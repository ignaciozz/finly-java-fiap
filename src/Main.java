public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "Gabriel",
                "123.456.789-00",
                "gabriel@email.com",
                20
        );

        Conta conta = new ContaCorrente(
                "001",
                1000.0,
                500.0
        );

        usuario.associarConta(conta);

        Cartao cartao = new Cartao(
                "1234 5678 9012 3456",
                "Gabriel",
                2000.0
        );

        System.out.println("\n=== DADOS DO USUÁRIO ===");
        usuario.exibirDados();

        System.out.println("\n=== DEPÓSITO ===");

        Transacao deposito = new Transacao(
                1,
                "DEPOSITO",
                500.0,
                "Depósito inicial",
                conta
        );

        if (deposito.realizarTransacao()) {
            System.out.println("Depósito realizado com sucesso.");
        }

        System.out.println("Status: " + deposito.getStatus());
        System.out.println("Saldo: R$ " + conta.consultarSaldo());

        System.out.println("\n=== SAQUE ===");

        Transacao saque = new Transacao(
                2,
                "SAQUE",
                300.0,
                "Saque em dinheiro",
                conta
        );

        if (saque.realizarTransacao()) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }

        System.out.println("Status: " + saque.getStatus());
        System.out.println("Saldo: R$ " + conta.consultarSaldo());

        System.out.println("\n=== POLIMORFISMO ===");

        conta.exibirTipoConta();

        System.out.println("\n=== CARTÃO ===");

        boolean compra = cartao.realizarCompra(500.0);

        if (compra) {
            System.out.println("Compra realizada com sucesso.");
        } else {
            System.out.println("Compra não autorizada.");
        }

        System.out.println("Limite disponível: R$ "
                + cartao.consultarLimiteDisponivel());

        cartao.bloquear();

        boolean compraBloqueado = cartao.realizarCompra(100.0);

        if (compraBloqueado) {
            System.out.println("Compra realizada com sucesso.");
        } else {
            System.out.println("Compra não autorizada: cartão bloqueado.");
        }

        cartao.desbloquear();

        cartao.pagarFatura(300.0);

        System.out.println("Limite após pagamento da fatura: R$ "
                + cartao.consultarLimiteDisponivel());

        System.out.println("\n=== DADOS FINAIS ===");

        usuario.exibirDados();
    }
}