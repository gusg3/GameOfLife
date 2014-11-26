package com.gusg.kata.gameoflife;

import java.util.HashMap;
import java.util.Map;

public class Tablero {

	private int tamanioX;

	private int tamanioY;

	private Map<String, Celula> celulasVivas;

	public Tablero(final int x, final int y) {
		this.tamanioX = x;
		this.tamanioY = y;
		this.celulasVivas = new HashMap<String, Celula>();
	}

	public boolean hayCelulaViva(final int x, final int y) {
		return celulasVivas.containsKey(toKey(x, y));
	}

	public void agregarCelulaViva(final Celula celulaActual) {
		celulasVivas.put(getKey(celulaActual), celulaActual);
	}

	private String getKey(Celula celulaActual) {
		return Integer.toString(celulaActual.getPosicionX()).concat(
				Integer.toString(celulaActual.getPosicionY()));
	}

	private String toKey(int x, int y) {
		return Integer.toString(x).concat(Integer.toString(y));
	}
}
