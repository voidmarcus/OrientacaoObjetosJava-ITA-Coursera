#Conceitos trabalhados

Nesta semana você aprofundará seu contato com classes e métodos, bem como com modelagem CRC. Ao final desta semana, você será capaz de: 1) modelar o comportamento de classes com métodos em Java; 2) projetar novas classes para uma aplicação por meio da modelagem CRC

#Instruções

Crie uma classe Pizza que possua o método adicionaIngrediente() que recebe uma String com o ingrediente a ser adicionado. Essa classe também deve possuir o método getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.

É preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize uma variável estática na classe Pizza para guardar esse tipo de informação (dica: utilize a classe HashMap para guardar o ingrediente como chave e um Integer como valor). Crie o método estático contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro.

Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. Ela deve ter um método que retorna o valor total de todas as pizzas adicionadas. O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.

Crie uma classe Principal com o método main() que faz o seguinte:

Cria 3 pizzas com ingredientes diferentes
Adiciona essas Pizzas em um CarrinhoDeCompra
Imprime o total do CarrinhoDeCompra
Imprime a quantidade utilizada de cada ingrediente
