package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;

    public CasaIndependiente(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
        super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
