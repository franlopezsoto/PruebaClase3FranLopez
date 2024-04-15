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
        double precioTotal = 0;
        for (Elemento elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal * 0.9; // Aplicamos el descuento del 10%
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
}
