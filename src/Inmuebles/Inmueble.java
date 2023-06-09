package Inmuebles;

public class Inmueble {
    protected int idInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public Inmueble(int idInmobiliario, int area, String direccion) {
        this.idInmobiliario = idInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcularPrecioVenta(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }

    public void imprimir() {
        System.out.println("Identificador inmobiliario: " + idInmobiliario);
        System.out.println("Área: " + area);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio de venta: $" + precioVenta);
    }
}
