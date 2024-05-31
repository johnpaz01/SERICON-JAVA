package Front;

import Back.AtualizaFuncionarios;
import Back.Funcionario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class EdicaoFuncionarios extends javax.swing.JFrame {

    private int id;

    public EdicaoFuncionarios() {
        initComponents();
        tudofalso();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        Voltar.setBackground(Color.WHITE);
        Confrimar.setBackground(Color.WHITE);
    }

    void tudofalso() {
        campoVazioLogin.setVisible(false);
        campovaziotelefone.setVisible(false);
        campovazionome.setVisible(false);
        campovaziosenha.setVisible(false);
        campovaziosalario.setVisible(false);
        campoVazioEmail.setVisible(false);
        formatoInvalidoEmail.setVisible(false);
        formatoInvalidoSalario.setVisible(false);
        formatoInvalidotelefone.setVisible(false);
        formatoInvalidoNome.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        recebeNome = new javax.swing.JTextField();
        Scrolllist = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ReceberSalario = new javax.swing.JTextField();
        RecebrLogin = new javax.swing.JTextField();
        RecberNome1 = new javax.swing.JTextField();
        ReceberEmail = new javax.swing.JTextField();
        ReceberSenha = new javax.swing.JTextField();
        ReceberTelefone = new javax.swing.JTextField();
        campoVazioLogin = new javax.swing.JLabel();
        campovaziosenha = new javax.swing.JLabel();
        campovaziotelefone = new javax.swing.JLabel();
        formatoInvalidotelefone = new javax.swing.JLabel();
        campovazionome = new javax.swing.JLabel();
        formatoInvalidoNome = new javax.swing.JLabel();
        formatoInvalidoEmail = new javax.swing.JLabel();
        campoVazioEmail = new javax.swing.JLabel();
        formatoInvalidoSalario = new javax.swing.JLabel();
        campovaziosalario = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Confrimar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 630));
        setPreferredSize(getMinimumSize());
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("Digite o nome do funcionário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 40, 260, 50);

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
        recebeNome.setBounds(40, 70, 310, 30);

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
        Scrolllist.setBounds(40, 100, 310, 160);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("EMAIL:    ------>");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 150, 110, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("LOGIN:    ------>");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 230, 110, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("SENHA:   ------>");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 300, 110, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("TELEFONE:  -->");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 370, 110, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("SALÁRIO:   --->");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 440, 110, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("NOME:     ------>");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 90, 110, 30);

        ReceberSalario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ReceberSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReceberSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberSalarioActionPerformed(evt);
            }
        });
        ReceberSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReceberSalarioKeyPressed(evt);
            }
        });
        getContentPane().add(ReceberSalario);
        ReceberSalario.setBounds(580, 440, 320, 30);

        RecebrLogin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        RecebrLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebrLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebrLoginActionPerformed(evt);
            }
        });
        RecebrLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebrLoginKeyPressed(evt);
            }
        });
        getContentPane().add(RecebrLogin);
        RecebrLogin.setBounds(580, 230, 320, 30);

        RecberNome1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        RecberNome1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecberNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecberNome1ActionPerformed(evt);
            }
        });
        RecberNome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecberNome1KeyPressed(evt);
            }
        });
        getContentPane().add(RecberNome1);
        RecberNome1.setBounds(580, 90, 320, 30);

        ReceberEmail.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ReceberEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReceberEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberEmailActionPerformed(evt);
            }
        });
        ReceberEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReceberEmailKeyPressed(evt);
            }
        });
        getContentPane().add(ReceberEmail);
        ReceberEmail.setBounds(580, 160, 320, 30);

        ReceberSenha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ReceberSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReceberSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberSenhaActionPerformed(evt);
            }
        });
        ReceberSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReceberSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(ReceberSenha);
        ReceberSenha.setBounds(580, 300, 320, 30);

        ReceberTelefone.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ReceberTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReceberTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberTelefoneActionPerformed(evt);
            }
        });
        ReceberTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReceberTelefoneKeyPressed(evt);
            }
        });
        getContentPane().add(ReceberTelefone);
        ReceberTelefone.setBounds(580, 370, 320, 30);

        campoVazioLogin.setForeground(new java.awt.Color(153, 0, 0));
        campoVazioLogin.setText("*O campo não pode estar vazio");
        getContentPane().add(campoVazioLogin);
        campoVazioLogin.setBounds(580, 210, 210, 16);

        campovaziosenha.setForeground(new java.awt.Color(153, 0, 0));
        campovaziosenha.setText("*O campo não pode estar vazio");
        getContentPane().add(campovaziosenha);
        campovaziosenha.setBounds(580, 280, 180, 16);

        campovaziotelefone.setForeground(new java.awt.Color(153, 0, 0));
        campovaziotelefone.setText("*O campo não pode estar vazio");
        getContentPane().add(campovaziotelefone);
        campovaziotelefone.setBounds(580, 350, 190, 16);

        formatoInvalidotelefone.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidotelefone.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidotelefone);
        formatoInvalidotelefone.setBounds(580, 350, 220, 16);

        campovazionome.setForeground(new java.awt.Color(153, 0, 0));
        campovazionome.setText("*O campo não pode estar vazio");
        getContentPane().add(campovazionome);
        campovazionome.setBounds(580, 70, 200, 16);

        formatoInvalidoNome.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoNome.setText("*Seu nome tem números?  hum... isso não é bom!");
        getContentPane().add(formatoInvalidoNome);
        formatoInvalidoNome.setBounds(580, 70, 290, 16);

        formatoInvalidoEmail.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoEmail.setText("*Formato invalido");
        getContentPane().add(formatoInvalidoEmail);
        formatoInvalidoEmail.setBounds(580, 140, 110, 16);

        campoVazioEmail.setForeground(new java.awt.Color(153, 0, 0));
        campoVazioEmail.setText("*O campo não pode estar vazio");
        getContentPane().add(campoVazioEmail);
        campoVazioEmail.setBounds(580, 140, 200, 16);

        formatoInvalidoSalario.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoSalario.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidoSalario);
        formatoInvalidoSalario.setBounds(580, 420, 180, 16);

        campovaziosalario.setForeground(new java.awt.Color(153, 0, 0));
        campovaziosalario.setText("*O campo não pode estar vazio");
        getContentPane().add(campovaziosalario);
        campovaziosalario.setBounds(580, 420, 180, 16);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(290, 520, 220, 50);

        Confrimar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confrimar.setText("Confirmar");
        Confrimar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Confrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimar);
        Confrimar.setBounds(540, 520, 190, 50);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SCMaior.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 320, 250, 160);

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
        Lista.setModel(modeloLista);
        Lista.setVisible(true);
        Scrolllist.setVisible(true);
    }//GEN-LAST:event_recebeNomeKeyReleased

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked

        if (evt.getClickCount() == 1) {
            JList<String> list = (JList<String>) evt.getSource();
            int index = list.getSelectedIndex();
            if (index >= 0) {
                String nomeProduto = (String) list.getModel().getElementAt(index);
                int idProduto = new Back.Conection().getIdProdutoPorNome(nomeProduto);
                if (idProduto != -1) {
                    preencher(idProduto);
                    this.id = idProduto;
                } else {
                    //---
                }
            }
        }
    }//GEN-LAST:event_ListaMouseClicked

    private void ReceberSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberSalarioActionPerformed

    }//GEN-LAST:event_ReceberSalarioActionPerformed

    private void ReceberSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberSalarioKeyPressed

    }//GEN-LAST:event_ReceberSalarioKeyPressed

    private void RecebrLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebrLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecebrLoginActionPerformed

    private void RecebrLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebrLoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecebrLoginKeyPressed

    private void RecberNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecberNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecberNome1ActionPerformed

    private void RecberNome1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecberNome1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecberNome1KeyPressed

    private void ReceberEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberEmailActionPerformed

    private void ReceberEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberEmailKeyPressed

    private void ReceberSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberSenhaActionPerformed

    private void ReceberSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberSenhaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberSenhaKeyPressed

    private void ReceberTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberTelefoneActionPerformed

    private void ReceberTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberTelefoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberTelefoneKeyPressed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarActionPerformed
        try {
            if (obterdadosEntrada()) {
                String nome = RecberNome1.getText();
                String email = ReceberEmail.getText();
                String login = RecebrLogin.getText();
                String senha = ReceberSenha.getText();
                String telefone = ReceberTelefone.getText();
                String salario = ReceberSalario.getText().replace(',', '.');
                AtualizaFuncionarios.atualizarDadosFuncionario(id, nome, login, senha, email,
                        salario, telefone);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EdicaoFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_ConfrimarActionPerformed

    public void preencher(int id) {
        Back.Funcionario obt = new Funcionario();
        obt = obt.obterDetalhesFuncionario(id); // Atribui o retorno do método à variável obt
        if (obt != null) {
            RecberNome1.setText(obt.getNomeFuncionario());
            ReceberEmail.setText(obt.getEmail());
            RecebrLogin.setText(obt.getLogin());
            ReceberSenha.setText(obt.getSenha());
            ReceberTelefone.setText(obt.getNumeroTelefone());
            ReceberSalario.setText(String.valueOf(obt.getSalario())); // Converte double para String
            recebeNome.setText("");
            id = obt.getIdFuncionario();
            Scrolllist.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean obterdadosEntrada() throws SQLException {
        boolean ok = true;
        String nome = RecberNome1.getText();
        String email = ReceberEmail.getText();
        String login = RecebrLogin.getText();
        String senha = ReceberSenha.getText();
        String telefone = ReceberTelefone.getText();
        String salario = ReceberSalario.getText().replace(',', '.');

        if (login.isEmpty()) {
            campoVazioLogin.setVisible(true);
            ok = false;
        } else {
            campoVazioLogin.setVisible(false);
        }

        if (telefone.isEmpty()) {
            campovaziotelefone.setVisible(true);
            ok = false;
            formatoInvalidotelefone.setVisible(false);
        } else if (!telefone.matches("^\\d+$")) {
            campovaziotelefone.setVisible(false);
            formatoInvalidotelefone.setVisible(true);
            ok = false;
        } else {
            campovaziotelefone.setVisible(false);
            formatoInvalidotelefone.setVisible(false);
        }

        if (senha.isEmpty()) {
            campovaziosenha.setVisible(true);
            ok = false;
        } else {
            campovaziosenha.setVisible(false);
        }

        if (nome.isEmpty()) {
            campovazionome.setVisible(true);
            ok = false;
            formatoInvalidoNome.setVisible(false);
        } else if (!nome.matches("[a-zA-Z]+")) {
            formatoInvalidoNome.setVisible(true);
            campovazionome.setVisible(false);
        } else {
            formatoInvalidoNome.setVisible(false);
            campovazionome.setVisible(false);
        }

        if (salario.isEmpty()) {
            campovaziosalario.setVisible(true);
            formatoInvalidoSalario.setVisible(false);
            ok = false;
        } else {
            String salarioFormatado = salario.replaceAll("[^\\d,.]", "");
            if (!salarioFormatado.matches("^\\d+([,.]\\d{1,2})?$")) {
                campovaziosalario.setVisible(false);
                formatoInvalidoSalario.setVisible(true);
                ok = false;
            } else {
                campovaziosalario.setVisible(false);
                formatoInvalidoSalario.setVisible(false);
            }
        }

        if (email.isEmpty()) {
            campoVazioEmail.setVisible(true);
            ok = false;
            formatoInvalidoEmail.setVisible(false);
        } else if (!validarEmail(email) && !email.isEmpty()) {
            formatoInvalidoEmail.setVisible(true);
            ok = false;
            campoVazioEmail.setVisible(false);
        } else {
            formatoInvalidoEmail.setVisible(false);
            campoVazioEmail.setVisible(false);
        }

        // Verifique o campo de data de nascimento se necessário
        return ok;
    }

    private boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
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
            java.util.logging.Logger.getLogger(EdicaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicaoFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confrimar;
    private javax.swing.JList<String> Lista;
    private javax.swing.JTextField RecberNome1;
    private javax.swing.JTextField ReceberEmail;
    private javax.swing.JTextField ReceberSalario;
    private javax.swing.JTextField ReceberSenha;
    private javax.swing.JTextField ReceberTelefone;
    private javax.swing.JTextField RecebrLogin;
    private javax.swing.JScrollPane Scrolllist;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel campoVazioEmail;
    private javax.swing.JLabel campoVazioLogin;
    private javax.swing.JLabel campovazionome;
    private javax.swing.JLabel campovaziosalario;
    private javax.swing.JLabel campovaziosenha;
    private javax.swing.JLabel campovaziotelefone;
    private javax.swing.JLabel formatoInvalidoEmail;
    private javax.swing.JLabel formatoInvalidoNome;
    private javax.swing.JLabel formatoInvalidoSalario;
    private javax.swing.JLabel formatoInvalidotelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField recebeNome;
    // End of variables declaration//GEN-END:variables
}
