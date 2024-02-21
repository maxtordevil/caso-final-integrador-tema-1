package org.example;


import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoreo {
    // Definir los límites para los factores críticos
    static final double LIMITE_SUPERIOR_RADIACION = 10.0;
    static final double LIMITE_SUPERIOR_TEMPERATURA = 40.0;
    static final double LIMITE_SUPERIOR_PRESION = 2000.0;

    // Método para monitorear los factores críticos
    public void monitorearFactores(double radiacion, double temperatura, double presion) {
        if (radiacion > LIMITE_SUPERIOR_RADIACION) {
            System.out.println("Alerta: Nivel de radiación alto");
        }
        if (temperatura > LIMITE_SUPERIOR_TEMPERATURA) {
            System.out.println("Alerta: Temperatura alta");
        }
        if (presion > LIMITE_SUPERIOR_PRESION) {
            System.out.println("Alerta: Presión alta");
        }
    }

    // Método para identificar los N primeros números primos
    public List<Integer> identificarPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        int numero = 2;
        while (primos.size() < n) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }
        return primos;
    }

    // Método para verificar si un número es primo
    private boolean esPrimo(int numero) {
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
