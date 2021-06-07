package com.alfabank.work24;

public class Task24 {
    public static void main(String[] args) {
        int number = 537;
        int digit_1 = number%10;
        int digit_2 = number/10%10;
        int digit_3 = number / 100;

        int number1 = digit_1*100+digit_2*10+digit_3;
        System.out.println(number1);
        System.out.println(number-number1);
    }
}
