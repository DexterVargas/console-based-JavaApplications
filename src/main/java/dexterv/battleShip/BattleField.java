package main.java.dexterv.battleShip;

public class BattleField {
    private int areaX = 10;
    private int areaY = 10;
    private String[] str = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    public void generateField() {
        for (int i = 0; i <= areaX; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print(i);
            }

            for (int j = 0; j < areaY; j++) {
                if (i == 0) {
                    System.out.print("  " + str[j] + "  ");
                } else {
                    System.out.print(" [ ] ");
                }
            }
            System.out.println();
        }
    }
}
