package com.genus;

public class Seeker {

    private static boolean response = false;

    public static boolean isNemoInThere(String[][] sea) {

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(sea[i][j].equals("N")){
                   keepSwimming(sea, "E", i, j);
                }
            }
        }
        return response;
    }

    private static void keepSwimming(String [][] sea, String nextLetter, int i, int j) {

        if(j+1 < sea[0].length)
        {
            if(sea[i][j+1].equals(nextLetter))
            {
                if(j+2 < sea[0].length){
                    if(sea[i][j+2].equals("M")){
                        if(j+3 < sea[0].length){
                            if(sea[i][j+3].equals("O")){
                                response = true;
                            }
                        }
                    }
                }
            }
        }

        if(j-1 >= 0)
        {
            if(sea[i][j-1].equals(nextLetter))
            {
                if(j-2 >= 0){
                    if(sea[i][j-2].equals("M")){
                        if(j-3 >=0){
                            if(sea[i][j-3].equals("O")){
                                response = true;
                            }
                        }
                    }
                }

            }
        }

        if(i+1 < sea.length)
        {
            if(sea[i+1][j].equals(nextLetter))
            {
                if(i+2 < sea.length){
                    if(sea[i+2][j].equals("M")){
                        if(i+3 < sea.length){
                            if(sea[i+3][j].equals("O")){
                                response = true;
                            }
                        }
                    }
                }

            }
        }

        if(i-1 >= 0)
        {
            if(sea[i-1][j].equals(nextLetter))
            {
                if(i-2 >= 0){
                    if(sea[i-2][j].equals("M")){
                        if(i-3 >= 0){
                            if(sea[i-3][j].equals("O")){
                                response = true;
                            }
                        }
                    }
                }
            }
        }
    }

}
