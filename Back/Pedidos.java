package Back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pedidos {

    protected int idPedido;
    public String nomeCliente;
    protected String telefoneCliente;
    protected String endereco;
    protected double precoUnidade;
    protected String prazoEntrega;
    protected int quantidade;
    protected double desconto;

    public Pedidos() {
    }

    @Override
    public String toString() {
        return "Pedidos{" + "idPedido=" + idPedido + ", nomeCliente=" + nomeCliente + ", telefoneCliente=" + telefoneCliente + ", endereco=" + endereco + ", precoUnidade=" + precoUnidade + ", prazoEntrega=" + prazoEntrega + ", quantidade=" + quantidade + ", desconto=" + desconto + '}';
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getIdPedido() {
        return idPedido;
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

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public Pedidos obterDetalhesPedido(int idPedidopassado) {
        System.out.println("passando: " + toString());
        String query = "SELECT idpedidos, nomecliente, telefonecliente, endereco,"
                + " precounidade, prazoentrega, quantidade, desconto FROM pedidos WHERE idpedidos = ?";
        Conection conexao = new Conection();
        Pedidos pedido = null;
        try {
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement stmt = connection.prepareStatement(query)) {
                            stmt.setInt(1, idPedidopassado);
                            System.out.println(query);
                            try (ResultSet rs = stmt.executeQuery()) {
                                if (rs.next()) {
                                    pedido = new Pedidos();
                                    pedido.setIdPedido(rs.getInt("idpedidos"));
                                    pedido.setNomeCliente(rs.getString("nomecliente"));
                                    pedido.setTelefoneCliente(rs.getString("telefonecliente"));
                                    pedido.setEndereco(rs.getString("endereco"));
                                    pedido.setPrecoUnidade(rs.getDouble("precounidade"));
                                    pedido.setPrazoEntrega(rs.getString("prazoentrega"));
                                    pedido.setQuantidade(rs.getInt("quantidade"));
                                    pedido.setDesconto(rs.getDouble("desconto"));

                                    /*// Imprimir os valores individualmente 
                                System.out.println("ID Pedido: " + pedido.getIdPedido());
                                System.out.println("Nome Cliente: " + pedido.getNomeCliente());
                                System.out.println("Telefone Cliente: " + pedido.getTelefoneCliente());
                                System.out.println("Endereço: " + pedido.getEndereco());
                                System.out.println("Preço Unidade: " + pedido.getPrecoUnidade());
                                System.out.println("Prazo Entrega: " + pedido.getPrazoEntrega());
                                System.out.println("Quantidade: " + pedido.getQuantidade());
                                System.out.println("Desconto: " + pedido.getDesconto());*/
                                } else {
                                    JOptionPane.showMessageDialog(null, "Nenhum pedido encontrado com o ID fornecido.", "Erro", JOptionPane.ERROR_MESSAGE);
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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar detalhes do pedido: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexao.close();
        }
        return pedido;
    }

}
