package Inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int numHabitaciones;
    protected int numBaños;

    public InmuebleVivienda(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idInmobiliario, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Número de baños: " + numBaños);
    }
}
