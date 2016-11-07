import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	public static Map<Produto, Integer> carrinho = new HashMap<>(); // public para realizar os testes com Junit 
	private static double total = 0;

	public void adicionaProduto(Produto produto, int quantidade) {
		int quantidadeNoCarrrinho;
		if (carrinho.containsKey(produto)) {
			quantidadeNoCarrrinho = carrinho.get(produto);
			somaParcial(produto, quantidade);
			carrinho.put(produto, quantidade += quantidadeNoCarrrinho);
		} else {
			carrinho.put(produto, quantidade);
			somaParcial(produto, quantidade);
		}

	}

	public void removeProduto(Produto produto, int quantidade) {
		if (carrinho.containsKey(produto)) {
			carrinho.merge(produto, quantidade, (x, y) -> {
				return x - y < 1 ? null : x - y;
			});
			total -= produto.getPreco() * quantidade;
		}
	}

	public double valorCompra() {
		return total;
	}

	private void somaParcial(Produto produto, int quantidade) {
		total += produto.getPreco() * quantidade;
	}
		
	public void limparCarrinho(){
		carrinho.clear();
		total = 0;
		
	}

}


/*

Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo HashMap cada produto 
adicionado no carrinho e sua respectiva quantidade. O método adicionaProduto() deve receber a instancia
 do produto e a quantidade. Caso o produto já exista no HashMap, a quantidade deve ser somada a que já 
 existe no carrinho. Deve haver também um método removeProduto() que também recebe a instancia do produto 
 e a quantidade a ser removida. Observe que produtos de tamanhos diferentes devem ser considerados como produtos 
 diferentes no carrinho. O carrinho deve possuir um método que calcula o valor total da compra.

Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e para a classe CarrinhoDeCompras. 
Os testes de cada classe devem ser colocados em classes separadas e devem estar em um diretório de código diferente 
das classes de produção.




*O método hashCode() também é definido na classe Object e retorna o código hash de um objeto, que é utilizado em várias classes 
*que implementam estruturas de dados. Ele precisa obedecer a seguinte regra: 

*quando o método equals() retornar true, o retorno de hashCode() desses objetos precisa ser igual. 
*Mas se o retorno do hashCode() for igual, não necessariamente os objetos são iguais, ou seja, o equals() precisa retornar true.
*
*
*
*
*/