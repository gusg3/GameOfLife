package com.gusg.kata.gameoflife;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest {

	private GameOfLife juego;

	@Before
	public void setUp() {
		juego = new GameOfLife();
		juego.asignarTamanioTablero(5, 5);
	}

	@Test
	public void dadoUnJuego_puedoAsignarCelulasIniciales_puedoHacerCorridas_puedoVerificarCelulaViva() {
		juego.asignarCelulasIniciales(crearUnaCelulaVivaSinVecinos(3, 3));
		Tablero tableroResultante = juego.hacerCorridas(1);
		tableroResultante.hayCelulaViva(3, 3);
	}

	@Test
	public void dadoUnJuego_conUnaCelulaSinVecinos_dichaCelulaDebeMorir() {
		juego.asignarCelulasIniciales(crearUnaCelulaVivaSinVecinos(3, 3));
		Tablero tableroResultante = juego.hacerCorridas(1);
		Assert.assertFalse(tableroResultante.hayCelulaViva(3, 3));
	}

	@Test
	public void dadoUnJuego_conUnaCelulaConDosVecinos_dichaCelulaDebeVivir() {
		juego.asignarCelulasIniciales(crearCelulaVivaConDosVecinas(3, 3));
		Tablero tableroResultante = juego.hacerCorridas(1);
		Assert.assertTrue(tableroResultante.hayCelulaViva(3, 3));
	}

	private List<Celula> crearUnaCelulaVivaSinVecinos(final int x, final int y) {
		List<Celula> lista = new ArrayList<Celula>();
		lista.add(new Celula(x, y));
		return lista;
	}

	private List<Celula> crearCelulaVivaConDosVecinas(final int x, final int y) {
		List<Celula> lista = new ArrayList<Celula>();
		lista.add(new Celula(x, y));
		lista.add(new Celula(x, y - 1));
		lista.add(new Celula(x - 1, y));
		return lista;
	}

}
