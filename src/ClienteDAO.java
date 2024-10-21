import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {

    private Connection connection;

    public ClienteDAO(Connection connection){
        this.connection = connection;
    }

    //<editor-fold desc="Cadastrar Cliente">
    public void cadastrarCliente(Cliente cliente) throws SQLException{
        String sql = "INSERT INTO cliente (id_cliente, nome, email) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, String.valueOf(cliente.getId()));
        stmt.setString(2, cliente.getNome());
        stmt.setString(3, cliente.getEmail());
        stmt.execute();
        stmt.close();
    }
    //</editor-fold>

    //<editor-fold desc="Buscar Cliente">
    public Cliente buscarCliente(int id) throws SQLException{
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        Cliente cliente = null;
        if(rs.next()){
            cliente = new Cliente();
            cliente.setId(rs.getInt("id_cliente"));
            cliente.setNome(rs.getString("nome"));
            cliente.setEmail(rs.getString("email"));
        }
        rs.close();
        stmt.close();
        return cliente;
    }
    //</editor-fold>

    //<editor-fold desc="Remover Cliente">
        public void removerCliente(int id) throws SQLException{
            String sql = "DELETE FROM cliente WHERE id_cliente = ?";
            PreparedStatement stmt = null;

            try{
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, id);

                stmt.executeUpdate();
            } finally {
                if (stmt != null){
                    stmt.close();
                }
            }

        }
    //</editor-fold>

    //<editor-fold desc="Atualizar Cliente">

    public void editarCliente(int id, String nome, String email) throws SQLException {
        String sql = "UPDATE cliente SET nome = ?, email = ? WHERE id_cliente = ?";
        PreparedStatement stmt = null;

        try{
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setInt(3, id);

        } finally {
            if(stmt != null){
                stmt.close();
            }
        }


    }

    //</editor-fold>
}
