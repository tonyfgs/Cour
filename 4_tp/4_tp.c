#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include <errno.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <dirent.h>
#include <string.h>
#include <signal.h>


void dertournerSignal(int signum, void funtion(signum)){
    struct sigaction action , save ;
    sigemptyset (& action . sa_mask );
    action.sa_handler = funtion ;
    action.sa_flags = 0;
    if ( sigaction ( SIGUSR1 , & action , & save ) == -1) {
    perror (" Installation coucou "); exit (1);
}
}

void coucou ( int sig ) {
    printf (" Coucou , sig %d\n", sig );
}

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Usage: %s nbArgumennt\n", argv[0]);
        exit(EXIT_FAILURE);
    }
    int ligne = 1;
    int taille = 1024;
    char s[taille] ;
    int nb = 5;
    int tube [2];
    int i = 0;
 
    if ( pipe ( tube )== -1) { perror ( " pipe " ); exit ( errno ); }
    for(i = 0 ; i<nb;nb--){
    switch ( fork ()) {
    case -1 : perror ( " fork " ); exit ( errno );
    case 0 : 
            close ( tube [1]);
            dertournerSignal(SIGUSR1,coucou);
            while(read ( tube [0] , s ,taille)){
                printf ( "%d- fils : %s \n" ,ligne, s );
                ligne++;
            }
            close ( tube [0]);
            exit (0);
    default : // le pere
            close ( tube [0]);
            while(fgets(s, taille, stdin)){
                write ( tube [1] , s , taille);
                nb--;
            }
            close(tube [1]);
            wait(NULL);
            exit (0);
    }
    nb -- ;
    }
}

