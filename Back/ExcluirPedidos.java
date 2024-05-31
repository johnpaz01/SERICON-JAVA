package Back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExcluirPedidos {

    public void excluirPedido(String nomeCliente, int idPedido) {
        String sql = "DELETE FROM pedidos WHERE nomecliente = ? AND idpedidos = ? LIMIT 1";

        try (Connection connection = conectarExplicitamente(); PreparedStatement statement = connection.prepareStatement(sql)) {

            // Substitua os placeholders (?) pelos valores apropriados
            statement.setString(1, nomeCliente);
            statement.setInt(2, idPedido);

            // Execute a consulta
            int linhasAfetadas = statement.executeUpdate();

            // Verifique se uma linha foi excluída com sucesso
            if (linhasAfetadas > 0) {
                exibirMensagem("Pedido deletado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                exibirMensagem("Nenhuma pedido foi excluído.", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            exibirMensagem("Erro ao excluir o pedido: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exibirMensagem(String mensagem, int tipoMensagem) {
        ImageIcon icon = tipoMensagem == JOptionPane.INFORMATION_MESSAGE
                ? new ImageIcon("verde.png") : new ImageIcon("vermelho.png");
        JOptionPane.showMessageDialog(null, mensagem, "Status", tipoMensagem, icon);
    }

    private Connection conectarExplicitamente() throws SQLException {
        Conection conexao = new Conection();
        if (conexao.conectarExplicitamente()) {
            return conexao.getConnection();
        } else {
            throw new SQLException("Erro ao conectar explicitamente");
        }
    }
}
