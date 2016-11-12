package Fabricas;

import Geradores.GeradorNumAleatorio;
import Embaralhadores.*;
//import Embaralhadores.TrocaParImpar;
import Interfaces.Embaralhador;

public class FabricaEmbaralhadores {

	public Embaralhador getEmbaralhador(String num) {

		int numAleatorio = new GeradorNumAleatorio(32079).getNumAleatorio();
		
		if(num.equals("0")) {
			return new InverteString();
		} else if(num.equals("1")) {
			return new TrocaParImpar();
		} 
		return numAleatorio == 0 ? new InverteString() : numAleatorio < 6 ? new TrocaParImpar():new InverteString();
	}
}