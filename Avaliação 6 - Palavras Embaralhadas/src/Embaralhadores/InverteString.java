/*
 * Está classe reescreve o método embaralhar, presente na classe Embaralhador
 * do pacote de interfaces 
 * 
 * Dada uma string qualquer, o metodo retorna uma string ao contrario a.g:
 * Input: BANANA | Output: ANANAB
 */

package Embaralhadores;

import Interfaces.Embaralhador;

public class InverteString implements Embaralhador {

	@Override
	public String Embaralhar(String palavra) {
		StringBuffer sb = new StringBuffer(palavra);
		sb.reverse(); // Causes this character sequence to be replaced by the
						// reverse of the sequence. If there are any surrogate
						// pairs included in the sequence,
		palavra = sb.toString();
		return palavra;
	}
}
