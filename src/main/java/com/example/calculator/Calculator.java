package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.println("Entrez l'opérateur (+ , - , *, / ) : ");
        char operator = scanner.next().charAt(0);

        System.out.println("Entrez le second nombre : ");
        double num2 = scanner.nextDouble();
        
        double result = calculate(num1, num2, operator);
        System.out.println("Le résultat est : " + result);

        scanner.close();
    }

    public static double calculate(double num1, double num2, char operator) {
        switch(operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division par zéro !");
                }
            default:
                throw new IllegalArgumentException("Opérateur invalide");
        }
    }
}
