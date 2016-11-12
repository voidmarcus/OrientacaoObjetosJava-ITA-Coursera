package Interfaces;

public interface MecanicaDoJogo {

	public String iniciaJogo(String dificuldade);

	public int setNumTentativas();

	public int getNumTentativas();

	public String getPalavra();

	public String getResposta();

	public Embaralhador getEmbaralhador(String dificuldade);

	public String embaralhar(String palavra, Embaralhador embaralhador);

	public boolean comparaRespostaComPalavra(String resposta, String palavra);

	public String[] jogando(String palavra);

	public int getPontuacao();

	public String retomaJogo(boolean continua);

	public int getNumPalavras();

	public void setNumPalavras();

}
