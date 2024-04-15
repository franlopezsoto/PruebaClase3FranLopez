package Ej1;

public class ElementoSimple implements Elemento {
    private double precio;
    private int codigo;

    public ElementoSimple(double precio, int codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
}
