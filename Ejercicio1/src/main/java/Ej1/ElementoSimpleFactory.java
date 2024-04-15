package Ej1;

public class ElementoSimpleFactory implements ElementoFactory {
    @Override
    public Elemento crearElemento(double precio, int codigo) {
        return new ElementoSimple(precio, codigo);
    }
}

