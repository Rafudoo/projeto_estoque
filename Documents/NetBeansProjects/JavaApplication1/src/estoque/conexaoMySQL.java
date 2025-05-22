package estoque;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexaoMySQL {
    public static Connection conectar() throws Exception {
        String url = "jdbc:mysql://localhost:3306/estoque";
        String usuario = "root";
        String senha = "fc1fab63";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, usuario, senha);
    }
}

