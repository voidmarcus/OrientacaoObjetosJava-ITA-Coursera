package Jogo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import Geradores.GeradorNumAleatorio;

public class BancoDePalavras {

	// 32079 eh o numero de palavras dentro do arquivo
	private static String palavras[] = new String[32079];

	public String getPalavra() {
		String palavra = null;
		listaPalavras();
		return getPalavraAleatoria(palavra);
	}

	// 32079 eh o numero de palavras dentro do arquivo
	private String getPalavraAleatoria(String palavra) {
		palavra = palavras[new GeradorNumAleatorio(32079).getNumAleatorio()];

		return palavra;
	}
	
	//Lê as palavras contidas no arquivo "input.txt" e armazena no vetor palavras[]
	private void listaPalavras() {
		Scanner sc;
		try {
			sc = new Scanner(new File("input.txt"));

			for (int i = 0; sc.hasNextLine(); i++) {
				palavras[i] = sc.nextLine();
			}
		} catch (IOException e) {
			e.getMessage();
		}
	}

}