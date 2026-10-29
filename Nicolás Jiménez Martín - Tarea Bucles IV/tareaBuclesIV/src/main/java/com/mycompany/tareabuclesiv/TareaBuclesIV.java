/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareabuclesiv;

/**
 * @author Nicolás Jiménez Martín
 * DAM Online
 * Tarea Bucles IV
 */


import java.util.Scanner;

public class TareaBuclesIV {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Ejercicio 1");
        
        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el carácter a utilizar: ");
        String caracter = sc.next();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

        
        // Ejercicio 2
        System.out.println("\nEjercicio 2");
        
        System.out.print("Introduce el número de filas (del 1 al 10): ");
        int filasNum = sc.nextInt();

        if (filasNum >= 1 && filasNum <= 10) {
            for (int i = 1; i <= filasNum; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Número incorrecto debe de estar compendido entre 1 y 10.");
        }

        
        // Ejercicio 3
        System.out.println("\nEjercicio 3");
        
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num >= 10 && num <= 99) {
                if (num % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
            } else if (num >= 100 && num <= 999) {
                System.out.println("El resto de dividir el número entre 2 es: " + (num % 2));
            } else {
                System.out.println("El número no es de dos ni de tres cifras.");
            }
        } else {
            System.out.println("Error, el número debe ser positivo y distinto de cero.");
        }

        
        // Ejercicio 4
        System.out.println("\nEjercicio 4");
        
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        if (!(numero <= 0)) {
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        } else {
            System.out.println("Error, el número debe ser mayor que cero y distinto de cero.");
        }

        
        sc.close();
    }
}