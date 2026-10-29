/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareabuclesii;

/**
 * @author Nicolás Jiménez Martín
 * DAM Online
 * Tarea Bucles II
 * Ejercicio 3
 */

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2;

        do {
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Ingresa el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Ingresa el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Salida confirmada.");
                    break;

                default:
                    System.out.println("Opción no existente.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
