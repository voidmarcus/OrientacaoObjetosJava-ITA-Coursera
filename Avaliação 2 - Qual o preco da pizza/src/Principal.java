
public class Principal {

	public static void main(String[] args) {

		// Cria 3 pizzas com ingredientes diferentes
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

		CarrinhoDeCompras car = new CarrinhoDeCompras();

		// Adiciona essas Pizzas em um CarrinhoDeCompra
		car.addPizza(p1);
		car.addPizza(p2);
		car.addPizza(p3);

		// Imprime o total do CarrinhoDeCompra
		System.out.println("Valor total da compra = R$" + car.getTotal());
		System.out.println("");

		// Imprime a quantidade utilizada de cada ingrediente
		System.out.println("Quantidade de Presunto: " + Pizza.mapa.get("presunto"));
		System.out.println("Quantidade de Mozarela: " + Pizza.mapa.get("mozarela"));
		System.out.println("Quantidade de Calabreza: " + Pizza.mapa.get("calabreza"));
		System.out.println("Quantidade de Champion: " + Pizza.mapa.get("champion"));
		System.out.println("Quantidade de Azeitona: " + Pizza.mapa.get("azeitona"));
		System.out.println("Quantidade de Oregano: " + Pizza.mapa.get("oregano"));
	}

}
