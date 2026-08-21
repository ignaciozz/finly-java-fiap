# Finly

Projeto acadêmico de um sistema **Fintech desenvolvido em Java**.

## Sobre o projeto

O Finly foi desenvolvido como parte de atividades acadêmicas de programação, com o objetivo de aplicar conceitos de **Programação Orientada a Objetos (POO)** na construção gradual de um sistema Fintech.

O projeto começou com a definição das principais classes, seus atributos e métodos e, nesta segunda etapa, recebeu implementações de lógica de negócio, além de conceitos de herança, polimorfismo e encapsulamento.

## Funcionalidades

- Cadastro e gerenciamento de usuários
- Criação e gerenciamento de contas
- Depósitos e saques
- Contas corrente e poupança
- Criação e execução de transações
- Controle de status das transações
- Gerenciamento de cartões
- Controle de limite disponível
- Realização de compras
- Bloqueio e desbloqueio de cartão
- Pagamento de fatura
- Aplicação de rendimento em conta poupança

## Estrutura do projeto

```text
src/
├── Main.java
├── Usuario.java
├── Conta.java
├── ContaCorrente.java
├── ContaPoupanca.java
├── Transacao.java
└── Cartao.java
````

### Principais classes

* `Usuario` - representa o usuário da plataforma e permite interação com sua conta.
* `Conta` - superclasse responsável pelas operações básicas de uma conta.
* `ContaCorrente` - especialização de `Conta` com limite adicional.
* `ContaPoupanca` - especialização de `Conta` com rendimento.
* `Transacao` - representa e executa operações financeiras.
* `Cartao` - controla compras, limite, bloqueio e pagamento de fatura.
* `Main` - classe responsável pela execução e testes do sistema.

## Conceitos de POO aplicados

### Encapsulamento

Os atributos das classes são protegidos utilizando `private`, com acesso controlado através de métodos públicos.

### Herança

A classe `Conta` é utilizada como superclasse para:

* `ContaCorrente`
* `ContaPoupanca`

### Polimorfismo

Os métodos das subclasses sobrescrevem comportamentos definidos na classe `Conta`, utilizando `@Override`.

Exemplo:

```java
Conta conta = new ContaCorrente("001", 1000.0, 500.0);

conta.exibirTipoConta();
```

Nesse caso, o método executado corresponde ao comportamento da `ContaCorrente`.

### Construtores

As classes possuem construtores para inicialização dos objetos com seus respectivos dados.

## Tecnologias

* Java
* Visual Studio Code
* Git
* GitHub

## Status

🚧 Projeto em desenvolvimento.

O projeto será evoluído gradualmente com novas funcionalidades e conceitos de programação nas próximas etapas.
