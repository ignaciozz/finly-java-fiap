public class Transacao {

    private Integer idTransacao;
    private String tipo;
    private Double valor;
    private String descricao;
    private String status;
    private Conta conta;

    public Transacao(Integer idTransacao, String tipo, Double valor,
                     String descricao, Conta conta) {

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da transação deve ser maior que zero.");
        }

        this.idTransacao = idTransacao;
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.status = "PENDENTE";
        this.conta = conta;
    }

    public boolean realizarTransacao() {

        if (!status.equals("PENDENTE")) {
            return false;
        }

        boolean sucesso;

        if (tipo.equalsIgnoreCase("DEPOSITO")) {
            conta.depositar(valor);
            sucesso = true;

        } else if (tipo.equalsIgnoreCase("SAQUE")) {
            sucesso = conta.sacar(valor);

        } else {
            sucesso = false;
        }

        if (sucesso) {
            status = "CONCLUIDA";
        }

        return sucesso;
    }

    public boolean cancelarTransacao() {

        if (status.equals("PENDENTE")) {
            status = "CANCELADA";
            return true;
        }

        return false;
    }

    public Integer getIdTransacao() {
        return idTransacao;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }
}