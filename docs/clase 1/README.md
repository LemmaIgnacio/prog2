# POO
Es un enfoque para razonar sobre software que busca aumentar 
la productividad y la calidad, reusabilidad, extensibilidad y comprensión del código. 
Se enfoca en las abstracciones de los datos, encapsulando funciones y datos en entidades relacionadas.
Este enfoque reduce la "brecha semántica", que es la diferencia entre el modelo de software y
el dominio del problema que se está representando.

# Conceptos Fundamentales:
Objeto: Es un componente de software que se almacena en la memoria y encapsula datos 
        y comportamiento en una sola unidad. Pueden representar conceptos del mundo real (como un 
        Avion o un Alumno) o entidades abstractas (como una fórmula matemática o un evento).
        Los objetos revelan lo que pueden hacer, pero no cómo lo hacen.
Encapsulamiento: Se refiere a la ocultación de información o detalles. 
                Los datos de un objeto son privados y no pueden ser accedidos o 
                modificados desde el "mundo exterior". Para interactuar con un objeto, 
                se deben enviar mensajes a sus métodos, los cuales son típicamente públicos.
Mensajes y Métodos:
  Mensaje: Una señal enviada a un objeto para invocar un método.
  Método: El comportamiento de un objeto que se ejecuta al recibir un mensaje.

Clase: Es un molde para crear objetos con un comportamiento y estado predefinido. 
      Se puede pensar como una fábrica que crea instancias de un tipo específico.

Instancia: Es el objeto creado a partir de una clase. Ocupa espacio en memoria, 
          tiene su propio estado y comportamiento, y sabe a qué clase pertenece. 
          Un programa suele necesitar muchas instancias de la misma clase, por ejemplo, múltiples objetos de la clase 

# Java como Lenguaje de POO
Java: Es un lenguaje de programación orientado a objetos y una plataforma de desarrollo multiplataforma. 
      Sin embargo, usar Java no garantiza automáticamente una solución bien diseñada si no se aplican los principios de la POO.

Plataforma Java: Es un conjunto de herramientas de software (programas y bibliotecas) para crear aplicaciones multiplataforma. 
                Las aplicaciones se escriben en lenguaje Java y son compiladas a un lenguaje intermedio llamado Bytecode.


Máquina Virtual de Java (VM): Es el programa central de la plataforma Java que traduce el Bytecode al código de la máquina actual, 
                              permitiendo que las aplicaciones corran en diferentes sistemas operativos como Windows, Linux o Android.
                              La VM también gestiona la memoria de forma automática con un sistema de "limpieza" llamado Garbage Collector (GC)

# Sintaxis
Creación de una Clase: Se define con la palabra clave class y se guarda en un archivo con el mismo nombre y extensión .java. 
                      Por convención, los nombres de las clases siempre comienzan con mayúsculas.

Atributos: Son las variables que definen el estado de un objeto.
          Deben tener una alta cohesión, lo que significa que están directamente 
          relacionadas con la entidad que representan.

Métodos: Definen el comportamiento del objeto. 
        Se usa la notación camelCase para los nombres de los métodos y variables, 
        mientras que para las clases se usa PascalCase.

Constructor: Es un método especial que se invoca al crear una nueva instancia de una clase. 
              Se encarga de inicializar los valores del objeto. Una clase puede tener múltiples constructores, 
              siempre que tengan una "signatura" (lista de parámetros) diferente.
