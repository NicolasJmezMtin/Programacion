/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaarrays;

/**
 * Nicolás Jiménez Martín
 * DAM Online
 * Tarea Arrays
 */

import java.util.Scanner;

public class TareaArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ ARRAYS =====");
            System.out.println("1. Array del 1 al 10 (inverso)");
            System.out.println("2. Unir dos arrays");
            System.out.println("3. Arrays char + int");
            System.out.println("4. Pares e impares (1-57)");
            System.out.println("5. Notas y media final");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2(sc);
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5(sc);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // EJERCICIO 1
    public static void ejercicio1() {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Array en sentido inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    // EJERCICIO 2
    public static void ejercicio2(Scanner sc) {

        System.out.print("Número de posiciones del primer array: ");
        int n1 = sc.nextInt();

        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Introduce valor " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        System.out.print("Número de posiciones del segundo array: ");
        int n2 = sc.nextInt();

        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Introduce valor " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }

        int[] array3 = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }

        System.out.println("Array combinado:");
        for (int num : array3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // EJERCICIO 3
    public static void ejercicio3() {

        char[] letras = {'a', 'e', 'r', 't', 'y', 'u'};
        int[] numeros = {1, 2, 3, 4, 5, 6};

        int[] combinado = new int[letras.length + numeros.length];

        System.out.println("Tamaño del tercer array: " + combinado.length);
    }

    // EJERCICIO 4
    public static void ejercicio4() {

        int[] numeros = new int[57];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    // EJERCICIO 5
    public static void ejercicio5(Scanner sc) {

        double[] notas = new double[6];
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce nota de la asignatura " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double media = suma / notas.length;
        System.out.println("Nota media: " + media);

        if (media < 5) {
            System.out.println("Calificación: SUSPENSO");
        } else if (media >= 5 && media <= 6.5) {
            System.out.println("Calificación: BIEN");
        } else if (media > 6.5 && media <= 8.5) {
            System.out.println("Calificación: NOTABLE");
        } else if (media > 8.5) {
            System.out.println("Calificación: SOBRESALIENTE");
        }
    }
}