package Front;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AreaAdmin extends javax.swing.JFrame {

    public AreaAdmin() {
        initComponents();
        this.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        campoVazioDate.setVisible(false);
        Confrimar.setBackground(Color.GRAY);
        Voltar.setBackground(Color.GRAY);
        RetornaData.setBackground(Color.GRAY);
        Confrimar.setForeground(Color.WHITE);
        Voltar.setForeground(Color.WHITE);
        RetornaData.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RetornaData = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Confrimar = new javax.swing.JButton();
        campoVazioDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 590));
        setPreferredSize(getMinimumSize());
        getContentPane().setLayout(null);

        RetornaData.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(RetornaData);
        RetornaData.setBounds(200, 190, 300, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Proxima Atualização:");
        jLabel2.setAlignmentX(5.5F);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 130, 250, 50);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 2));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(140, 350, 210, 50);

        Confrimar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confrimar.setText("Confirmar");
        Confrimar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 2));
        Confrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimar);
        Confrimar.setBounds(380, 350, 190, 50);

        campoVazioDate.setForeground(new java.awt.Color(153, 0, 0));
        campoVazioDate.setText("*O campo não pode estar vazio");
        getContentPane().add(campoVazioDate);
        campoVazioDate.setBounds(200, 170, 210, 16);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/LogoAllgren.jpg"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(670, 470));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-280, 0, 990, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        fecharJanela();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarActionPerformed

        if (RetornaData != null) {
            Date date = RetornaData.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String data = sdf.format(date);
            new Back.Conection().atualizaData(data);
            fecharJanela();
        } else {
            campoVazioDate.setVisible(true);
        }
    }//GEN-LAST:event_ConfrimarActionPerformed

    private void fecharJanela() {
        System.exit(0); // Encerra o processo da aplicação
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
            java.util.logging.Logger.getLogger(AreaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confrimar;
    private com.toedter.calendar.JDateChooser RetornaData;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel campoVazioDate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
