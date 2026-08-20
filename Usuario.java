public class Usuario {

    private String nome;
    private String cpf;
    private String email;
    private Integer idade;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, String email, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }

    public void cadastrarUsuario() {
        System.out.println("Cadastrando usuário.");
    }

    public void atualizarDados() {
        System.out.println("Atualizando dados do usuário.");
    }

    public void exibirDados() {
        System.out.println("Exibindo dados do usuário.");
    }
}