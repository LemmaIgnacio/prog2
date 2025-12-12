
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

# 📘 **Búsquedas en Sistema de Archivos**   

---

## 🎯 **Problema: Búsquedas flexibles**

El sistema de archivos ahora necesita **buscar archivos** que cumplan ciertas condiciones:

* Por nombre
* Por tamaño
* Por fecha de creación
* Por extensión
* Combinaciones de condiciones (AND, OR, NOT)

---

## 🔍 **Nuevo requerimiento**

Agregar al sistema:

```java
public ArrayList<Archivo> buscar(Condicion condicion);
```

Este método debe:
* Recorrer toda la estructura
* Evaluar cada archivo contra la condición
* Devolver solo los archivos que cumplan

---

## 🧩 **Patrón aplicado: Strategy + Composite**

### Estrategia de búsqueda

En lugar de hardcodear las condiciones, se crea una **interfaz Condicion**:

```java
public interface Condicion {
    boolean cumple(Archivo archivo);
}
```

Esto permite:
✅ Agregar nuevas condiciones sin modificar el código existente  
✅ Combinar condiciones dinámicamente  
✅ Reutilizar condiciones en distintos contextos

---

## 📦 **Implementación en ElementoSA**

```java
public abstract class ElementoSA {
    private String nombre;
    private LocalDate fechaCreacion;
    
    // Constructor y getters/setters...
    
    public abstract double getTamanio();
    public abstract int cantElementos();
    public abstract ArrayList<Archivo> buscar(Condicion condicion);
    
    @Override
    public boolean equals(Object o) {
        try {
            ElementoSA otroElemento = (ElementoSA) o;
            return otroElemento.getNombre().equals(this.getNombre());
        } catch (ClassCastException e) {
            return false;
        }
    }
}
```

**Nota importante:** El `equals()` compara por **nombre**, no por referencia.

---

## 📄 **Búsqueda en Archivo**

```java
public class Archivo extends ElementoSA {
    private double tamanio;
    
    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        ArrayList<Archivo> resultado = new ArrayList<>();
        if (condicion.cumple(this))
            resultado.add(this);
        return resultado;
    }
}
```

**Lógica:**
* Si el archivo cumple la condición → se agrega al resultado
* Si no cumple → retorna lista vacía

---

## 📁 **Búsqueda en Directorio**

```java
public class Directorio extends ElementoSA {
    private ArrayList<ElementoSA> elementos;
    
    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        ArrayList<Archivo> resultado = new ArrayList<>();
        
        for (ElementoSA elemento : elementos) {
            ArrayList<Archivo> resultadoParcial = elemento.buscar(condicion);
            for (Archivo archivoQueCumple : resultadoParcial) {
                resultado.add(archivoQueCumple);
            }
        }
        return resultado;
    }
}
```

**Lógica recursiva:**
1. Itera sobre cada elemento contenido
2. Pide a cada elemento que busque (delegación)
3. Acumula todos los resultados parciales
4. Retorna el resultado completo

---

## 🗜️ **Búsqueda en Comprimido**

```java
public class Comprimido extends Directorio {
    private double tasaCompresion;
    
    @Override
    public double getTamanio() {
        return super.getTamanio() * tasaCompresion;
    }
}
```

**Ventaja de heredar de Directorio:**
* No necesita redefinir `buscar()`
* Hereda el comportamiento de búsqueda recursiva
* Solo modifica el cálculo de tamaño

---

## 🔗 **Búsqueda en AccesoDirecto**

```java
public class AccesoDirecto extends ElementoSA {
    private static double tamanio = 1.0;
    private ElementoSA loQueApunta;
    private static final String PREFIJO = "Acceso directo a ";
    
    public AccesoDirecto(ElementoSA loQueApunta) {
        super(PREFIJO + loQueApunta.getNombre());
        this.loQueApunta = loQueApunta;
    }
    
    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        return new ArrayList<>(); // Lista vacía
    }
}
```

**Decisión de diseño:**
* Los accesos directos **NO** participan en búsquedas
* Retorna lista vacía
* Evita duplicados (el elemento real ya fue evaluado)

---

## 🎨 **Ejemplos de Condiciones**

### Condición por nombre:

```java
public class CondicionNombre implements Condicion {
    private String nombre;
    
    public CondicionNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean cumple(Archivo archivo) {
        return archivo.getNombre().contains(nombre);
    }
}
```

### Condición por tamaño:

```java
public class CondicionTamanioMayor implements Condicion {
    private double tamanioMinimo;
    
    public CondicionTamanioMayor(double tamanio) {
        this.tamanioMinimo = tamanio;
    }
    
    @Override
    public boolean cumple(Archivo archivo) {
        return archivo.getTamanio() > tamanioMinimo;
    }
}
```

