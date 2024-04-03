package com.example;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int indice = scanner.nextInt();

        boolean isFibonacci = false;
        int a = 0;
        int b = 1;
        int c = 0;

        while (c < indice) {
            c = a + b;
            a = b;
            b = c;
            if (c == indice) {
                isFibonacci = true;
                break;
            }
        }

        if (isFibonacci) {
            System.out.println("O número " + indice + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + indice + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();


    }
}
