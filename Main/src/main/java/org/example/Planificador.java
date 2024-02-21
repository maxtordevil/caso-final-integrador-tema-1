package org.example;

import java.util.HashMap;
import java.util.Map;
public class Planificador {
    // Método para visualizar la tabla de tareas
    public void visualizarTablaTareas(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    // Método para calcular la carga de trabajo óptima
    public Map<String, Integer> calcularCargaTrabajo(Map<String, Integer> tareas, Map<String, Integer> capacidad) {
        // Verificar si los mapas son nulos
        if (tareas == null || capacidad == null) {
            throw new IllegalArgumentException("Los mapas de tareas y capacidad no pueden ser nulos");
        }

        // Verificar si los mapas tienen la misma cantidad de miembros
        if (tareas.size() != capacidad.size()) {
            throw new IllegalArgumentException("Los mapas de tareas y capacidad deben tener la misma cantidad de miembros");
        }

        Map<String, Integer> cargaOptima = new HashMap<>();
        for (String miembro : tareas.keySet()) {
            // Verificar si el miembro existe en ambos mapas
            if (!capacidad.containsKey(miembro)) {
                throw new IllegalArgumentException("El miembro '" + miembro + "' no tiene capacidad asignada");
            }

            // Calcular la carga óptima para el miembro
            int carga = tareas.get(miembro) * capacidad.get(miembro);
            cargaOptima.put(miembro, carga);
        }
        return cargaOptima;
    }
}
