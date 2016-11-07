/*
 * Informal: retorna somente o primeiro nome
 */

public class Informal implements FormatadorNome {

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return nome;
	}
}