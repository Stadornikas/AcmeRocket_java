/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.view;

import java.awt.Color;

/**
 *
 * @author Thiago
 */
public class FormNovoLancamento extends javax.swing.JFrame {

    /**
     * Creates new form FormNovoLancamento
     */
    public FormNovoLancamento() {
        initComponents();
        setLocationRelativeTo(this);
        lblDashboard.setForeground(Color.blue);
        lblLancamento.setForeground(Color.blue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblLancamento = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRm = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cmbGrupo = new javax.swing.JComboBox<>();
        btnCancelarAluno = new javax.swing.JButton();
        btnSalvarAluno2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtRm1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRm2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRm3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRm4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtRm5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtRm6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtRm7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtRm8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtRm9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtRm10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtRm11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtRm12 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtRm13 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtRm14 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtRm15 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(723, 420));
        setSize(new java.awt.Dimension(723, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-05 51x51.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel4.setText("Lançamento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel2.setText("Novo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 11, -1, -1));

        lblDashboard.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 9, -1, -1));

        lblLancamento.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblLancamento.setText("Lançamentos");
        lblLancamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLancamentoMouseClicked(evt);
            }
        });
        getContentPane().add(lblLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 11, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 9, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setText("PIC ACL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setText("STATUS:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setText("Grupo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        txtRm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 110, -1));

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 210, -1));

        cmbGrupo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Grupo", "Item 2", "Item 3", "Item 4" }));
        cmbGrupo.setMinimumSize(new java.awt.Dimension(129, 21));
        cmbGrupo.setPreferredSize(new java.awt.Dimension(129, 21));
        getContentPane().add(cmbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 210, 20));

        btnCancelarAluno.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnCancelarAluno.setText("Cancelar");
        getContentPane().add(btnCancelarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 110, -1));

        btnSalvarAluno2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnSalvarAluno2.setText("Salvar");
        btnSalvarAluno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAluno2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAluno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 90, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("SUCESSO");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jRadioButton2.setText("FALHA");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel10.setText("ÂNGULO LANÇAMENTO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtRm1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 110, -1));

        jLabel12.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel12.setText("VELOCIDADE VENTO:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtRm2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 110, -1));

        jLabel13.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel13.setText("DISTANCIA ALVO:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtRm3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 110, -1));

        jLabel14.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel14.setText("PESO FOGUETE:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        txtRm4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 110, -1));

        jLabel15.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel15.setText("ALTURA MÁXIMA:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        txtRm5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 110, -1));

        jLabel16.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel16.setText("VELOCIDADE MÁXIMA:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        txtRm6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 110, -1));

        jLabel17.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel17.setText("TEMPRP?");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        txtRm7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 110, -1));

        jLabel18.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel18.setText("HORA LANÇAMENTO:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtRm8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 110, -1));

        jLabel19.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel19.setText("ALCANCE MÁXIMO");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        txtRm9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 110, -1));

        jLabel20.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel20.setText("TEMPO APOGEU");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txtRm10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 110, -1));

        jLabel21.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel21.setText("TEMEJE");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        txtRm11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 110, -1));

        jLabel22.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel22.setText("ALTURA EJE");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        txtRm12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 110, -1));

        jLabel23.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel23.setText("TAX DES");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        txtRm13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 110, -1));

        jLabel24.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel24.setText("DUR VOO");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        txtRm14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 110, -1));

        jLabel25.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel25.setText("DISTANCIA QUEDA");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtRm15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        //CHAMANDO FORMULARIO PRINCIPAL
        FormPrincipal fp = new FormPrincipal();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblLancamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLancamentoMouseClicked
        //CHAMANDO FORMULARIO LANÇAMENTO(LISTA)
        FormLancamento fl = new FormLancamento();
        this.dispose();
        fl.setVisible(true);
    }//GEN-LAST:event_lblLancamentoMouseClicked

    private void btnSalvarAluno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAluno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarAluno2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormNovoLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNovoLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNovoLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNovoLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNovoLancamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAluno;
    private javax.swing.JButton btnSalvarAluno2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblLancamento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRm;
    private javax.swing.JTextField txtRm1;
    private javax.swing.JTextField txtRm10;
    private javax.swing.JTextField txtRm11;
    private javax.swing.JTextField txtRm12;
    private javax.swing.JTextField txtRm13;
    private javax.swing.JTextField txtRm14;
    private javax.swing.JTextField txtRm15;
    private javax.swing.JTextField txtRm2;
    private javax.swing.JTextField txtRm3;
    private javax.swing.JTextField txtRm4;
    private javax.swing.JTextField txtRm5;
    private javax.swing.JTextField txtRm6;
    private javax.swing.JTextField txtRm7;
    private javax.swing.JTextField txtRm8;
    private javax.swing.JTextField txtRm9;
    // End of variables declaration//GEN-END:variables
}
