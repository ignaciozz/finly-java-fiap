public class Usuario {

    private String nome;
    private String cpf;
    private String email;
    private Integer idade;
    private Conta conta;

    public Usuario(String nome, String cpf, String email, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }

    public void associarConta(Conta conta) {
        this.conta = conta;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Idade: " + idade);

        if (conta != null) {
            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Saldo: R$ " + conta.consultarSaldo());
        }
    }

    public void depositar(Double valor) {
        if (conta != null) {
            conta.depositar(valor);
        }
    }

    public boolean sacar(Double valor) {
        if (conta != null) {
            return conta.sacar(valor);
        }

        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }

    public Conta getConta() {
        return conta;
    }
}
