package Ej1;

import java.util.ArrayList;
import java.util.List;

public class Kit implements Elemento {
    private List<Elemento> elementos = new ArrayList<>();
    private int codigo;

    public Kit(int codigo) {
        this.codigo = codigo;
    }

    public void addElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    @Override
    public double getPrecio() {
        return aplicarDescuento(calcularPrecioTotal());
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    private double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Elemento elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal;
    }

    private double aplicarDescuento(double precioTotal) {
        return precioTotal * 0.9; // Aplicamos el descuento del 10%
    }
}
