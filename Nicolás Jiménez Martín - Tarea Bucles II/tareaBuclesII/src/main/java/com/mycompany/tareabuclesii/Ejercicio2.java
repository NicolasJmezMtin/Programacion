/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareabuclesii;

/**
 * @author Nicolás Jiménez Martín
 * DAM Online
 * Tarea Bucles II
 * Ejercicio 2
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;

        System.out.print("Ingresa un número entero positivo (ingresa un negativo para terminar): ");
        num = sc.nextInt();

        while (num >= 0) {
            suma += num;
            System.out.println("Suma acumulada: " + suma);

            System.out.print("Ingresa otro número entero positivo (ingresa un negativo para terminar): ");
            num = sc.nextInt();
        }

        System.out.println("Total de la suma acumulada: " + suma);
        sc.close();
    }
}
