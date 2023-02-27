package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        int k;
        for (int i = 1; i<=10; i++){
            k = i*numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + k);
        }
    }

    public static void main(String[] args) {
        new MultiplicationTable().printTable(454454);
    }
}
