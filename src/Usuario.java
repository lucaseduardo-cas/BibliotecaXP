public class Usuario {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private boolean inadimplente;

    // Construtor
    public Usuario(int id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.inadimplente = false;
    }

    // Getters e Setters

    // Método para marcar como inadimplente
    public void marcarComoInadimplente() {
        this.inadimplente = true;
    }

    // Outros métodos necessários...
}
