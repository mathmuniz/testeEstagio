package com.example;

public class InverterString {
    public static void main(String[] args) {

        String original = "Hello, world!";
        char[] caracteres = original.toCharArray();

        inverterCaracteres(caracteres);

        String invertida = new String(caracteres);

        System.out.println("String invertida: " + invertida);
    }

    public static void inverterCaracteres(char[] array) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio < fim) {
            char temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
    }
}
