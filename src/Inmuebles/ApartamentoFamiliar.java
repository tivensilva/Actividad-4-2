package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int valorAdministracion) {
        super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
        this.valorAdministracion = valorAdministracion;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administración: $" + valorAdministracion);
        System.out.println();
    }
}
