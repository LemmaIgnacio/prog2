
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

# 📘 **Clase 7 — 11/09 — Modelado de Objetos: Cooperativa de Cereales**

---

# 🌱 **Problema: Cooperativa de Cereales**

Una cooperativa necesita un sistema que permita:

1. Determinar **qué cereales se pueden sembrar en un lote**.
2. Determinar **qué lotes sirven para un cereal dado**.
3. Indicar si un **lote es común o especial**.

---

# 🌾 **Tipos de Cereales**

La consigna menciona:

* Granos de cosecha gruesa (maíz, girasol, …)
* Granos de cosecha fina (trigo, avena, …)
* Pasturas (alfalfa, trébol, …)

**Pregunta clave:**
¿Esto implica **clases distintas**?

✔ **Respuesta:** NO.
Son **instancias** de una misma clase `Cereal`.

---

# 🧩 **EXCEPCIÓN: Pastura**

La **pastura sí cambia el comportamiento**:

* Su método `apto(Lote unLote)` exige:

  * que el lote tenga los minerales necesarios
  * **y** que su superficie sea > 50

Por lo tanto:

✔ `Pastura` debe ser una **subclase** de `Cereal`.

---

# 🌱 **Modelado Correcto de Cereal**

Atributos típicos:

* `nombre`
* `mineralesRequeridos: List<String>`

Método:

```java
public boolean apto(Lote lote);
```

Subclase `Pastura`:

```java
public boolean apto(Lote lote) {
    return super.apto(lote) && lote.getSuperficie() > 50;
}
```

---

# 🧱 **Modelado del Lote**

Los lotes contienen:

* superficie
* minerales presentes

La clasificación **común/especial** NO es del lote.
La cooperativa decide.

✔ El lote **no sabe** si es “especial”.
✔ La cooperativa lo determina según sus listas de minerales prioritarios.

---

# 🏢 **Cooperativa**

Responsabilidades:

* Saber cuáles minerales son de:

  * **interés primario** (lote especial)
  * **interés secundario** (lote común)
* Recorrer sus lotes y cereales para responder:

  * qué sembrar en cada lote
  * qué lotes sirven para un cereal
  * si un lote es especial

---

# 🧪 **Mineral**

Si no tiene comportamiento propio → **no es una clase**.
Usar `String` para los nombres es suficiente.

Regla aplicada:
✔ “Si no tiene estado ni comportamiento significativo → NO es clase.”

---

# 📝 **Conclusión de la Clase de Modelado**

**Identificación de clases:**

* `Cereal`
* `Pastura` (subclase)
* `Lote`
* `Cooperativa`

**Lo que NO es clase:**

* “girasol, maíz, trigo” → **instancias**
* “minerales” → **strings**

Principio aplicado:

> Crear clases solo cuando existe **estado y comportamiento propio** que lo justifique.

---

# 📘 **Clase 8 — 11/09 — Dinámico vs Estático (Cambio de Comportamiento)**


---

# 🔄 **Cambios en Tiempo de Ejecución**

La clase introduce un concepto clave:

> Cambiar **atributos** es dinámico.
> Cambiar **comportamiento** normalmente es estático.

Ejemplo:

### ✔ Cambiar atributo directamente

```java
persona.setNombre("Carlos");
```

Todos los objetos relacionados se enteran del cambio.

### ✖ Cambiar comportamiento creando un objeto nuevo

```java
procesador = new ProcesadorCPU();
```

Los objetos que tenían referencia al procesador anterior **no se enteran**.

---

# 🟪 **Atributo vs Comportamiento**

* Atributo → se cambia dinámicamente vía setter.
* Comportamiento → NO se cambia vía setter porque Java no permite cambiar métodos en runtime.

Entonces, ¿cómo modificar comportamiento dinámicamente?

---

# 🛠 **Procesadores: el ejemplo central**

Problema:

