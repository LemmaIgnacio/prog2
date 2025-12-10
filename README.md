
# **🔵 CLASE 1 – Introducción a Objetos y Java**

## **1. ¿Qué es Programación Orientada a Objetos (POO)?**

* Paradigma basado en **objetos** que encapsulan **estado (datos)** y **comportamiento (métodos)**.
* Objetos que **colaboran** entre sí mediante el **envío de mensajes**.
* Permite:

  * mayor **mantenibilidad**
  * **extensibilidad**
  * **reusabilidad**
  * mejor **comprensibilidad**

## **2. Conceptos centrales**

### ✔ **Objeto**

* Unidad de software.
* Tiene **identidad**, **estado** y **comportamiento**.
* Representa cosas reales (Avión, Alumno) o abstractas (Evento, Cálculo).

### ✔ **Clase**

* Es un **molde / fábrica** que define cómo son los objetos.
* Tiene atributos y métodos.
* De una clase pueden crearse muchas **instancias**.

### ✔ **Atributo vs Variable de instancia**

* *Atributo*: la característica conceptual (color, capacidad).
* *Variable de instancia*: dónde se guarda el valor real en memoria.

### ✔ **Encapsulamiento**

* Los **datos → privados**
* Los **métodos → públicos** (en general)
* Se accede por getters y setters.

### ✔ **Mensajes y métodos**

* **Mensaje** = pedido enviado a un objeto.
* **Método** = código que responde ese mensaje.

---

## **3. Crear clases y objetos**

### Ejemplo básico:

```java
public class Avion {
    int capacidad;
    String estado;
    String color;

    public Avion(){
        capacidad = 100;
        estado = "en Tierra";
        color = "Blanco";
    }

    public Avion(int cap, String col){
        capacidad = cap;
        color = col;
        estado = "en Tierra";
    }
}
```

Instancia:

```java
Avion a = new Avion(50,"Rojo");
```

---

## **4. Uso de referencias**

* Asignar un objeto copia **la referencia**, no el objeto.

Ejemplo:

```java
Die d = new Die();
Die e = d;   // ambos apuntan al mismo objeto
```

`==` compara **direcciones**, no contenidos.

---

# **🔵 CLASE 2 – Ejemplo Dados (modelado de objetos)**

---

## **1. Objetivo**

Aprender a:

* identificar **objetos**
* definir sus **responsabilidades**
* entender **colaboraciones**
* mejorar diseños pobres

---

## **2. Alternativa 1 – MAL diseño**

Todo en una sola clase `Juego`.

* Procedural.
* Sin objetos claros.
* No hay separación de responsabilidades.
* Difícil de mantener/extender.

---

## **3. Alternativa 2 – Dado como objeto**

Definir clase `Die`:

Responsabilidades:

* **roll()** → genera un valor 1–6
* **getFaceValue()**

Atributo:

* **faceValue**

Diseño correcto: cada objeto hace lo suyo (**Lo hago yo mismo**).

---

## **4. Alternativa 3 – Jugador como objeto**

Un jugador sabe:

* su nombre
* sus puntos
* **jugar su turno** → takeTurn()

Movimiento del código:

* el jugador tira los dados
* devuelve el valor de la tirada
* si gana, incrementa su puntaje

---

## **5. Cup (Cubilete)**

Modela composición:

* Un `Cup` **contiene dos dados**.
* Cuando se tira el Cup, tira *ambos*.

Composición permite:

* ocultar detalles
* reducir complejidad

---

## **6. Solución final**

Objetos:

* **Die**
* **Cup** (contiene 2 Die)
* **Player**
* **DiceGame** (coordina el juego)

Principios aplicados:

* **Encapsulamiento**
* **Delegación**
* **Composición**
* **Responsabilidades claras**

---

# **🔵 CLASE 3 – Herencia**

---

## **1. Herencia**

Mecanismo de:

* **abstracción**
* **clasificación**
* **extensión**
* **reuso**

Permite definir:

* **superclase** con atributos/métodos comunes
* **subclases** que extienden y refinan

---

## **2. Ejemplo: Figura**

Superclase:

```java
public class Figura {
    String nombre;
    public double getArea(){
        return 0.0;
    }
    public String getNombre(){ return nombre; }
}
```

---

## **3. Subclases**

### Circulo:

```java
public class Circulo extends Figura {
    double radio;
    public double getArea(){
        return Math.PI * radio * radio;
    }
}
```

### Triángulo:

```java
public class Triangulo extends Figura {
    double base;
    double altura;
    public double getArea(){
        return (base * altura) / 2;
    }
}
```

---

## **4. Constructores y super**

Los constructores **NO se heredan**.

Para llamar al constructor padre:

```java
public Circulo(int r){
    super("circulo");
    this.radio = r;
}
```

Siempre va en **primera línea**.

---

## **5. Asignaciones válidas**

