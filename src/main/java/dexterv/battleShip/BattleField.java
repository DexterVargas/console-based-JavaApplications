package main.java.dexterv.battleShip;

public class BattleField {
    private int areaX = 10;
    private int areaY = 10;
    private String[] str = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    private int[] startAxis = {9,3};
    private int len = 5;
    private String direction;
    public void generateField() {
        for (int i = 0; i <= areaX; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print(i);
            }

            int increment = 0;
            for (int j = 1; j <= areaY; j++) {



                if (i == 0) {
                    System.out.print("  " + j + "  ");
                } else if (startAxis[0] == i) {
                     if(startAxis[1] <= j && increment < len) {
                         System.out.print(" [0] ");
                         increment ++;


                     }  else {
                         System.out.print(" [ ] ");
                     }

                } else {
                    System.out.print(" [ ] ");
                }
            }
            System.out.println();
        }
    }
}