### Condición por extensión:

```java
public class CondicionExtension implements Condicion {
    private String extension;
    
    public CondicionExtension(String extension) {
        this.extension = extension;
    }
    
    @Override
    public boolean cumple(Archivo archivo) {
        return archivo.getNombre().endsWith(extension);
    }
}
```

---

## 🔧 **Condiciones Compuestas**

### AND (todas deben cumplirse):

```java
public class CondicionAND implements Condicion {
    private Condicion c1;
    private Condicion c2;
    
    public CondicionAND(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    @Override
    public boolean cumple(Archivo archivo) {
        return c1.cumple(archivo) && c2.cumple(archivo);
    }
}
```

### OR (al menos una debe cumplirse):

```java
public class CondicionOR implements Condicion {
    private Condicion c1;
    private Condicion c2;
    
    @Override
    public boolean cumple(Archivo archivo) {
        return c1.cumple(archivo) || c2.cumple(archivo);
    }
}
```

### NOT (negación):

```java
public class CondicionNOT implements Condicion {
    private Condicion condicion;
    
    public CondicionNOT(Condicion condicion) {
        this.condicion = condicion;
    }
    
    @Override
    public boolean cumple(Archivo archivo) {
        return !condicion.cumple(archivo);
    }
}
```

---

**Estructura creada:**

```
//
├── TUDAI/
│   ├── calendario (10KB)
│   ├── 1er año/
│   │   └── Prog2/
│   │       ├── parcial.doc (100KB)
│   │       ├── recu.pdf (200KB)
│   │       └── prefi.txt (300KB)
│   └── 2do año/
├── Fotos/
│   ├── Selfies.zip (compresión 50%)
│   │   ├── selfie.jpg (25KB)
│   │   ├── rindiendo el parcial.jpg (25KB)
│   │   ├── cara de recu.gif (25KB)
│   │   └── firulais.jpg (25KB)
│   └── Paisajes/
├── Pacman/
└── Acceso directo a prefi.txt (1KB)
```

**Tamaño real de Selfies.zip:** (25 + 25 + 25 + 25) × 0.5 = **50KB**

---

## 🏗️ **Diagrama de Clases actualizado**

```
ElementoSA (abstracta)
├── nombre: String
├── fechaCreacion: LocalDate
├── getTamanio(): double
├── cantElementos(): int
└── buscar(Condicion): ArrayList<Archivo>

    ↑ extienden
    │
    ├── Archivo
    │   └── tamanio: double
    │
    ├── Directorio
    │   └── elementos: List<ElementoSA>
    │
    ├── Comprimido (extiende Directorio)
    │   └── tasaCompresion: double
    │
    └── AccDirecto
        └── loQueApunta: ElementoSA


Condicion (interface)      ←─── usa ───┐
└── cumple(Archivo): boolean           │
                                       │
    ↑ implementan                      │
    │                                  │
    ├── CondicionNombre                │
    ├── CondicionTamanio               │
    ├── CondicionExtension             │
    ├── CondicionAND ──────────────────┘
    ├── CondicionOR
    └── CondicionNOT
```

---

## 🎯 **Patrones de Diseño aplicados**

| Patrón | Aplicación |
|--------|-----------|
| **Composite** | Estructura recursiva de archivos y directorios |
| **Strategy** | Encapsular algoritmos de búsqueda en condiciones intercambiables |
| **Template Method** | `buscar()` define el esqueleto, cada clase lo implementa |
| **Delegation** | Directorio delega búsqueda a sus elementos |

---

## 💡 **Conceptos clave**

### ✅ Ventajas del diseño con Condiciones:

1. **Open/Closed Principle**: Abierto a extensión (nuevas condiciones), cerrado a modificación
2. **Composición de condiciones**: AND, OR, NOT permiten búsquedas complejas
3. **Reusabilidad**: Las condiciones se pueden reutilizar
4. **Testabilidad**: Cada condición se puede probar independientemente

### ✅ Recursión en Composite:

* Cada `Directorio` delega a sus elementos
* Los `Archivo` son el caso base (leaf)
* El resultado se acumula en cada nivel

### ✅ Decisiones de diseño:

* `AccesoDirecto` no busca en su destino (evita duplicados)
* `Comprimido` hereda de `Directorio` (reutiliza comportamiento)
* `equals()` compara por nombre (no por referencia)

---

---

# 📘 **(Parte 2) Evolución del Sistema de Búsquedas**

---

## 🔄 **Cambio fundamental en la búsqueda**

