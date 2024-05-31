package Back;

import Front.EdicaoPedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

public class AtualizaItens {

    private EdicaoPedidos edv = new EdicaoPedidos();
//dados = 2, pagamentos = 1, error = 0

    public static void atualiza_preco(String preco, String quantidade, String desconto, String id) {
        String query = "UPDATE pedidos SET precounidade=?, quantidade=?, desconto=? WHERE idpedidos=?";
        Conection conexao = new Conection();
        try {
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement stmt = connection.prepareStatement(query)) {
                            stmt.setString(1, preco);
                            stmt.setString(2, quantidade);
                            stmt.setString(3, desconto);
                            stmt.setString(4, id);
                            int linhasAfetadas = stmt.executeUpdate();
                            if (linhasAfetadas > 0) {
                                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("Nenhum registro atualizado.");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar preço do pedido: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static void atualiza_dados(String nome, String telefone, String endereco, Date data, String id) {
        String query = "UPDATE pedidos SET nomecliente=?, telefonecliente=?, endereco= ?, "
                + "prazoentrega=? WHERE idpedidos=?";

        Conection conexao = new Conection();
        try {
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement stmt = connection.prepareStatement(query)) {
                            stmt.setString(1, nome);
                            stmt.setString(2, telefone);
                            stmt.setString(3, endereco);
                            stmt.setDate(4, new java.sql.Date(data.getTime()));
                            stmt.setString(5, id);
                            int linhasAfetadas = stmt.executeUpdate();
                            if (linhasAfetadas > 0) {
                                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("Nenhum registro atualizado.");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do pedido: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

}
