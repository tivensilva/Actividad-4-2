package Inmuebles;

public class Local extends Inmueble {
    enum Tipo { INTERNO, CALLE }
    protected Tipo tipoLocal;

    public Local(int idInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(idInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local: " + tipoLocal);
    }
}
