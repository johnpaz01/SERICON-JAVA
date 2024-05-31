package Front;

import Back.Conection;
import Back.SaveLogin;
import Back.Verificacoes;
import java.awt.Color;
import Mensagem.VerificaData;
import java.awt.event.KeyEvent;
import Mensagem.BlinkingText;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaLogar extends javax.swing.JFrame {

    private String login;
    private char[] senhach;
    private String senha;
    private final Integer op;
    private Integer attok = 0;
    Verificacoes vf = new Verificacoes();
    Conection conexao = new Conection();

    public TelaLogar(Integer chose) {
          initComponents();
          
        Back.SaveLogin.carregarDadosLogin();
     if (SaveLogin.isTrue) {
        ChekSaveSenha.setState(true);
         char[] senhaCharArray = SaveLogin.senha.toCharArray();
        EntradaSenha.setText(new String(senhaCharArray));
        EntradaLogin.setText(SaveLogin.login);
        Entrar.requestFocus();
    }
      
        this.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.op = chose;
        TornaSenhaVisivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Visivel.png")));
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE); // Evita que a janela seja fechada automaticamente
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                fecharJanela(evt); // Chama o método quando a janela estiver prestes a ser fechada
            }
        });
        Online.setVisible(false);
        Attvencida.setVisible(false);
        Ofline.setVisible(false);
        VoltarAttvencida.setVisible(false);
        embranco();
        deuCerto();
        proximaatualizacao();

    }

    void embranco() {

        Voltar.setBackground(Color.WHITE);
        Entrar.setBackground(Color.WHITE);
        AreaAdm.setBackground(Color.WHITE);
        TornaSenhaVisivel.setBackground(Color.WHITE);
        VoltarAttvencida.setBackground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TornaSenhaVisivel = new javax.swing.JButton();
        Attvencida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EntradaLogin = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();
        Entrar = new javax.swing.JButton();
        EntradaSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Online = new javax.swing.JLabel();
        Ofline = new javax.swing.JLabel();
        AreaAdm = new javax.swing.JButton();
        NextAtt = new javax.swing.JLabel();
        VoltarAttvencida = new javax.swing.JButton();
        ChekSaveSenha = new java.awt.Checkbox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(550, 420));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

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
        TornaSenhaVisivel.setBounds(350, 160, 40, 40);

        Attvencida.setFont(new java.awt.Font("Cambria", 1, 50)); // NOI18N
        Attvencida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Attvencida.setText("Atualize o aplicativo");
        Attvencida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttvencidaMouseClicked(evt);
            }
        });
        getContentPane().add(Attvencida);
        Attvencida.setBounds(30, 270, 500, 100);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("SENHA:");
        jLabel1.setAlignmentX(5.5F);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 110, 90, 50);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("LOGIN:");
        jLabel2.setAlignmentX(5.5F);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 20, 80, 50);

        EntradaLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EntradaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLoginActionPerformed(evt);
            }
        });
        EntradaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaLoginKeyPressed(evt);
            }
        });
        getContentPane().add(EntradaLogin);
        EntradaLogin.setBounds(140, 60, 240, 40);

        Voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Voltar.setText("VOLTAR");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(110, 250, 140, 50);

        Entrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Entrar.setText("ENTRAR");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        Entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntrarKeyPressed(evt);
            }
        });
        getContentPane().add(Entrar);
        Entrar.setBounds(280, 250, 140, 50);

        EntradaSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EntradaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaSenhaActionPerformed(evt);
            }
        });
        EntradaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(EntradaSenha);
        EntradaSenha.setBounds(140, 160, 210, 40);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SericonTransparetne.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 0, 70, 80);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SericonTransparetne.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 0, 70, 80);

        Online.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Online.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Online.png"))); // NOI18N
        getContentPane().add(Online);
        Online.setBounds(20, 290, 50, 40);

        Ofline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ofline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ofline.png"))); // NOI18N
        getContentPane().add(Ofline);
        Ofline.setBounds(20, 290, 50, 40);

        AreaAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Admin.png"))); // NOI18N
        AreaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaAdmActionPerformed(evt);
            }
        });
        getContentPane().add(AreaAdm);
        AreaAdm.setBounds(470, 330, 30, 30);

        NextAtt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        NextAtt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NextAtt.setText("Dias Restantes: ");
        getContentPane().add(NextAtt);
        NextAtt.setBounds(120, 330, 290, 22);

        VoltarAttvencida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        VoltarAttvencida.setText("VOLTAR");
        VoltarAttvencida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarAttvencidaActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarAttvencida);
        VoltarAttvencida.setBounds(190, 310, 140, 50);

        ChekSaveSenha.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        ChekSaveSenha.setLabel("Salvar senha");
        getContentPane().add(ChekSaveSenha);
        ChekSaveSenha.setBounds(140, 200, 130, 26);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, -10, 640, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaLoginActionPerformed

    private void EntradaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaSenhaActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        boolean retorno = false;
        obterCredenciais();
         if (ChekSaveSenha.getState()) {
        // Se a caixa de seleção "Salvar senha" estiver marcada, salve a senha
        new Back.SaveLogin().salvarSenha(senha);
        new Back.SaveLogin().salvarLogin(login);
        new Back.SaveLogin().salvarBoolean(true);
    }else{
             new Back.SaveLogin().salvarBoolean(false);
         }
        retorno = conexao.acesso(login, senha);
        if (retorno) {
            vf.telaEscolhida(op);
            dispose();
        }
    }//GEN-LAST:event_EntrarActionPerformed

    private void TornaSenhaVisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TornaSenhaVisivelActionPerformed
        if (EntradaSenha.getEchoChar() == '\0') {
            EntradaSenha.setEchoChar('*');
            TornaSenhaVisivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Visivel.png")));
        } else {
            TornaSenhaVisivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NaoVisivel.png")));
            EntradaSenha.setEchoChar('\0');
        }
    }//GEN-LAST:event_TornaSenhaVisivelActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void EntradaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            EntradaSenha.requestFocus();
        }
    }//GEN-LAST:event_EntradaLoginKeyPressed

    private void EntradaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaSenhaKeyPressed
        if (attok != 1) {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                Entrar.doClick();
            }
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                caminhohtml();
            }
        }
    }//GEN-LAST:event_EntradaSenhaKeyPressed

    private void EntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Entrar.doClick();
        }    }//GEN-LAST:event_EntrarKeyPressed

    private void TornaSenhaVisivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TornaSenhaVisivelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Entrar.doClick();
        }
    }//GEN-LAST:event_TornaSenhaVisivelKeyPressed

    private void AreaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaAdmActionPerformed
        TelaLogarAdm Tladm = new TelaLogarAdm();
        Tladm.setVisible(true);
        dispose();
    }//GEN-LAST:event_AreaAdmActionPerformed

    private void AttvencidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttvencidaMouseClicked
        caminhohtml();
    }//GEN-LAST:event_AttvencidaMouseClicked

    private void VoltarAttvencidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarAttvencidaActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarAttvencidaActionPerformed

    void caminhohtml() {
        String caminhoArquivoHTML = "/HTML/site.html";
        InputStream inputStream = getClass().getResourceAsStream(caminhoArquivoHTML);
        if (inputStream != null) {
            try {
                Files.copy(inputStream, Paths.get("site.html"), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Desktop.getDesktop().browse(Paths.get("site.html").toUri());
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Arquivo HTML não encontrado");
        }

    }

    void proximaatualizacao() {
        VerificaData resultado = new VerificaData();
        resultado.verificacaodata(); // Chamada do método para calcular o código de operação

        int codigoOperacao = resultado.getCodigoOperacao();
        long diasRestantes = resultado.getDiasRestantes();

        NextAtt.setText("Proxima Atualizção em: " + diasRestantes + " dias");

        switch (codigoOperacao) {
            case 1:
                NextAtt.setForeground(Color.BLACK); // Altera a cor do texto para preto
                break;
            case 2:
                NextAtt.setForeground(Color.BLUE); // Altera a cor do texto para azul, por exemplo
                // Adicione qualquer outra lógica necessária para o caso 2 aqui
                break;
            case 3:
                NextAtt.setForeground(Color.GREEN); // Altera a cor do texto para verde, por exemplo
                // Adicione qualquer outra lógica necessária para o caso 3 aqui
                break;
            case 4:
                NextAtt.setForeground(Color.ORANGE); // Altera a cor do texto para laranja, por exemplo
                // Adicione qualquer outra lógica necessária para o caso 4 aqui
                break;
            case 5:
                NextAtt.setForeground(Color.ORANGE); // Altera a cor do texto para amarelo, por exemplo
                NextAtt.setText("Atualização Necessária!");
                break;
            case 6:
                NextAtt.setForeground(Color.RED); // Altera a cor do texto para vermelho, por exemplo
                if (NextAtt.isVisible()) {
                    NextAtt.setVisible(false); // Oculta a label apenas se estiver visível
                    Attvencida.setVisible(true); // Torna a label de atualização necessária visível
                    Attvencida.setForeground(Color.RED); // Define a cor do texto
                    BlinkingText blinkingText = new BlinkingText(Attvencida);
                    blinkingText.startBlinking(); // Começa a fazer o texto piscar
                    attok = 1; // Define a variável de controle
                    Voltar.setVisible(false);
                    Entrar.setVisible(false);
                    VoltarAttvencida.setVisible(true);
                }
                break;
            default:
                throw new AssertionError("Código de operação inválido: " + codigoOperacao);
        }
    }

    public void obterCredenciais() {
        this.login = EntradaLogin.getText();
        this.senhach = EntradaSenha.getPassword();
        this.senha = "";
        for (int i = 0; i < senhach.length; i++) {
            senha = senha + senhach[i];
        }

    }

    public boolean tentarConectat() {
        boolean ok = conexao.conectar();
        return ok;
    }

    void deuCerto() {

        if (tentarConectat()) {
            Online.setVisible(true);
            Ofline.setVisible(false);
        } else {
            Online.setVisible(false);
            Ofline.setVisible(true);
        }
    }

    private void fecharJanela(java.awt.event.WindowEvent evt) {
        System.exit(0); // Encerra o processo da aplicação
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogar telaLogar = new TelaLogar(1);
                telaLogar.setVisible(true);
                telaLogar.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaAdm;
    private javax.swing.JLabel Attvencida;
    private java.awt.Checkbox ChekSaveSenha;
    private javax.swing.JTextField EntradaLogin;
    private javax.swing.JPasswordField EntradaSenha;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel NextAtt;
    private javax.swing.JLabel Ofline;
    private javax.swing.JLabel Online;
    private javax.swing.JButton TornaSenhaVisivel;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton VoltarAttvencida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
