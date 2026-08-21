public class ContaPoupanca extends Conta {

    private Double taxaRendimento;

    public ContaPoupanca(String numeroConta, Double saldoInicial, Double taxaRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void aplicarRendimento() {
        Double rendimento = consultarSaldo() * (taxaRendimento / 100);
        depositar(rendimento);
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta poupança");
    }
}
