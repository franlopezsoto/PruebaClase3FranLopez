package Ej1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementoSimpleTest {

    @Test
    public void testElementoSimple() {
        ElementoFactory elementoSimpleFactory = new ElementoSimpleFactory();
        Elemento silla = elementoSimpleFactory.crearElemento(100.0, 1);
        assertEquals(100.0, silla.getPrecio());
        assertEquals(1, silla.getCodigo());
    }

    @Test
    public void testKit() {
        ElementoFactory elementoSimpleFactory = new ElementoSimpleFactory();
        ElementoFactory kitFactory = new KitFactory();

        Elemento silla = elementoSimpleFactory.crearElemento(100.0, 1);
        Elemento mesa = elementoSimpleFactory.crearElemento(200.0, 2);

        Kit kit = (Kit) kitFactory.crearElemento(0, 3);
        kit.addElemento(silla);
        kit.addElemento(mesa);

        assertEquals(270.0, kit.getPrecio()); // 100 + 200 - 10%
        assertEquals(3, kit.getCodigo());
    }
}
