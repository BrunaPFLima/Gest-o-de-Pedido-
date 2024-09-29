 Sistema de Gerenciamento de Pedidos
Nome do Projeto: Sistema de Gerenciamento de Pedidos

Tecnologias Utilizadas:

Java
Spring Boot
Maven
Padrões de Design (GoF)
Visão Geral: O Sistema de Gerenciamento de Pedidos é uma aplicação web desenvolvida para gerenciar e processar pedidos de forma eficiente. O projeto utiliza o framework Spring Boot para facilitar a criação de aplicações Java, implementando padrões de design clássicos do Gang of Four (GoF) para promover boas práticas de desenvolvimento.

Funcionalidades Principais:

Processamento de Pedidos: Permite a criação e o processamento de pedidos de forma simplificada.
Estratégias de Pagamento: Implementa o padrão Strategy para suportar diferentes métodos de pagamento, como Cartão de Crédito e PayPal, possibilitando a extensão fácil para novas formas de pagamento no futuro.
Gerenciamento de Pedidos Singleton: Utiliza o padrão Singleton para garantir que apenas uma instância do gerenciador de pedidos exista durante a execução da aplicação, promovendo a consistência dos dados.
Arquitetura do Projeto:

Controlador: O OrderController é responsável por receber as requisições HTTP e orquestrar o processamento dos pedidos e pagamentos.
Modelo: A classe OrderManager atua como um gerenciador de pedidos, responsável por processar as informações do pedido.
Serviços: As classes de serviços CreditCardPayment e PayPalPayment implementam a interface PaymentStrategy, permitindo que a lógica de pagamento seja facilmente alterada ou estendida.
Padrões de Design Utilizados:

Singleton: Assegura que a classe OrderManager tenha uma única instância, evitando conflitos em ambientes multithread.
Strategy: Permite que diferentes algoritmos de pagamento sejam intercambiáveis, facilitando a adição de novos métodos de pagamento sem alterar o código existente.
Objetivos do Projeto: O objetivo deste projeto é demonstrar a aplicação de padrões de design no desenvolvimento de software, criando uma solução escalável e de fácil manutenção. Além disso, proporciona uma experiência prática no uso do Spring Framework, preparando o desenvolvedor para desafios reais na construção de aplicações.


