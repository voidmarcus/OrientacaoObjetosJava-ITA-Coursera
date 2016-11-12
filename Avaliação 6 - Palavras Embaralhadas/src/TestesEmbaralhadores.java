import static org.junit.Assert.*;

import org.junit.Test;

import Embaralhadores.InverteString;
import Embaralhadores.TrocaParImpar;

public class TestesEmbaralhadores {
	
	String palavra = "coxinha";
	
	@Test
	public void testEmbaralharAoContrario() {
		InverteString e = new InverteString();
		assertEquals("ahnixoc",e.Embaralhar(palavra));
	}

	@Test
	public void testEmbaralharParImpar() {
		TrocaParImpar e = new TrocaParImpar();
		assertEquals("cxoniah",e.Embaralhar(palavra));
	}
}