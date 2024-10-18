import java.time.LocalDate;
import java.time.LocalDateTime;

public class Emprestimo {

    //<editor-fold desc="Atributos">

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    //</editor-fold>

    //<editor-fold desc="Construtor">
    public Emprestimo() {
    }
    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    //</editor-fold>

    //<editor-fold desc="Funções">

    public void registrarEmprestimo(){

    }

    public void registrarDevolucao(){

    }

    //</editor-fold>
}
