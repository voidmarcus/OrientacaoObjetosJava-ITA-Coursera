/*
 * Respeitoso: deve receber em seu construtor a informação se é masculino 
 * ou feminino, e retornar "Sr." ou "Sra." seguido do sobrenome
 */

public class Respeitoso implements FormatadorNome {
	
	private boolean XY;

	public Respeitoso(boolean XY) {
		super();
		this.XY = XY;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(XY){
			return "Sr. "+ nome + " " + sobrenome;
		} else{
			return "Sra. "+ nome + " " + sobrenome;
		}
	}
}