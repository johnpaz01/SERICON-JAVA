package Front;

import Back.GeraRelatorios;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public final class Relatorios extends javax.swing.JFrame {

    public Relatorios() {
        initComponents();
        addChoiceItem();
        addChoiceItem2();
        addCheckboxListeners();
        iniciarcompontetes();
    }

    void iniciarcompontetes() {
        ChoiceAno.setVisible(false);
        LabelChoice.setVisible(false);
        ChoiceMes.setVisible(false);
        ConfrimarAno.setBackground(Color.WHITE);
        ConfrimarMes.setBackground(Color.WHITE);
        Voltar.setBackground(Color.WHITE);
        VoltarGigante.setBackground(Color.WHITE);
        ConfrimarAno.setVisible(false);
        ConfrimarMes.setVisible(false);
        VoltarGigante.setVisible(true);
        Voltar.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    void addChoiceItem() {
        ChoiceAno.add("2024");
        ChoiceAno.add("2025");
        ChoiceAno.add("2026");
        ChoiceAno.add("2027");
    }

    void addChoiceItem2() {
        ChoiceMes.add("Janeiro");
        ChoiceMes.add("Fevereiro");
        ChoiceMes.add("Março");
        ChoiceMes.add("Abril");
        ChoiceMes.add("Maio");
        ChoiceMes.add("Junho");
        ChoiceMes.add("Julho");
        ChoiceMes.add("Agosto");
        ChoiceMes.add("Setembro");
        ChoiceMes.add("Outubro");
        ChoiceMes.add("Novembro");
        ChoiceMes.add("Dezembro");
    }

    void addCheckboxListeners() {
        AnualCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    ConfrimarAno.setVisible(true);
                    ConfrimarMes.setVisible(false);
                    mensalCheckBockx.setState(false);
                    ChoiceAno.setVisible(true);
                    ChoiceMes.setVisible(false);
                    LabelChoice.setVisible(true);
                    LabelChoice.setText("Selecione o ano: ");
                    Labelinicial.setText("Relatório anual");
                    VoltarGigante.setVisible(false);
                    Voltar.setVisible(true);
                }
            }
        });

        mensalCheckBockx.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    ConfrimarAno.setVisible(false);
                    ConfrimarMes.setVisible(true);
                    AnualCheckBox.setState(false);
                    ChoiceAno.setVisible(false);
                    ChoiceMes.setVisible(true);
                    LabelChoice.setText("Selecione o mês: ");
                    LabelChoice.setVisible(true);
                    Labelinicial.setText("Relatório mensal");
                    VoltarGigante.setVisible(false);
                    Voltar.setVisible(true);

                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelChoice = new javax.swing.JLabel();
        AnualCheckBox = new java.awt.Checkbox();
        mensalCheckBockx = new java.awt.Checkbox();
        ChoiceAno = new java.awt.Choice();
        Labelinicial = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        ConfrimarAno = new javax.swing.JButton();
        ChoiceMes = new java.awt.Choice();
        ConfrimarMes = new javax.swing.JButton();
        VoltarGigante = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);

        LabelChoice.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        LabelChoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelChoice.setText("Escolha o ano:");
        getContentPane().add(LabelChoice);
        LabelChoice.setBounds(200, 250, 320, 50);

        AnualCheckBox.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        AnualCheckBox.setLabel(" Anual");
        getContentPane().add(AnualCheckBox);
        AnualCheckBox.setBounds(400, 170, 130, 32);

        mensalCheckBockx.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        mensalCheckBockx.setLabel(" Mensal");
        getContentPane().add(mensalCheckBockx);
        mensalCheckBockx.setBounds(220, 170, 130, 32);

        ChoiceAno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ChoiceAno.setName(""); // NOI18N
        getContentPane().add(ChoiceAno);
        ChoiceAno.setBounds(200, 310, 310, 60);

        Labelinicial.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        Labelinicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labelinicial.setText("Relátorio");
        getContentPane().add(Labelinicial);
        Labelinicial.setBounds(130, 80, 470, 50);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(160, 470, 220, 50);

        ConfrimarAno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConfrimarAno.setText("Confirmar");
        ConfrimarAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConfrimarAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarAnoActionPerformed(evt);
            }
        });
        getContentPane().add(ConfrimarAno);
        ConfrimarAno.setBounds(410, 470, 190, 50);

        ChoiceMes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ChoiceMes.setName(""); // NOI18N
        getContentPane().add(ChoiceMes);
        ChoiceMes.setBounds(200, 310, 310, 60);

        ConfrimarMes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConfrimarMes.setText("Confirmar");
        ConfrimarMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConfrimarMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarMesActionPerformed(evt);
            }
        });
        getContentPane().add(ConfrimarMes);
        ConfrimarMes.setBounds(410, 470, 190, 50);

        VoltarGigante.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        VoltarGigante.setText("Voltar");
        VoltarGigante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VoltarGigante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarGiganteActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarGigante);
        VoltarGigante.setBounds(200, 430, 340, 100);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SCMaior.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 10, 200, 160);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/SCMaior.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 10, 200, 160);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, -20, 840, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfrimarAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarAnoActionPerformed

        String anoSelecionado = ChoiceAno.getSelectedItem();
        GeraRelatorios.gerarRelatorioAnual(anoSelecionado);
        dispose();
    }//GEN-LAST:event_ConfrimarAnoActionPerformed

    private void ConfrimarMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarMesActionPerformed

        String mesSelecionado = ChoiceMes.getSelectedItem();
        GeraRelatorios.gerarRelatorioMensal(mesSelecionado);
        dispose();
    }//GEN-LAST:event_ConfrimarMesActionPerformed

    private void VoltarGiganteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarGiganteActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarGiganteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox AnualCheckBox;
    private java.awt.Choice ChoiceAno;
    private java.awt.Choice ChoiceMes;
    private javax.swing.JButton ConfrimarAno;
    private javax.swing.JButton ConfrimarMes;
    private javax.swing.JLabel LabelChoice;
    private javax.swing.JLabel Labelinicial;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton VoltarGigante;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private java.awt.Checkbox mensalCheckBockx;
    // End of variables declaration//GEN-END:variables
}