### ❌ Versión anterior (sistemaArchivosSlides):
```java
public abstract ArrayList<Archivo> buscar(Condicion condicion);
```
* Solo retornaba **Archivos**
* Los directorios no podían ser resultado de búsqueda

### ✅ Versión mejorada (sistemaArchivosTP9):
```java
public abstract ArrayList<ElementoSA> buscar(Condicion condicion);
```
* Retorna **cualquier ElementoSA** (Archivo, Directorio, Comprimido, AccDirecto)
* Permite buscar carpetas, comprimidos, etc.

---

## 🧩 **Implementación mejorada en ElementoSA**

```java
public ArrayList<ElementoSA> buscar(Condicion condicion) {
    ArrayList<ElementoSA> resultado = new ArrayList<>();
    if (condicion.cumple(this))
        resultado.add(this);
    return resultado;
}
```

**Cambio clave:**
* Ahora está **implementado en la clase abstracta** (no es abstracto)
* Comportamiento por defecto: evaluarse a sí mismo
* Las subclases pueden sobrescribirlo si necesitan comportamiento especial

---

## 📁 **Búsqueda en Directorio - Template Method**

```java
public class Directorio extends ElementoSA {
    protected ArrayList<ElementoSA> elementos;
    
    @Override
    public ArrayList<ElementoSA> buscar(Condicion condicion) {
        // 1. Primero me evalúo yo mismo (llamada a super)
        ArrayList<ElementoSA> resultado = super.buscar(condicion);
        
        // 2. Luego pregunto a mis hijos
        for (ElementoSA elemento : elementos) {
            resultado.addAll(elemento.buscar(condicion));
        }
        
        return resultado;
    }
}
```

**Patrón Template Method aplicado:**
1. **super.buscar(condicion)** → evalúa si el directorio mismo cumple
2. Luego itera sobre sus elementos
3. **addAll()** en lugar de agregar uno por uno

---

## 🗜️ **Comprimido - Comportamiento especial**

```java
public class Comprimido extends Directorio {
    private double tasaCompresion;
    
    @Override
    public ArrayList<ElementoSA> buscar(Condicion condicion) {
        ArrayList<ElementoSA> resultado = new ArrayList<>();
        ArrayList<ElementoSA> resultadoParcial = super.buscar(condicion);
        
        if (!resultadoParcial.isEmpty()) {
            resultado.add(this); // Solo agrega el comprimido
        }
        
        return resultado;
    }
}
```

**Lógica especial:**
* Si **algún elemento interno** cumple la condición
* Retorna **el comprimido completo**, no sus elementos individuales
* **No expone su contenido** en los resultados

**¿Por qué?**
* Los archivos dentro del `.zip` no son directamente accesibles
* Solo interesa saber que el comprimido contiene algo relevante

---

## 📄 **Archivo - Simplificación**

```java
public class Archivo extends ElementoSA {
    private double tamanio;
    
    // Ya NO sobrescribe buscar()
    // Usa el comportamiento por defecto de ElementoSA
}
```

**Cambio:**
* Antes tenía su propia implementación
* Ahora **hereda** el comportamiento de `ElementoSA`
* Código más limpio y menos redundancia

---

## 🔗 **AccesoDirecto - Sin búsqueda**

```java
public class AccesoDirecto extends ElementoSA {
    private static double tamanio = 1.0;
    private ElementoSA loQueApunta;
    
    // NO sobrescribe buscar()
    // Usa el comportamiento por defecto
}
```

**Comportamiento:**
* Se evalúa a sí mismo (por defecto)
* **NO** delega al elemento que apunta
* Evita duplicados en resultados

---

## 🎯 **Comparación de enfoques**

### Búsqueda en Directorio:

| Aspecto | Versión Slides | Versión TP9 |
|---------|----------------|-------------|
| Retorno | `ArrayList<Archivo>` | `ArrayList<ElementoSA>` |
| Auto-evaluación | ❌ No | ✅ Sí (`super.buscar()`) |
| Método en padre | Abstracto | Implementado |
| Agregado | Loop con `add()` | `addAll()` |

### Búsqueda en Comprimido:

| Aspecto | Versión Slides | Versión TP9 |
|---------|----------------|-------------|
| Sobrescribe | ❌ No | ✅ Sí |
| Retorna | Contenido interno | El comprimido mismo |
| Lógica | Hereda de Directorio | Comportamiento especial |

---

## 💡 **Ventajas del nuevo diseño**

### ✅ Menos código duplicado:
* `Archivo` ya no necesita implementar `buscar()`
* Reutiliza el comportamiento de `ElementoSA`

### ✅ Template Method:
* `ElementoSA` define comportamiento base
* `Directorio` lo extiende agregando búsqueda recursiva
* `Comprimido` lo especializa con lógica propia

