import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {

	static Pizza p1 = new Pizza();
	static Pizza p2 = new Pizza();
	static Pizza p3 = new Pizza();
	


	/*
	 *  [...] E invoque ele(ZeraAtributos) em um método de inicialização OU finalização na classe de testes.
	 */
	@Before
	public void Before() {
		Pizza.ZeraAtributos();
	}
	
	/*
	 * Faça os testes de unidade da classe Pizza e verifique se o valor da Pizza está correto de
	 * acordo com a quantidade de ingredientes.
	 */ 
	@Test
	public void possiveisValoresPizza() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("presunto");
		p1.adicionaIngrediente("mozarela");

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("presunto");
		p2.adicionaIngrediente("mozarela");
		p2.adicionaIngrediente("calabreza");
		p2.adicionaIngrediente("champion");
		p2.adicionaIngrediente("azeitona");

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("presunto");
		p3.adicionaIngrediente("mozarela");
		p3.adicionaIngrediente("calabreza");
		p3.adicionaIngrediente("champion");
		p3.adicionaIngrediente("azeitona");
		p3.adicionaIngrediente("oregano");

		assertEquals(15, p1.getPreco());
		assertEquals(20, p2.getPreco());
		assertEquals(23, p3.getPreco());
	}
	 
	 /*
	  * Verifique também se o registro de ingredientes funcionou corretamente.
	  */
	@Test
	public void VerificaIngradientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("presunto");
		p1.adicionaIngrediente("mozarela");

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("presunto");
		p2.adicionaIngrediente("mozarela");
		p2.adicionaIngrediente("calabreza");
		p2.adicionaIngrediente("champion");
		p2.adicionaIngrediente("azeitona");

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("presunto");
		p3.adicionaIngrediente("mozarela");
		p3.adicionaIngrediente("calabreza");
		p3.adicionaIngrediente("champion");
		p3.adicionaIngrediente("azeitona");
		p3.adicionaIngrediente("oregano");
		
		assertEquals(Integer.valueOf(3), Pizza.mapa.get("presunto"));
		assertEquals(Integer.valueOf(3), Pizza.mapa.get("mozarela"));
		assertEquals(Integer.valueOf(2), Pizza.mapa.get("calabreza"));
		assertEquals(Integer.valueOf(2), Pizza.mapa.get("champion"));
		assertEquals(Integer.valueOf(2), Pizza.mapa.get("azeitona"));
		assertEquals(Integer.valueOf(1), Pizza.mapa.get("oregano"));
	}
}
