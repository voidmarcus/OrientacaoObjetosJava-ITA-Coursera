/*
 * Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome 
 * e uma instância de FormatadorNome. Essa classe deve possuir um método 
 * getTratamento() que delega a formatação do nome para a instância de 
 * FormatadorNome.
 */

public class Autoridade{

	protected String nome;
	protected String sobrenome;
	protected boolean XY;
	protected String tratamento;
	
	FormatadorNome obj;
	
	public Autoridade(String nome, String sobrenome, boolean XY, String tratamento){
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.XY = XY;
		this.tratamento = tratamento;
	}
	
	public String getTratamento(){
		
		switch(tratamento.toLowerCase()) {
			case "informal":
				obj = new Informal();
				break;
			case "respeitoso":
				obj = new Respeitoso(this.XY);
				break;
			default:
				obj = new ComTítulo(tratamento);
				break;
		}
		return obj.formatarNome(this.nome, this.sobrenome);	
	}
	
	
	
	

}
