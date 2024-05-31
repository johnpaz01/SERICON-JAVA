package Back;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizaFuncionarios {

    public static boolean atualizarDadosFuncionario(int idFuncionario, String nome, String login,
            String senha, String email, String salario, String numeroTelefone) {
        Conection conexao = new Conection();
        // Mensagem de confirmação
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja atualizar os dados do funcionário?", "Confirmação", JOptionPane.YES_NO_OPTION);

        // Verificar se o usuário confirmou a operação
        if (confirmacao != JOptionPane.YES_OPTION) {
            // O usuário não confirmou, então retornamos false
            return false;
        }

        String query = "UPDATE funcionarios SET nomefuncionario = ?, login = ?, senha = ?, email = ?, salario = ?, numerotelefone = ? WHERE idfuncionario = ?";

        try {
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement statement = connection.prepareStatement(query)) {
                            statement.setString(1, nome);
                            statement.setString(2, login);
                            statement.setString(3, senha);
                            statement.setString(4, email);
                            statement.setString(5, salario);
                            statement.setString(6, numeroTelefone);
                            statement.setInt(7, idFuncionario);

                            int linhasAfetadas = statement.executeUpdate();

                            // Verificar se o update foi bem-sucedido
                            if (linhasAfetadas > 0) {
                                JOptionPane.showMessageDialog(null, "Dados do funcionário atualizados com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados do funcionário.", "Erro", JOptionPane.ERROR_MESSAGE);
                                return false;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do funcionário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            conexao.close();
        }

        return false;
    }

}
