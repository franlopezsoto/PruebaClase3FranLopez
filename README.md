# PruebaClase3FranLopez

https://github.com/franlopezsoto/Prueba3TPFranLopez



# Proyecto de Fábrica Abstracta

Este proyecto implementa el patrón de diseño de Fábrica Abstracta en Java. El proyecto incluye las siguientes clases e interfaces:

- `Elemento`: Una interfaz que representa un elemento con un precio y un código.
- `ElementoSimple`: Una clase que implementa la interfaz `Elemento`. Representa un elemento simple con un precio y un código.
- `Kit`: Una clase que implementa la interfaz `Elemento`. Representa un kit que contiene varios elementos.
- `ElementoFactory`: Una clase abstracta que declara los métodos para crear `ElementoSimple` y `Kit`.
- `ElementoFactoryImpl`: Una subclase concreta de `ElementoFactory` que implementa los métodos para crear `ElementoSimple` y `Kit`.

## Cómo usar

Para crear un `ElementoSimple` o un `Kit`, primero crea una instancia de `ElementoFactoryImpl` y luego llama a los métodos `crearElementoSimple` o `crearKit`:

```java
ElementoFactory factory = new ElementoFactoryImpl();
Elemento simple = factory.crearElementoSimple(100.0, 1);
Kit kit = factory.crearKit(2);
```
