/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClienteDTO;
import DTO.VeiculoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author João Carser
 */
public class VeiculoDAO {

    Connection c;
    PreparedStatement p;
    ResultSet rs;
    ArrayList<VeiculoDTO> lista = new ArrayList<>();

    //SOMENTE FUNÇÃO CADASTRAR VEÍCULO
    public void cadastrarVeiculo(VeiculoDTO obj) {
        String cadastrar = "INSERT INTO veiculo (modelo,cor,placa,fabricante,anoModelo,qntPortas,acessorios) VALUES(?,?,?,?,?,?,?)";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(cadastrar);

            p.setString(1, obj.getModelo());
            p.setString(2, obj.getCor());
            p.setString(3, obj.getPlaca());
            p.setString(4, obj.getFabricante());
            p.setInt(5, obj.getAnoModelo());
            p.setInt(6, obj.getQtdPortas());
            p.setString(7, obj.getAcessorios());

            p.execute();
            p.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO Cadastrar" + erro);
        }

    }

    public ArrayList<VeiculoDTO> pesquisarVeiculo() {
        String pesquisar = "SELECT * FROM veiculo ORDER BY modelo";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(pesquisar);
            rs = p.executeQuery();

            while (rs.next()) {
                VeiculoDTO c = new VeiculoDTO();
                c.setModelo(rs.getString("modelo"));
                c.setCor(rs.getString("cor"));
                c.setPlaca(rs.getString("placa"));
                c.setFabricante(rs.getString("fabricante"));
                c.setAnoModelo(rs.getInt("anoModelo"));
                c.setQtdPortas(rs.getInt("qntPortas"));
                c.setAcessorios(rs.getString("acessorios"));
                c.setIdVeiculo(rs.getInt("idVeiculo"));

                lista.add(c);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar" + erro);
        }
        return lista;
    }

    public void alterarVeiculo(VeiculoDTO obj) {
        String alterar = "UPDATE veiculo SET modelo=?,cor=?,placa=?,fabricante=?,anoModelo=?,qntPortas=?,acessorios=? WHERE idVeiculo=?";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(alterar);
            
            p.setString(1, obj.getModelo());
            p.setString(2, obj.getCor());
            p.setString(3, obj.getPlaca());
            p.setString(4, obj.getFabricante());
            p.setInt(5, obj.getAnoModelo());
            p.setInt(6, obj.getQtdPortas());
            p.setString(7, obj.getAcessorios());
            
            p.setInt(8, obj.getIdVeiculo());

            p.execute();
            p.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO ALTERAR: " + erro);
        }
    }

    //METODO QUE VAI FAZER A INSERÇÃO NO COMBOBOX DE ALUGUEL PARA SER LISTADO NO COMBOBOX.
    public ResultSet listarModelo() {
        c = new ConexaoDAO().conectaBD();
        String sql = "SELECT modelo, placa FROM veiculo ORDER BY modelo";

        try {
            p = c.prepareStatement(sql);
            return p.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO" + e);
            return null;
        }
    }

    // METODO QUE FAZ A BUSCA DOS VEICULOS PELO NOME OU PLACA
    public ArrayList<VeiculoDTO> buscarVeiculo(String modelo, String placa) {
        String buscar = "SELECT * FROM veiculo WHERE modelo like ? OR placa like ? ORDER BY modelo";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(buscar);
            p.setString(1, modelo);
            p.setString(2, placa);
            rs = p.executeQuery();

            while (rs.next()) {
                VeiculoDTO obj = new VeiculoDTO();
                obj.setModelo(rs.getString("modelo"));
                obj.setCor(rs.getString("cor"));
                obj.setPlaca(rs.getString("placa"));
                obj.setFabricante(rs.getString("fabricante"));
                obj.setAnoModelo(rs.getInt("anoModelo"));
                obj.setQtdPortas(rs.getInt("qntPortas"));
                obj.setAcessorios(rs.getString("acessorios"));
                obj.setIdVeiculo(rs.getInt("idVeiculo"));

                lista.add(obj);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar" + erro);
        }
        return lista;
    }

    public void excluirVeiculo(VeiculoDTO obj) {
        String excluir = "DELETE FROM veiculo WHERE idVeiculo=?";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(excluir);

            p.setInt(1, obj.getIdVeiculo());

            p.execute();
            p.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir" + erro);
        }
    }

    public ResultSet verificarVeiculo(String placa) {
        String pesquisar = "select modelo, placaVeiculo from aluguel where placaVeiculo=?";
        c = new ConexaoDAO().conectaBD();
        String res = null;
        try {
            p = c.prepareStatement(pesquisar);
            p.setString(1, placa);
            rs = p.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO VERIFICAÇÃO: " + erro);
        }
        return rs;
    }
}
