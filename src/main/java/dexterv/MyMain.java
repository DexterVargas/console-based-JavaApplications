package main.java.dexterv;

import main.java.dexterv.guessingGame.Play;

public class MyMain {

    public static void main(String[] args) {
        PhraseOMatic phrase = new PhraseOMatic();
        phrase.exec();

        Play guessingGame = new Play();
        guessingGame.play();

        Dog[] dogs =  new Dog[3];
        dogs[0] = new Dog("Felix");
        dogs[1] = new Dog("Paolo");
        dogs[2] = new Dog("Lolo");
        for (Dog dog : dogs) {
            dog.bark();
        }

    }
}
