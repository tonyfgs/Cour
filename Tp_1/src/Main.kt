import com.sun.jdi.CharType
import java.util.Scanner

private const val ECHAPPEMENT = '_'

fun initialize(secretWord: String): StringBuilder{
    var motRetour : StringBuilder
    for(position in 0..secretWord.length-1){
        motRetour[position]  = ECHAPPEMENT
    }
    return motRetour
}

fun verifMotEtConcat(secretWord: String, motSaisi: Char): Boolean{
    var motRetour: StringBuilder
    if (motRetour.isEmpty()){
        motRetour = initialize(secretWord)
    }

    if(secretWord.contains(motSaisi)){
        motRetour = devoileMotSecret(motSaisi,secretWord, motRetour)
    }

    if (motRetour.contains("_")){
        println(motRetour)
        return false
    }
    return true
}

fun devoileMotSecret(lettre: Char, motSecret: String, motCache: StringBuilder): StringBuilder {
    for (position in 0..motSecret.length-1){
        if(motSecret[position].equals(lettre)){
            motCache[position] = lettre
        }
    }
    return motCache
}

fun afficherVie(nbVie: Int) {
    for (i in 0..nbVie){
        println("\u2665")
    }
}

fun main() {

    val secretWord = "lion"
    var nbVie : Int = 4
    var motSaisi: String
    println("Entrer votre mot")
    var saisie = Scanner((System.`in`))
    motSaisi = saisie.nextLine()
    println("$motSaisi")
    var end: Boolean
    while(nbVie != 0) {
        end = verifMotEtConcat(secretWord,motSaisi)
        if (end.equals(true)){
            println("fin")
            break
        }
        nbVie--
        println("Entrer votre mot")
        motSaisi = saisie.nextLine()

    }

}

