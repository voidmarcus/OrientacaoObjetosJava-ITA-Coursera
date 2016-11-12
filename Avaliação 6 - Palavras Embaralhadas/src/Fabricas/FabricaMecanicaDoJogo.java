package Fabricas;

import Interfaces.MecanicaDoJogo;
import Jogo.MecanicaDificil;
import Jogo.MecanicaFacil;

public class FabricaMecanicaDoJogo {

	private String dificuldade;


	public FabricaMecanicaDoJogo(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public MecanicaDoJogo getMecanicaDoJogo() {
		if(this.dificuldade.equals("0")) {
			return new MecanicaFacil();
		} else {
			return new MecanicaDificil();
		}
	}
}