public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.cadastrarUsuario();
        usuario.atualizarDados();
        usuario.exibirDados();

        Conta conta = new Conta();
        conta.depositar();
        conta.sacar();
        conta.consultarSaldo();

        Transacao transacao = new Transacao();
        transacao.realizarTransacao();
        transacao.cancelarTransacao();
        transacao.consultarTransacao();

        Cartao cartao = new Cartao();
        cartao.realizarCompra();
        cartao.consultarLimite();
        cartao.bloquearCartao();
    }
}