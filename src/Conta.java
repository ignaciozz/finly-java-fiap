public class Conta {

    private String numeroConta;
    private Double saldo;
    private String status;

    public Conta(String numeroConta, Double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.status = "Ativa";
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(Double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    public Double consultarSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getStatus() {
        return status;
    }

    public void exibirTipoConta() {
        System.out.println("Conta bancária");
    }
}