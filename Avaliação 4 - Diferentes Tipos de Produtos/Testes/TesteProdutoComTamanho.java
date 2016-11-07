import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	ProdutoComTamanho p1;
	ProdutoComTamanho p2;
	ProdutoComTamanho p3;
	ProdutoComTamanho p4;
	ProdutoComTamanho p5;
	
	@Before
	public void Before() {
		p1 = new ProdutoComTamanho ("BiscoitoA", 100, 1.50, 150);
		p2 = new ProdutoComTamanho ("Queijo", 200, 8.50, 2);
		p3 = new ProdutoComTamanho ("BiscoitoB", 100, 1.75, 150);
		p4 = new ProdutoComTamanho ("Queijo", 200, 8.50, 2);
		p5 = new ProdutoComTamanho ("BiscoitoA", 100, 2.50, 300);
	}
	

	@Test
	public void testaProdutoIgual() {
		assertEquals(true, p2.equals(p4));
	}
	
	//de forma a serem considerados iguais instancias de Produto que possuam o mesmo código.
	@Test
	public void testaProdutoDiferenteCodigosIguais() {
		assertEquals(true, p1.equals(p3));
	}
	
	//produto com mesmo código e tamanhos diferentes são considerados diferentes
	@Test
	public void testaProdutoDiferenteCodigosIguaisTamDiferentes() {
		assertEquals(false, p1.equals(p5));
	}
	
	@Test
	public void testaProdutoDiferente() {
		assertEquals(false, p1.equals(p2));
	}

}
