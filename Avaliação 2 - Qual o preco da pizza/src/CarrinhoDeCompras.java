import java.util.ArrayList;

public class CarrinhoDeCompras {
	int aux_total = 0;
	ArrayList<Pizza> lista_pizzas = new ArrayList<>();

	public void addPizza(Pizza pizza) {
		if (pizza.qt_ingradientes != 0) {
			lista_pizzas.add(pizza);
		}
	}

	public int getTotal() {
		for (int i = 0; i < lista_pizzas.size(); i++) {
			aux_total += lista_pizzas.get(i).getPreco();
		}
		return aux_total;
	}
	
	public void clearCarrinhoDeCompras(){
		lista_pizzas.clear();
	}
	
}
