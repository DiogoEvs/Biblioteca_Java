
package Conexao;

import java.sql.*;


public class ModuloConexao {
    
    public static Connection conector() {
        java.sql.Connection conexao = null;

        // local de armanezamento do BANCO DE DADOS   
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
    
}
