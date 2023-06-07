package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectaBD() {
        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306/rentcar?user=root&password=root";
            con = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null," ConexaoDAO"+ erro.getMessage());
        }
        return con;
    }
}
