package Front;

import Back.Pedidos;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ExcluirPedidos extends javax.swing.JFrame {

    protected int idPedidos;
    protected String nomeCliente;
    protected String telefoneCliente;
    protected String endereco;
    protected String precoUnidade;
    protected String prazoEntrega;
    protected String quantidade;
    protected String desconto;

    public ExcluirPedidos() {
        initComponents();
        Confrimar.setBackground(Color.WHITE);
        Voltar.setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recebeNome = new javax.swing.JTextField();
        Scrolllist = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        Confrimar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        vizualizarEndereco = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vizualizarNome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vizualizarData = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vizualizarTelefone2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1225, 700));
        getContentPane().setLayout(null);

        recebeNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        recebeNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebeNomeActionPerformed(evt);
            }
        });
        recebeNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recebeNomeKeyReleased(evt);
            }
        });
        getContentPane().add(recebeNome);
        recebeNome.setBounds(30, 90, 320, 30);

        Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        Scrolllist.setViewportView(jScrollPane1);

        getContentPane().add(Scrolllist);
        Scrolllist.setBounds(30, 120, 320, 160);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setText("Digite o nome do cliente ou pedido:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 40, 340, 50);

        Confrimar.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Confrimar.setText("Confirmar");
        Confrimar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Confrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimar);
        Confrimar.setBounds(720, 510, 200, 50);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(460, 510, 200, 50);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Endereço:     ------>");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 290, 160, 30);

        vizualizarEndereco.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        vizualizarEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        getContentPane().add(vizualizarEndereco);
        vizualizarEndereco.setBounds(590, 280, 420, 40);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Nome:     ------>");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 130, 150, 30);

        vizualizarNome.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        vizualizarNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        getContentPane().add(vizualizarNome);
        vizualizarNome.setBounds(590, 120, 420, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Data de entrega:   ------>");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 360, 180, 30);

        vizualizarData.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        vizualizarData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(vizualizarData);
        vizualizarData.setBounds(590, 350, 420, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Telefone:   ------>");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 210, 180, 30);

        vizualizarTelefone2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        vizualizarTelefone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarTelefone2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(vizualizarTelefone2);
        vizualizarTelefone2.setBounds(590, 200, 420, 40);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SCMaior.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 370, 250, 160);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, -20, 1240, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recebeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebeNomeActionPerformed

    }//GEN-LAST:event_recebeNomeActionPerformed

    private void recebeNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recebeNomeKeyReleased
        String letra = recebeNome.getText();
        DefaultListModel<String> modeloLista = new Back.Conection().listarnomes(letra);
        Lista.setModel(modeloLista);
        Scrolllist.setVisible(true);
        Lista.setVisible(true);
        jScrollPane1.setVisible(true);
    }//GEN-LAST:event_recebeNomeKeyReleased

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked
        JList<String> list = (JList<String>) evt.getSource();
        int index = list.getSelectedIndex();
        if (index >= 0) {
            String nomeProduto = (String) list.getModel().getElementAt(index);
            int idPedido = new Back.Conection().getIdProdutoPorNome(nomeProduto); // Obter o ID do pedido
            if (idPedido != -1) {
                setLabels(idPedido); // Passe o ID do pedido para o método setLabels
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum pedido encontrado com o nome fornecido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ListaMouseClicked

    private void ConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarActionPerformed
        Back.ExcluirPedidos exp = new Back.ExcluirPedidos();

        exp.excluirPedido(nomeCliente, idPedidos);
        dispose();
    }//GEN-LAST:event_ConfrimarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    public void setLabels(int id) {
        Pedidos pds = new Pedidos(); // Cria um novo objeto Pedidos
        pds = pds.obterDetalhesPedido(id); // Obter detalhes do pedido
        if (pds != null) { // Verificar se o objeto retornado não é nulo
            System.out.println("o nome:");
            System.out.println(pds.getNomeCliente());
            vizualizarNome.setText(pds.getNomeCliente());
            vizualizarTelefone2.setText(pds.getTelefoneCliente());
            vizualizarEndereco.setText(pds.getEndereco());
            vizualizarData.setText(pds.getPrazoEntrega());
            this.nomeCliente = pds.getNomeCliente();
            this.idPedidos = pds.getIdPedido();
            Lista.setVisible(true);
            Scrolllist.setVisible(true);
            jScrollPane1.setVisible(true);
        } else {
            // Lógica para lidar com nenhum pedido encontrado
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windos".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExcluirPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confrimar;
    private javax.swing.JList<String> Lista;
    private javax.swing.JScrollPane Scrolllist;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField recebeNome;
    private javax.swing.JLabel vizualizarData;
    private javax.swing.JLabel vizualizarEndereco;
    private javax.swing.JLabel vizualizarNome;
    private javax.swing.JLabel vizualizarTelefone2;
    // End of variables declaration//GEN-END:variables
}
