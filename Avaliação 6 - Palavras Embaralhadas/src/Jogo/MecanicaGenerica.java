package Jogo;

import Fabricas.FabricaEmbaralhadores;
import Interfaces.Embaralhador;
import Interfaces.MecanicaDoJogo;

public class MecanicaGenerica implements MecanicaDoJogo{
	
	protected String palavraOriginal;
	protected String palavraEmbaralhada;
	protected Embaralhador embaralhador;
	protected int pontos = 0;
	protected int numTentativas;
	protected int numPalavras;
	
	@Override
	public String iniciaJogo(String dificuldade) {
		this.palavraOriginal = getPalavra();
		this.embaralhador = getEmbaralhador(dificuldade);
		this.palavraEmbaralhada = embaralhar(this.palavraOriginal, this.embaralhador);
		this.numTentativas = setNumTentativas();
		this.numPalavras = 0;
		this.pontos = 0;
		return this.palavraEmbaralhada;
	}

	@Override
	public int setNumTentativas() {
		return 0;
	}

	@Override
	public int getNumTentativas() {
		return numTentativas;
	}

	@Override
	public String getPalavra() {
		return new BancoDePalavras().getPalavra();
	}
	
	@Override
	public String getResposta() {
		return palavraOriginal;
	}
	
	@Override
	public Embaralhador getEmbaralhador(String dificuldade) {
		return new FabricaEmbaralhadores().getEmbaralhador(dificuldade);
	}

	@Override
	public String embaralhar(String palavra, Embaralhador embaralhador) {
		return embaralhador.Embaralhar(palavra);
	}

	@Override
	public boolean comparaRespostaComPalavra(String resposta, String palavra) {
		return palavra.equals(resposta) ? true : false;
	}
	
	protected void pontuar() {}
	
	@Override
	public int getPontuacao() {
		return pontos;
	}

	@Override
	public String retomaJogo(boolean continua) {
		if(!continua) {
			if((numTentativas) > 0){
				numTentativas--;
				return palavraEmbaralhada;
			}
			return "";
		} 
		
		if (numPalavras > 0){
			setNumPalavras();
		}
		
		pontuar();
		this.palavraOriginal = getPalavra();
		this.palavraEmbaralhada = embaralhar(this.palavraOriginal, this.embaralhador);
		this.numTentativas = setNumTentativas();
		return this.palavraEmbaralhada;
	}

	@Override
	public int getNumPalavras() {
		return numPalavras ;
	}

	@Override
	public void setNumPalavras() {
		this.numPalavras = getNumPalavras() - 1;
	}

	@Override
	public String[] jogando(String palavraDigitada) {
		String[] retorno = {"","",""};

		if(palavraDigitada.equals("s") || palavraDigitada.equals("q")) {
			retorno[0] = ".";
			retorno[1] = ".";
			retorno[2] = palavraDigitada.equals("s") ? "s" : "q";
			return retorno;
		}

		if(comparaRespostaComPalavra(getResposta(), palavraDigitada)) {
			
			if(getNumPalavras()-1 > 0) {
				retorno[0] = "Acertou!";
				retorno[1] = "A próxima palavra é: ";
				retorno[2] = retomaJogo(true);
			} else {
				retorno[0] = "Você terminou o nível Fácil!";
				retorno[1] = "Sua pontuação foi de " + getPontuacao() + " pontos.";
				retorno[2] = "Deseja jogar novamente? s = Sim e q = Sair";
			}
						
		} else {
			
			if(getNumTentativas()-1 > 0) {
				retorno[0] = "Você Errou!";
				retorno[1] = "Tente novamente ou seja fraco e desista!: ";
				retorno[2] = retomaJogo(false);
			} else {
				retorno[0] = "Suas chances acabaram!";
				retorno[1] = "Sua pontuação foi de " + getPontuacao() + " pontos.";
				retorno[2] = "Deseja jogar novamente? s = Sim e q = Sair";;
			}
			
		}
		
		return retorno;	
	}
}