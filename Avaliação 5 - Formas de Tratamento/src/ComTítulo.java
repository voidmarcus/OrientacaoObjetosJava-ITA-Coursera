/*
 * ComTítulo: deve receber em seu construtor o título e retornar o título 
 * seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"
 */

public class ComTítulo implements FormatadorNome{

	private String titulo;

	public ComTítulo(String titulo) {
		super();
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {	
		return titulo + " " + nome + " " + sobrenome;
	}
}