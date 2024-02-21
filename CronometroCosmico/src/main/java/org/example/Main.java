package org.example;

public class Main {
    public static void main(String[] args) {
        Planeta planeta = new Planeta();

        // Calcular y mostrar el tiempo en la Tierra y en el nuevo planeta
        double tiempoTerrestre = 1.0;  // 1 día terrestre
        double tiempoPlaneta = planeta.convertirTiempo(tiempoTerrestre);

        System.out.println("Tiempo en la Tierra: " + planeta.formatearTiempo(tiempoTerrestre));
        System.out.println("Tiempo en el nuevo planeta: " + planeta.formatearTiempo(tiempoPlaneta));
    }
}