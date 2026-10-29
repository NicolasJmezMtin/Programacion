package ejercicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Nicolás Jiménez Martín - DAM Online
 * Tarea Tarea Bucles I
 */

import java.util.Scanner;

public class bucleWhile {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingresa numeros enteros positivos."
                + "Para terminar, ingresa un numero negativo.");

        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();

        while (numero >= 0) {
            suma += numero;
            System.out.println("La suma total es: " + suma);

            System.out.print("Ingresa otro numero: ");
            numero = sc.nextInt();
        }

        System.out.println("Has ingresado un numero negativo. La suma total es: " + suma);
        sc.close();
    }
}