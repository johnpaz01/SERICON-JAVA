package Back;

import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Funcionario {

    private int idFuncionario;
    private String nomeFuncionario;
    private String login;
    private String senha;
    private Date aniversario;
    private String email;
    private double salario;
    private String numeroTelefone;

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", nomeFuncionario=" + nomeFuncionario + ", login=" + login + ", senha=" + senha + ", aniversario=" + aniversario + ", email=" + email + ", salario=" + salario + ", numeroTelefone=" + numeroTelefone + '}';
    }

    // Métodos setter
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    // Métodos getter
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public String getEmail() {
        return email;
    }

    public double getSalario() {
        return salario;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public Funcionario obterDetalhesFuncionario(int idFuncionariooo) {
        String query = "SELECT idfuncionario, nomefuncionario, login, senha, aniversario, email, "
                + "salario, numerotelefone FROM funcionarios WHERE idfuncionario = ?";
        Conection conexao = new Conection();
        Funcionario funcionario = null;
        try {
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement stmt = connection.prepareStatement(query)) {
                            stmt.setInt(1, idFuncionariooo);
                            try (ResultSet rs = stmt.executeQuery()) {
                                if (rs.next()) {
                                    funcionario = new Funcionario();
                                    funcionario.setIdFuncionario(rs.getInt("idfuncionario"));
                                    funcionario.setNomeFuncionario(rs.getString("nomefuncionario"));
                                    funcionario.setEmail(rs.getString("email"));
                                    funcionario.setLogin(rs.getString("login"));
                                    funcionario.setSenha(rs.getString("senha"));
                                    funcionario.setAniversario(rs.getDate("aniversario"));
                                    funcionario.setSalario(rs.getDouble("salario"));
                                    funcionario.setNumeroTelefone(rs.getString("numerotelefone"));

                                    // Imprimir os valores individualmente
                                    System.out.println("ID Funcionario: " + funcionario.getIdFuncionario());
                                    System.out.println("Nome: " + funcionario.getNomeFuncionario());
                                    System.out.println("Email: " + funcionario.getEmail());
                                    System.out.println("Login: " + funcionario.getLogin());
                                    System.out.println("Senha: " + funcionario.getSenha());
                                    System.out.println("Aniversário: " + funcionario.getAniversario());
                                    System.out.println("Salário: " + funcionario.getSalario());
                                    System.out.println("Número de Telefone: " + funcionario.getNumeroTelefone());
                                } else {
                                    JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado com o ID fornecido.", "Erro", JOptionPane.ERROR_MESSAGE);
                                }
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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar detalhes do funcionário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexao.close();
        }

        return funcionario;
    }

}
