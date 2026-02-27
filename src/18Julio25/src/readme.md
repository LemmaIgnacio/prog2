Elemento ✅
    String titulo
    int desgarcas
metodos:
getTitulo()
getDescargas()
buscar()
getPalabrasClave()
compare()
contienePlabraClave()
getTamanio

wallpaper ✅
    string titulo
    Usuario user
    int descargas
    int anio
    Arraylist<String> palabras clave
metodos:
getters y settes
getTamanio() //retorna 1

colecciones o carpeta (contenedor) ✅
    String titulo
    ArrayList<Elemento> elementos
    int descargas
metodos:
getTitulo()
getDescargas() -> la suma de todos sus elementos
buscar(Condicion c)
getPalabrasClave() (sin repetir, recorro todos los elementos y 
                    luego recorro palabras clave 
                    y si no estan las agrego [uso de contains])
getTamanio() // recorre las hojas y las suma
contienePalabraClave()

Usuario ✅
    String nombre
    int anioRegristro
    String email
metodos:
getters y setters

interfaz Condicion con public boolean cumple (Elemento e)

servicios
1. Listado de wallpapers ✅
a) Listado con mas de 1k descargas -> CondicionMasDescargas ✅
b) publicados en el año 2020 -> CondicionAnio ✅
c) creados por usuaio y 5k descargas -> CondicionAND + CondicionUsuario + CondicionMasDescargas ✅
d) devolver los que tengan palabra clave -> CondicionPalabraClave ✅ 
e) combinacion logica de los anteriores -> CondicionOR + CondicionNOT ✅
2. listado de palbras clave (ya planteado) ✅
3. Cant wallpapers ya planteado ✅
4. descargas totales ya planteado ✅

colecciones o carpetas con publicidad minimalismo patrocinado
busqueda
Elemento publicidad
listado.add(publicidad);
sigue buscando


wallpaper universales ✅
@override a contienePalabraClave return true


