#Conceitos trabalhados

Olá! Bem-vindo à semana 5 do curso Orientação a Objetos com Java! Nesta semana você aprofundará seu contato com os conceitos de Encapsulamento, Acoplamento entre Classes e Interfaces em Java. Ao final desta semana, você será capaz de 1) projetar e estruturar programas Java evitando quebras de encapsulamento e propiciando acoplamento baixo entre classes, 2) além de garantir acoplamento abstrato entre classes pelo uso adequado de interfaces em Java

#Instruções

Crie uma interface chamada FormatadorNome que possui o método String formatarNome(String nome, String sobrenome).

Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome e uma instância de FormatadorNome. Essa classe deve possuir um método getTratamento() que delega a formatação do nome para a instância de FormatadorNome.

Crie a seguintes implementações da interface FormatadorNome:

Informal: retorna somente o primeiro nome
Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, e retornar "Sr." ou "Sra." seguido do sobrenome
ComTítulo: deve receber em seu construtor o título e retornar o título seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"
Crie testes de unidade que fazem os testes da classe Autoridade com cada uma das implementações da interface.
