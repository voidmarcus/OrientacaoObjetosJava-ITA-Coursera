package Geradores;

import java.util.Random;

public class GeradorNumAleatorio {

	private int num;

	public GeradorNumAleatorio(int num) {
		this.num = num;
	}
	
	public int getNumAleatorio() {
		Integer numAleatorio = new Random().nextInt(num);
		return numAleatorio;
	}
}