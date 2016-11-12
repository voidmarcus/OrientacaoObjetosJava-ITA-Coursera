/*
 * Está classe reescreve o método embaralhar, presente na classe Embaralhador
 * do pacote de interfaces 
 * 
 * Dada uma string qualquer, o metodo retorna uma string com as posicoes pares
 * invertidadas com as impares a.g:
 * Input: coxinha | Output: cxoniah
 */

package Embaralhadores;

import Interfaces.Embaralhador;

public class TrocaParImpar implements Embaralhador {

	@Override
	public String Embaralhar(String palavra) {
		String[] letras = new String[palavra.length() + 1];

		for (int i = 0; i <= palavra.length() - 1; i++) {
			int n = i + 1;
			letras[i] = palavra.substring(i, n);
		}

		String anterior = "";
		int n = 0;

		for (int num = 0; num <= letras.length - 2; num++) {
			if (num % 2 != 0) {
				n = num + 1 <= letras.length - 2 ? num + 1 : num;
			} else {
				n = num;
			}

			anterior = letras[num];
			letras[num] = letras[n];
			letras[n] = anterior;
		}

		palavra = "";

		for (int i = 0; i <= letras.length - 2; i++) {
			palavra = palavra + letras[i];
		}

		return palavra;
	}

}
