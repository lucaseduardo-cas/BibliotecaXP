public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int quantidadeDisponivel;

    // Construtor
    public Livro(int id, String titulo, String autor, String editora, int anoPublicacao, int quantidadeDisponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // Getters e Setters

    // Método para reduzir a quantidade de cópias disponíveis
    public void emprestar() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
        }
    }

    public void devolver() {
        quantidadeDisponivel++;
    }

    // Outros métodos necessários...
}
