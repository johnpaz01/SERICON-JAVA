package Front;

import Back.Funcionario;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ExcluirFuncionarios extends javax.swing.JFrame {

    private int id = 0;

    public ExcluirFuncionarios() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.WHITE);
        Scrolllist.setVisible(false);
        Confrimar.setBackground(Color.WHITE);
        Voltar.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        recebeNome = new javax.swing.JTextField();
        Scrolllist = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Listaprincipal = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        vizualizarSalario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        vizualizarNascimento = new javax.swing.JLabel();
        vizualizarEmail = new javax.swing.JLabel();
        vizualizarSenha = new javax.swing.JLabel();
        vizualizarNome = new javax.swing.JLabel();
        vizualizarLogin = new javax.swing.JLabel();
        vizualizarTelefone = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Confrimar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir funcionários");
        setMinimumSize(new java.awt.Dimension(880, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("Digite o nome do funcionário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 260, 50);

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
        recebeNome.setBounds(20, 50, 310, 30);

        Listaprincipal.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Listaprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaprincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Listaprincipal);

        Scrolllist.setViewportView(jScrollPane1);

        getContentPane().add(Scrolllist);
        Scrolllist.setBounds(20, 80, 310, 160);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NACIMENTO:  -->");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 350, 130, 30);

        vizualizarSalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(vizualizarSalario);
        vizualizarSalario.setBounds(490, 300, 260, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("EMAIL:    ------>");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 90, 110, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("LOGIN:    ------>");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 150, 110, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("SENHA:   ------>");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 200, 110, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("TELEFONE:  -->");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 250, 110, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("SALÁRIO:   --->");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 300, 110, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("NOME:     ------>");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 50, 110, 30);

        vizualizarNascimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        getContentPane().add(vizualizarNascimento);
        vizualizarNascimento.setBounds(490, 350, 260, 30);

        vizualizarEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(vizualizarEmail);
        vizualizarEmail.setBounds(490, 100, 260, 30);

        vizualizarSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(vizualizarSenha);
        vizualizarSenha.setBounds(490, 200, 260, 30);

        vizualizarNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        getContentPane().add(vizualizarNome);
        vizualizarNome.setBounds(490, 50, 260, 30);

        vizualizarLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        getContentPane().add(vizualizarLogin);
        vizualizarLogin.setBounds(490, 150, 260, 30);

        vizualizarTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vizualizarTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        getContentPane().add(vizualizarTelefone);
        vizualizarTelefone.setBounds(490, 250, 260, 30);

        Voltar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Voltar.setText("Cancelar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(130, 430, 200, 70);

        Confrimar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Confrimar.setText("Confirmar");
        Confrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimar);
        Confrimar.setBounds(440, 430, 200, 70);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SCMaior.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 240, 250, 160);

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
        DefaultListModel<String> modeloLista = new Back.Conection().listarnomesFuncionarios(letra);
        Scrolllist.setVisible(true);
        Listaprincipal.setVisible(true);
        Listaprincipal.setModel(modeloLista);

    }//GEN-LAST:event_recebeNomeKeyReleased

    private void ListaprincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaprincipalMouseClicked

        if (evt.getClickCount() == 1) {
            JList<String> list = (JList<String>) evt.getSource();
            int index = list.getSelectedIndex();
            if (index >= 0) {
                String nomeProduto = (String) list.getModel().getElementAt(index);
                int idProduto = new Back.Conection().getIdProdutoPorNome(nomeProduto);
                if (idProduto != -1) {
                    this.id = idProduto;
                    preencher(id);
                } else {
                    //---
                }
            }
        }
    }//GEN-LAST:event_ListaprincipalMouseClicked

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarActionPerformed
        try {
            new Back.Conection().excluirPessoa(id);
            dispose();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_ConfrimarActionPerformed

    public void preencher(int idf) {
        Back.Funcionario obt = new Funcionario();
        obt = obt.obterDetalhesFuncionario(idf); // Atribui o retorno do método à variável obt
        if (obt != null) {
            vizualizarNome.setText(obt.getNomeFuncionario());
            vizualizarEmail.setText(obt.getEmail());
            vizualizarLogin.setText(obt.getLogin());
            vizualizarSenha.setText(obt.getSenha());
            vizualizarTelefone.setText(obt.getNumeroTelefone());
            vizualizarSalario.setText(String.valueOf(obt.getSalario())); // Converte double para String
            vizualizarNascimento.setText(obt.getAniversario().toString());
            recebeNome.setText("");
            id = obt.getIdFuncionario();
            Scrolllist.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confrimar;
    private javax.swing.JList<String> Listaprincipal;
    private javax.swing.JScrollPane Scrolllist;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List list1;
    private javax.swing.JTextField recebeNome;
    private javax.swing.JLabel vizualizarEmail;
    private javax.swing.JLabel vizualizarLogin;
    private javax.swing.JLabel vizualizarNascimento;
    private javax.swing.JLabel vizualizarNome;
    private javax.swing.JLabel vizualizarSalario;
    private javax.swing.JLabel vizualizarSenha;
    private javax.swing.JLabel vizualizarTelefone;
    // End of variables declaration//GEN-END:variables
}
