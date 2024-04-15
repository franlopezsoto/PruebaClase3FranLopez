package Ej1;






public class MobiliarioModular {
    public static void main(String[] args) {
        ElementoFactory elementoSimpleFactory = new ElementoSimpleFactory();
        ElementoFactory kitFactory = new KitFactory();

        Elemento silla = elementoSimpleFactory.crearElemento(100.0, 1);
        Elemento mesa = elementoSimpleFactory.crearElemento(200.0, 2);

        Kit kit = (Kit) kitFactory.crearElemento(0, 3);
        kit.addElemento(silla);
        kit.addElemento(mesa);

        System.out.println("Precio del kit: " + kit.getPrecio());
    }
}
