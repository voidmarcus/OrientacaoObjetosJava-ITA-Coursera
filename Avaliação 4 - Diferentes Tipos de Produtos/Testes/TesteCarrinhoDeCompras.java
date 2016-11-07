import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

	ProdutoComTamanho p1;
	ProdutoComTamanho p2;
	ProdutoComTamanho p3;
	ProdutoComTamanho p4;
	ProdutoComTamanho p5;
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	
	//Atribuição dos Produtos
	@Before
	public void Before() {
		p1 = new ProdutoComTamanho ("BiscoitoA", 100, 1.50, 150);
		p2 = new ProdutoComTamanho ("Queijo", 200, 8.50, 2);
		p3 = new ProdutoComTamanho ("BiscoitoB", 100, 1.75, 150);
		p4 = new ProdutoComTamanho ("Queijo", 200, 8.50, 2);
		p5 = new ProdutoComTamanho ("BiscoitoA", 100, 2.50, 300);
	}
	
	//Limpeza do Carrinho
	@Before
	public void limpaCarrinho() {
		carrinho.limparCarrinho();
	}
	
	//addCarrinho eh testada de forma implicita
	@Test
	public void testeValorCompra() {
		carrinho.adicionaProduto(p1, 2);
		carrinho.adicionaProduto(p5, 3);
		assertEquals(10.5, carrinho.valorCompra(),0.0);
	}
	
	
	@Test
	public void testeRemoveProduto() {
		carrinho.adicionaProduto(p1,8);
		carrinho.adicionaProduto(p5,6);
		carrinho.removeProduto(p1, 6);
		carrinho.removeProduto(p5, 3);
		assertEquals(10.5, carrinho.valorCompra(), 0.0);
	}
	
	
}
