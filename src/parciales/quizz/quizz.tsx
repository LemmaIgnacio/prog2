import React, { useState } from 'react';
import { CheckCircle, XCircle, AlertCircle, Trophy, BookOpen } from 'lucide-react';

const QuizPOO = () => {
  const [currentQuestion, setCurrentQuestion] = useState(0);
  const [selectedAnswer, setSelectedAnswer] = useState(null);
  const [showExplanation, setShowExplanation] = useState(false);
  const [score, setScore] = useState(0);
  const [answeredQuestions, setAnsweredQuestions] = useState(new Set());

  const questions = [
    {
      id: 1,
      category: "Composite - Decisión de Diseño",
      question: "Tenés 'Colectivo Urbano' (costo $5000 por asiento) y 'Colectivo Media Distancia' (costo $7000 por asiento). ¿Qué hacés?",
      options: [
        "Crear ColectivoUrbano y ColectivoMediaDistancia (dos clases)",
        "Una clase Colectivo con atributo costoMantenimiento",
        "Usar herencia: ColectivoUrbano extends Colectivo",
        "Crear interface ColectivoConPrecio"
      ],
      correct: 1,
      explanation: "✅ CORRECTO: Solo cambia un NÚMERO (5000 vs 7000), no el comportamiento. Usar ATRIBUTO, no dos clases.\n\n❌ ERROR COMÚN: Crear clases por constantes.\n\nLección de Metrópolis 2025: 'NO debe haber constantes en el código duro'",
      code: "// ✅ BIEN:\nclass Colectivo {\n  private double costoMantenimiento;\n  public double getCosto() {\n    return costoMantenimiento * asientos;\n  }\n}\n\n// Uso:\nColectivo urbano = new Colectivo(5000);\nColectivo mediaDistancia = new Colectivo(7000);"
    },
    {
      id: 2,
      category: "Composite - Búsqueda",
      question: "Una Flota contiene vehículos. Al buscar vehículos con modelo > 2020, ¿la Flota se incluye en el resultado?",
      options: [
        "Sí, la Flota se incluye si tiene vehículos que cumplen",
        "No, solo se incluyen los Vehículos que cumplen",
        "Depende si la Flota misma cumple la condición",
        "Se incluye la Flota Y sus vehículos"
      ],
      correct: 1,
      explanation: "✅ CORRECTO: En búsquedas, el COMPOSITE NO se incluye, solo los LEAF (elementos simples).\n\nNOTA del enunciado: 'Las flotas NO se incluyen en el listado pero sí los vehículos que posean'",
      code: "// En Flota (Composite):\npublic ArrayList<Vehiculo> buscar(Condicion c) {\n  ArrayList<Vehiculo> resultado = new ArrayList<>();\n  for (Transporte t : elementos) {\n    resultado.addAll(t.buscar(c)); // Delega\n  }\n  return resultado; // NO se agrega a sí misma\n}"
    },
    {
      id: 3,
      category: "Strategy - Búsqueda",
      question: "Necesitas buscar vehículos con 'modelo > 2020 Y kilometros < 50000'. ¿Cómo lo implementás?",
      options: [
        "Un método buscarPorModeloYKilometros(int modelo, int km)",
        "Dos condiciones: CondicionModelo y CondicionKilometros con CondicionAND",
        "Una clase CondicionModeloYKilometros específica",
        "Un if largo en el método buscar()"
      ],
      correct: 1,
      explanation: "✅ CORRECTO: Strategy permite COMBINAR condiciones con AND, OR, NOT.\n\nVentaja: Reutilizás CondicionModelo y CondicionKilometros en otras búsquedas.",
      code: "// Uso:\nCondicion c1 = new CondicionModeloMayor(2020);\nCondicion c2 = new CondicionKilometrosMenor(50000);\nCondicion combinada = new CondicionAND(c1, c2);\n\nArrayList<Vehiculo> resultado = flota.buscar(combinada);"
    },
    {
      id: 4,
      category: "Composite - Cálculo Recursivo",
      question: "Una Flota debe devolver el modelo MÁS ANTIGUO de sus vehículos. ¿Cómo lo calculás?",
      options: [
        "return elementos.get(0).getModelo();",
        "Sumar modelos y dividir por cantidad",
        "Recorrer y quedarse con el MÍNIMO (Math.min)",
        "Recorrer y quedarse con el MÁXIMO (Math.max)"
      ],
      correct: 2,
      explanation: "✅ CORRECTO: 'Más antiguo' = número MENOR.\nEj: 2010 es más antiguo que 2024.\n\nUsar Math.min o comparar con <",
      code: "public int getModelo() {\n  int minimo = Integer.MAX_VALUE;\n  for (Transporte t : elementos) {\n    minimo = Math.min(minimo, t.getModelo());\n  }\n  return minimo;\n}"
    },
    {
      id: 5,
      category: "Validación con Condiciones",
      question: "'Flota Limitada' solo acepta vehículos con modelo > 2024. ¿Cómo lo implementás?",
      options: [
        "FlotaLimitada extiende Flota y sobrescribe agregar()",
        "Un if en Flota.agregar() que verifica modelo",
        "FlotaLimitada tiene un atributo Condicion y valida con ella",
        "Crear FlotaModelo2024, FlotaModelo2025, etc."
      ],
      correct: 2,
      explanation: "✅ CORRECTO: Reutilizar el sistema de Condiciones para VALIDAR agregados.\n\nVentaja: Podés cambiar la restricción en runtime o combinarlas (modelo > 2024 Y kilometros < 10000)",
      code: "public class FlotaLimitada extends Flota {\n  private Condicion restriccion;\n  \n  public FlotaLimitada(String nombre, Condicion r) {\n    super(nombre);\n    this.restriccion = r;\n  }\n  \n  public void agregar(Transporte t) {\n    if (restriccion.cumple(t)) {\n      super.agregar(t);\n    }\n  }\n}"
    },
    {
      id: 6,
      category: "Herencia vs Atributo",
      question: "Taxi tiene 'extra de $500 si año < 2010'. Remis tiene 'extra de $500 si año < 2020'. ¿Diseño?",
      options: [
        "Taxi y Remis son clases separadas sin relación",
        "Remis extiende Taxi",
        "Taxi y Remis comparten código con un atributo anioLimite",
        "Crear TaxiViejo, TaxiNuevo, RemisViejo, RemisNuevo"
      ],
      correct: 2,
      explanation: "✅ CORRECTO: Ambos tienen lógica SIMILAR, solo cambia el año límite.\n\nUsar atributo o parámetro para evitar duplicación.",
      code: "public class Taxi extends Vehiculo {\n  protected int anioLimite;\n  \n  public Taxi(int anioLimite) {\n    this.anioLimite = anioLimite;\n  }\n  \n  public double getCosto() {\n    double costo = km * 2000;\n    if (modelo < anioLimite) {\n      costo += 500;\n    }\n    return costo;\n  }\n}\n\n// Uso:\nTaxi taxi = new Taxi(2010);\nTaxi remis = new Taxi(2020); // Reutiliza código"
    },
    {
      id: 7,
      category: "Atributos Static",
      question: "MaquinariaVial cobra $3200 por hora trabajada. Este valor 'puede cambiar y es el mismo para todas'. ¿Cómo lo guardás?",
      options: [
        "private double costoPorHora;",
        "private static double COSTO_POR_HORA = 3200;",
        "private final double COSTO_POR_HORA = 3200;",
        "public double costoPorHora = 3200;"
      ],
      correct: 1,
      explanation: "✅ CORRECTO: STATIC = compartido por todas las instancias.\n\n'puede cambiar' → NO final\n'mismo para todas' → static",
      code: "public class MaquinariaVial extends Vehiculo {\n  private int horasTrabajo;\n  private static double COSTO_POR_HORA = 3200;\n  \n  public double getCosto() {\n    return horasTrabajo * COSTO_POR_HORA;\n  }\n  \n  // Cambiar para TODAS las instancias:\n  public static void setCostoPorHora(double nuevo) {\n    COSTO_POR_HORA = nuevo;\n  }\n}"
    },
    {
      id: 8,
      category: "Composite - Características",
      question: "Vehiculo tiene lista de características ['Blanco', 'Buen estado']. ¿Cómo sabe Flota si tiene característica 'Blanco'?",
      options: [
        "Flota tiene su propia lista de características",
        "Flota retorna true si AL MENOS UN elemento la tiene",
        "Flota retorna true solo si TODOS la tienen",
        "Flota no puede responder esa pregunta"
      ],
      correct: 1,
      explanation: "✅ CORRECTO: Búsqueda recursiva con OR lógico.\n\nSi algún hijo tiene la característica → true",
      code: "// En Vehiculo (Leaf):\npublic boolean tieneCaracteristica(String c) {\n  return caracteristicas.contains(c);\n}\n\n// En Flota (Composite):\npublic boolean tieneCaracteristica(String c) {\n  for (Transporte t : elementos) {\n    if (t.tieneCaracteristica(c)) {\n      return true; // Al menos uno\n    }\n  }\n  return false;\n}"
    },
    {
      id: 9,
      category: "Strategy - Condiciones Compuestas",
      question: "¿Cómo buscarías: (modelo > 2020) O (tiene característica 'Buen estado' Y kilometros < 50000)?",
      options: [
        "Crear una clase CondicionCompleja con toda esa lógica",
        "Combinar: OR(CondicionModelo, AND(CondicionCaract, CondicionKm))",
        "Tres métodos distintos de búsqueda",
        "No se puede, es muy complejo"
      ],
      correct: 1,
      explanation: "✅ CORRECTO: Strategy permite ANIDAR condiciones.\n\nAND, OR y NOT son condiciones que CONTIENEN otras condiciones.",
      code: "Condicion c1 = new CondicionModeloMayor(2020);\nCondicion c2 = new CondicionCaracteristica(\"Buen estado\");\nCondicion c3 = new CondicionKmMenor(50000);\n\nCondicion c2yc3 = new CondicionAND(c2, c3);\nCondicion final = new CondicionOR(c1, c2yc3);\n\nArrayList<Vehiculo> resultado = flota.buscar(final);"
    },
    {
      id: 10,
      category: "Diseño - Error Común",
      question: "Te dicen: 'Puede haber nuevos tipos de vehículos en el futuro'. ¿Qué hacés?",
      options: [
        "Crear todas las clases posibles ahora",
        "Usar clase abstracta/interface para extensibilidad",
        "Esperar a que te digan qué vehículos y ahí crear clases",
        "Usar muchos if/switch según tipo"
      ],
      correct: 1,
      explanation: "✅ CORRECTO: Open/Closed Principle.\n\nAbierto a EXTENSIÓN (nuevas clases heredan)\nCerrado a MODIFICACIÓN (no tocás código existente)",
      code: "// Diseño extensible:\npublic abstract class Vehiculo {\n  public abstract double getCosto();\n}\n\n// En el futuro agregan:\npublic class Bicicleta extends Vehiculo {\n  public double getCosto() {\n    return 100; // Nueva lógica\n  }\n}\n\n// ✅ NO tocaste Vehiculo, Flota, ni búsquedas"
    }
  ];

  const handleAnswer = (index) => {
    setSelectedAnswer(index);
    setShowExplanation(true);
    
    if (index === questions[currentQuestion].correct && !answeredQuestions.has(currentQuestion)) {
      setScore(score + 1);
      setAnsweredQuestions(new Set([...answeredQuestions, currentQuestion]));
    }
  };

  const nextQuestion = () => {
    if (currentQuestion < questions.length - 1) {
      setCurrentQuestion(currentQuestion + 1);
      setSelectedAnswer(null);
      setShowExplanation(false);
    }
  };

  const prevQuestion = () => {
    if (currentQuestion > 0) {
      setCurrentQuestion(currentQuestion - 1);
      setSelectedAnswer(null);
      setShowExplanation(false);
    }
  };

  const resetQuiz = () => {
    setCurrentQuestion(0);
    setSelectedAnswer(null);
    setShowExplanation(false);
    setScore(0);
    setAnsweredQuestions(new Set());
  };

  const q = questions[currentQuestion];
  const isCorrect = selectedAnswer === q.correct;

  return (
    <div className="w-full max-w-4xl mx-auto p-6 bg-gradient-to-br from-blue-50 to-purple-50 min-h-screen">
      <div className="bg-white rounded-lg shadow-lg p-6 mb-6">
        <div className="flex items-center justify-between mb-4">
          <h1 className="text-3xl font-bold text-purple-600 flex items-center gap-2">
            <BookOpen size={32} />
            Quiz POO - Preparación Parcial
          </h1>
          <div className="text-right">
            <div className="text-2xl font-bold text-green-600">{score}/{questions.length}</div>
            <div className="text-sm text-gray-600">Puntaje</div>
          </div>
        </div>
        
        <div className="flex items-center gap-2 mb-4">
          <div className="flex-1 bg-gray-200 h-2 rounded-full overflow-hidden">
            <div 
              className="bg-purple-600 h-full transition-all duration-300"
              style={{ width: `${((currentQuestion + 1) / questions.length) * 100}%` }}
            />
          </div>
          <span className="text-sm text-gray-600 font-medium">
            {currentQuestion + 1}/{questions.length}
          </span>
        </div>

        <div className="inline-block bg-purple-100 text-purple-800 px-3 py-1 rounded-full text-sm font-medium mb-4">
          {q.category}
        </div>
      </div>

      <div className="bg-white rounded-lg shadow-lg p-6 mb-6">
        <h2 className="text-xl font-bold mb-6 text-gray-800">{q.question}</h2>
        
        <div className="space-y-3 mb-6">
          {q.options.map((option, index) => {
            let bgColor = 'bg-gray-50 hover:bg-gray-100';
            let borderColor = 'border-gray-300';
            let icon = null;

            if (showExplanation) {
              if (index === q.correct) {
                bgColor = 'bg-green-50';
                borderColor = 'border-green-500';
                icon = <CheckCircle className="text-green-600" size={20} />;
              } else if (index === selectedAnswer && index !== q.correct) {
                bgColor = 'bg-red-50';
                borderColor = 'border-red-500';
                icon = <XCircle className="text-red-600" size={20} />;
              }
            } else if (selectedAnswer === index) {
              bgColor = 'bg-blue-50';
              borderColor = 'border-blue-500';
            }

            return (
              <button
                key={index}
                onClick={() => !showExplanation && handleAnswer(index)}
                disabled={showExplanation}
                className={`w-full text-left p-4 rounded-lg border-2 ${bgColor} ${borderColor} transition-all flex items-center gap-3 ${!showExplanation && 'cursor-pointer'}`}
              >
                <span className="flex-1">{option}</span>
                {icon}
              </button>
            );
          })}
        </div>

        {showExplanation && (
          <div className={`p-4 rounded-lg border-l-4 ${isCorrect ? 'bg-green-50 border-green-500' : 'bg-orange-50 border-orange-500'}`}>
            <div className="flex items-start gap-2 mb-3">
              {isCorrect ? (
                <CheckCircle className="text-green-600 flex-shrink-0 mt-1" size={24} />
              ) : (
                <AlertCircle className="text-orange-600 flex-shrink-0 mt-1" size={24} />
              )}
              <div>
                <h3 className="font-bold text-lg mb-2">
                  {isCorrect ? '¡Correcto!' : 'No es la mejor opción'}
                </h3>
                <p className="text-sm whitespace-pre-line mb-3">{q.explanation}</p>
                {q.code && (
                  <div className="bg-gray-900 text-green-400 p-3 rounded font-mono text-xs overflow-x-auto">
                    <pre>{q.code}</pre>
                  </div>
                )}
              </div>
            </div>
          </div>
        )}
      </div>

      <div className="flex gap-3">
        <button
          onClick={prevQuestion}
          disabled={currentQuestion === 0}
          className="px-6 py-3 bg-gray-500 text-white rounded-lg disabled:opacity-50 disabled:cursor-not-allowed hover:bg-gray-600 transition"
        >
          ← Anterior
        </button>
        
        {showExplanation && currentQuestion < questions.length - 1 && (
          <button
            onClick={nextQuestion}
            className="flex-1 px-6 py-3 bg-purple-600 text-white rounded-lg hover:bg-purple-700 transition font-medium"
          >
            Siguiente →
          </button>
        )}

        {currentQuestion === questions.length - 1 && showExplanation && (
          <button
            onClick={resetQuiz}
            className="flex-1 px-6 py-3 bg-green-600 text-white rounded-lg hover:bg-green-700 transition font-medium flex items-center justify-center gap-2"
          >
            <Trophy size={20} />
            Reiniciar Quiz ({score}/{questions.length})
          </button>
        )}
      </div>

      {currentQuestion === questions.length - 1 && showExplanation && (
        <div className="mt-6 bg-yellow-50 border-l-4 border-yellow-400 p-4 rounded">
          <h3 className="font-bold text-yellow-800 mb-2">🎯 Tu Puntaje Final: {score}/{questions.length}</h3>
          <p className="text-yellow-700 text-sm">
            {score >= 8 ? '🎉 ¡Excelente! Estás listo para el parcial.' : 
             score >= 6 ? '👍 Bien! Repasá los temas donde fallaste.' :
             '📚 Necesitás estudiar más. Revisá las explicaciones.'}
          </p>
        </div>
      )}
    </div>
  );
};

export default QuizPOO;