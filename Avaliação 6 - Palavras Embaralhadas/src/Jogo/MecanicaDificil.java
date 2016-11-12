package Jogo;

import Interfaces.MecanicaDoJogo;

public class MecanicaDificil extends MecanicaGenerica implements MecanicaDoJogo {

	private int pontos;

	@Override
	public String iniciaJogo(String dificuldade) {
		super.iniciaJogo(dificuldade);
		numPalavras = 15;
		pontos = 0;
		return palavraEmbaralhada;
	}

	@Override
	public String getResposta() {
		return palavraOriginal;
	}

	@Override
	public int setNumTentativas() {
		return 1;
	}

	@Override
	protected void pontuar() {
		if (getNumTentativas() == 1)
			pontos += 10;
	}

	@Override
	public int getPontuacao() {
		return this.pontos;
	}

}