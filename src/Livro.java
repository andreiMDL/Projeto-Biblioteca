public class Livro {


    //<editor-fold desc="Atributos">
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponibilidade;
    private int ISBN;
    //</editor-fold>

    //<editor-fold desc="Construtor">
    public Livro() {
    }
    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    //</editor-fold>

    //<editor-fold desc="Funções">

    public void isDisponivel(){

    }

    public void emprestar(){

    }

    public void devolver(){

    }

    public void exibirDetalhes(){

    }

    //</editor-fold>

}
