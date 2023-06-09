package Inmuebles;

public class Casa extends InmuebleVivienda {
    protected int numPisos;

    public Casa(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
        super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
        this.numPisos = numPisos;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos: " + numPisos);
    }
}
