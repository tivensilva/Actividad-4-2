package Inmuebles;

public class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean esGobierno;

    public Oficina(int idInmobiliario, int area, String direccion, Tipo tipoLocal, boolean esGobierno) {
        super(idInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}
