import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

	static Pizza p0 = new Pizza(); // 0 ingredientes - nao e' add no carrinho
	static Pizza p1 = new Pizza(); // 2 ingredientes - 15 reais
	static Pizza p2 = new Pizza(); // 5 ingredientes - 20 reais
	static Pizza p3 = new Pizza(); // 6 ingredientes - 23 reais
	
	// Atribuicoes das variaveis do tipo Pizza
	@BeforeClass 
	public static void AtribuiValores() {
		p1.adicionaIngrediente("presunto");
		p1.adicionaIngrediente("mozarela");

		// Pizza p2 = new Pizza();
		p2.adicionaIngrediente("presunto");
		p2.adicionaIngrediente("mozarela");
		p2.adicionaIngrediente("calabreza");
		p2.adicionaIngrediente("champion");
		p2.adicionaIngrediente("azeitona");

		// Pizza p3 = new Pizza();
		p3.adicionaIngrediente("presunto");
		p3.adicionaIngrediente("mozarela");
		p3.adicionaIngrediente("calabreza");
		p3.adicionaIngrediente("champion");
		p3.adicionaIngrediente("azeitona");
		p3.adicionaIngrediente("oregano");

	}
	
	/*
	 * Verificando se o preço das pizzas são 
	 * somados corretamente.
	 */
	@Test
	public void TGetPreco() {
		CarrinhoDeCompras car = new CarrinhoDeCompras();
		car.addPizza(p0);
		car.addPizza(p1);
		car.addPizza(p2);
		car.addPizza(p3);
		
		assertEquals(58, car.getTotal());
	}
	
	// E se impede a adição de uma pizza sem ingredientes.
	@Test
	public void TAddCarrinho() {
		CarrinhoDeCompras car = new CarrinhoDeCompras();
		car.addPizza(p0); // sem ingradientes
		car.addPizza(p1); // com ingradientes
		car.addPizza(p2); // com ingradientes
		car.addPizza(p3); // com ingradientes
		
		assertEquals(3, Pizza.mapa.size()/2); // Divide por dois pois mapa.size retorna o numero de key E value
	}

}
