/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareabuclesiii;

/**
 * @author Nicolás Jiménez Martín
 * DAM Online
 * Tarea Bucles III
 */

import java.util.Scanner;

public class TareaBuclesIII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        // 1. Imprimir con un bucle for los valores de 1-1000 de 5 en 5
        System.out.println("1. Valores de 1 a 1000 de 5 en 5:");
        
        for (int i = 1; i <= 1000; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        
        // 2. Imprimir los números del 10000 al 1, con incremento de 10
        System.out.println("2. Valores de 10000 a 1 de 10 en 10:");
        
        for (int i = 10000; i >= 1; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        
        // 3. Preguntar por pantalla tu nombre y el número de veces que deseamos imprimir el nombre
        System.out.println("3. Introduce tu nombre:");
        
        String nombre = sc.nextLine();

        System.out.println("¿Cuántas veces deseas imprimir tu nombre?");
        int numveces = sc.nextInt();

        for (int i = 1; i <= numveces; i++) {
            System.out.println(nombre);
        }
        System.out.println();

        
        
        // 4. Se piden números por pantalla al usuario, hasta que se teclea el valor 0
        System.out.println("4. Introduce números (introduce 0 para salir):");
        
        int numero;
        do {
            numero = sc.nextInt();
        } while (numero != 0);
        System.out.println("Has introducido el número 0.\n");

        
        // 5. (Con bucle do while), imprimir los números del 1-100
        System.out.println("5. Números del 1 al 100 con do-while:");
        
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 100);
        System.out.println("\n");

        
        // 6. (Con bucle while), imprimir los números del 1-100
        System.out.println("6. Números del 1 al 100 con while:");
        
        int num = 1;
        while (num <= 100) {
            System.out.print(num + " ");
            num++;
        }

        
        sc.close();
    }
}