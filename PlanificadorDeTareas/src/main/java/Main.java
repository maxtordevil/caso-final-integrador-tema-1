

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PlanificadorTareas planificador = new PlanificadorTareas();

        // Visualizar la tabla de tareas para el número 5
        planificador.visualizarTablaTareas(5);

        // Calcular la carga de trabajo óptima
        Map<String, Integer> tareas = new HashMap<>();
        tareas.put("Miembro1", 5);
        tareas.put("Miembro2", 7);

        Map<String, Integer> capacidad = new HashMap<>();
        capacidad.put("Miembro1", 2);
        capacidad.put("Miembro2", 3);

        System.out.println("Carga de trabajo óptima: " + planificador.calcularCargaTrabajo(tareas, capacidad));
    }
}