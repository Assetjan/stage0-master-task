package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int counter = 0;
        int sum = 0;
        int l = number;
        while (l != 0){
            counter++;
            l = l/10;
        }
        for (int i = 0; i < counter; i++){
            sum = sum + number%10;
            number /= 10;
        }
        System.out.println(sum);
    }

}
