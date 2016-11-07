
public class ProdutoComTamanho extends Produto {

	private int tamanho;

	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	public int getCodigo() {
		return super.getCodigo();
	}

	@Override
	public int hashCode() {
		return super.hashCode()+ tamanho;
	}

	@Override
	public boolean equals(Object obj) {
		//Se os obj são iguais
		if (this == obj)
			return true;
		
		//Se o obj é null
		if (!super.equals(obj))
			return false;
		
		//Se obj é de classe diferente
		if (getClass() != obj.getClass())
			return false;
		
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		
		//Se o codigo é igual e o tamanho diferente
		if (tamanho != other.tamanho && getCodigo() == other.getCodigo())
			return false;
		return true;
	}

}
