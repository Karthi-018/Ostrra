package edu.osttra.training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator"+"\n 1 = + \n 2 = - \n 3 = * \n 4 = /");
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation");
        int op = sc.nextInt();

        int result;
        switch(op) {
            case 1: result = sum(num1, num2);
                break;
            case 2: result = sub(num1, num2);
                break;
            case 3: result = mul(num1, num2);
                break;
            case 4: result = div(num1, num2);
                break;
            default: result = -0;
                System.out.println("Something went wrong!");
        }
        if(result != -0) {
            System.out.println("The answer is: "+ result);
        }
    }

    public static int sum(int num1, int num2) {
        return num1+num2;
    }

    public static int sub(int num1, int num2) {
        return num1-num2;
    }
    public static int mul(int num1, int num2) {
        return num1*num2;
    }
    public static int div(int num1, int num2) {
        return num1/num2;
    }
}