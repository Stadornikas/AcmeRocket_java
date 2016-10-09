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
public class FormNovoAluno extends javax.swing.JFrame {

    /**
     * Creates new form FormNovoAluno
     */
    public FormNovoAluno() {
        initComponents();
        setLocationRelativeTo(this);
         lblDashboard.setForeground(Color.blue);
         lblAlunos.setForeground(Color.blue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRm = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cmbGrupo = new javax.swing.JComboBox<>();
        btnCancelarAluno = new javax.swing.JButton();
        btnSalvarAluno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAlunos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(723, 420));
        setSize(new java.awt.Dimension(723, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel3.setText("Aluno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-04 51x51.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setText("RM:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setText("Nome:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setText("Grupo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        txtRm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 70, -1));

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 210, -1));

        cmbGrupo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Grupo", "Item 2", "Item 3", "Item 4" }));
        cmbGrupo.setMinimumSize(new java.awt.Dimension(129, 21));
        cmbGrupo.setPreferredSize(new java.awt.Dimension(129, 21));
        getContentPane().add(cmbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 210, 20));

        btnCancelarAluno.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnCancelarAluno.setText("Cancelar");
        getContentPane().add(btnCancelarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 110, -1));

        btnSalvarAluno.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnSalvarAluno.setText("Salvar");
        btnSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 230, 90, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel2.setText("Novo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 11, -1, -1));

        lblDashboard.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 9, -1, -1));

        lblAlunos.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblAlunos.setText("Alunos");
        lblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlunosMouseClicked(evt);
            }
        });
        getContentPane().add(lblAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 11, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 9, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarAlunoActionPerformed

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
         //CHAMANDO FORMULARIO PRINCIPAL
        FormPrincipal fp = new FormPrincipal();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlunosMouseClicked
        //CHAMANDO FORMULARIO ALUNOS(LISTA)
        FormAluno fa = new FormAluno();
        this.dispose();
        fa.setVisible(true);
    }//GEN-LAST:event_lblAlunosMouseClicked

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
            java.util.logging.Logger.getLogger(FormNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNovoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAluno;
    private javax.swing.JButton btnSalvarAluno;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAlunos;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRm;
    // End of variables declaration//GEN-END:variables
}
