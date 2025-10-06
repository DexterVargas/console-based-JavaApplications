package main.java.dexterv;

import main.java.dexterv.guessingGame.Play;

public class MyMain {

    public static void main(String[] args) {
        PhraseOMatic phrase = new PhraseOMatic();
        phrase.exec();

        Play guessingGame = new Play();
        guessingGame.play();
    }
}
