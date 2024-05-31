package Front;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public final class TelaLogarAdm extends javax.swing.JFrame {

    private String login;
    private char[] senhach;
    private String senha;

    public TelaLogarAdm() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setcores();

    }

    void setcores() {
        Confrimar.setBackground(Color.GRAY); // Alterando para cinza
        Voltar.setBackground(Color.GRAY); // Alterando para cinza
        TornaSenhaVisivel.setBackground(Color.GRAY);
        ReceberLogin.setBackground(Color.GRAY); // Alterando para cinza
        ReceberSenha.setBackground(Color.GRAY); // Alterando para cinza
        ReceberLogin.setForeground(Color.WHITE);
        ReceberSenha.setForeground(Color.WHITE);
        Voltar.setForeground(Color.WHITE);
        Confrimar.setForeground(Color.WHITE);
        jLabel1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        AG.setForeground(Color.GREEN);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Voltar = new javax.swing.JButton();
        Confrimar = new javax.swing.JButton();
        ReceberLogin = new javax.swing.JTextField();
        ReceberSenha = new javax.swing.JPasswordField();
        TornaSenhaVisivel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AG = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login adm");
        setMinimumSize(new java.awt.Dimension(700, 480));
        setPreferredSize(getMinimumSize());
        getContentPane().setLayout(null);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 2));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(150, 300, 210, 50);

        Confrimar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confrimar.setText("Confirmar");
        Confrimar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 2));
        Confrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimar);
        Confrimar.setBounds(390, 300, 190, 50);

        ReceberLogin.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        ReceberLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReceberLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberLoginActionPerformed(evt);
            }
        });
        ReceberLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReceberLoginKeyPressed(evt);
            }
        });
        getContentPane().add(ReceberLogin);
        ReceberLogin.setBounds(170, 100, 380, 40);

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
        ReceberSenha.setBounds(170, 200, 340, 40);

        TornaSenhaVisivel.setForeground(new java.awt.Color(255, 255, 255));
        TornaSenhaVisivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Visivel.png"))); // NOI18N
        TornaSenhaVisivel.setIconTextGap(3);
        TornaSenhaVisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TornaSenhaVisivelActionPerformed(evt);
            }
        });
        TornaSenhaVisivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TornaSenhaVisivelKeyPressed(evt);
            }
        });
        getContentPane().add(TornaSenhaVisivel);
        TornaSenhaVisivel.setBounds(510, 200, 40, 40);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("LOGIN:");
        jLabel2.setAlignmentX(5.5F);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 40, 80, 50);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("SENHA:");
        jLabel1.setAlignmentX(5.5F);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 140, 90, 50);

        AG.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        AG.setText("ALLGREEN");
        AG.setAlignmentX(5.5F);
        getContentPane().add(AG);
        AG.setBounds(10, 390, 130, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/LogoAllgren.jpg"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(670, 470));
        jLabel3.setPreferredSize(getMinimumSize());
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-270, 0, 990, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarActionPerformed

        if (obterdados()) {
            new AreaAdmin().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta para o login: "
                    + login, "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ConfrimarActionPerformed

    private void ReceberLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberLoginActionPerformed

    private void ReceberSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberSenhaActionPerformed

    private void TornaSenhaVisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TornaSenhaVisivelActionPerformed
        if (ReceberSenha.getEchoChar() == '\0') {
            ReceberSenha.setEchoChar('*');
            TornaSenhaVisivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Visivel.png")));
        } else {
            TornaSenhaVisivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NaoVisivel.png")));
            ReceberSenha.setEchoChar('\0');
        }
    }//GEN-LAST:event_TornaSenhaVisivelActionPerformed

    private void TornaSenhaVisivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TornaSenhaVisivelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Confrimar.doClick();
        }
    }//GEN-LAST:event_TornaSenhaVisivelKeyPressed

    private void ReceberLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ReceberSenha.requestFocus();
        }
    }//GEN-LAST:event_ReceberLoginKeyPressed

    private void ReceberSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Confrimar.doClick();
        }
    }//GEN-LAST:event_ReceberSenhaKeyPressed

    boolean obterdados() {
        boolean ok = false;

        this.login = ReceberLogin.getText().toLowerCase();
        this.senhach = ReceberSenha.getPassword();
        this.senha = "";
        for (int i = 0; i < senhach.length; i++) {
            senha = senha + senhach[i];
        }

        if (senha.equals("2305") && login.equals("71331563429")) {
            ok = true;
        } else {
            ok = false;
        }

        return ok;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogarAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AG;
    private javax.swing.JButton Confrimar;
    private javax.swing.JTextField ReceberLogin;
    private javax.swing.JPasswordField ReceberSenha;
    private javax.swing.JButton TornaSenhaVisivel;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
