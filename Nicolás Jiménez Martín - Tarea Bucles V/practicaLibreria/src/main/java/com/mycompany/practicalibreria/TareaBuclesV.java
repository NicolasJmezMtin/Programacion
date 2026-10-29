/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicalibreria;

/**
 * @author Nicolás Jiménez Martín
 * DAM Online
 * Tarea Bucles V
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TareaBuclesV {

    // Creamos la clase Libro para guardar la información de cada libro
    static class Libro {
        String titulo;
        String autor;
        int fecha;
        double precio;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>(); // Lista de libros
        int opcion;

        // Creamos un bucle do-while para mostrar el menú hasta que el usuario quiera salir
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el salto de línea

            // Creamos condicionales anidados para utilizar el menú
            if (opcion == 1) {
                // Agregar nuevo libro
                Libro libro = new Libro();

                System.out.print("Título: ");
                libro.titulo = sc.nextLine();

                System.out.print("Autor: ");
                libro.autor = sc.nextLine();

                // Validar año positivo
                System.out.print("Año de publicación: ");
                libro.fecha = sc.nextInt();

                if (libro.fecha > 0) {
                    System.out.print("Precio: ");
                    libro.precio = sc.nextDouble();

                    if (libro.precio > 0) {
                        libros.add(libro);
                        System.out.println("Libro agregado con éxito.");
                    } else {
                        System.out.println("El precio debe ser mayor que 0.");
                    }
                } else {
                    System.out.println("El año debe ser mayor que 0.");
                }

            } else if (opcion == 2) {
                // Mostrar todos los libros
                if (libros.isEmpty()) {
                    System.out.println("No hay libros en el inventario.");
                } else {
                    // Creamos un bucle for para recorrer el inventario
                    for (int i = 0; i < libros.size(); i++) {
                        Libro l = libros.get(i);
                        System.out.println("\nLibro " + (i + 1));
                        System.out.println("Título: " + l.titulo);
                        System.out.println("Autor: " + l.autor);
                        System.out.println("Año: " + l.fecha);
                        System.out.println("Precio: " + l.precio);
                    }
                }

            } else if (opcion == 3) {
                // Buscar libro por título
                System.out.print("Introduce el título del libro a buscar: ");
                String buscarTitulo = sc.nextLine();

                int i = 0;
                boolean encontrado = false;

                // Creamos un bucle while para buscar
                while (i < libros.size() && !encontrado) {
                    if (libros.get(i).titulo.equalsIgnoreCase(buscarTitulo)) {
                        Libro l = libros.get(i);
                        System.out.println("\nLibro encontrado:");
                        System.out.println("Título: " + l.titulo);
                        System.out.println("Autor: " + l.autor);
                        System.out.println("Año: " + l.fecha);
                        System.out.println("Precio: " + l.precio);
                        encontrado = true;
                    }
                    i++;
                }

                if (!encontrado) {
                    System.out.println("El libro no está en el inventario.");
                }

            } else if (opcion == 4) {
                // Salir
                System.out.println("Saliendo del programa...");

            } else {
                // Opción incorrecta
                System.out.println("Opción incorrecta. Inténtalo de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
