package Front;

import Back.Conection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastroFuncionarios extends javax.swing.JFrame {

    private String nome;
    private String cpf;
    private String senha;
    private String numerotelefone;
    private String email;
    private String salario;
    private Date dataNascimento;
    private String login;
    Conection conexao = new Conection();

    public CadastroFuncionarios() {
        initComponents();
        tudofalso();
        Confrimar.setBackground(Color.WHITE);
        Voltar.setBackground(Color.WHITE);
        this.setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    void tudofalso() {
        campoVazioLogin.setVisible(false);
        campovaziotelefone.setVisible(false);
        campovazionome.setVisible(false);
        campovaziosenha.setVisible(false);
        campovaziosalario.setVisible(false);
        campovazionascimento.setVisible(false);
        campoVazioEmail.setVisible(false);
        formatoInvalidoEmail.setVisible(false);
        formatoInvalidoSalario.setVisible(false);
        formatoInvalidoNacimento.setVisible(false);
        formatoInvalidotelefone.setVisible(false);
        formatoInvalidoNome.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ReceberSenha = new javax.swing.JTextField();
        Divisoria1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RecebeLogin = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();
        Confrimar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Recebenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Divisoria2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Divisoria3 = new javax.swing.JLabel();
        ReceberTelefone = new javax.swing.JTextField();
        ReceberSalario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Divisoria4 = new javax.swing.JLabel();
        ReceberEmail = new javax.swing.JTextField();
        Divisoria5 = new javax.swing.JLabel();
        campovaziotelefone = new javax.swing.JLabel();
        formatoInvalidoEmail = new javax.swing.JLabel();
        campoVazioLogin = new javax.swing.JLabel();
        campovaziosenha = new javax.swing.JLabel();
        campoVazioEmail = new javax.swing.JLabel();
        campovazionome = new javax.swing.JLabel();
        formatoInvalidoSalario = new javax.swing.JLabel();
        campovaziosalario = new javax.swing.JLabel();
        formatoInvalidoNacimento = new javax.swing.JLabel();
        campovazionascimento = new javax.swing.JLabel();
        formatoInvalidotelefone = new javax.swing.JLabel();
        formatoInvalidoNome = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de funcionários");
        setMinimumSize(new java.awt.Dimension(880, 600));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nascimento:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 180, 100, 17);

        ReceberSenha.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
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
        ReceberSenha.setBounds(440, 110, 270, 30);

        Divisoria1.setText("___________________________________________________");
        getContentPane().add(Divisoria1);
        Divisoria1.setBounds(450, 140, 250, 16);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Número de telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 290, 150, 17);

        RecebeLogin.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        RecebeLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeLoginActionPerformed(evt);
            }
        });
        RecebeLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeLoginKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeLogin);
        RecebeLogin.setBounds(60, 110, 260, 30);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(230, 480, 220, 50);

        Confrimar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confrimar.setText("Confirmar");
        Confrimar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Confrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimar);
        Confrimar.setBounds(480, 480, 190, 50);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Nome do funcionário:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 170, 160, 17);

        jDateChooser1.setDateFormatString("y '- M '-' d");
        jDateChooser1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyPressed(evt);
            }
        });
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(440, 230, 270, 30);

        Recebenome.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Recebenome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Recebenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebenomeActionPerformed(evt);
            }
        });
        Recebenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebenomeKeyPressed(evt);
            }
        });
        getContentPane().add(Recebenome);
        Recebenome.setBounds(60, 210, 250, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 70, 120, 17);

        Divisoria2.setText("___________________________________________________");
        getContentPane().add(Divisoria2);
        Divisoria2.setBounds(450, 260, 250, 16);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Login:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 70, 50, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Salário:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 360, 70, 17);

        Divisoria3.setText("___________________________________________________");
        getContentPane().add(Divisoria3);
        Divisoria3.setBounds(60, 140, 250, 16);

        ReceberTelefone.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
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
        ReceberTelefone.setBounds(440, 330, 270, 30);

        ReceberSalario.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
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
        ReceberSalario.setBounds(60, 400, 250, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("E-mail:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 270, 60, 17);

        Divisoria4.setText("___________________________________________________");
        getContentPane().add(Divisoria4);
        Divisoria4.setBounds(60, 330, 250, 20);

        ReceberEmail.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
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
        ReceberEmail.setBounds(60, 310, 250, 30);

        Divisoria5.setText("___________________________________________________");
        getContentPane().add(Divisoria5);
        Divisoria5.setBounds(60, 240, 250, 16);

        campovaziotelefone.setForeground(new java.awt.Color(153, 0, 0));
        campovaziotelefone.setText("*O campo não pode estar vazio");
        getContentPane().add(campovaziotelefone);
        campovaziotelefone.setBounds(460, 310, 190, 16);

        formatoInvalidoEmail.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoEmail.setText("*Formato invalido");
        getContentPane().add(formatoInvalidoEmail);
        formatoInvalidoEmail.setBounds(60, 290, 110, 16);

        campoVazioLogin.setForeground(new java.awt.Color(153, 0, 0));
        campoVazioLogin.setText("*O campo não pode estar vazio");
        getContentPane().add(campoVazioLogin);
        campoVazioLogin.setBounds(60, 90, 210, 16);

        campovaziosenha.setForeground(new java.awt.Color(153, 0, 0));
        campovaziosenha.setText("*O campo não pode estar vazio");
        getContentPane().add(campovaziosenha);
        campovaziosenha.setBounds(450, 90, 180, 16);

        campoVazioEmail.setForeground(new java.awt.Color(153, 0, 0));
        campoVazioEmail.setText("*O campo não pode estar vazio");
        getContentPane().add(campoVazioEmail);
        campoVazioEmail.setBounds(60, 290, 200, 16);

        campovazionome.setForeground(new java.awt.Color(153, 0, 0));
        campovazionome.setText("*O campo não pode estar vazio");
        getContentPane().add(campovazionome);
        campovazionome.setBounds(60, 190, 200, 16);

        formatoInvalidoSalario.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoSalario.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidoSalario);
        formatoInvalidoSalario.setBounds(60, 380, 180, 16);

        campovaziosalario.setForeground(new java.awt.Color(153, 0, 0));
        campovaziosalario.setText("*O campo não pode estar vazio");
        getContentPane().add(campovaziosalario);
        campovaziosalario.setBounds(60, 380, 180, 16);

        formatoInvalidoNacimento.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoNacimento.setText("*É impossivel ter nascido depois de hoje!  :)");
        getContentPane().add(formatoInvalidoNacimento);
        formatoInvalidoNacimento.setBounds(450, 200, 260, 16);

        campovazionascimento.setForeground(new java.awt.Color(153, 0, 0));
        campovazionascimento.setText("*O campo não pode estar vazio");
        getContentPane().add(campovazionascimento);
        campovazionascimento.setBounds(450, 200, 190, 16);

        formatoInvalidotelefone.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidotelefone.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidotelefone);
        formatoInvalidotelefone.setBounds(460, 310, 220, 16);

        formatoInvalidoNome.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoNome.setText("*Seu nome tem números?  hum... isso não é bom!");
        getContentPane().add(formatoInvalidoNome);
        formatoInvalidoNome.setBounds(50, 190, 290, 16);

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Sctransformed (1) (1).png"))); // NOI18N
        getContentPane().add(Icon);
        Icon.setBounds(230, -40, 310, 230);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-90, 0, 980, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceberSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberSenhaActionPerformed

    }//GEN-LAST:event_ReceberSenhaActionPerformed

    private void RecebeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeLoginActionPerformed

    }//GEN-LAST:event_RecebeLoginActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarActionPerformed
        if (obterDados()) {
            conexao.cadastroFuncionario(nome, cpf, senha, dataNascimento, email, salario, numerotelefone);
            dispose();
        }
    }//GEN-LAST:event_ConfrimarActionPerformed

    private void RecebenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecebenomeActionPerformed

    private void ReceberTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberTelefoneActionPerformed

    private void ReceberSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberSalarioActionPerformed

    private void ReceberEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberEmailActionPerformed

    private void RecebeLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ReceberSenha.requestFocus();
        }
    }//GEN-LAST:event_RecebeLoginKeyPressed

    private void ReceberSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Recebenome.requestFocus();
        }
    }//GEN-LAST:event_ReceberSenhaKeyPressed

    private void RecebenomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebenomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jDateChooser1.requestFocus();
        }
    }//GEN-LAST:event_RecebenomeKeyPressed

    private void jDateChooser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ReceberEmail.requestFocus();
        }
    }//GEN-LAST:event_jDateChooser1KeyPressed

    private void ReceberEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ReceberTelefone.requestFocus();
        }
    }//GEN-LAST:event_ReceberEmailKeyPressed

    private void ReceberTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberTelefoneKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ReceberSalario.requestFocus();
        }
    }//GEN-LAST:event_ReceberTelefoneKeyPressed

    private void ReceberSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberSalarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Confrimar.doClick();
        }
    }//GEN-LAST:event_ReceberSalarioKeyPressed

    public boolean obterDados() {
        boolean ok = true;
        this.nome = Recebenome.getText();
        this.cpf = RecebeLogin.getText();
        this.senha = ReceberSenha.getText();
        this.numerotelefone = ReceberTelefone.getText();
        this.email = ReceberEmail.getText();
        this.salario = ReceberSalario.getText().replace(',', '.');
        this.dataNascimento = jDateChooser1.getDate();
        this.login = RecebeLogin.getText();

        if (login.isEmpty()) {
            campoVazioLogin.setVisible(true);
            ok = false;
        } else {
            campoVazioLogin.setVisible(false);
        }
        //-------------------
        if (numerotelefone.isEmpty()) {
            campovaziotelefone.setVisible(true);
            ok = false;
            formatoInvalidotelefone.setVisible(false);
        } else if (!numerotelefone.matches("^\\d+$")) {
            campovaziotelefone.setVisible(false);
            formatoInvalidotelefone.setVisible(true);
            ok = false;
        } else {
            campovaziotelefone.setVisible(false);
            formatoInvalidotelefone.setVisible(false);
        }
        //-------------------
        if (senha.isEmpty()) {
            campovaziosenha.setVisible(true);
            ok = false;
        } else {
            campovaziosenha.setVisible(false);
        }
        //-------------------
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
        //-----------------------
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
        //--------------------  
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
        //--------------------
        if (dataNascimento == null) {
            campovazionascimento.setVisible(true);
            ok = false;
            formatoInvalidoNacimento.setVisible(false);
        } else if (dataNascimento.after(new Date())) {
            formatoInvalidoNacimento.setVisible(true);
            campovazionascimento.setVisible(false);
            ok = false;
        } else {
            campovazionascimento.setVisible(false);
            formatoInvalidoNacimento.setVisible(false);
        }
        //-------------------
        return ok;
    }

    private boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new CadastroFuncionarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confrimar;
    private javax.swing.JLabel Divisoria1;
    private javax.swing.JLabel Divisoria2;
    private javax.swing.JLabel Divisoria3;
    private javax.swing.JLabel Divisoria4;
    private javax.swing.JLabel Divisoria5;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Icon;
    private javax.swing.JTextField RecebeLogin;
    private javax.swing.JTextField Recebenome;
    private javax.swing.JTextField ReceberEmail;
    private javax.swing.JTextField ReceberSalario;
    private javax.swing.JTextField ReceberSenha;
    private javax.swing.JTextField ReceberTelefone;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel campoVazioEmail;
    private javax.swing.JLabel campoVazioLogin;
    private javax.swing.JLabel campovazionascimento;
    private javax.swing.JLabel campovazionome;
    private javax.swing.JLabel campovaziosalario;
    private javax.swing.JLabel campovaziosenha;
    private javax.swing.JLabel campovaziotelefone;
    private javax.swing.JLabel formatoInvalidoEmail;
    private javax.swing.JLabel formatoInvalidoNacimento;
    private javax.swing.JLabel formatoInvalidoNome;
    private javax.swing.JLabel formatoInvalidoSalario;
    private javax.swing.JLabel formatoInvalidotelefone;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