* Primero implementamos:

  * `ProcesadorPrioridad`
  * `ProcesadorMemoria`
  * `ProcesadorCPU`
  * `ProcesadorLlegada`

Pero:

* Cambiar qué procesador se usa **requiere crear un objeto nuevo**.
* Los objetos que usaban el procesador viejo **no se enteran del cambio**.

---

# 🎯 **Objetivo real**

Cambiar **cómo se ordenan las tareas** en tiempo de ejecución, sin reconstruir el procesador.

---

# 🧩 **Solución: Separar responsabilidades**

Identificar qué cambia:

* No cambia el procesador.
* Cambia **la forma de almacenar/ordenar tareas**.

Entonces:

✔ Aparece la clase **ColaTareas** (strategy / composición).
✔ El procesador **posee** una cola.
✔ El comportamiento cambia reemplazando la cola, no el procesador.

---

# 🏗 **Diseño Final**

```
Procesador
   - ColaTareas cola
   - ejecutarTarea()

ColaTareas (interfaz o abstracta)
   - addTarea()
   - compare()

Subclases de ColaTareas:
   - ColaTareasPrioridad
   - ColaTareasCPU
   - ColaTareasMemoria
   - ColaTareasFIFO (Llegada)
```

El procesador ahora delega:

```java
cola.addTarea(tarea);
```

Para cambiar la política de ordenamiento:

```java
procesador.setCola(new ColaTareasCPU());
```

✔ Sin crear un procesador nuevo.
✔ Todos los objetos relacionados siguen usando el mismo procesador.
✔ Comportamiento dinámico mediante composición.

---

# 🔍 **Concepto clave de la clase**

> Para cambiar un comportamiento en runtime se debe **desacoplar** ese comportamiento en un objeto aparte, y reemplazarlo dinámicamente.

Patrón asociado:
✔ **Strategy Pattern**

---

# 📘 **Sistema de Archivos (Patrón Composite)**

---

## 🎯 **Problema a resolver**

Un Sistema de Archivos debe organizar y manipular:

* **Archivos**: tienen nombre, fecha de creación y tamaño.
* **Directorios**: tienen nombre, fecha de creación y contienen archivos y subdirectorios.

**Requerimientos:**

* Calcular el **tamaño total** de un directorio.
* Contar la **cantidad de elementos** que posee un directorio.

---

## 🗂️ **Versión 1.0 — Base**

### Estructura:

```
\
├── TUDAI/
│   ├── Prog2/
│   │   ├── Parcial.doc
│   │   ├── Recu.pdf
│   │   └── Prefi.txt
│   └── Fotos/
│       ├── 1er año/
│       ├── 2do año/
│       ├── Selfies/
│       └── Paisajes/
└── Pacman
```

### Servicios necesarios:

* `getTamanio()` → devuelve el tamaño del elemento
* `getCantidadElementos()` → cuenta elementos contenidos

---

## 🧩 **Modelado Orientado a Objetos v1.0**

```java
public abstract class ElementoFS {
    protected String nombre;
    protected LocalDate fCreacion;
    
    public abstract int getTamanio();
    public abstract int getCantidadElementos();
    
    // getters y setters
}
```

### Archivo:

```java
public class Archivo extends ElementoFS {
    private int tamanio;
    
    public int getTamanio() {
        return this.tamanio;
    }
    
    public int getCantidadElementos() {
        return 1; // el archivo mismo
    }
}
```

### Carpeta (Directorio):

```java
public class Carpeta extends ElementoFS {
    private ArrayList<ElementoFS> elementos;
    
    public int getTamanio() {
        int total = 0;
        for (ElementoFS elem : elementos) {
            total += elem.getTamanio();
        }
        return total;
    }
    
    public int getCantidadElementos() {
        int total = 0;
        for (ElementoFS elem : elementos) {
            total += elem.getCantidadElementos();
        }
        return total;
    }
}
```

---

