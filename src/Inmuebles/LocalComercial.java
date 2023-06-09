package Inmuebles;

public class LocalComercial extends Local {
    protected static double valorArea = 3000000;
    protected String centroComercial;

    public LocalComercial(int idInmobiliario, int area, String direccion, Tipo tipoLocal, String centroComercial) {
        super(idInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
