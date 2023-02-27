package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int counter = 0;
        int sum = 0;
        int l = number;
        int um = 100;
        while (l != 0){
            counter++;
            l = l/10;
        }
        int[] arr = new int[counter];
        for (int i = 0; i < counter; i++){
            arr[i] = number%10;
            number /= 10;
        }
        for (int i = 0; i < counter; i++){
            sum += arr[i]*um;
            um /= 10;
        }
        System.out.println(sum);
    }

}
