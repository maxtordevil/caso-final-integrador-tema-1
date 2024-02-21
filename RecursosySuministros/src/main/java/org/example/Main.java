package org.example;

public class Main {
    public static void main(String[] args) {
        double[] recursos = {10.0, 20.0, 30.0};
        double umbralSeguro = 15.0;
        GastoDeRecursos recursosObj = new GastoDeRecursos(recursos, umbralSeguro);
        recursosObj.imprimirValores();
        double[] consumo = recursosObj.calcularConsumo(7);
        System.out.println("Consumo para 7 días: " + java.util.Arrays.toString(consumo));
        double[] proyeccion = recursosObj.proyectarConsumoFuturo(30);
        System.out.println("Proyección para 30 días: " + java.util.Arrays.toString(proyeccion));
        boolean alerta = recursosObj.alertaUmbralSeguro();
        System.out.println("Alerta de umbral seguro: " + alerta);
        double[] estadisticas = recursosObj.estadisticasUso();
        System.out.println("Estadísticas de uso: Promedio = " + estadisticas[0] + ", Mínimo = " + estadisticas[1] + ", Máximo = " + estadisticas[2]);
    }

}