```java
Figura f = new Circulo();  // ok
f = new Triangulo();       // ok

Circulo c = new Figura();  // error
Triangulo t = new Circulo(); // error
```

Una referencia de tipo padre puede almacenar objetos hijos.
A la inversa, **no**.

---

## **6. Polimorfismo**

Una misma referencia puede representar distintos tipos.

Ejemplo:

```java
public void imprimirFigura(Figura f){
    System.out.println(f.getArea());
}
```

Se usa en **parámetros**, **colecciones**, **interfaces**.

---

## **7. Binding dinámico**

El método ejecutado depende de la **clase real del objeto** en tiempo de ejecución, no del tipo de referencia.

Ejemplo:

```java
Figura f = new Circulo(4);
f.getArea(); // ejecuta getArea del Circulo
```

---
Perfecto, ya tengo todo el contenido de **Clase 4**, **Clase 5 (ambos PDFs)** y **Clase 6**.
A continuación te dejo **resúmenes completos, claros y listos para pegar en tu README.md**, siguiendo **el mismo formato** que usé en las clases anteriores.

---

# 📘 **Clase 4  — Conceptos + Dados Cargados + Object + ArrayList**

## 🎲 **Problema: Dados y Herencia**

* Se plantea un juego con un **Dado**, y luego se agregan **dados cargados** que favorecen números específicos.
* Mal enfoque inicial: crear clases `DadoCargado5`, `DadoCargado6`.
  **Error conceptual:**

  * Las clases no deben diferenciarse *solo por una constante*.
  * Debe existir **una sola clase DadoCargado**, con un atributo `ladoCargado`.

✔ **Solución correcta:**

```java
public class DadoCargado extends Dado {
    int ladoCargado;

    public int tirar() {
        if (Math.random() > 0.5)
            return super.tirar();
        else
            return ladoCargado;
    }
}
```

## ❗ **Regla de oro:** *NO debe haber constantes en el código duro*.

→ `"juan"`, `84`, `"a"`, `5`, `6` deben ser **variables**, no constantes embebidas.

---

# 🧱 **Clase vs Instancia**

* Si dos clases cambian solo por un valor constante → **son la misma clase**.
* Ejemplo:

  * ❌ `PersonaJuan`, `PersonaPedro`
  * ✔ Una clase `Persona` con atributo `nombre`

---

# 🧩 **La clase Object**

Toda clase en Java **hereda de Object**.

Métodos importantes:

* `equals(Object obj)`
* `toString()`
* `finalize()` (deprecated en versiones modernas, pero conceptual)

## **equals()**

Por default compara **referencias**, no contenido.

Para redefinirlo:

```java
public boolean equals(Object obj) {
    Dado other = (Dado) obj;
    return this.getValor() == other.getValor();
}
```

## **toString()**

Usado automáticamente con `System.out.println(obj);`

Ejemplo:

```java
public String toString() {
    return "Dado con valor = " + this.getValor();
}
```

---

# 📚 **ArrayList**

Ventajas frente a arreglos:

* Crece dinámicamente
* Métodos útiles: `add`, `get`, `remove`, `size`, `set`

Ejemplo:

```java
ArrayList<String> nombres = new ArrayList<>();
nombres.add("Alice");
nombres.add("Bob");
nombres.add(1, "Juan"); 
nombres.remove(2);
```

---

# 📘 **Clase 5 — Conceptos (this, super, static, final, paquetes)**

## 🟦 **this**

Referencia al **objeto actual**.

Usos:

* Diferenciar atributo vs variable local:

  ```java
  this.nombre = nombre;
  ```
* Pasarse como parámetro
* Llamar a otro constructor:

  ```java
  this(dni);
  ```

---

# 📦 **Paquetes**

Organizan el código:

```java
package tp3.ejercicio1;
import java.util.Vector;
import java.io.*;
```

---

# 🔐 **Modificadores de Acceso**

* `private`
* `protected`
* `public`
* *default* (sin palabra clave)

✔ Regla clave: **Nunca atributos públicos**.

---

# 🟥 **super**

Refiere a la **clase padre**.

Usos:

* Llamar métodos del padre:

  ```java
  super.getArea()
  ```
* Obligatorio en algunos constructores:

  ```java
  super(dni);
  ```

---

# 🟨 **Atributos y Métodos de Clase (static)**

## **Atributo estático**

* 1 sola copia, compartida por todas las instancias.
* Ideal para cosas como contadores:

  ```java
  static int contador;
  ```

## **Método estático**

* Puede invocarse sin instancias:

  ```java
  Math.random();
  ```

✔ No se puede usar métodos NO estáticos dentro de métodos estáticos.

---

# 🟧 **final**

| Donde    | Significa               |
| -------- | ----------------------- |
| Atributo | No cambia nunca         |
| Método   | No puede sobrescribirse |
| Clase    | No puede heredarse      |

Ejemplo constante:

```java
public static final int MAYOR_EDAD = 23;
```

---

