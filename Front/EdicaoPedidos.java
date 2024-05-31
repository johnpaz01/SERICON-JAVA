package Front;

import Back.AtualizaItens;
import Back.Pedidos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EdicaoPedidos extends javax.swing.JFrame {

    protected int idPedidos;
    protected String nomeCliente;
    protected String telefoneCliente;
    protected String endereco;
    protected String precoUnidade;
    protected String prazoEntrega;
    protected String quantidade;
    protected String desconto;
    private boolean produtoEntregue = true;
    public static Integer op = 0;

    public EdicaoPedidos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ClienteSelecionado.setVisible(false);
        Pagamentos.setBackground(Color.WHITE);
        Dados.setBackground(Color.WHITE);
        ConfrimarDados.setBackground(Color.WHITE);
        ConfirmarPagamentos.setBackground(Color.WHITE);
        Voltar.setBackground(Color.WHITE);
        ConfirmarPagamentos.setVisible(false);
        ConfrimarDados.setVisible(false);
        tudo_falso();
        Não.doClick();

        ReceberPreço.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }
        });

        RecebeQuantidade.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }
        });

        RecebeDesonto.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }

            public void changedUpdate(DocumentEvent e) {
                atualizarSubtotal();
            }
        });

        Não.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NãoActionPerformed(evt);
            }
        });

        Sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimActionPerformed(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClienteSelecionado = new javax.swing.JLabel();
        recebeNome = new javax.swing.JTextField();
        Scrolllist = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        Voltar = new javax.swing.JButton();
        ConfrimarDados = new javax.swing.JButton();
        Pagamentos = new javax.swing.JButton();
        Dados = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RecebeNomeCliente = new javax.swing.JTextField();
        RecebeTelefoneCLiente = new javax.swing.JTextField();
        RecebeEndereçoEntrega = new javax.swing.JTextField();
        RecebeDataDeEntrega = new com.toedter.calendar.JDateChooser();
        Não = new javax.swing.JCheckBox();
        Sim = new javax.swing.JCheckBox();
        LabelJaentregue = new javax.swing.JLabel();
        LabelEndereco = new javax.swing.JLabel();
        LabelTelefone = new javax.swing.JLabel();
        LabelNomeccliente = new javax.swing.JLabel();
        LabelEntrega = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        RecebeDesonto = new javax.swing.JTextField();
        RecebeQuantidade = new javax.swing.JTextField();
        ReceberPreço = new javax.swing.JTextField();
        LabelAplicarDesconto = new javax.swing.JLabel();
        LabelQuantidade = new javax.swing.JLabel();
        LabelPreco = new javax.swing.JLabel();
        formatoInvalidotelefone = new javax.swing.JLabel();
        TelefoneBranco = new javax.swing.JLabel();
        nomeBranco = new javax.swing.JLabel();
        enderecodeEntregaBranco = new javax.swing.JLabel();
        dataInexistente = new javax.swing.JLabel();
        prazoBranco = new javax.swing.JLabel();
        formatoInvalidoDesconto1 = new javax.swing.JLabel();
        quantidadeBranco = new javax.swing.JLabel();
        formatoInvalidoQuantidade = new javax.swing.JLabel();
        formatoInvalidoPreco = new javax.swing.JLabel();
        precoBranco = new javax.swing.JLabel();
        precoAbaixodeZero = new javax.swing.JLabel();
        ConfirmarPagamentos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1225, 700));
        getContentPane().setLayout(null);

        ClienteSelecionado.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        ClienteSelecionado.setText("Cliente selecionado: ");
        getContentPane().add(ClienteSelecionado);
        ClienteSelecionado.setBounds(20, 310, 380, 50);

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
        Scrolllist.setBounds(20, 80, 310, 160);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(310, 550, 230, 50);

        ConfrimarDados.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        ConfrimarDados.setText("Confirmar");
        ConfrimarDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConfrimarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(ConfrimarDados);
        ConfrimarDados.setBounds(620, 550, 200, 50);

        Pagamentos.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Pagamentos.setText("Pagamentos");
        Pagamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagamentosActionPerformed(evt);
            }
        });
        getContentPane().add(Pagamentos);
        Pagamentos.setBounds(40, 380, 120, 50);

        Dados.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Dados.setText("Dados");
        Dados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadosActionPerformed(evt);
            }
        });
        getContentPane().add(Dados);
        Dados.setBounds(180, 380, 110, 50);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setText("Digite o nome do cliente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 20, 260, 30);

        RecebeNomeCliente.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        RecebeNomeCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeNomeClienteActionPerformed(evt);
            }
        });
        RecebeNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeNomeClienteKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeNomeCliente);
        RecebeNomeCliente.setBounds(500, 110, 260, 30);

        RecebeTelefoneCLiente.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        RecebeTelefoneCLiente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeTelefoneCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeTelefoneCLienteActionPerformed(evt);
            }
        });
        RecebeTelefoneCLiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeTelefoneCLienteKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeTelefoneCLiente);
        RecebeTelefoneCLiente.setBounds(500, 190, 260, 30);

        RecebeEndereçoEntrega.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        RecebeEndereçoEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeEndereçoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeEndereçoEntregaActionPerformed(evt);
            }
        });
        RecebeEndereçoEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeEndereçoEntregaKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeEndereçoEntrega);
        RecebeEndereçoEntrega.setBounds(500, 280, 260, 30);

        RecebeDataDeEntrega.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        RecebeDataDeEntrega.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        RecebeDataDeEntrega.setMaxSelectableDate(new java.util.Date(253370779317000L));
        RecebeDataDeEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeDataDeEntregaKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeDataDeEntrega);
        RecebeDataDeEntrega.setBounds(810, 110, 270, 30);

        Não.setText("Não");
        Não.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NãoActionPerformed(evt);
            }
        });
        getContentPane().add(Não);
        Não.setBounds(870, 170, 85, 20);

        Sim.setText("Sim");
        Sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimActionPerformed(evt);
            }
        });
        getContentPane().add(Sim);
        Sim.setBounds(950, 170, 85, 20);

        LabelJaentregue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelJaentregue.setText("Já Entregue?");
        getContentPane().add(LabelJaentregue);
        LabelJaentregue.setBounds(890, 150, 140, 17);

        LabelEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelEndereco.setText("Endereço de entrega:");
        getContentPane().add(LabelEndereco);
        LabelEndereco.setBounds(550, 240, 170, 17);

        LabelTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelTelefone.setText("Telefone:");
        getContentPane().add(LabelTelefone);
        LabelTelefone.setBounds(580, 160, 80, 17);

        LabelNomeccliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelNomeccliente.setText("Nome do cliente ou pedido:");
        getContentPane().add(LabelNomeccliente);
        LabelNomeccliente.setBounds(520, 70, 230, 17);

        LabelEntrega.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelEntrega.setText("Prazo de entrega:");
        getContentPane().add(LabelEntrega);
        LabelEntrega.setBounds(820, 70, 230, 17);

        Subtotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtotal.setText("Subtotal: ");
        Subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        Subtotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Subtotal);
        Subtotal.setBounds(810, 220, 300, 40);

        RecebeDesonto.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        RecebeDesonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeDesonto.setText("0.0");
        RecebeDesonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeDesontoActionPerformed(evt);
            }
        });
        RecebeDesonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeDesontoKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeDesonto);
        RecebeDesonto.setBounds(490, 280, 270, 40);

        RecebeQuantidade.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        RecebeQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeQuantidadeActionPerformed(evt);
            }
        });
        RecebeQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeQuantidadeKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeQuantidade);
        RecebeQuantidade.setBounds(500, 190, 260, 30);

        ReceberPreço.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        ReceberPreço.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReceberPreço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberPreçoActionPerformed(evt);
            }
        });
        ReceberPreço.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReceberPreçoKeyPressed(evt);
            }
        });
        getContentPane().add(ReceberPreço);
        ReceberPreço.setBounds(500, 110, 250, 30);

        LabelAplicarDesconto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelAplicarDesconto.setText("Aplicar Desconto:");
        getContentPane().add(LabelAplicarDesconto);
        LabelAplicarDesconto.setBounds(560, 240, 170, 17);

        LabelQuantidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelQuantidade.setText("Quantidade:");
        getContentPane().add(LabelQuantidade);
        LabelQuantidade.setBounds(580, 160, 100, 17);

        LabelPreco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelPreco.setText("Preço da unidade:");
        getContentPane().add(LabelPreco);
        LabelPreco.setBounds(570, 70, 140, 17);

        formatoInvalidotelefone.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidotelefone.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidotelefone);
        formatoInvalidotelefone.setBounds(500, 170, 220, 16);

        TelefoneBranco.setForeground(new java.awt.Color(153, 0, 0));
        TelefoneBranco.setText("*Campo Obrigatório");
        getContentPane().add(TelefoneBranco);
        TelefoneBranco.setBounds(500, 170, 220, 16);

        nomeBranco.setForeground(new java.awt.Color(153, 0, 0));
        nomeBranco.setText("*Campo Obrigatório");
        getContentPane().add(nomeBranco);
        nomeBranco.setBounds(500, 90, 220, 16);

        enderecodeEntregaBranco.setForeground(new java.awt.Color(153, 0, 0));
        enderecodeEntregaBranco.setText("*Adicone um endereço de entrega");
        getContentPane().add(enderecodeEntregaBranco);
        enderecodeEntregaBranco.setBounds(500, 260, 220, 16);

        dataInexistente.setForeground(new java.awt.Color(153, 0, 0));
        dataInexistente.setText("*Insira uma data válida/ seja superior a atual!  :)");
        getContentPane().add(dataInexistente);
        dataInexistente.setBounds(830, 90, 280, 16);

        prazoBranco.setForeground(new java.awt.Color(153, 0, 0));
        prazoBranco.setText("*Campo Obrigatório");
        getContentPane().add(prazoBranco);
        prazoBranco.setBounds(820, 90, 220, 16);

        formatoInvalidoDesconto1.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoDesconto1.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidoDesconto1);
        formatoInvalidoDesconto1.setBounds(500, 260, 220, 16);

        quantidadeBranco.setForeground(new java.awt.Color(153, 0, 0));
        quantidadeBranco.setText("*Campo Obrigatório");
        getContentPane().add(quantidadeBranco);
        quantidadeBranco.setBounds(530, 170, 220, 16);

        formatoInvalidoQuantidade.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoQuantidade.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidoQuantidade);
        formatoInvalidoQuantidade.setBounds(500, 170, 220, 16);

        formatoInvalidoPreco.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoPreco.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidoPreco);
        formatoInvalidoPreco.setBounds(530, 90, 220, 16);

        precoBranco.setForeground(new java.awt.Color(153, 0, 0));
        precoBranco.setText("*É nescessario adicionar  um preço");
        getContentPane().add(precoBranco);
        precoBranco.setBounds(500, 90, 220, 16);

        precoAbaixodeZero.setForeground(new java.awt.Color(153, 0, 0));
        precoAbaixodeZero.setText("*Preço Invalido!");
        getContentPane().add(precoAbaixodeZero);
        precoAbaixodeZero.setBounds(570, 170, 220, 16);

        ConfirmarPagamentos.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        ConfirmarPagamentos.setText("Confirmar");
        ConfirmarPagamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConfirmarPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarPagamentosActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmarPagamentos);
        ConfirmarPagamentos.setBounds(620, 550, 200, 50);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SCMaior.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(870, 350, 250, 160);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-40, -40, 1240, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recebeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebeNomeActionPerformed

    }//GEN-LAST:event_recebeNomeActionPerformed

    private void recebeNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recebeNomeKeyReleased
        String letra = recebeNome.getText();
        DefaultListModel<String> modeloLista = new Back.Conection().listarnomes(letra);
        Lista.setModel(modeloLista);
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

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfrimarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarDadosActionPerformed
        obterdados();
    }//GEN-LAST:event_ConfrimarDadosActionPerformed

    private void PagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagamentosActionPerformed

        ConfirmarPagamentos.setVisible(true);
        ConfrimarDados.setVisible(false);
        pagamento_Amostra();
        this.op = 1;

    }//GEN-LAST:event_PagamentosActionPerformed

    private void DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadosActionPerformed

        this.op = 2;
        ConfirmarPagamentos.setVisible(false);
        ConfrimarDados.setVisible(true);
        dados_amostra();

    }//GEN-LAST:event_DadosActionPerformed

    private void RecebeNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeNomeClienteActionPerformed

    }//GEN-LAST:event_RecebeNomeClienteActionPerformed

    private void RecebeNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeNomeClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            RecebeTelefoneCLiente.requestFocus();
        }
    }//GEN-LAST:event_RecebeNomeClienteKeyPressed

    private void RecebeTelefoneCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeTelefoneCLienteActionPerformed

    }//GEN-LAST:event_RecebeTelefoneCLienteActionPerformed

    private void RecebeTelefoneCLienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeTelefoneCLienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            RecebeEndereçoEntrega.requestFocus();
        }

    }//GEN-LAST:event_RecebeTelefoneCLienteKeyPressed

    private void RecebeEndereçoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeEndereçoEntregaActionPerformed

    }//GEN-LAST:event_RecebeEndereçoEntregaActionPerformed

    private void RecebeEndereçoEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeEndereçoEntregaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            RecebeDataDeEntrega.requestFocus();
        }

    }//GEN-LAST:event_RecebeEndereçoEntregaKeyPressed

    private void RecebeDataDeEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeDataDeEntregaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ConfrimarDados.doClick();
    }//GEN-LAST:event_RecebeDataDeEntregaKeyPressed
    }
    private void NãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NãoActionPerformed
        this.produtoEntregue = true;
        Não.setSelected(true);
        Sim.setSelected(false);
        LabelEntrega.setText("Prazo de entrega: ");
    }//GEN-LAST:event_NãoActionPerformed

    private void SimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimActionPerformed
        produtoEntregue = false;
        Sim.setSelected(true);
        Não.setSelected(false);
        LabelEntrega.setText("Data da entrega: ");
    }//GEN-LAST:event_SimActionPerformed

    private void RecebeDesontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeDesontoActionPerformed

    }//GEN-LAST:event_RecebeDesontoActionPerformed

    private void RecebeDesontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeDesontoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            RecebeDataDeEntrega.requestFocus();
        }
    }//GEN-LAST:event_RecebeDesontoKeyPressed

    private void RecebeQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeQuantidadeActionPerformed

    }//GEN-LAST:event_RecebeQuantidadeActionPerformed

    private void RecebeQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            RecebeDesonto.requestFocus();
        }
    }//GEN-LAST:event_RecebeQuantidadeKeyPressed

    private void ReceberPreçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberPreçoActionPerformed

    }//GEN-LAST:event_ReceberPreçoActionPerformed

    private void ReceberPreçoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberPreçoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            RecebeQuantidade.requestFocus();
        }
    }//GEN-LAST:event_ReceberPreçoKeyPressed

    private void ConfirmarPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarPagamentosActionPerformed
        obterdados();
    }//GEN-LAST:event_ConfirmarPagamentosActionPerformed

    void setLabels(int idPedido) {
        Pedidos pds = new Pedidos(); // Cria um novo objeto Pedidos
        pds = pds.obterDetalhesPedido(idPedido); // Obtenha os detalhes do pedido
        if (pds != null) { // Verificar se o objeto retornado não é nulo
            idPedidos = pds.getIdPedido();
            nomeCliente = pds.getNomeCliente();
            telefoneCliente = pds.getTelefoneCliente();
            endereco = pds.getEndereco();
            precoUnidade = Double.toString(pds.getPrecoUnidade());
            prazoEntrega = pds.getPrazoEntrega();
            quantidade = Integer.toString(pds.getQuantidade());
            desconto = Double.toString(pds.getDesconto());

            RecebeNomeCliente.setText(nomeCliente);
            RecebeTelefoneCLiente.setText(telefoneCliente);
            ReceberPreço.setText(precoUnidade);
            RecebeQuantidade.setText(quantidade);
            RecebeEndereçoEntrega.setText(endereco);
            RecebeDesonto.setText(desconto);
            ClienteSelecionado.setVisible(true);
            ClienteSelecionado.setText("<html>Cliente selecionado: " + nomeCliente
                    + "<br>ID: " + idPedido + "</html>");
            try {
                // Converter a String para Date
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date prazoEntregaDate = sdf.parse(prazoEntrega);
                // Criar um novo objeto Date e atribuir à RecebeDataDeEntrega
                RecebeDataDeEntrega.setDate(prazoEntregaDate);
            } catch (ParseException ex) {
                // Lidar com uma exceção caso ocorra um erro na conversão
                ex.printStackTrace();
            }

        } else {
            // Lógica para lidar com nenhum pedido encontrado
        }
    }

    public void obterdados() {
        System.out.println(produtoEntregue);
        boolean ok = true;
        String desconto = RecebeDesonto.getText();
        String nome = RecebeNomeCliente.getText();
        String telefone = RecebeTelefoneCLiente.getText();
        String endereco = RecebeEndereçoEntrega.getText();
        String precoUnidade = ReceberPreço.getText().replace(',', '.');
        String quantidade = RecebeQuantidade.getText();
        Date prazoEntrega = RecebeDataDeEntrega.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //-------------------------
        if (desconto.isEmpty()) {
            RecebeDesonto.setText("0.0");
        } else if (!desconto.matches("^\\d+([,.]\\d{1,2})?$")) {
            formatoInvalidoDesconto1.setVisible(true);
            ok = false;
        } else {
            formatoInvalidoDesconto1.setVisible(false);
        }
        //---------------------------
        if (nome.isEmpty()) {
            nomeBranco.setVisible(true);
        } else {
            nomeBranco.setVisible(false);
        }
        //--------------------------
        if (telefone.isEmpty()) {
            TelefoneBranco.setVisible(true);
            formatoInvalidotelefone.setVisible(false);
            ok = false;
        } else if (!telefone.matches("^\\d+$")) {
            TelefoneBranco.setVisible(false);
            formatoInvalidotelefone.setVisible(true);
            ok = false;
        } else {
            TelefoneBranco.setVisible(false);
            formatoInvalidotelefone.setVisible(false);
        }
        //---------------------------
        if (endereco.isEmpty()) {
            enderecodeEntregaBranco.setVisible(true);
            ok = false;
        } else {
            enderecodeEntregaBranco.setVisible(false);
        }
        //---------------------------
        if (precoUnidade.isEmpty()) {
            ok = false;
            formatoInvalidoPreco.setVisible(false);
            precoBranco.setVisible(true);
            precoAbaixodeZero.setVisible(false);
        } else if (!precoUnidade.matches("^\\d+([,.]\\d{1,2})?$")) {
            ok = false;
            formatoInvalidoPreco.setVisible(true);
            precoBranco.setVisible(false);
            precoAbaixodeZero.setVisible(false);
        } /* else if( verificapreco <  0){ok=false;formatoInvalidoPreco.setVisible(false);precoBranco.setVisible(false);
    precoAbaixodeZero.setVisible(true);}*/ else {
            precoBranco.setVisible(false);
            precoAbaixodeZero.setVisible(false);
            formatoInvalidoPreco.setVisible(false);
        }
        //---------------------------
        if (!quantidade.matches("^\\d+$")) {
            formatoInvalidoQuantidade.setVisible(true);
            quantidadeBranco.setVisible(false);
            ok = false;
        } else if (quantidade.isEmpty()) {
            formatoInvalidoQuantidade.setVisible(false);
            quantidadeBranco.setVisible(true);
            ok = false;
        } else {
            formatoInvalidoQuantidade.setVisible(false);
            quantidadeBranco.setVisible(false);
        }
        //----------------------------
        if (produtoEntregue == true) {
            if (prazoEntrega.before(new Date())) {
                dataInexistente.setVisible(true);
                prazoBranco.setVisible(false);
                ok = false;
            } else if (prazoEntrega == null || prazoEntrega.equals("")) {
                ok = false;
                prazoBranco.setVisible(true);
                dataInexistente.setVisible(false);
            } else {
                dataInexistente.setVisible(false);
                prazoBranco.setVisible(false);
            }
        } else if (produtoEntregue == false) {
            if (prazoEntrega == null) {
                ok = false;
                prazoBranco.setVisible(true);
                dataInexistente.setVisible(false);
            } else if (prazoEntrega == null || prazoEntrega.equals("")) {
                ok = false;
                prazoBranco.setVisible(true);
                dataInexistente.setVisible(false);
            } else {
                dataInexistente.setVisible(false);
                prazoBranco.setVisible(false);
            }
        }
        //---------------------------
        if (ok) {
            switch (op) {
                case 1:
                    AtualizaItens.atualiza_preco(precoUnidade, quantidade, desconto, Integer.toString(idPedidos));
                    dispose();
                    break;
                case 2:
                    AtualizaItens.atualiza_dados(nome, telefone, endereco, prazoEntrega, Integer.toString(idPedidos));
                    dispose();

                    break;
                default:
                    throw new AssertionError();
            }

        }
    }

    public void printPedido() {
        System.out.println("ID do Pedido: " + this.idPedidos);
        System.out.println("Nome do Cliente: " + this.nomeCliente);
        System.out.println("Telefone do Cliente: " + this.telefoneCliente);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Preço por Unidade: " + this.precoUnidade);
        System.out.println("Prazo de Entrega: " + this.prazoEntrega);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Desconto: " + this.desconto);
    }

    private void atualizarSubtotal() {
        try {
            int quantidade = 0;
            double preco = Double.parseDouble(ReceberPreço.getText().replace(',', '.'));
            quantidade += Integer.parseInt(RecebeQuantidade.getText());
            double desconto = Double.parseDouble(RecebeDesonto.getText().replace(',', '.'));
            double subtotal = (preco * quantidade) * (1 - (desconto / 100));
            Subtotal.setText("Subtotal: " + String.format("%.2f", subtotal));
        } catch (NumberFormatException ex) {
            Subtotal.setText("Subtotal: Erro");
        }
    }

    //deixo as labels que preciso desligadas e as que precis,ligo, alem de setar elas
    private void dados_amostra() {
        LabelAplicarDesconto.setVisible(false);
        LabelQuantidade.setVisible(false);
        LabelPreco.setVisible(false);
        RecebeDesonto.setVisible(false);
        ReceberPreço.setVisible(false);
        RecebeQuantidade.setVisible(false);
        LabelEntrega.setVisible(true);
        LabelEndereco.setVisible(true);
        LabelNomeccliente.setVisible(true);
        LabelJaentregue.setVisible(true);
        LabelTelefone.setVisible(true);
        LabelEntrega.setVisible(true);
        RecebeDataDeEntrega.setVisible(true);
        RecebeEndereçoEntrega.setVisible(true);
        RecebeTelefoneCLiente.setVisible(true);
        RecebeNomeCliente.setVisible(true);
        Subtotal.setVisible(false);
        Sim.setVisible(true);
        Não.setVisible(true);
    }

    private void pagamento_Amostra() {
        LabelTelefone.setVisible(false);
        LabelAplicarDesconto.setVisible(true);
        LabelQuantidade.setVisible(true);
        LabelPreco.setVisible(true);
        RecebeDesonto.setVisible(true);
        ReceberPreço.setVisible(true);
        LabelEntrega.setVisible(false);
        LabelEndereco.setVisible(false);
        LabelNomeccliente.setVisible(false);
        LabelJaentregue.setVisible(false);
        LabelEntrega.setVisible(false);
        RecebeDataDeEntrega.setVisible(false);
        RecebeEndereçoEntrega.setVisible(false);
        RecebeTelefoneCLiente.setVisible(false);
        RecebeNomeCliente.setVisible(false);
        Subtotal.setVisible(true);
        RecebeQuantidade.setVisible(true);
        Sim.setVisible(false);
        Não.setVisible(false);

    }

    private void tudo_falso() {
        LabelTelefone.setVisible(false);
        LabelAplicarDesconto.setVisible(false);
        LabelQuantidade.setVisible(false);
        LabelPreco.setVisible(false);
        RecebeDesonto.setVisible(false);
        ReceberPreço.setVisible(false);
        LabelEntrega.setVisible(false);
        LabelEndereco.setVisible(false);
        LabelNomeccliente.setVisible(false);
        LabelJaentregue.setVisible(false);
        LabelEntrega.setVisible(false);
        RecebeDataDeEntrega.setVisible(false);
        RecebeEndereçoEntrega.setVisible(false);
        RecebeTelefoneCLiente.setVisible(false);
        RecebeNomeCliente.setVisible(false);
        Subtotal.setVisible(false);
        Sim.setVisible(false);
        Não.setVisible(false);
        RecebeQuantidade.setVisible(false);
        formatoInvalidoDesconto1.setVisible(false);
        nomeBranco.setVisible(false);
        TelefoneBranco.setVisible(false);
        formatoInvalidotelefone.setVisible(false);
        enderecodeEntregaBranco.setVisible(false);
        precoBranco.setVisible(false);
        precoAbaixodeZero.setVisible(false);
        formatoInvalidoPreco.setVisible(false);
        formatoInvalidoQuantidade.setVisible(false);
        quantidadeBranco.setVisible(false);
        dataInexistente.setVisible(false);
        prazoBranco.setVisible(false);
    }

    private void setTextFields() throws ParseException {
        RecebeDesonto.setText(desconto);
        ReceberPreço.setText(precoUnidade);
        RecebeQuantidade.setText(quantidade);
        RecebeEndereçoEntrega.setText(endereco);
        RecebeTelefoneCLiente.setText(telefoneCliente);
        RecebeNomeCliente.setText(nomeCliente);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(prazoEntrega);
        RecebeDataDeEntrega.setDate(date);

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicaoPedidos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClienteSelecionado;
    private javax.swing.JButton ConfirmarPagamentos;
    private javax.swing.JButton ConfrimarDados;
    private javax.swing.JButton Dados;
    private javax.swing.JLabel LabelAplicarDesconto;
    private javax.swing.JLabel LabelEndereco;
    private javax.swing.JLabel LabelEntrega;
    private javax.swing.JLabel LabelJaentregue;
    private javax.swing.JLabel LabelNomeccliente;
    private javax.swing.JLabel LabelPreco;
    private javax.swing.JLabel LabelQuantidade;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JList<String> Lista;
    private javax.swing.JCheckBox Não;
    private javax.swing.JButton Pagamentos;
    private com.toedter.calendar.JDateChooser RecebeDataDeEntrega;
    private javax.swing.JTextField RecebeDesonto;
    private javax.swing.JTextField RecebeEndereçoEntrega;
    private javax.swing.JTextField RecebeNomeCliente;
    private javax.swing.JTextField RecebeQuantidade;
    private javax.swing.JTextField RecebeTelefoneCLiente;
    private javax.swing.JTextField ReceberPreço;
    private javax.swing.JScrollPane Scrolllist;
    private javax.swing.JCheckBox Sim;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel TelefoneBranco;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel dataInexistente;
    private javax.swing.JLabel enderecodeEntregaBranco;
    private javax.swing.JLabel formatoInvalidoDesconto1;
    private javax.swing.JLabel formatoInvalidoPreco;
    private javax.swing.JLabel formatoInvalidoQuantidade;
    private javax.swing.JLabel formatoInvalidotelefone;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeBranco;
    private javax.swing.JLabel prazoBranco;
    private javax.swing.JLabel precoAbaixodeZero;
    private javax.swing.JLabel precoBranco;
    private javax.swing.JLabel quantidadeBranco;
    private javax.swing.JTextField recebeNome;
    // End of variables declaration//GEN-END:variables
}
