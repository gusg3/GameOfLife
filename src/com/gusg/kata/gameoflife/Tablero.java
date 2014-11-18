package com.gusg.kata.gameoflife;

public class Tablero {

	private boolean[][] areaJuego;

	public Tablero(final int x, final int y) {
		areaJuego = new boolean[x][y];
	}

	public boolean hayCelulaViva(final int x, final int y) {
		return areaJuego[x][y];
	}

	public void agregarCelulaViva(final Celula celulaActual) {
		areaJuego[celulaActual.getPosicionX()][celulaActual.getPosicionY()] = true;
	}
}
