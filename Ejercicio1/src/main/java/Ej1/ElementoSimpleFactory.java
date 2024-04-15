package Ej1;

public class ElementoSimpleFactory implements ElementoFactory {
    @Override
    public Elemento crearElemento(double precio, int codigo) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        if (codigo < 0) {
            throw new IllegalArgumentException("El código no puede ser negativo");
        }
        return new ElementoSimple(precio, codigo);
    }
}


