public class Usuario {

    //<editor-fold desc="Atributos">
    private int id;
    private String nome;
    private String email;
    //</editor-fold>

    //<editor-fold desc="Construtor">
    public Usuario() {
    }
    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //</editor-fold>
}
