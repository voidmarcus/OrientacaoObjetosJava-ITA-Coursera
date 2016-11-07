import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testes {

	private static Autoridade[] vetorAutoridade = new Autoridade[6];
	
	@Before
	public void inicializaInstancias(){

		vetorAutoridade[0] = new Autoridade("Carl", "Gaus", true, "Informal");
		vetorAutoridade[1] = new Autoridade("Marie", "Curie", false, "Informal");
		vetorAutoridade[2] = new Autoridade("Alan", "Turing", true, "respeitoso"); 
		vetorAutoridade[3] = new Autoridade("Ada", "Byron", false, "Respeitoso");
		vetorAutoridade[4] = new Autoridade("Galileu", "Galilei", true, "Dr");
		vetorAutoridade[5] = new Autoridade("Isaac", "Newton", false, "Sir");
	}
	
	@Test
	public void Respeitoso_XY() {
		assertTrue("Erro: Informal XY true", vetorAutoridade[0].getTratamento().equals("Carl"));
	}
	@Test
	public void Respeitoso_XX() {
		assertTrue("Erro: Informal XY false", vetorAutoridade[1].getTratamento().equals("Marie"));
	}
	@Test
	public void Titulo_XY() {
		assertTrue("Erro: Respeitoso XY true", vetorAutoridade[2].getTratamento().equals("Sr. Alan Turing"));
	}
	@Test
	public void Titulo_XX() {
		assertTrue("Erro: Respeitoso XY false", vetorAutoridade[3].getTratamento().equals("Sra. Ada Byron"));
	}
	@Test
	public void Informal_XX() {
		assertTrue("Erro: ComTitulo XY true", vetorAutoridade[4].getTratamento().equals("Dr Galileu Galilei"));
	}
	@Test
	public void Informal_XY() {
		assertTrue("Erro: ComTitulo XY false", vetorAutoridade[5].getTratamento().equals("Sir Isaac Newton"));
	}

}
