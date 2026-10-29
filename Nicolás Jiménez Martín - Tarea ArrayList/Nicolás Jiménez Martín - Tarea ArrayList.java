/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaarraylist;

/**
 * Nicolás Jiménez Martín
 * DAM Online
 * Tarea ArrayList
 */

import java.util.ArrayList;

public class TareaArrayList {

    public static void main(String[] args) {

        // 1. Crear ArrayList<String>
        ArrayList<String> ciudades = new ArrayList<>();

        // 2. Añadir 5 ciudades
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        ciudades.add("Bilbao");

        // 3. Mostrar tamaño de la lista
        System.out.println("Tamaño de la lista: " + ciudades.size());

        // 4. Mostrar la ciudad en la posición 3
        System.out.println("Ciudad en la posición 3: " + ciudades.get(3));

        // 5. Eliminar la ciudad de la posición 1
        ciudades.remove(1);

        System.out.println("Lista después de eliminar posición 1: " + ciudades);

        // 6. Comprobar si contiene "Madrid"
        if (ciudades.contains("Madrid")) {
            System.out.println("La lista contiene Madrid.");
        } else {
            System.out.println("La lista NO contiene Madrid.");
        }

        // 7. Vaciar la lista y comprobar si está vacía
        ciudades.clear();

        if (ciudades.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista NO está vacía.");
        }
    }
}