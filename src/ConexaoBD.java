import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "22292254";

    public static Connection conectar(){
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão com banco de dados realizada com sucesso!");
        } catch (SQLException e){
            System.out.println("Erro ao conectar com banco de dados. ");
            e.printStackTrace();
        }
        return conexao;
    }
}
