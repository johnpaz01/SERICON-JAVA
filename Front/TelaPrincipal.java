package Front;

import java.awt.Color;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import Back.Conection;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
 definirProporcaoPadrao();
 embranco();
        Ligado.setVisible(false);
        preencherListasPedidos();
        setHoraAtual();
        Desligado.doClick();
        SAC.setForeground(Color.BLACK); // Define a cor do texto original como preto

        SAC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                SAC.setForeground(Color.BLUE); // Altera a cor do texto para azul quando o mouse entra
            }

            @Override
            public void mouseExited(MouseEvent e) {
                SAC.setForeground(Color.BLACK); // Retorna a cor do texto para preto quando o mouse sai
            }
        });
    }

    
       private void definirProporcaoPadrao() {
        // Obter as dimensões da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) (screenSize.getWidth() * 0.8); // Definindo a largura para 80% da largura da tela
        int altura = (int) (screenSize.getHeight() * 0.8); // Definindo a altura para 80% da altura da tela
        
        // Definir as dimensões da janela
        setSize(largura, altura);
        
        // Centralizar a janela na tela
        setLocationRelativeTo(null);
    }
    
    
    
    void embranco() {
        Color corDeFundo = new Color(251, 253, 247);

        // Define a cor de fundo personalizada para cada componente
        this.setBackground(corDeFundo);
        Nomeempresa2.setBackground(corDeFundo);
        entradahora.setBackground(corDeFundo);
        cadastrarFuncionarios.setBackground(corDeFundo);
        ExcluirFuncionarios.setBackground(corDeFundo);
        NovoPedido.setBackground(corDeFundo);
        Relatorios.setBackground(corDeFundo);
        EditarPedidos.setBackground(corDeFundo);
        ExcluirPedidos.setBackground(corDeFundo);
        Sair.setBackground(corDeFundo);
        Ligado.setBackground(corDeFundo);
        Desligado.setBackground(corDeFundo);
        EditarFuncionario.setBackground(corDeFundo);
        EmitirNota.setBackground(corDeFundo);
        TelaFundoSemLista.setVisible(false);
        TelaFundoComLista.setVisible(true);
          Listnome.setBackground(corDeFundo);
        ScrollPane.setBackground(corDeFundo);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        SAC = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ExcluirFuncionarios = new javax.swing.JButton();
        EmitirNota = new javax.swing.JButton();
        cadastrarFuncionarios = new javax.swing.JButton();
        NovoPedido = new javax.swing.JButton();
        EditarPedidos = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Relatorios = new javax.swing.JButton();
        ExcluirPedidos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Ligado = new javax.swing.JButton();
        Desligado = new javax.swing.JButton();
        EditarFuncionario = new javax.swing.JButton();
        Nomeempresa2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Divisorhorizopntal5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entradahora = new javax.swing.JTextField();
        TelaFundoSemLista = new javax.swing.JLabel();
        LabelInformacoes = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        Listnome = new javax.swing.JList<>();
        TelaFundoComLista = new javax.swing.JLabel();
        Borders = new javax.swing.JLabel();
        Borders1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 1));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Exclusaopedidos.png"))); // NOI18N
        jLabel6.setText("|");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(660, 70, 70, 70);
        jLabel6.getAccessibleContext().setAccessibleName("Icon1");

        SAC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SAC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SAC.setText("Clique aqui´para consultar o SAC");
        SAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SACMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SACMouseReleased(evt);
            }
        });
        getContentPane().add(SAC);
        SAC.setBounds(650, 690, 290, 40);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/EdicaoFuncionario.png"))); // NOI18N
        jLabel13.setText("|");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(380, 10, 60, 60);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Relatorios.png"))); // NOI18N
        jLabel11.setText("|");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(960, 10, 50, 60);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/EditarPedidos.png"))); // NOI18N
        jLabel10.setText("|");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(370, 70, 80, 80);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AdicionarFuncionario.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 20, 80, 50);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sair.png"))); // NOI18N
        jLabel12.setText("|");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(160, 510, 80, 80);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ExcuirFuncionario.png"))); // NOI18N
        jLabel9.setText("|");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 80, 90, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ComprasEVendas.png"))); // NOI18N
        jLabel7.setText("|");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 10, 60, 60);

        ExcluirFuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ExcluirFuncionarios.setForeground(new java.awt.Color(197, 34, 12));
        ExcluirFuncionarios.setText("Exclusão de funcinários");
        ExcluirFuncionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        ExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(ExcluirFuncionarios);
        ExcluirFuncionarios.setBounds(90, 90, 250, 40);

        EmitirNota.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EmitirNota.setForeground(new java.awt.Color(153, 0, 0));
        EmitirNota.setText("Emitir nota");
        EmitirNota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        EmitirNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmitirNotaActionPerformed(evt);
            }
        });
        getContentPane().add(EmitirNota);
        EmitirNota.setBounds(1000, 20, 180, 40);

        cadastrarFuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cadastrarFuncionarios.setForeground(new java.awt.Color(0, 0, 204));
        cadastrarFuncionarios.setText("cadastro de funcionários");
        cadastrarFuncionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        cadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarFuncionarios);
        cadastrarFuncionarios.setBounds(90, 20, 240, 40);

        NovoPedido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NovoPedido.setForeground(new java.awt.Color(204, 0, 0));
        NovoPedido.setText("Novo pedido");
        NovoPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        NovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(NovoPedido);
        NovoPedido.setBounds(730, 20, 210, 40);

        EditarPedidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EditarPedidos.setForeground(new java.awt.Color(197, 34, 12));
        EditarPedidos.setText("Editar pedidos");
        EditarPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        EditarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(EditarPedidos);
        EditarPedidos.setBounds(440, 90, 210, 40);

        Sair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sair.setForeground(new java.awt.Color(0, 0, 153));
        Sair.setText("Sair\n");
        Sair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(50, 530, 110, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Relatorios.png"))); // NOI18N
        jLabel14.setText("|");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(950, 70, 70, 70);

        Relatorios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Relatorios.setForeground(new java.awt.Color(153, 0, 0));
        Relatorios.setText("Relatórios");
        Relatorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        Relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(Relatorios);
        Relatorios.setBounds(1020, 90, 150, 40);

        ExcluirPedidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ExcluirPedidos.setForeground(new java.awt.Color(0, 0, 204));
        ExcluirPedidos.setText("Excluir  pedidos");
        ExcluirPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        ExcluirPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(ExcluirPedidos);
        ExcluirPedidos.setBounds(730, 90, 210, 40);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Informações:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 380, 100, 50);

        Ligado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Visivel.png"))); // NOI18N
        Ligado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LigadoActionPerformed(evt);
            }
        });
        getContentPane().add(Ligado);
        Ligado.setBounds(80, 420, 50, 40);

        Desligado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NaoVisivel.png"))); // NOI18N
        Desligado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesligadoActionPerformed(evt);
            }
        });
        getContentPane().add(Desligado);
        Desligado.setBounds(80, 420, 50, 40);

        EditarFuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EditarFuncionario.setForeground(new java.awt.Color(0, 0, 153));
        EditarFuncionario.setText("Editar funcionários");
        EditarFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        EditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(EditarFuncionario);
        EditarFuncionario.setBounds(440, 20, 210, 40);

        Nomeempresa2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Nomeempresa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nomeempresa2.setText("Sericon");
        Nomeempresa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nomeempresa2ActionPerformed(evt);
            }
        });
        getContentPane().add(Nomeempresa2);
        Nomeempresa2.setBounds(20, 250, 190, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Empresa:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 220, 80, 17);

        Divisorhorizopntal5.setText("______________________________________");
        getContentPane().add(Divisorhorizopntal5);
        Divisorhorizopntal5.setBounds(110, 290, 190, 16);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Hora entrada:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 320, 130, 17);

        entradahora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        entradahora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entradahora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradahoraActionPerformed(evt);
            }
        });
        getContentPane().add(entradahora);
        entradahora.setBounds(20, 350, 200, 30);

        TelaFundoSemLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TelaFundoSemLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SercionSemLista-0000.jpg"))); // NOI18N
        getContentPane().add(TelaFundoSemLista);
        TelaFundoSemLista.setBounds(200, 70, 1140, 640);

        LabelInformacoes.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        LabelInformacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelInformacoes.setText("Informações dos proximos pedidos:");
        getContentPane().add(LabelInformacoes);
        LabelInformacoes.setBounds(480, 180, 500, 50);

        ScrollPane.setBorder(null);

        Listnome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        Listnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Listnome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Listnome.setDragEnabled(true);
        Listnome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListnomeMouseClicked(evt);
            }
        });
        ScrollPane.setViewportView(Listnome);

        getContentPane().add(ScrollPane);
        ScrollPane.setBounds(398, 230, 720, 310);

        TelaFundoComLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TelaFundoComLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Comlista-0000.jpg"))); // NOI18N
        getContentPane().add(TelaFundoComLista);
        TelaFundoComLista.setBounds(210, 70, 1140, 640);

        Borders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Borders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Borders-0000.jpg"))); // NOI18N
        getContentPane().add(Borders);
        Borders.setBounds(680, 70, 1140, 640);

        Borders1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Borders1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Borders-0000.jpg"))); // NOI18N
        getContentPane().add(Borders1);
        Borders1.setBounds(0, 70, 1140, 640);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -50, 1860, 190);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-110, 660, 1640, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionariosActionPerformed
        TelaLogar tl = new TelaLogar(2);
        tl.setVisible(true);
    }//GEN-LAST:event_cadastrarFuncionariosActionPerformed

    private void ExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirFuncionariosActionPerformed
        TelaLogar tl = new TelaLogar(3);
        tl.setVisible(true);
    }//GEN-LAST:event_ExcluirFuncionariosActionPerformed

    private void NovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoPedidoActionPerformed
        TelaVendas tlv = new TelaVendas();
        tlv.setVisible(true);
    }//GEN-LAST:event_NovoPedidoActionPerformed

    private void EditarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPedidosActionPerformed
        EdicaoPedidos edv = new EdicaoPedidos();
        edv.setVisible(true);

    }//GEN-LAST:event_EditarPedidosActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void RelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatoriosActionPerformed
        Relatorios rl = new Relatorios();
        rl.setVisible(true);
    }//GEN-LAST:event_RelatoriosActionPerformed

    private void ExcluirPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirPedidosActionPerformed
        TelaLogar tl = new TelaLogar(4);
        tl.setVisible(true);
    }//GEN-LAST:event_ExcluirPedidosActionPerformed

    private void LigadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LigadoActionPerformed
        TelaFundoSemLista.setVisible(false);
        TelaFundoComLista.setVisible(true);
        LabelInformacoes.setVisible(true);
        Ligado.setVisible(false);
        Listnome.setVisible(true);
        Desligado.setVisible(true);
        preencherListasPedidos();
    }//GEN-LAST:event_LigadoActionPerformed

    private void DesligadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesligadoActionPerformed
        TelaFundoSemLista.setVisible(true);
        TelaFundoComLista.setVisible(false);
        LabelInformacoes.setVisible(false);
        Listnome.setVisible(false);
        Ligado.setVisible(true);
        Desligado.setVisible(false);
    }//GEN-LAST:event_DesligadoActionPerformed

    private void Nomeempresa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nomeempresa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nomeempresa2ActionPerformed

    private void entradahoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradahoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradahoraActionPerformed

    private void EditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarFuncionarioActionPerformed
        TelaLogar tl = new TelaLogar(5);
        tl.setVisible(true);
    }//GEN-LAST:event_EditarFuncionarioActionPerformed

    private void SACMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SACMouseReleased

    }//GEN-LAST:event_SACMouseReleased

    private void SACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SACMouseClicked
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

    }//GEN-LAST:event_SACMouseClicked

    private void ListnomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListnomeMouseClicked

        int index = Listnome.getSelectedIndex();
        if (index != -1) {
            DefaultListModel<String> modelo = (DefaultListModel<String>) Listnome.getModel();
            String itemClicado = modelo.getElementAt(index);
            String[] partes = itemClicado.split(" - ");
            String nome = partes[0].replaceAll("<[^>]*>", "");
            String telefone = partes[2].replaceAll("<[^>]*>", "").replace("Contato: ", "");

            // Removendo as tags HTML "<i>" e "</i>" da data
            String dataString = partes[1].replaceAll("<[^>]*>", "");
            Date data = null;
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                data = sdf.parse(dataString);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            // Verificando se a data foi corretamente inicializada
            if (data != null) {
                System.out.println("Na funcao inicial:");
                System.out.println(nome);
                System.out.println(telefone);
                System.out.println("terminei na primeria ");
                new VizualizacaoDePedidos(nome, telefone, data).setVisible(true);
            } else {
                System.out.println("Erro ao converter a data.");
            }
        }
    }//GEN-LAST:event_ListnomeMouseClicked

    private void EmitirNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmitirNotaActionPerformed
        new EmitirNota().setVisible(true);
    }//GEN-LAST:event_EmitirNotaActionPerformed

    private void setHoraAtual() {
        // Obter a hora atual do sistema
        LocalTime horaAtual = LocalTime.now();

        // Formatar a hora atual para o formato desejado (HH:mm:ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horaAtual.format(formatter);

        // Definir a hora formatada no campo de entrada de hora
        entradahora.setText(horaFormatada);
    }

    private void preencherListasPedidos() {
        DefaultListModel<String> modeloNome = new DefaultListModel<>();
        Listnome.setModel(modeloNome);

        // Obter a data atual
        LocalDate dataAtual = LocalDate.now();

        // Query SQL para obter os pedidos com prazo de entrega a partir de hoje
        String query = "SELECT nomecliente, prazoentrega, telefonecliente FROM pedidos WHERE prazoentrega >= ? ORDER BY prazoentrega";

        try (Connection connection = conectarExplicitamente(); PreparedStatement statement = connection.prepareStatement(query)) {

            // Definir o parâmetro da data atual na consulta
            statement.setString(1, dataAtual.toString());

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String nomeCliente = resultSet.getString("nomecliente");
                    String prazoEntrega = resultSet.getString("prazoentrega");
                    String telefone = resultSet.getString("telefonecliente");

                    // Calcular a diferença de dias entre a data atual e a data de entrega
                    LocalDate dataEntrega = LocalDate.parse(prazoEntrega);
                    long diasRestantes = ChronoUnit.DAYS.between(dataAtual, dataEntrega);

                    // Excluir pedidos já entregues
                    if (diasRestantes >= 0) {
                        // Definir a cor do texto com base na proximidade da data de entrega
                        Color corTexto = Color.BLACK; // cor padrão
                        if (diasRestantes <= 3) {
                            corTexto = Color.red; // vermelho para 3 dias ou menos
                        } else if (diasRestantes <= 8) {
                            corTexto = Color.ORANGE; // amarelo para 8 dias ou menos
                        } else if (diasRestantes <= 15) {
                            corTexto = Color.GREEN; // azul para 15 dias ou menos
                        }

                        // Adicionar o item à lista com a cor do texto definida
                        String formattedText = "<html><font color='" + getColorHex(corTexto) + "'>"
                                + "<b>" + nomeCliente + "</b> - "
                                + "<i>" + prazoEntrega + "</i> - "
                                + "Contato: " + telefone + "</font></html>";
                        modeloNome.addElement(formattedText);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// Método para converter uma cor para seu valor hexadecimal
    private String getColorHex(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }

    private Connection conectarExplicitamente() throws SQLException {
        Conection conexao = new Conection();
        if (conexao.conectarExplicitamente()) {
            return conexao.getConnection();
        } else {
            throw new SQLException("Erro ao conectar explicitamente");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Borders;
    private javax.swing.JLabel Borders1;
    private javax.swing.JButton Desligado;
    private javax.swing.JLabel Divisorhorizopntal5;
    private javax.swing.JButton EditarFuncionario;
    private javax.swing.JButton EditarPedidos;
    private javax.swing.JButton EmitirNota;
    private javax.swing.JButton ExcluirFuncionarios;
    private javax.swing.JButton ExcluirPedidos;
    private javax.swing.JLabel LabelInformacoes;
    private javax.swing.JButton Ligado;
    private javax.swing.JList<String> Listnome;
    private javax.swing.JTextField Nomeempresa2;
    private javax.swing.JButton NovoPedido;
    private javax.swing.JButton Relatorios;
    private javax.swing.JLabel SAC;
    private javax.swing.JButton Sair;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel TelaFundoComLista;
    private javax.swing.JLabel TelaFundoSemLista;
    private javax.swing.JButton cadastrarFuncionarios;
    private javax.swing.JTextField entradahora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
