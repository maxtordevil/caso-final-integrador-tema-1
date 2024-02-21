package org.example;

public class Main {
    public static void main(String[] args) {
        SistemaMonitoreo sistema = new SistemaMonitoreo();

        // Monitorear factores críticos
        sistema.monitorearFactores(11.0, 45.0, 2100.0);

        // Identificar los 10 primeros números primos
        System.out.println("Los 10 primeros números primos son: " + sistema.identificarPrimos(10));
    }
}