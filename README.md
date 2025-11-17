# Taller 5: Informe de Métodos de Ordenación

**Grupo:** V 

**Asignatura:** Estructura de Datos

**Algoritmos:** InsertionSort, SelectionSort, BubbleSort


## 1. Decisiones de Implementación

El proyecto implementa los tres algoritmos de ordenación básica solicitados, dentro del paquete `ed.u2.sorting`.

**Clases:** Se crearon las clases `InsertionSort`, `SelectionSort` y `BubbleSort`.

**Utilerías:** Se creó una clase `SortingUtils` que contiene un método estático `swap` para ser reutilizado por *SelectionSort* y *BubbleSort*.

**Sobrecarga:** Todos los algoritmos implementan la firma `public static void sort(int[] a)` y la sobrecarga `public static void sort(int[] a, boolean trace)` para imprimir trazas.

* **Métricas:**
    * **InsertionSort:** Cuenta los **desplazamientos** (shifts) de elementos.
    * **SelectionSort:** Cuenta los **intercambios** (swaps).
    * **BubbleSort:** Cuenta los **intercambios** (swaps) e implementa la optimización de **corte temprano**.

## 2. Casos Borde Probados

Además de los datasets A-E, la clase `SortingDemo` prueba los siguientes casos borde:

* **Arreglo vacío:** `[]`
* **Arreglo de tamaño 1:** `[7]`
* **Arreglo casi ordenado:** `[9, 1, 8, 2]`
* **Arreglo con duplicados:** `[2, 2, 2, 2]`
* **Arreglo ya ordenado:** `[1, 2, 3, 4, 5]`
* **Arreglo en orden inverso:** `[5, 4, 3, 2, 1]`
* **Arreglo normal:** `[8, 3, 6, 3, 9]`

## 3. Cómo Ejecutar las Pruebas

1.  Asegurarse de que los 5 archivos `.java` estén en la carpeta `src/ed/u2/sorting/`.
2.  Compilar el proyecto.
3.  Ejecutar la clase `ed.u2.sorting.SortingDemo`.
4.  La consola imprimirá las trazas completas de los tres algoritmos para todos los datasets. Las trazas generadas son las evidencias solicitadas.

## 4. Tabla de Recuento de Operaciones

Esta tabla compara el número de operaciones clave (swaps o desplazamientos) observadas para cada algoritmo.

| Dataset | Arreglo Original  | InsertionSort (Desplazamientos) | SelectionSort (Swaps) | BubbleSort (Swaps) |
| :--- |:------------------|:-------------------------------:|:---------------------:|:------------------:|
| A | `[8, 3, 6, 3, 9]` |                4                |           2           |         3          |
| B | `[5, 4, 3, 2, 1]` |                4                |           2           |         4          |
| C | `[1, 2, 3, 4, 5]` |                0                |           0           |         0          |
| D | `[2, 2, 2, 2]`    |                0                |           0           |         0          |
| E | `[9, 1, 8, 2]`    |                3                |           2           |         3          |
| F | `[]`              |              Vacio              |         Vacio         |       Vacio        |
| G | `[7]`             |                0                |           0           |         0          |

## 5. Comparación Cualitativa

Esta tabla resume cuándo es preferible usar cada algoritmo, basado en sus características.

| Algoritmo | Desplazamientos o Swaps                              | Cuándo Usarlo (Caso Ideal)                                                        | Ventaja Clave                                                                                               |
| :--- |:-----------------------------------------------------|:----------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------|
| **Inserción (Insertion)** | A = 2, B = 2, C = 0, D = 0, E = 2, F = 0, G = Vacio. | Datos casi ordenados o con datos en tiempo real                                   | Es el más eficaz en datos pequeños y  si el arreglo está casi ordenado porque realiza menos comparaciones . |
| **Selección (Selection)** | A = 4, B = 4, C = 0, D = 0, E = 3, F = 0, G = Vacio. | Para minimizar escritura en memoria ya que realiza menos intercambios.            | Es el más eficiente en intercambios por que realiza el mínimo número de intercambios de datos posible.      |
| **Burbuja (Bubble)** | A = 3, B = 4, C = 0, D = 0, E = 3, F = 0, G = Vacio. | **Datos pequeños** o para **detectar si un arreglo ya está ordenado** muy rápido. | Su eficiencia en memoria ya que ordena, los elementos dentro del mismo arreglo.                     |