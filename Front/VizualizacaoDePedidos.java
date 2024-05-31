package Front;

import Back.Conection;
import java.awt.Color;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public final class VizualizacaoDePedidos extends javax.swing.JFrame {

    public VizualizacaoDePedidos(String nomee, String telefonee, Date dataa) {
        initComponents();
        Voltar.setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setInformation(nomee, telefonee, dataa);
        atualizarSubtotal();
    }

    void atualizatodomomentosubtotal() {
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
        RecebeQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Divisoria3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Divisoria4 = new javax.swing.JLabel();
        ReceberPreço = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RecebeEnderecoEntrega = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RecebeDesonto = new javax.swing.JTextField();
        Subtotal = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        LabelEntrega = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RecebeDataEntrega = new javax.swing.JTextField();
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

        RecebeNomeCliente.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
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
        RecebeNomeCliente.setBounds(40, 190, 260, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Telefone:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 230, 80, 17);

        RecebeTelefoneCLiente.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
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
        RecebeTelefoneCLiente.setBounds(40, 270, 260, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Preço da unidade:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(630, 150, 140, 17);

        RecebeQuantidade.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RecebeQuantidadeKeyReleased(evt);
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
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mais informações");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 40, 190, 40);

        Divisoria4.setText("___________________________________________________");
        getContentPane().add(Divisoria4);
        Divisoria4.setBounds(50, 120, 250, 20);

        ReceberPreço.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ReceberPreçoKeyReleased(evt);
            }
        });
        getContentPane().add(ReceberPreço);
        ReceberPreço.setBounds(550, 190, 250, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Quantidade:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(640, 230, 100, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Endereço de entrega:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 320, 170, 17);

        RecebeEnderecoEntrega.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        RecebeEnderecoEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeEnderecoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeEnderecoEntregaActionPerformed(evt);
            }
        });
        RecebeEnderecoEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeEnderecoEntregaKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeEnderecoEntrega);
        RecebeEnderecoEntrega.setBounds(40, 360, 260, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Desconto:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 410, 170, 17);

        RecebeDesonto.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        RecebeDesonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeDesonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeDesontoActionPerformed(evt);
            }
        });
        RecebeDesonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeDesontoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RecebeDesontoKeyReleased(evt);
            }
        });
        getContentPane().add(RecebeDesonto);
        RecebeDesonto.setBounds(40, 450, 270, 40);

        Subtotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtotal.setText("Subtotal: ");
        Subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        Subtotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Subtotal);
        Subtotal.setBounds(530, 450, 300, 40);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(330, 550, 250, 60);

        LabelEntrega.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelEntrega.setText("Data da entrega:");
        LabelEntrega.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelEntrega);
        LabelEntrega.setBounds(570, 320, 230, 17);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SericonTransparetne.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(750, 0, 150, 90);

        RecebeDataEntrega.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        RecebeDataEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecebeDataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeDataEntregaActionPerformed(evt);
            }
        });
        RecebeDataEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecebeDataEntregaKeyPressed(evt);
            }
        });
        getContentPane().add(RecebeDataEntrega);
        RecebeDataEntrega.setBounds(550, 360, 260, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-110, -30, 1140, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecebeNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeNomeClienteActionPerformed

    }//GEN-LAST:event_RecebeNomeClienteActionPerformed

    private void RecebeNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeNomeClienteKeyPressed

    }//GEN-LAST:event_RecebeNomeClienteKeyPressed

    private void RecebeTelefoneCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeTelefoneCLienteActionPerformed

    }//GEN-LAST:event_RecebeTelefoneCLienteActionPerformed

    private void RecebeTelefoneCLienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeTelefoneCLienteKeyPressed

    }//GEN-LAST:event_RecebeTelefoneCLienteKeyPressed

    private void RecebeQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeQuantidadeActionPerformed

    }//GEN-LAST:event_RecebeQuantidadeActionPerformed

    private void RecebeQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeQuantidadeKeyPressed

    }//GEN-LAST:event_RecebeQuantidadeKeyPressed

    private void ReceberPreçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberPreçoActionPerformed

    }//GEN-LAST:event_ReceberPreçoActionPerformed

    private void ReceberPreçoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberPreçoKeyPressed

    }//GEN-LAST:event_ReceberPreçoKeyPressed

    private void RecebeEnderecoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeEnderecoEntregaActionPerformed

    }//GEN-LAST:event_RecebeEnderecoEntregaActionPerformed

    private void RecebeEnderecoEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeEnderecoEntregaKeyPressed

    }//GEN-LAST:event_RecebeEnderecoEntregaKeyPressed

    private void RecebeDesontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeDesontoActionPerformed

    }//GEN-LAST:event_RecebeDesontoActionPerformed

    private void RecebeDesontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeDesontoKeyPressed

    }//GEN-LAST:event_RecebeDesontoKeyPressed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void RecebeDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecebeDataEntregaActionPerformed

    private void RecebeDataEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeDataEntregaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecebeDataEntregaKeyPressed

    private void RecebeDesontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeDesontoKeyReleased
        atualizarSubtotal();
    }//GEN-LAST:event_RecebeDesontoKeyReleased

    private void ReceberPreçoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReceberPreçoKeyReleased
        atualizarSubtotal();
    }//GEN-LAST:event_ReceberPreçoKeyReleased

    private void RecebeQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeQuantidadeKeyReleased
        atualizarSubtotal();
    }//GEN-LAST:event_RecebeQuantidadeKeyReleased

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

    void setInformation(String nomeporinformacao, String telefoneporinformacao, Date dataporinformacao) {
        Conection con = new Conection();
        con.getInformation(nomeporinformacao, telefoneporinformacao, dataporinformacao);
        String nome = con.getNomeCliente();
        String telefone = con.getTelefoneCliente();
        String endereco = con.getEndereco();
        String desconto = con.getDesconto();
        String precounidade = con.getPrecoUnidade();
        String quantidade = con.getQuantidade();
        String dataentrega = con.getPrazoEntrega();
        RecebeNomeCliente.setText(nome);
        RecebeTelefoneCLiente.setText(telefone);
        RecebeEnderecoEntrega.setText(endereco);
        RecebeDesonto.setText(desconto);
        ReceberPreço.setText(precounidade);
        RecebeQuantidade.setText(quantidade);
        RecebeDataEntrega.setText(dataentrega);
        atualizarSubtotal();
    }

    void Dontmodificy() {
        RecebeDesonto.setEditable(false);
        RecebeEnderecoEntrega.setEditable(false);
        RecebeDataEntrega.setVisible(false);
        RecebeNomeCliente.setEditable(false);
        RecebeQuantidade.setEditable(false);
        RecebeTelefoneCLiente.setEditable(false);
        ReceberPreço.setEditable(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Instanciando com argumentos válidos
                String telefone = "123456789";
                String nome = "Cliente";
                Date data = new Date(); // Ou qualquer outra data desejada
                new VizualizacaoDePedidos(telefone, nome, data).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Divisoria3;
    private javax.swing.JLabel Divisoria4;
    private javax.swing.JLabel LabelEntrega;
    private javax.swing.JTextField RecebeDataEntrega;
    private javax.swing.JTextField RecebeDesonto;
    private javax.swing.JTextField RecebeEnderecoEntrega;
    private javax.swing.JTextField RecebeNomeCliente;
    private javax.swing.JTextField RecebeQuantidade;
    private javax.swing.JTextField RecebeTelefoneCLiente;
    private javax.swing.JTextField ReceberPreço;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JButton Voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
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
    // End of variables declaration//GEN-END:variables
}