### ✅ Encapsulación en Comprimidos:
* El usuario no ve los archivos internos del `.zip`
* Solo sabe que el comprimido contiene algo relevante

---

## 🏗️ **Diagrama de flujo de búsqueda**

```
ElementoSA.buscar(condicion)
    │
    ├─ if cumple(this) → add(this)
    └─ return resultado

         ↓ override en Directorio

Directorio.buscar(condicion)
    │
    ├─ resultado = super.buscar(condicion)  ← Evalúa el directorio
    ├─ for elemento in elementos:
    │      resultado.addAll(elemento.buscar(condicion))  ← Recursión
    └─ return resultado

         ↓ override en Comprimido

Comprimido.buscar(condicion)
    │
    ├─ resultadoParcial = super.buscar(condicion)
    ├─ if !resultadoParcial.isEmpty():
    │      resultado.add(this)  ← Solo agrega el comprimido
    └─ return resultado
```
---

## 🎯 **Conceptos clave reforzados**

| Concepto | Aplicación |
|----------|-----------|
| **Template Method** | `ElementoSA` define base, subclases especializan |
| **DRY (Don't Repeat Yourself)** | Código común sube a `ElementoSA` |
| **Open/Closed** | Fácil agregar nuevas condiciones sin tocar búsqueda |
| **Polimorfismo** | Retorno `ArrayList<ElementoSA>` acepta cualquier tipo |
| **Encapsulación** | Comprimido oculta su estructura interna |

---

## 🚀 **Mejoras implementadas**

✅ **Generalización:** De `Archivo` a `ElementoSA`  
✅ **Reutilización:** Comportamiento por defecto en clase abstracta  
✅ **Especialización:** Comprimido retorna solo a sí mismo  
✅ **Claridad:** `addAll()` es más expresivo que loop con `add()`  
✅ **Extensibilidad:** Fácil agregar nuevos tipos de elementos

---

# 📘 **Copia y Copia Condicional (Patrón Prototype)**

---

## 🎯 **Nuevas funcionalidades**

Esta versión agrega:

1. **Copia completa** de elementos (Patrón Prototype)
2. **Copia condicional** (solo elementos que cumplen criterios)


---

## 📋 **Patrón Prototype - Copia completa**

### Método abstracto en ElementoSA:

```java
public abstract ElementoSA copiar();
```

Cada clase debe saber cómo copiarse a sí misma.

---

### Copia de Archivo:

```java
@Override
public ElementoSA copiar() {
    Archivo copia = new Archivo(this.getNombre(), this.getTamanio());
    return copia;
}
```

**Copia superficial:**
* Crea un nuevo `Archivo` con los mismos valores
* No comparte referencias

---

### Copia de Directorio:

```java
@Override
public ElementoSA copiar() {
    Directorio copia = this.crearElemento();
    for (ElementoSA elemento : this.elementos) {
        ElementoSA copiaElemento = elemento.copiar();
        copia.addElemento(copiaElemento);
    }
    return copia;
}

public Directorio crearElemento() {
    return new Directorio(this.getNombre());
}
```

**Copia profunda recursiva:**
1. Crea un directorio vacío
2. Itera sobre cada elemento
3. Llama a `copiar()` de cada hijo (polimorfismo)
4. Agrega la copia al nuevo directorio

---

### Factory Method en Comprimido:

```java
@Override
public Directorio crearElemento() {
    return new Comprimido(this.getNombre(), this.getTasaCompresion());
}
```

**Patrón Factory Method:**
* `Directorio` usa `crearElemento()` para instanciarse
* `Comprimido` lo sobrescribe para crear un `Comprimido`
* Permite reutilizar el código de `copiar()` del padre

---

### Copia de AccesoDirecto:

```java
@Override
public ElementoSA copiar() {
    AccesoDirecto copia = new AccesoDirecto(this.getLoQueApunta());
    return copia;
}
```

**Decisión:** 
* La copia apunta **al mismo elemento** (copia superficial de la referencia)
* No copia el elemento destino

---

## 🔍 **Copia condicional**

### Método abstracto:

```java
public abstract ElementoSA copiar(Condicion condicion);
```

Copia solo los elementos que cumplen la condición.

---

### Copia condicional en Archivo:

```java
@Override
public ElementoSA copiar(Condicion condicion) {
    if (condicion.cumple(this)) {
        return this.copiar();
    }
    else return null; // Acordarse de atajar esto!
}
```

**Lógica:**
* Si cumple → devuelve copia
* Si no cumple → devuelve `null`

---

### Copia condicional en Directorio:

```java
@Override
public ElementoSA copiar(Condicion condicion) {
    Directorio copia = this.crearElemento();
    for (ElementoSA elemento : this.elementos) {
        ElementoSA copiaElemento = elemento.copiar(condicion);
        if (copiaElemento != null) { // Acá atajos los nulos
            copia.addElemento(copiaElemento);
        } // else no hago nada, no lo agrego
    }
    if (copia.tieneElementos())
        return copia;
    else
        return null; // Ojo, ¿quién lo ataja?
}

public boolean tieneElementos() {
    return !this.elementos.isEmpty();
}
```

**Lógica compleja:**
1. Crea directorio vacío
2. Itera sobre hijos pidiendo copias condicionales
3. **Filtra nulls** → solo agrega copias válidas
4. Si el directorio queda vacío → retorna `null`
5. Si tiene al menos un elemento → retorna la copia

**Problema del diseño:**
* Los `null` se propagan hacia arriba
* Cada nivel debe atajarlos

---

### Copia condicional en AccesoDirecto:

```java
@Override
public ElementoSA copiar(Condicion condicion) {
    return null; // Hacerlo!!!
}
```
---

## 🎯 **Patrones de diseño aplicados**

| Patrón | Aplicación |
|--------|-----------|
| **Prototype** | `copiar()` permite clonar objetos sin conocer su tipo exacto |
| **Factory Method** | `crearElemento()` permite a subclases definir qué crear |
| **Composite** | Recursión natural en copia e impresión |

---

## 🧩 **Diagrama de flujo - Copia condicional**

```
Directorio.copiar(condicion)
    │
    ├─ copia = crearElemento()
    │
    ├─ for elemento in elementos:
    │      copiaElemento = elemento.copiar(condicion)
    │      if copiaElemento != null:
    │          copia.addElemento(copiaElemento)
    │
    ├─ if copia.tieneElementos():
    │      return copia
    └─ else:
           return null

                ↓ recursión

Archivo.copiar(condicion)
    │
    ├─ if condicion.cumple(this):
    │      return copiar()
    └─ else:
           return null
```

---

## 💡 **Conceptos clave**

### ✅ Copia profunda vs superficial:

| Tipo | ElementoSA | Implementación |
|------|-----------|----------------|
| **Profunda** | Directorio, Comprimido | Recursiva, copia todos los hijos |
| **Superficial** | Archivo | Solo copia valores primitivos |
| **Híbrida** | AccesoDirecto | Copia objeto pero mantiene referencia al destino |

### ✅ Manejo de nulls:

* `copiar(condicion)` puede retornar `null`
* Los directorios **filtran** los nulls al agregar
* Un directorio vacío también retorna `null`
* La estructura se "poda" automáticamente

### ✅ Factory Method:

* `crearElemento()` abstrae la creación
* Permite que `Comprimido` reutilice el `copiar()` de `Directorio`
* Principio Open/Closed aplicado

---

## 🚀 **Ventajas del diseño**

✅ **Reutilización:** `Comprimido` hereda `copiar()` completo  
✅ **Polimorfismo:** No se necesita `instanceof` para copiar  
✅ **Extensibilidad:** Agregar nuevos elementos es simple  
✅ **Claridad:** Cada clase sabe cómo copiarse  
✅ **Composición:** La recursión es natural y elegante


---

# 📘 **Clase — Interfaces en Java**

---

## 🎯 **¿Qué es una Interface?**

Una **interface** lleva un paso más allá el concepto de **clase abstracta**:

* Define un **protocolo de comportamiento**
* Proporciona un formato común para implementarlo en clases
* Es independiente de dónde será utilizado

---

## ✅ **Ventajas de las Interfaces**

### Desacople entre comportamiento y clase:

* Una clase puede tener múltiples comportamientos (implementar varias interfaces)
* Distintas clases pueden compartir el mismo comportamiento sin estar relacionadas por herencia

---

## 📋 **Características conceptuales**

| Característica | Descripción |
|----------------|-------------|
| **Solo signaturas** | Declaran métodos sin implementarlos |
| **Sin atributos** | Solo pueden tener constantes |
| **Contrato** | Quien implementa debe cumplir todos los métodos |

---

## 💻 **Sintaxis básica**

### Declaración:

```java
public interface MiInterface {
    public void miMetodo();
    public int otroMetodo(String param);
}
```

**Reglas:**
* Se declara con `interface` en lugar de `class`
* Los métodos no tienen cuerpo (solo signatura)

---

## 🔒 **Constantes en Interfaces**

Todas las variables son implícitamente `public static final`:

```java
public interface Configuracion {
    int CANT_MAX = 100;  // implícitamente: public static final
    String NOMBRE = "Sistema";
}
```

**Obligatorio:**
* Deben incluir un valor inicial
* Son constantes, no variables

---

## 🔗 **Herencia de Interfaces**

### Una interface puede heredar de otras interfaces:

```java
public interface MiInterface extends OtraInterface, UnaMas {
    // métodos adicionales
}
```

**Reglas:**
* Una interface **solo** puede heredar de otras interfaces
* Puede heredar de **múltiples** interfaces (herencia múltiple)
* No puede heredar de clases

---

## 🏗️ **Implementación de Interfaces**

### Una clase implementa una interface con `implements`:

```java
public class MiClase implements MiInterface {
    @Override
    public void miMetodo() {
        // implementación obligatoria
    }
}
```

**Reglas:**
* Una clase puede implementar **múltiples** interfaces
* Debe implementar **todos** los métodos de la interface
* Si no los implementa todos → debe ser `abstract`

---

## 🎭 **Uso polimórfico**

Las interfaces pueden usarse como **tipos**:

```java
MiInterface objeto = new MiClase();
objeto.miMetodo();  // polimorfismo
```

**Restricción:**
* Solo puedes llamar métodos definidos en la interface
* Para acceder a métodos de la clase concreta → casting

```java
ElementoComparable a1 = new Alumno("Juan", cumple, 23779);
System.out.println(a1.esMayor(a2));  // OK
System.out.println(((Alumno) a1).getNombre());  // Necesita casting
```

---

### Solución con Interfaces:

```java
interface A {
    int getValor();  // Solo signatura, sin implementación
}

interface B extends A {
    int getAtributo();
}

interface C extends A {
    int calcular();
}

class MiClase implements B, C {
    @Override
    public int getValor() { return 3; }  // Una sola implementación
    
    @Override
    public int getAtributo() { return 5; }
    
    @Override
    public int calcular() { return getValor() + 10; }
}
```

**Ventaja:**
* No hay ambigüedad porque las interfaces **no tienen implementación**
* La clase concreta define una sola vez cada método

---

## 🧛 **Ejemplo: Sistema de Monstruos**

### Interfaces:

```java
interface Monstruo {
    void asustar();
}

interface MonstruoPeligroso extends Monstruo {
    void destruir();
}

interface MonstruoLetal {
    void matar();
}

interface Vampiro extends MonstruoPeligroso, MonstruoLetal {
    void chuparSangre();
}
```

**Jerarquía:**
```
Monstruo
    └── MonstruoPeligroso
            └── Vampiro (también extiende MonstruoLetal)

MonstruoLetal
    └── Vampiro
```

---

### Implementaciones:

```java
class GodZilla implements MonstruoPeligroso {
    @Override
    public void asustar() {
        System.out.println("Grrrrr");
    }
    
    @Override
    public void destruir() {
        System.out.println("plaf!");
    }
}

class VampiroMaléfico implements Vampiro {
    @Override
    public void asustar() {
        System.out.println("buuuh!");
    }
    
    @Override
    public void destruir() {
        System.out.println("boing!");
    }
    
    @Override
    public void matar() {
        System.out.println("pum!");
    }
    
    @Override
    public void chuparSangre() {
        System.out.println("ffffffhhhhh");
    }
}
```

---

### Uso polimórfico:

```java
public class HorrorShow {
    public void asusta(Monstruo m) {
        m.asustar();
    }
    
    public void liquida(MonstruoLetal l) {
        l.matar();
    }
    
    public void asustaMas(MonstruoPeligroso m) {
        m.asustar();
        m.destruir();
    }
    
    public static void main(String[] args) {
        HorrorShow show = new HorrorShow();
        
        MonstruoPeligroso barney = new GodZilla();
        show.asusta(barney);      // "Grrrrr"
        show.asustaMas(barney);   // "Grrrrr" + "plaf!"
        show.liquida(barney);     // ❌ ERROR: GodZilla no es MonstruoLetal
        
        Vampiro dracula = new VampiroMaléfico();
        show.asusta(dracula);     // "buuuh!"
        show.asustaMas(dracula);  // "buuuh!" + "boing!"
        show.liquida(dracula);    // "pum!"
    }
}
```

**Análisis:**
* `barney` (GodZilla) solo implementa `MonstruoPeligroso`
* No puede ser pasado a `liquida()` porque no es `MonstruoLetal`
* `dracula` implementa `Vampiro` que extiende ambas interfaces
* Puede ser usado en cualquier método

---

## 💻 **Ejercicio: Centro de Cómputos**

### Problema:

Un centro de cómputos gestiona:

* **Computadoras**: ejecutan procesos
* **Procesos**: esperan computadoras disponibles

**Reglas:**
* Si no hay computadoras → procesos van a cola de espera
* Si no hay procesos → computadoras van a cola de disponibles
* Los procesos se ordenan por **mayor requerimiento de memoria**
* Las computadoras se ordenan por **mayor velocidad CPU**

---

## 🧩 **Interface ObjetoComparable**

```java
public interface ObjetoComparable {
    boolean esMayor(ObjetoComparable otro);
}
```

**Propósito:**
* Definir un comportamiento común de comparación
* Permite ordenar distintos tipos de objetos

---

## 🖥️ **Clase Computadora**

```java
public class Computadora extends Inventariable implements ObjetoComparable {
    private String nombre;
    private double velocidadCPU;
    private Proceso procesoEnEjecucion;
    
    public Computadora(int inventario, String nombre, String sala, double velocidadCPU) {
        super(inventario, sala);
        this.nombre = nombre;
        this.velocidadCPU = velocidadCPU;
        this.procesoEnEjecucion = null;
    }
    
    @Override
    public boolean esMayor(ObjetoComparable otro) {
        return this.velocidadCPU > ((Computadora) otro).getVelocidadCPU();
    }
    
    public void asignoProceso(Proceso proceso) {
        this.procesoEnEjecucion = proceso;
    }
    
    public String toString() {
        return nombre + " (" + velocidadCPU + " MHz)";
    }
}
```

**Análisis:**
* Hereda de `Inventariable` (herencia)
* Implementa `ObjetoComparable` (interface)
* Compara por velocidad CPU

---

## ⚙️ **Clase Proceso**

```java
public class Proceso implements ObjetoComparable {
    private String pid;
    private double reqMemoria;
    private int reqTiempo;
    
    public Proceso(String pid, double reqMemoria, int reqTiempo) {
        this.pid = pid;
        this.reqMemoria = reqMemoria;
        this.reqTiempo = reqTiempo;
    }
    
    @Override
    public boolean esMayor(ObjetoComparable otro) {
        return this.reqMemoria > ((Proceso) otro).getReqMemoria();
    }
    
    public String toString() {
        return pid + " (" + reqMemoria + " Mb)";
    }
}
```

**Análisis:**
* Implementa `ObjetoComparable`
* Compara por requerimiento de memoria
* **No hereda de Inventariable** (no es parte del inventario físico)

---

## 📦 **Clase Inventariable**

```java
public class Inventariable {
    private int nroInventario;
    private String sala;
    
    public Inventariable(int nroInventario, String sala) {
        this.nroInventario = nroInventario;
        this.sala = sala;
    }
    
    // getters y setters...
}
```

**Propósito:**
* Agrupa características comunes de dispositivos físicos
* `Computadora` e `Impresora` heredan de esta clase

---

## 🖨️ **Clase Impresora**

```java
public class Impresora extends Inventariable {
    private String marca;
    private boolean color;
    
    public Impresora(int nroInventario, String sala, String marca, boolean color) {
        super(nroInventario, sala);
        this.marca = marca;
        this.color = color;
    }
    
    // getters y setters...
}
```

**Análisis:**
* Hereda de `Inventariable`
* **NO** implementa `ObjetoComparable` (no necesita ordenarse)

---

## 🗂️ **Clase ColaEspera**

```java
public class ColaEspera {
    private ArrayList<ObjetoComparable> elementos;
    
    public ColaEspera() {
        this.elementos = new ArrayList<>();
    }
    
    public boolean estaVacio() {
        return elementos.isEmpty();
    }
    
    public void agregarOrdenado(ObjetoComparable elementoNuevo) {
        int i = 0;
        while (i < elementos.size() && elementos.get(i).esMayor(elementoNuevo))
            i++;
        elementos.add(i, elementoNuevo);
    }
    
    public Object dameSiguiente() {
        return elementos.remove(0);
    }
    
    public void imprimir() {
        for (Object elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
```

**Ventaja clave:**
* Trabaja con `ObjetoComparable`
* **No necesita saber** si tiene `Proceso` o `Computadora`
* Polimorfismo puro → reutilizable

---

## 🏢 **Clase CentroComputos**

```java
public class CentroComputos {
    private ColaEspera computadoras;
    private ColaEspera procesos;
    
    public CentroComputos() {
        this.computadoras = new ColaEspera();
        this.procesos = new ColaEspera();
    }
    
    public void agregarProceso(Proceso proceso) {
        if (computadoras.estaVacio()) {
            procesos.agregarOrdenado(proceso);
        } else {
            Computadora compu = (Computadora) computadoras.dameSiguiente();
            compu.asignoProceso(proceso);
        }
    }
    
    public void agregarComputadora(Computadora computadora) {
        if (procesos.estaVacio()) {
            computadoras.agregarOrdenado(computadora);
        } else {
            computadora.asignoProceso((Proceso) procesos.dameSiguiente());
        }
    }
    
    public void imprimirProcesosEnEspera() {
        procesos.imprimir();
    }
    
    public void imprimirComputadorasLibres() {
        computadoras.imprimir();
    }
}
```

**Lógica:**
1. Si llega un proceso:
   * Si hay computadoras libres → asignar inmediatamente
   * Si no → agregarlo a cola de procesos (ordenado por memoria)

2. Si llega una computadora:
   * Si hay procesos esperando → asignar inmediatamente
   * Si no → agregarla a cola de computadoras (ordenado por velocidad)

---

## 🎯 **Ejemplo de ejecución**

```java
CentroComputos cc = new CentroComputos();

// Llegan 2 procesos (no hay computadoras)
cc.agregarProceso(new Proceso("Proc1", 100, 10));
cc.agregarProceso(new Proceso("Proc2", 200, 10));

System.out.println("Procesos en espera:");
cc.imprimirProcesosEnEspera();
// Salida:
// Proc2 (200 Mb)  ← mayor memoria primero
// Proc1 (100 Mb)

// Llega una computadora
cc.agregarComputadora(new Computadora(1, "Comp1", "Sala 1", 200));
// Se asigna a Proc2 (el de mayor memoria)

System.out.println("Procesos en espera:");
cc.imprimirProcesosEnEspera();
// Salida:
// Proc1 (100 Mb)  ← solo queda Proc1
```

---

## 📊 **Diagrama de clases**

```
                    ┌───────────────────┐
                    │ ObjetoComparable  │ (interface)
                    │  + esMayor()      │
                    └───────────────────┘
                            △
                            │ implements
                ┌───────────┴───────────┐
                │                       │
        ┌───────────────┐       ┌──────────────┐
        │  Computadora  │       │   Proceso    │
        │  + esMayor()  │       │  + esMayor() │
        └───────────────┘       └──────────────┘
                △
                │ extends
        ┌───────────────┐
        │ Inventariable │
        └───────────────┘
                △
                │ extends
        ┌───────────────┐
        │   Impresora   │
        └───────────────┘


        ┌───────────────┐
        │  ColaEspera   │
        │  elementos:   │
        │  List<ObjetoComparable>
        └───────────────┘
                △
                │ usa
        ┌───────────────────┐
        │ CentroComputos    │
        │  computadoras     │
        │  procesos         │
        └───────────────────┘
```

---

## 💡 **Conceptos clave**

| Concepto | Aplicación en el ejemplo |
|----------|--------------------------|
| **Interface** | `ObjetoComparable` define contrato de comparación |
| **Polimorfismo** | `ColaEspera` trabaja con cualquier `ObjetoComparable` |
| **Herencia** | `Computadora` e `Impresora` heredan de `Inventariable` |
| **Implementación múltiple** | Una clase puede heredar **y** implementar interfaces |
| **Desacople** | `ColaEspera` no depende de clases concretas |

---

## 🎯 **Ventajas de usar Interfaces**

### ✅ Reutilización:
* `ColaEspera` sirve para **cualquier** tipo comparable
* No necesita duplicarse para `Proceso` y `Computadora`

### ✅ Extensibilidad:
* Agregar nuevos elementos comparables es fácil
* Solo deben implementar `ObjetoComparable`

### ✅ Polimorfismo:
* El código cliente trabaja con la interface
* No necesita conocer las clases concretas

### ✅ Desacople:
* Cambiar la implementación de `Proceso` no afecta `ColaEspera`
* Las responsabilidades están claramente separadas

---

## 🔧 **Comparación: Herencia vs Interface**

| Aspecto | Herencia | Interface |
|---------|----------|-----------|
| **Cantidad** | Solo una clase padre | Múltiples interfaces |
| **Implementación** | Hereda código | Solo contrato |
| **Relación** | "ES UN" (is-a) | "PUEDE HACER" (can-do) |
| **Flexibilidad** | Acoplada a jerarquía | Desacoplada |
| **Ejemplo** | `Computadora` IS-A `Inventariable` | `Proceso` CAN-DO `ObjetoComparable` |

---

## 🚀 **Cuándo usar Interfaces**

✅ **Usa interfaces cuando:**
* Varias clases no relacionadas necesitan el mismo comportamiento
* Quieres definir un contrato sin implementación
* Necesitas "herencia múltiple" de comportamientos
* Quieres desacoplar el código

✅ **Usa herencia cuando:**
* Hay una relación clara "ES UN"
* Quieres reutilizar código (implementación)
* Hay una jerarquía natural de conceptos

---
