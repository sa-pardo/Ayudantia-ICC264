# Ejercicio repaso prueba N°1

## Introduccion

Este ejemplo es para que noten como se realiza la implementacion en codigo de un diagrama de clases, incluyendo clases y sus relaciones (importante).


## Diagrama de clases

![Diagrama UML](/Ejercicio.png)

----

#### En este caso el contexto no es importante, ya que solo estamos enfocados en como se realiza la implementacion del diagrama UML, por lo mismo, las mayoria de las clases solo contiene atributos, la implementacion de los metodos no se vera, eso les corresponde a ustedes.


Les dejo los archivos ***.java*** para que revisen la implementacion, sobre todo la de las distintas relaciones.

----
## Notas

Fijense en las relaciones y su multiplicidad [**0**,**\***, **1..\***, **1..3**], la multiplicidad es tan importante como el tipo de relacion. 

El tipo de relacion define donde se implementara la relacion, en la clase como atributo (asociaciones) o en los metodos como parametro u objeto (dependencia), mientras que la multiplicidad de esta define el como se implementara, ej: un **ArrayList**, un **Array[]** o un objeto solamente.

En este ejemplo la clase **Cliente** tiene una relacion de asociacion con **Cuenta**, la cardinalidad en el extremo de **Cuenta** es *1..3*, por lo tanto, la implementacion en la clase **Cliente** de esta relacion es con una Array[] de tamaño 3.

La relacion entre **Ventas** y **Producto** es unidireccional hacia **Producto**, por lo que esta relacion solo se implementa en la clase **Venta** en modo de ArrayList, ya que en **Producto** no tendria sentido guardar todas las ventas en las que se ha vendido ese mismo producto.

&nbsp;

![imagen composicion](https://www.didierperez.com/wp-content/uploads/2012/02/uml-relacion-composicion.jpg)

Ya que en la *composición* la vida de los componentes (objeto perteneciente a la clase sin el rombo negro) esta asociada a la vida del objeto que los agrupa (objeto perteneciente a la clase donde esta el rombo negro), por lo general, lo que se hace es crear instancias de la clase los componentes (Clase B) en una instancia de la clase agrupadore (Clase A).

----

![relaciones](https://www.seas.es/blog/wp-content/uploads/ScreenShot083.png)

##### fuente: https://www.seas.es/blog/informatica/agregacion-vs-composicion-en-diagramas-de-clases-uml/