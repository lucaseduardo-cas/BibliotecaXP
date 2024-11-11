import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private int usuarioId;
    private int livroId;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private String status;

    // Construtor
    public Emprestimo(int id, int usuarioId, int livroId, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.livroId = livroId;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = "ativo";
    }

    // Método para verificar se o empréstimo está atrasado
    public void verificarAtraso() {
        if (LocalDate.now().isAfter(dataDevolucao)) {
            this.status = "atrasado";
        }
    }

    // Outros métodos necessários...
}
