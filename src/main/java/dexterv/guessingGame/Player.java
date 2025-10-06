package main.java.dexterv.guessingGame;

public class Player {
    int number = 0;
    String name;

    public Player(String name) {
        this.name = name;
    }

    public int guess(){
        this.number = (int) (Math.random()*10);
        System.out.println( name + " guess number is "+number);
        return this.number;
    }
}
