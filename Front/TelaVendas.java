package Front;

import Back.Conection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TelaVendas extends javax.swing.JFrame {

    private boolean produtoEntregue = true;

    public TelaVendas() {
        initComponents();
        Confrimar.setBackground(Color.WHITE);
        Voltar.setBackground(Color.WHITE);
        tudo_falso();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RecebeNomeCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        RecebeTelefoneCLiente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RecebeQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Divisoria3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Divisoria4 = new javax.swing.JLabel();
        ReceberPreço = new javax.swing.JTextField();
        RecebeDataDeEntrega = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RecebeEndereçoEntrega = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RecebeDesonto = new javax.swing.JTextField();
        Subtotal = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Confrimar = new javax.swing.JButton();
        formatoInvalidoPreco = new javax.swing.JLabel();
        quantidadeBranco = new javax.swing.JLabel();
        formatoInvalidotelefone = new javax.swing.JLabel();
        formatoInvalidoQuantidade = new javax.swing.JLabel();
        formatoInvalidoDesconto1 = new javax.swing.JLabel();
        nomeBranco = new javax.swing.JLabel();
        enderecodeEntregaBranco = new javax.swing.JLabel();
        precoBranco = new javax.swing.JLabel();
        precoAbaixodeZero = new javax.swing.JLabel();
        TelefoneBranco = new javax.swing.JLabel();
        dataInexistente = new javax.swing.JLabel();
        Não = new javax.swing.JCheckBox();
        Sim = new javax.swing.JCheckBox();
        prazoBranco = new javax.swing.JLabel();
        LabelEntrega = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela De Vendas");
        setMinimumSize(new java.awt.Dimension(950, 700));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel1.setText("Dados Cliente:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 90, 160, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Nome do cliente ou pedido:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 150, 230, 17);

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
        RecebeNomeCliente.setBounds(40, 190, 260, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Telefone:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 230, 80, 17);

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
        RecebeTelefoneCLiente.setBounds(40, 270, 260, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Preço da unidade:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(620, 150, 140, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Já Entregue?");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(630, 400, 140, 17);

        RecebeQuantidade.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
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
        RecebeQuantidade.setBounds(550, 270, 260, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel2.setText("Dados da Venda:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 90, 200, 40);

        Divisoria3.setText("___________________________________________________");
        getContentPane().add(Divisoria3);
        Divisoria3.setBounds(550, 120, 250, 16);

        jLabel3.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel3.setText("Tela de Vendas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 40, 160, 40);

        Divisoria4.setText("___________________________________________________");
        getContentPane().add(Divisoria4);
        Divisoria4.setBounds(50, 120, 250, 20);

        ReceberPreço.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
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
        ReceberPreço.setBounds(550, 190, 250, 30);

        RecebeDataDeEntrega.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        RecebeDataDeEntrega.setMaxSelectableDate(new java.util.Date(253370779317000L));
        RecebeDataDeEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeDataDeEntregaKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeDataDeEntrega);
        RecebeDataDeEntrega.setBounds(550, 360, 270, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Quantidade:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(630, 230, 100, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Endereço de entrega:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 320, 170, 17);

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
        RecebeEndereçoEntrega.setBounds(40, 360, 260, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Aplicar Desconto:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 410, 170, 17);

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
        RecebeDesonto.setBounds(30, 450, 270, 40);

        Subtotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtotal.setText("Subtotal: ");
        Subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        Subtotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Subtotal);
        Subtotal.setBounds(530, 460, 300, 40);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(200, 560, 230, 50);

        Confrimar.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Confrimar.setText("Confirmar");
        Confrimar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Confrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimar);
        Confrimar.setBounds(540, 550, 200, 50);

        formatoInvalidoPreco.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoPreco.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidoPreco);
        formatoInvalidoPreco.setBounds(550, 170, 220, 16);

        quantidadeBranco.setForeground(new java.awt.Color(153, 0, 0));
        quantidadeBranco.setText("*Campo Obrigatório");
        getContentPane().add(quantidadeBranco);
        quantidadeBranco.setBounds(550, 250, 220, 16);

        formatoInvalidotelefone.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidotelefone.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidotelefone);
        formatoInvalidotelefone.setBounds(80, 250, 220, 16);

        formatoInvalidoQuantidade.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoQuantidade.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidoQuantidade);
        formatoInvalidoQuantidade.setBounds(550, 250, 220, 16);

        formatoInvalidoDesconto1.setForeground(new java.awt.Color(153, 0, 0));
        formatoInvalidoDesconto1.setText("*Serão aceito apenas números!");
        getContentPane().add(formatoInvalidoDesconto1);
        formatoInvalidoDesconto1.setBounds(50, 430, 220, 16);

        nomeBranco.setForeground(new java.awt.Color(153, 0, 0));
        nomeBranco.setText("*Campo Obrigatório");
        getContentPane().add(nomeBranco);
        nomeBranco.setBounds(40, 170, 220, 16);

        enderecodeEntregaBranco.setForeground(new java.awt.Color(153, 0, 0));
        enderecodeEntregaBranco.setText("*Adicone um endereço de entrega");
        getContentPane().add(enderecodeEntregaBranco);
        enderecodeEntregaBranco.setBounds(40, 340, 220, 16);

        precoBranco.setForeground(new java.awt.Color(153, 0, 0));
        precoBranco.setText("*É nescessario adicionar  um preço");
        getContentPane().add(precoBranco);
        precoBranco.setBounds(550, 170, 220, 16);

        precoAbaixodeZero.setForeground(new java.awt.Color(153, 0, 0));
        precoAbaixodeZero.setText("*Preço Invalido!");
        getContentPane().add(precoAbaixodeZero);
        precoAbaixodeZero.setBounds(550, 170, 220, 16);

        TelefoneBranco.setForeground(new java.awt.Color(153, 0, 0));
        TelefoneBranco.setText("*Campo Obrigatório");
        getContentPane().add(TelefoneBranco);
        TelefoneBranco.setBounds(40, 250, 220, 16);

        dataInexistente.setForeground(new java.awt.Color(153, 0, 0));
        dataInexistente.setText("*Insira uma data válida/ seja superior a atual!  :)");
        getContentPane().add(dataInexistente);
        dataInexistente.setBounds(550, 340, 280, 16);

        Não.setText("Não");
        Não.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NãoActionPerformed(evt);
            }
        });
        getContentPane().add(Não);
        Não.setBounds(610, 420, 85, 20);

        Sim.setText("Sim");
        Sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimActionPerformed(evt);
            }
        });
        getContentPane().add(Sim);
        Sim.setBounds(690, 420, 85, 20);

        prazoBranco.setForeground(new java.awt.Color(153, 0, 0));
        prazoBranco.setText("*Campo Obrigatório");
        getContentPane().add(prazoBranco);
        prazoBranco.setBounds(550, 340, 220, 16);

        LabelEntrega.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelEntrega.setText("Prazo de entrega:");
        getContentPane().add(LabelEntrega);
        LabelEntrega.setBounds(560, 320, 230, 17);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SericonTransparetne.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(750, 0, 150, 90);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-110, -30, 1140, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void RecebeEndereçoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeEndereçoEntregaActionPerformed

    }//GEN-LAST:event_RecebeEndereçoEntregaActionPerformed

    private void RecebeEndereçoEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeEndereçoEntregaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ReceberPreço.requestFocus();
        }

    }//GEN-LAST:event_RecebeEndereçoEntregaKeyPressed

    private void RecebeDesontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeDesontoActionPerformed

    }//GEN-LAST:event_RecebeDesontoActionPerformed

    private void RecebeDesontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeDesontoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            RecebeDataDeEntrega.requestFocus();
        }
    }//GEN-LAST:event_RecebeDesontoKeyPressed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarActionPerformed
        System.out.println("vou obter os dados:");
        obterdados();
        dispose();
    }//GEN-LAST:event_ConfrimarActionPerformed

    private void NãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NãoActionPerformed
        produtoEntregue = true;
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

    private void RecebeDataDeEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeDataDeEntregaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Confrimar.doClick();
       }    }//GEN-LAST:event_RecebeDataDeEntregaKeyPressed
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

        System.out.println("Consegui indo para o salvamento");

        if (ok) {
            Conection conexao = new Conection();
            conexao.cadastrodeVendas(nome, telefone, endereco, precoUnidade, quantidade, prazoEntrega, desconto);
        }

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

    private void tudo_falso() {
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confrimar;
    private javax.swing.JLabel Divisoria3;
    private javax.swing.JLabel Divisoria4;
    private javax.swing.JLabel LabelEntrega;
    private javax.swing.JCheckBox Não;
    private com.toedter.calendar.JDateChooser RecebeDataDeEntrega;
    private javax.swing.JTextField RecebeDesonto;
    private javax.swing.JTextField RecebeEndereçoEntrega;
    private javax.swing.JTextField RecebeNomeCliente;
    private javax.swing.JTextField RecebeQuantidade;
    private javax.swing.JTextField RecebeTelefoneCLiente;
    private javax.swing.JTextField ReceberPreço;
    private javax.swing.JCheckBox Sim;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel TelefoneBranco;
    private javax.swing.JButton Voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel dataInexistente;
    private javax.swing.JLabel enderecodeEntregaBranco;
    private javax.swing.JLabel formatoInvalidoDesconto1;
    private javax.swing.JLabel formatoInvalidoPreco;
    private javax.swing.JLabel formatoInvalidoQuantidade;
    private javax.swing.JLabel formatoInvalidotelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nomeBranco;
    private javax.swing.JLabel prazoBranco;
    private javax.swing.JLabel precoAbaixodeZero;
    private javax.swing.JLabel precoBranco;
    private javax.swing.JLabel quantidadeBranco;
    // End of variables declaration//GEN-END:variables
}
