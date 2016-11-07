public class Produto {

	//Crie uma classe chamada Produto que deve possuir um nome, um código e um preço.
	private String nome;
	private int codigo;
	private double preco;
	
	//Contrutor
	public Produto(String nome, int codigo, double preco){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	//Metodos da Classe
	public double getPreco(){
		return this.preco;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
	
	//Sobrescreva os métodos equals() e hashCode() de Object. 
	//de forma a serem considerados iguais instancias de Produto que possuam o mesmo código.
	@Override
	public int hashCode() {
		return this.codigo;
	}


	@Override
	public boolean equals(Object obj) {
		//Se os obj são iguais
		if (this == obj)
			return true;
		
		//Se o obj é null
		if (obj == null)
			return false;
		
		//Se obj é de classe diferente
		if (getClass() != obj.getClass())
			return false;
		
		Produto other = (Produto) obj;
		
		//Se o codigo é diferente
		if (codigo != other.codigo)
			return false;
		return true;
	}

}

