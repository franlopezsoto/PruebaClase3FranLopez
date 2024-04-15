package Ej1;

public class KitFactory implements ElementoFactory {
        @Override
        public Elemento crearElemento(double precio, int codigo) {
            return new Kit(codigo);
        }
    }
}
