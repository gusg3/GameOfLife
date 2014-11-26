package com.gusg.kata.gameoflife;

public class Celula {

	private int posicionX;

	private int posicionY;
	
	private Celula vecinoDerecho;
	
	private Celula vecinoSuperiorDerecho;
	
	private Celula vecinoSuperior;
	
	private Celula vecinoSuperiorIzquierdo;
	
	private Celula vecinoIzquierdo;
	
	private Celula vecinoInferiorIzquierdo;
	
	private Celula vecinoInferior;
	
	private Celula vecinoInferiorDerecho;

	public Celula(final int x, final int y) {
		posicionX = x;
		posicionY = y;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public Celula getVecinoDerecho() {
		return vecinoDerecho;
	}

	public void setVecinoDerecho(final Celula vecinoDerecho) {
		this.vecinoDerecho = vecinoDerecho;
	}

	public Celula getVecinoSuperiorDerecho() {
		return vecinoSuperiorDerecho;
	}

	public void setVecinoSuperiorDerecho(final Celula vecinoSuperiorDerecho) {
		this.vecinoSuperiorDerecho = vecinoSuperiorDerecho;
	}

	public Celula getVecinoSuperior() {
		return vecinoSuperior;
	}

	public void setVecinoSuperior(final Celula vecinoSuperior) {
		this.vecinoSuperior = vecinoSuperior;
	}

	public Celula getVecinoSuperiorIzquierdo() {
		return vecinoSuperiorIzquierdo;
	}

	public void setVecinoSuperiorIzquierdo(final Celula vecinoSuperiorIzquierdo) {
		this.vecinoSuperiorIzquierdo = vecinoSuperiorIzquierdo;
	}

	public Celula getVecinoIzquierdo() {
		return vecinoIzquierdo;
	}

	public void setVecinoIzquierdo(final Celula vecinoIzquierdo) {
		this.vecinoIzquierdo = vecinoIzquierdo;
	}

	public Celula getVecinoInferiorIzquierdo() {
		return vecinoInferiorIzquierdo;
	}

	public void setVecinoInferiorIzquierdo(final Celula vecinoInferiorIzquierdo) {
		this.vecinoInferiorIzquierdo = vecinoInferiorIzquierdo;
	}

	public Celula getVecinoInferior() {
		return vecinoInferior;
	}

	public void setVecinoInferior(final Celula vecinoInferior) {
		this.vecinoInferior = vecinoInferior;
	}

	public Celula getVecinoInferiorDerecho() {
		return vecinoInferiorDerecho;
	}

	public void setVecinoInferiorDerecho(final Celula vecinoInferiorDerecho) {
		this.vecinoInferiorDerecho = vecinoInferiorDerecho;
	}

}
