public class Conta {

    private String numeroConta;
    private Double saldo;
    private String tipoConta;
    private String status;

    public Conta() {
    }

    public Conta(String numeroConta, Double saldo, String tipoConta, String status) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.status = status;
    }

    public void depositar() {
        System.out.println("Realizando depósito na conta.");
    }

    public void sacar() {
        System.out.println("Realizando saque da conta.");
    }

    public void consultarSaldo() {
        System.out.println("Consultando saldo da conta.");
    }
}