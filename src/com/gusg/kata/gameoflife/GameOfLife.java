package com.gusg.kata.gameoflife;

import java.util.List;

public class GameOfLife {

	private Tablero tablero;

	public void asignarTamanioTablero(final int x, final int y) {
		tablero = new Tablero(x, y);

	}

	public void asignarCelulasIniciales(final List<Celula> listaCelulasVivas) {
		for (Celula celulaActual : listaCelulasVivas) {
			tablero.agregarCelulaViva(celulaActual);
		}
	}

	public Tablero hacerCorridas(final int i) {
		//obtener lista de celulas vivas
		//aplicar i corridas (reglas de negocio para cada celula)
		//retonar tablero resultante
		
		return tablero;
	}

}
