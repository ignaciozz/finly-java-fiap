public class Cartao {

    private String numero;
    private String titular;
    private Double limite;
    private Double limiteDisponivel;
    private Boolean bloqueado;

    public Cartao(String numero, String titular, Double limite) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
        this.limiteDisponivel = limite;
        this.bloqueado = false;
    }

    public boolean realizarCompra(Double valor) {

        if (bloqueado) {
            return false;
        }

        if (valor <= 0 || valor > limiteDisponivel) {
            return false;
        }

        limiteDisponivel -= valor;
        return true;
    }

    public void bloquear() {
        bloqueado = true;
    }

    public void desbloquear() {
        bloqueado = false;
    }

    public void pagarFatura(Double valor) {

        if (valor > 0) {
            limiteDisponivel += valor;

            if (limiteDisponivel > limite) {
                limiteDisponivel = limite;
            }
        }
    }

    public Double consultarLimiteDisponivel() {
        return limiteDisponivel;
    }

    public Boolean isBloqueado() {
        return bloqueado;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getLimite() {
        return limite;
    }
}