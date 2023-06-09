package Inmuebles;

public class Apartamento extends InmuebleVivienda {

    public Apartamento(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
    }

    public void imprimir() {
        super.imprimir();
    }
}
