package org.example;
public class CronometroCosmico{
    // Definir la duración de un día en el nuevo planeta en horas terrestres
    static final double DURACION_DIA = 30.0;

    // Método para convertir tiempo terrestre a tiempo del planeta
    public double convertirTiempo(double tiempoTerrestre) {
        return tiempoTerrestre / DURACION_DIA * 24.0;
    }

    // Método para formatear el tiempo en segundos, minutos, horas, días y años
    public String formatearTiempo(double tiempo) {
        double segundos = tiempo * 24 * 60 * 60;
        double minutos = tiempo * 24 * 60;
        double horas = tiempo * 24;
        double dias = tiempo;
        double años = tiempo / 365.25;

        return String.format("Segundos: %.2f, Minutos: %.2f, Horas: %.2f, Días: %.2f, Años: %.2f",
                segundos, minutos, horas, dias, años);
    }
}