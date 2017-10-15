package com.genus;

public class Main {

    public static void main(String[] args) {

        String[][] sea = Matrixer.inputMatrix();
        Matrixer.printMatrix(sea);

        if (Seeker.isNemoInThere(sea)) {
            System.out.println("Nemo found!!!");
        } else {
            System.out.println("Nemo Not Found! :/");
        }

    }
}
