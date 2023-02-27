package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0){
            System.out.println("division by zero");
        } else {
            int value = dividend / divider;
            int gotValue = value * divider;

            if (gotValue == dividend) System.out.println("can be divided completely");
            else System.out.println("cannot be divided completely");
        }
    }

    public static void main(String[] args) {
        new IntegerDivider().printCompletelyDivided(5,5);
    }
}
