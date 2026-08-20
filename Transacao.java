public class Transacao {

    private Integer idTransacao;
    private String tipo;
    private Double valor;
    private String data;
    private String descricao;

    public Transacao() {
    }

    public Transacao(Integer idTransacao, String tipo, Double valor,
                     String data, String descricao) {
        this.idTransacao = idTransacao;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public void realizarTransacao() {
        System.out.println("Realizando transação.");
    }

    public void cancelarTransacao() {
        System.out.println("Cancelando transação.");
    }

    public void consultarTransacao() {
        System.out.println("Consultando transação.");
    }
}