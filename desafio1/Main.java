package desafio1;

import java.util.Arrays;


public class Main{
    public static void main(String[] args) {

        // Se crea un arreglo de 5 elementos

        String[] words = new String[6];

        // Se le asignan valores al arreglo
        words[0] = "Hello";
        words[1] = "world";
        words[2] = "this";
        words[3] = "is";
        words[4] = "a";
        words[5] = "test";

        // Se llama al método smash de la clase SmashWords
        // y se le pasa el arreglo como parámetro
        String result = SmashWords.smash(words);

        // Se imprime el resultado
        System.out.println(result);

    }
}