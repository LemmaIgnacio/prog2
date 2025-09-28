# POO
Es un enfoque para razonar sobre software que busca aumentar 
la productividad y la calidad, reusabilidad, extensibilidad y comprensión del código. 
Se enfoca en las abstracciones de los datos, encapsulando funciones y datos en entidades relacionadas.
Este enfoque reduce la "brecha semántica", que es la diferencia entre el modelo de software y
el dominio del problema que se está representando.

# Clases en Java

- Una clase es el molde a partir del cual se crean objetos.

- Define atributos (estado) y métodos (comportamiento).

- PascalCase (primera letra mayúscula).

```java
public class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
```

# Métodos en Java

- Los métodos son las acciones o comportamientos que puede realizar un objeto.

```java
visibilidad tipoRetorno nombreMetodo(parametros) {
    // cuerpo del método
    return valor; // si el tipo de retorno no es void
}

public int sumar(int a, int b) {
    return a + b;
}
```

# Constructores y Objetos en Java

- Un constructor es un método especial que se llama al crear un objeto con new.

- Sirve para inicializar los atributos de la clase.

- Tiene el mismo nombre que la clase y no devuelve nada.

```java
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

// Crear objeto (instancia de la clase)
Persona p1 = new Persona("Juan", 25);
```

# Getters y Setters

- Métodos para leer (get) y modificar (set) atributos privados.

- Garantizan el encapsulamiento.

```java
public class Persona {
    private String nombre;
    private int edad;

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
```

# Herencia en Java

- Una clase puede heredar atributos y métodos de otra.

- La clase heredada se llama subclase y la original superclase.

- Se usa la palabra clave extends.

```java
// Superclase
public class Animal {
    public void comer() {
        System.out.println("niam niam!");
    }
}

// Subclase
public class Perro extends Animal {
    public void ladrar() {
        System.out.println("miau?");
    }
}

// Uso
Perro p = new Perro();
p.comer();   // heredado de Animal
p.ladrar();  // propio de Perro
```