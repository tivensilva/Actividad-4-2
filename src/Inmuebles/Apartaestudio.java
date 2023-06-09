package Inmuebles;

public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;

    public Apartaestudio(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idInmobiliario, area, direccion, 1, 1);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
