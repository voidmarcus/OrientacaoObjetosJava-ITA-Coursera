import java.util.HashMap;

public class Pizza {
	String sabor;
	int qt_ingradientes = 0;

	static HashMap<String, Integer> mapa = new HashMap<>();

	private static void contablilizaIngradiente(String ingradiente) {
		if (mapa.containsKey(ingradiente)) {
			mapa.put(ingradiente, (mapa.get(ingradiente)) + 1);
		} else
			mapa.put(ingradiente, 1);

	}

	public void adicionaIngrediente(String ingradiente) {
		this.qt_ingradientes++;
		contablilizaIngradiente(ingradiente);
	}

	public int getPreco() {
		if (this.qt_ingradientes <= 2)
			return 15;
		else if (this.qt_ingradientes > 2 && this.qt_ingradientes <= 5)
			return 20;
		else
			return 23;
	}
	
	/*
	 * Crie um método estático na classe Pizza que zera o registro de ingredientes.
	 */
	public static void ZeraAtributos(){
		Pizza.mapa.clear();
	}
}