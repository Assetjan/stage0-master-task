package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        String res = "1";
        int h = 2;
        for (int i = cathetusLength; i > 0; i--){
            for (int j = 0; j < i-1; j++){
                System.out.print(" ");
            }
            System.out.print(res);
            System.out.println();
            res = h + res + h;
            h++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
