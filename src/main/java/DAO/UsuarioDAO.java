/*
 * DAO = Acesso ao objeto.
 * Usado para quando precisamos acessar o objeto, para poder começar a trabalhar com eles.
 */

package DAO;

import DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection c;
    PreparedStatement p; // Prepara a conexão
    ResultSet rs;

    public ResultSet autenticarUsuario(UsuarioDTO userdto) { 
        /*
        Permite percorrermos um DataTable de alguma consulta em um banco de dados. Ao ser inicializado, 
        o Resultset coloca seu cursor na primeira linha do DataTable, o método next() permite que o ponteiro seja direcionado para a próxima linha caso exista.
        */
        c = new ConexaoDAO().conectaBD(); //Acessamos a classe de conexão e depois o metodo de conexão criado na classe.

        try { //Try = tente fazer o que tiver dentro.
            String select = "SELECT * FROM usuario where login = ? and senha = ?"; // Variavel que recebe o comando MYSQL que é direcionado ao banco 

            p = c.prepareStatement(select); // P recebe conexao, passando comando SQL
            p.setString(1, userdto.getLoginUser()); 
            // Setando uma String, no primeiro parametro (?), para comparar se o parametro passado corresponde ao que tem armazenado no banco.
            p.setString(2, userdto.getSenhaUser());

            ResultSet rs = p.executeQuery(); //Executando a 
            return rs;
        } catch (SQLException erro) { // Catch = caso não consiga faça.
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
}
