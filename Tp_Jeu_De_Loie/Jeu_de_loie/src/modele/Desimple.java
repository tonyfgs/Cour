package modele;

import java.util.Random;

public class Desimple extends De{

    public int lancer(){
        Random random = new Random();
        val = random.nextInt(6-1);
        return val;
    }

}
