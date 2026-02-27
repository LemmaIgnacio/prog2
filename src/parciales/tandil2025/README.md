*vehiculo:
patente 
modelo
km recorrido
asientos
mantenimiento diario
array string caracteristicas

get patente
get modelo
get kmrecorrido
gett asientos
get man diario
get caracteristicas
add caracteristica

*colectivo: costo diario -> 5k x asiento

*taxi: costo diario -> 2k x km recorrido y +500  + aniolimite para añadir el extra


*flota:
array de vehiculos
get modelo -> mas antiguo (2010 2002 2024 -> devuelve 2002)
get asientos -> suma de sus asientos
get km -> suma de sus km
get man diario -> suma de costos
get carac -> si uno la tiene


*metropoli
arraylist de transpote publico
Condicion c -> interface

la condicion recibe un parametro y retorna dependiendo de si cumple o no
no incluir flotas solo vehiculos (busqueda)
get modelos > 2021 
get vehiculos +100k km
get carac y modelo > 2010

*flota limitada -> solo cambia la forma de incorporar elementos
*combi escolar -> es un colectivo mas
*flota poco uso -> solo cambia la forma de incorporar elementos
*remises -> solo cambia el extra si es anterior a 2020
*maquina vial -> horas trabajadas, cambia el mantenimiento diario,
                man diario 3200 private static 
*flota astethtic -> solo cambia forma de incorporar elementos