public class Cartao {

    private String numeroCartao;
    private String nomeTitular;
    private Double limite;
    private String validade;
    private String status;

    public Cartao() {
    }

    public Cartao(String numeroCartao, String nomeTitular, Double limite,
                  String validade, String status) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.limite = limite;
        this.validade = validade;
        this.status = status;
    }

    public void realizarCompra() {
        System.out.println("Realizando compra com o cartão.");
    }

    public void consultarLimite() {
        System.out.println("Consultando limite do cartão.");
    }

    public void bloquearCartao() {
        System.out.println("Bloqueando cartão.");
    }
}