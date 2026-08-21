public class ContaCorrente extends Conta {

    private Double limite;

    public ContaCorrente(String numeroConta, Double saldoInicial, Double limite) {
        super(numeroConta, saldoInicial);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(Double valor) {
        if (valor > 0 && valor <= consultarSaldo() + limite) {
            if (valor <= consultarSaldo()) {
                super.sacar(valor);
            } else {
                Double valorRestante = valor - consultarSaldo();
                super.sacar(consultarSaldo());
                limite -= valorRestante;
            }

            return true;
        }

        return false;
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta corrente");
    }
}
