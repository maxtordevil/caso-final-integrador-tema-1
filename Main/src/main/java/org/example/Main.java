package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Cronómetro Cósmico
        CronometroCosmico planeta = new CronometroCosmico ();
        double tiempoTerrestre = 1.0;  // 1 día terrestre
        double tiempoPlaneta = planeta.convertirTiempo(tiempoTerrestre);
        System.out.println("Tiempo en la Tierra: " + planeta.formatearTiempo(tiempoTerrestre));
        System.out.println("Tiempo en el nuevo planeta: " + planeta.formatearTiempo(tiempoPlaneta));

        // Recursos y Suministros
        double[] recursos = {10.0, 20.0, 30.0};
        double umbralSeguro = 15.0;
        ContadorRecursos recursosObj = new ContadorRecursos(recursos, umbralSeguro);
        recursosObj.imprimirValores();
        double[] consumo = recursosObj.calcularConsumo(7);
        System.out.println("Consumo para 7 días: " + java.util.Arrays.toString(consumo));
        double[] proyeccion = recursosObj.proyectarConsumoFuturo(30);
        System.out.println("Proyección para 30 días: " + java.util.Arrays.toString(proyeccion));
        boolean alerta = recursosObj.alertaUmbralSeguro();
        System.out.println("Alerta de umbral seguro: " + alerta);
        double[] estadisticas = recursosObj.estadisticasUso();
        System.out.println("Estadísticas de uso: Promedio = " + estadisticas[0] + ", Mínimo = " + estadisticas[1] + ", Máximo = " + estadisticas[2]);

        // Sistema de Alerta y Monitoreo
        SistemaMonitoreo sistema = new SistemaMonitoreo();
        sistema.monitorearFactores(11.0, 45.0, 2100.0);
        System.out.println("Los 10 primeros números primos son: " + sistema.identificarPrimos(10));

        // Planificador de Tareas
        Planificador planificador = new Planificador();
        planificador.visualizarTablaTareas(5);
        Map<String, Integer> tareas = new HashMap<>();
        tareas.put("Miembro1", 5);
        tareas.put("Miembro2", 7);
        Map<String, Integer> capacidad = new HashMap<>();
        capacidad.put("Miembro1", 2);
        capacidad.put("Miembro2", 3);
        System.out.println("Carga de trabajo óptima: " + planificador.calcularCargaTrabajo(tareas, capacidad));

        // Navegador Estelar
        NavegadorEstelar navegador = new NavegadorEstelar();
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = navegador.multiplicarMatrices(a, b);
        navegador.visualizarMatriz(c);

        // Comunicador Interplanetario
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        String mensaje = "Esto es un mensaje codificado desde la galaxia Andromeda";
        System.out.println("Número de vocales: " + comunicador.contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + comunicador.invertirMensaje(mensaje));
        System.out.println("Es palíndromo: " + comunicador.esPalindromo(mensaje));
    }
}