package Back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Front.CadastroFuncionarios;
import javax.swing.DefaultListModel;

public class Conection {

    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;

    protected String nomeCliente;
    protected String telefoneCliente;
    protected String endereco;
    protected String precoUnidade;
    protected String prazoEntrega;
    protected String quantidade;
    protected String desconto;

    public Conection() {
        this.servidor = "localhost";
        this.banco = "sericon";
        this.usuario = "root";
        this.senha = "admin";
    }

    public boolean conectar() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha);
            return true;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Connection getConnection() {
        return conexao;
    }

    public String getData() {
        String dataAtualizacao = null;
        String query = "SELECT data_atualizacao FROM tabela_atualizacao WHERE id = 1";
        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha)) {
            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                ResultSet resultSet = stmt.executeQuery(query);

                // Processar o resultado da consulta aqui
                // Exemplo:
                while (resultSet.next()) {
                    dataAtualizacao = resultSet.getString("data_atualizacao");
                    // Faça o que você precisa com a data de atualização aqui
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return dataAtualizacao;
    }

    public void getInformation(String nome, String telefone, Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String dataFormatada = sdf.format(data);

        String query = "SELECT nomecliente, telefonecliente, endereco, precounidade, quantidade,"
                + " prazoentrega, desconto FROM pedidos WHERE nomecliente = ? AND telefonecliente = ? AND prazoentrega = ? LIMIT 1";

        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor
                + "/" + this.banco, this.usuario, this.senha); PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, dataFormatada);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nomeCliente = rs.getString("nomecliente");
                    telefoneCliente = rs.getString("telefonecliente");
                    endereco = rs.getString("endereco");
                    precoUnidade = rs.getString("precounidade");
                    quantidade = rs.getString("quantidade");
                    prazoEntrega = rs.getString("prazoentrega");
                    desconto = rs.getString("desconto");
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        System.out.println(nomeCliente);
        System.out.println(telefoneCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getPrecoUnidade() {
        return precoUnidade;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getDesconto() {
        return desconto;
    }

    public void atualizaData(String data) {
        String query = "UPDATE tabela_atualizacao SET data_atualizacao = ? WHERE id = 1";
        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/"
                + this.banco, this.usuario, this.senha); PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, data);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data atualizada com sucesso!");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean verificarCredenciais(String login, String senha) {
        String query = "SELECT COUNT(*) AS count FROM funcionarios WHERE login = ? AND senha = ?";
        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/"
                + this.banco, this.usuario, this.senha); PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, login);
            stmt.setString(2, senha);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt("count");
                    if (count > 0) {
                        return true;
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar data: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

            throw new RuntimeException(ex);
        }
        return false;
    }

    public boolean cadastroFuncionario(String nome, String cpf, String senha, Date dataNascimento,
            String email, String salario, String numerotelefone) {
        CadastroFuncionarios cd = new CadastroFuncionarios();
        boolean dadosValidos = cd.obterDados();
        if (!dadosValidos) {
            try {
                Conection conexao = new Conection();
                String query = "INSERT INTO funcionarios (nomefuncionario, login, senha, aniversario, email, salario, numerotelefone) VALUES (?, ?, ?, ?, ?, ?, ?)";
                conexao.conectar();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dataFormatada = sdf.format(dataNascimento);

                try (Connection connection = conexao.getConnection(); PreparedStatement stmt = connection.prepareStatement(query)) {
                    stmt.setString(1, nome);
                    stmt.setString(2, cpf);
                    stmt.setString(3, senha);
                    stmt.setString(4, dataFormatada);
                    stmt.setString(5, email);
                    stmt.setString(6, salario);
                    stmt.setString(7, numerotelefone);
                    int linhasAfetadas = stmt.executeUpdate();
                    if (linhasAfetadas > 0) {
                        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário. Nenhuma linha foi afetada.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return dadosValidos;
    }

    private boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean cadastrodeVendas(String nomecliente, String telefonecliente, String endereco,
            String precounidade, String quantidade, Date prazoentrega, String desconto) {
        System.out.println("entrei na funçãodo salvamento");

        boolean ok = true;
        String query = "INSERT INTO pedidos (nomecliente, telefonecliente, endereco, precounidade, quantidade, prazoentrega, desconto) "
                + "VALUES (?,?,?,?,?,?,?)";
        Conection conexao = new Conection();
        conexao.conectar();
        try (Connection connection = conexao.getConnection(); PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nomecliente);
            stmt.setString(2, telefonecliente);
            stmt.setString(3, endereco);
            stmt.setString(4, precounidade);
            stmt.setString(5, quantidade);
            stmt.setDate(6, new java.sql.Date(prazoentrega.getTime()));
            stmt.setString(7, desconto);
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Pedido.", "Erro", JOptionPane.ERROR_MESSAGE);
                ok = false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ok = false;
        }
        return ok;
    }

    public void close() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }

    public boolean conectarExplicitamente() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/"
                    + this.banco, this.usuario, this.senha);
            return true;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", ex);
        }
    }

    public boolean isConnected() {
        try {
            return conexao != null && !conexao.isClosed();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao verificar status da conexão", ex);
        }
    }

    public boolean acesso(String login, String senha) {

        Conection conexao = new Conection();
        conexao.conectar();
        boolean loginSucesso = conexao.verificarCredenciais(login, senha);
        if (loginSucesso) {
        } else {
            JOptionPane.showMessageDialog(null, "Erro, usuário não encontrado", "Falha", JOptionPane.ERROR_MESSAGE);

        }
        conexao.close();
        return loginSucesso;
    }

    public DefaultListModel<String> listarnomes(String letra) {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        String readLista = "SELECT idpedidos, nomecliente FROM pedidos WHERE nomecliente "
                + "LIKE ? ORDER BY nomecliente";
        Conection conexao = new Conection();

        try {
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement stmt = connection.prepareStatement(readLista)) {
                            stmt.setString(1, letra + "%");
                            try (ResultSet rs = stmt.executeQuery()) {
                                while (rs.next()) {
                                    modelo.addElement(rs.getString("idpedidos") + " - " + rs.getString("nomecliente"));
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar nomes: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexao.close();
        }

        return modelo;
    }

    public DefaultListModel<String> listarnomesFuncionarios(String letra) {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        String readLista = "SELECT idfuncionario, nomefuncionario FROM funcionarios WHERE nomefuncionario LIKE ? ORDER BY nomefuncionario";
        Conection conexao = new Conection();

        try {
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement stmt = connection.prepareStatement(readLista)) {
                            stmt.setString(1, letra + "%");
                            try (ResultSet rs = stmt.executeQuery()) {
                                while (rs.next()) {
                                    int idFuncionario = rs.getInt("idfuncionario");
                                    String nomeFuncionario = rs.getString("nomefuncionario");
                                    modelo.addElement(idFuncionario + " - " + nomeFuncionario);
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar nomes: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexao.close();
        }

        return modelo;
    }

    public void excluirPessoa(int id) throws SQLException {
        String query = "delete from funcionarios where idfuncionario = ? limit 1;";
        Conection conexao = new Conection();
        try {
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        int op = JOptionPane.showConfirmDialog(null, "Deseja Ecluir de fato? ", "Exclusão", JOptionPane.YES_NO_OPTION);
                        if (op == JOptionPane.YES_OPTION) {
                            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                                stmt.setInt(1, id);
                                stmt.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Funcionário exluido com sucesso! ", "SUCESSO", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            System.out.println("cancelou...");
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao excluir Funcionário!: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getIdProdutoPorNome(String nomeProduto) {
        String suaString = nomeProduto;
        String[] partes = suaString.split("-");
        String idString = partes[0].trim(); // Obtém a primeira parte (o ID) e remove espaços em branco ao redor
        int id = Integer.parseInt(idString); // Converte o ID de String para int
        System.out.println("ID: " + id);

        return id;
    }

}
