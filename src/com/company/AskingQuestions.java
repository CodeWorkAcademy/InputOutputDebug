package com.company;

public class AskingQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("First integer? ");
        num1 = keyboard.nextString();

        System.out.print("Second integer? ");
        num2 = keyboard.nextInt();

        System.out.print("Third integer? ");
        num3 = keyboard.nextDouble();
    }
        System.out.println("The total is : "+(num1 +num2 +num3));
}

