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
		return tablero;
	}

}
