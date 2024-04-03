package com.example;

import java.util.Scanner;

public class DesafiosLogica {
    public static void main(String[] args) {
        numberImpar();
         //multiply();
        // quadradoNatural();
        // quadradoPerfeito();
        // fibonacciSequence();
        // sequenciaAritmetica ();
    }

    public static void numberImpar() {
        int[] sequencia = new int[] { 1, 3, 5, 7 };
        int proximoNumero = sequencia[sequencia.length - 1] + 2;

        System.out.println("Sequência de números ímpares: ");
        for (int num : sequencia) {
            System.out.print(num + " ");
        }
        System.out.println(proximoNumero);
    }

    public static void multiply() {
        int[] sequencia = new int[] { 2, 4, 8, 16, 32, 64 };
        int proximoNumero = sequencia[sequencia.length - 1] * 2;

        System.out.println("Sequência de números multiplicados por 2: ");
        for (int num : sequencia) {
            System.out.print(num + " ");
        }
        System.out.println(proximoNumero);
    }

    public static void quadradoNatural() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int indice = scanner.nextInt();

        for (int i = 0; i <= indice; i++) {
            System.out.println(i + " ao quadrado é: " + i * i);

        }
        scanner.close();
    }

    public static void quadradoPerfeito() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int indice = scanner.nextInt();

        for (int i = 2; i <= indice; i++) {
            if (i % 2 == 0) {
                int quadrado = i * i;
                System.out.println("Quadrado de " + i + " é: " + quadrado);
            }

        }
        scanner.close();
    }

    public static void fibonacciSequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int indice = scanner.nextInt();

        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print("Sequência de Fibonacci: " + a + "," + b + ",");

        while (c < indice) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + ",");
        }

        scanner.close();

    }

    public static void sequenciaAritmetica() {
        int[] sequencia = new int[] { 2, 10, 12, 16, 17, 18, 19 };
        int ultimoNumero = sequencia[sequencia.length - 1];
        int proximoNumero = ultimoNumero + 1;

        System.out.println("Sequência com razão variável:");
        for (int num : sequencia) {
            System.out.print(num + " ");
        }
        System.out.println(proximoNumero);
    }
}
