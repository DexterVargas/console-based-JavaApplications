package main.java.dexterv.guessingGame;

public class Play {

    Player player1;
    Player player2;
    Player player3;

    public  void play() {
        System.out.println("\n \n -------Guessing Game-------");
        player1 = new Player("Juan");
        player2 = new Player("Paolo");
        player3 = new Player("Lolo");

        int ans = (int) (Math.random() * 10);

        System.out.println("I'm thinking of a number between 0 ~ 9...");

        boolean noWinner = true;
        String winners = "";

        System.out.println("Number to guess is ___[ " + ans + " ]___");
        System.out.println("_________________________________");

        while(noWinner) {
            int p1guess = player1.guess();
            int p2guess = player2.guess();
            int p3guess = player3.guess();

            if (p1guess == ans) {
                System.out.println("\n***> " + player1.name + " guessed the number -> " + ans);
                winners = " " + player1.name;
            }
            if (p2guess == ans) {
                System.out.println("\n***> " + player2.name + " guessed the number -> " + ans);
                winners = " " + player2.name;
            }

            if (p3guess == ans) {
                System.out.println("\n***> " + player3.name + " guessed the number -> " + ans);
                winners = " " + player3.name;
            }

            if (p1guess == ans ||  p2guess == ans || p3guess == ans) {
                System.out.println("\n We have a winner!!!!!! \n");
                System.out.println("Congratulations to *** " +  winners + " ***");
                noWinner = false;
            } else {
                System.out.println("\n Players will have to try again.\n ");
            }
        }
    }
}
