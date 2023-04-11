package juego;

public class juegoAritmetico {
	private int[][] matrizJuego;

	// Se inicializa un juego con una matriz de tamanio indicado por parametro con
	// todos
	// sus valores en 0, exceptuando un elemento mas por fila y columna que es el
	// valor a conseguir sumar por el usuario
	public juegoAritmetico(int tamanioMatriz) {
		this.matrizJuego = new int[tamanioMatriz + 1][tamanioMatriz + 1];
		inicializarMatriz();
	}

	// Inicializa la matriz junto el numero a conseguir sumar por fila y columna
	private void inicializarMatriz() {
		do {
			for (int fila = 0; fila < matrizJuego.length - 1; fila++) {
				for (int col = 0; col < matrizJuego[0].length - 1; col++) {
					matrizJuego[fila][col] = 0;

					matrizJuego[matrizJuego.length - 1][col] = (int)(Math.random() * (11 - 4)) + 4; // Valores de el ultimo elemento de la columna que se debe
				}

				matrizJuego[fila][matrizJuego.length - 1] = (int)(Math.random() * (11 - 4)) + 4; // Valores de el ultimo elemento de la fila que se debe
			}

	    } while (sumaUltimaFila()!= sumaUltimaColumna());
	}

    public int sumaUltimaFila() {
        int suma = 0;
        for (int i =0 ; i< matrizJuego.length; i++) {
            suma += matrizJuego[4][i];
        }

        return suma;
    }

    public int sumaUltimaColumna() {
        int suma = 0;
        for (int i =0 ; i< matrizJuego.length; i++) {
            suma += matrizJuego[i][4];
        }

        return suma;
    }
    
	// Verifica si la suma de los valores de la fila indicada por
	// parametro es igual al ultimo elemento de la misma
	private boolean verificarFila(int fila) {
		int sumaDeElementos = 0;
		for (int col = 0; col < matrizJuego[fila].length - 1; col++) {
			sumaDeElementos += matrizJuego[fila][col];
		}

		return sumaDeElementos == matrizJuego[fila][matrizJuego.length - 1];
	}

	// Verifica si la suma de los valores de la columna indicada por
	// parametro es igual al ultimo elemento de la misma
	private boolean verificarColumna(int columna) {
		int sumaDeElementos = 0;
		for (int fila = 0; fila < matrizJuego.length - 1; fila++) {
			sumaDeElementos += matrizJuego[fila][columna];
		}

		return sumaDeElementos == matrizJuego[matrizJuego.length - 1][columna];
	}

	// Verifica si la suma de filas y columnas corresponden con las indicadas por
	// los elementos de la matriz (ultimo elemento del arreglo de cada uno)
	public boolean verificarEstadoDelJuego() {
		boolean sumaFilas = true;
		boolean sumaColumnas = true;

		for (int i = 0; i < matrizJuego.length - 1; i++) {
			sumaFilas = sumaFilas && verificarFila(i);
			sumaColumnas = sumaColumnas && verificarColumna(i);
		}

		return sumaFilas && sumaColumnas;
	}
	
	// Realiza un set de un entero en la posicion indicada de la matriz
	public void setElementoEnMatriz(int fila, int col, int valor) {
		matrizJuego[fila][col] = valor;
	}

	// Retorna la matriz del juego
	public int[][] getMatriz() {
		return matrizJuego;
	}
	
}
