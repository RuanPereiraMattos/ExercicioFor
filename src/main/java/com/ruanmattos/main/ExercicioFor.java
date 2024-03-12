package com.ruanmattos.main;

import java.util.Scanner;

/**
 * Exercício sobre for
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioFor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite quantos números quer somar: ");
        int n = s.nextInt();

        int soma = 0;
        System.out.println("Quais números gostaria de somar?");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + " : ");
            int x = s.nextInt();
            soma += x;
        }

        System.out.println("A soma de todos os números digitados é: " + soma);
        s.close();

    }
}
