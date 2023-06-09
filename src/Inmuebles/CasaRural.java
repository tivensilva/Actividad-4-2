package Inmuebles;

public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int distanciaCabecera;
    protected int altitud;

    public CasaRural(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos, int distanciaCabecera, int altitud) {
        super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal: " + distanciaCabecera + " km");
        System.out.println("Altitud sobre el nivel del mar: " + altitud + " metros");
        System.out.println();
    }
}