## 🗜️ **Versión 2.0 — Archivos Comprimidos**

### Nuevo elemento: **Comprimido**

* Contiene otros archivos y/o directorios.
* Reduce su tamaño según una **tasa de compresión**.
* Tiene nombre y fecha de creación.

**Ejemplo:**

```
Paisajes/
└── playa.zip
    ├── listado.txt
    └── picture.jpg
```

### Implementación:

```java
public class Comprimido extends ElementoFS {
    private ArrayList<ElementoFS> elementos;
    private double tasaCompresion; // ej: 0.5 = 50%
    
    public int getTamanio() {
        int total = 0;
        for (ElementoFS elem : elementos) {
            total += elem.getTamanio();
        }
        return (int)(total * tasaCompresion);
    }
    
    public int getCantidadElementos() {
        int total = 0;
        for (ElementoFS elem : elementos) {
            total += elem.getCantidadElementos();
        }
        return total;
    }
}
```

---

## 🔗 **Versión 3.0 — Accesos Directos (Links)**

### Nuevo elemento: **AccesoDirecto (Link)**

* Vínculo a otro archivo, directorio o incluso otro link.
* **Tamaño fijo:** siempre 1KB.
* Nombre por defecto: `"Acceso directo a " + nombreDestino`

**Ejemplo:**

```
Prog2/
├── Prefi.txt
└── Acceso directo a Prefi.txt
```

### Implementación:

```java
public class AccDirecto extends ElementoFS {
    private static final int TAMANIO_FIJO = 1; // 1KB
    private ElementoFS destino;
    
    public AccDirecto(ElementoFS destino) {
        this.destino = destino;
        this.nombre = "Acceso directo a " + destino.getNombre();
    }
    
    public int getTamanio() {
        return TAMANIO_FIJO; // siempre 1KB
    }
    
    public int getCantidadElementos() {
        return destino.getCantidadElementos();
    }
}
```

---

## 🏗️ **Diagrama de Clases Final**

```
ElementoFS (abstracta)
├── nombre: String
├── fCreacion: LocalDate
├── getTamanio(): int
└── getCantidadElementos(): int

    ↑ extienden
    │
    ├── Archivo
    │   └── tamanio: int
    │
    ├── Carpeta
    │   └── elementos: List<ElementoFS>
    │
    ├── Comprimido
    │   ├── elementos: List<ElementoFS>
    │   └── tasaCompresion: double
    │
    └── AccDirecto
        └── destino: ElementoFS
```

---

## 🎯 **Patrón aplicado: COMPOSITE**

### Características:

* **Composición recursiva**: las carpetas contienen elementos, que pueden ser carpetas.
* **Tratamiento uniforme**: todos los elementos implementan los mismos métodos.
* **Polimorfismo**: el código cliente no necesita saber si está tratando con un archivo, carpeta o comprimido.

### Ventajas:

✅ Fácil agregar nuevos tipos de elementos (extensibilidad).  
✅ Simplifica el código cliente.  
✅ Operaciones recursivas naturales.

---

## 📌 **Conceptos clave**

| Concepto | Aplicación |
|----------|-----------|
| **Herencia** | Todos heredan de `ElementoFS` |
| **Polimorfismo** | `ArrayList<ElementoFS>` puede contener cualquier tipo |
| **Recursión** | Carpetas calculan tamaño sumando sus elementos |
| **Composición** | Carpetas y comprimidos contienen otros elementos |
| **Constantes** | `TAMANIO_FIJO` en AccDirecto |

---

## 💡 **Lecciones de diseño**

1. **Abstracción**: `ElementoFS` define el contrato común.
2. **Delegación**: Carpetas y comprimidos delegan el cálculo a sus elementos.
3. **Responsabilidad única**: Cada clase sabe cómo calcular su propio tamaño.
4. **Patrón Composite**: Permite tratar objetos individuales y composiciones de manera uniforme.

---

