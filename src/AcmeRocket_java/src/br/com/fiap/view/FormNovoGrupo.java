/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.view;

/**
 *
 * @author Thiago
 */
public class FormNovoGrupo extends javax.swing.JFrame {

    /**
     * Creates new form FormNovoGrupo
     */
    public FormNovoGrupo() {
        initComponents();
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
        txtGrupo = new javax.swing.JTextField();
        cmbEvento = new javax.swing.JComboBox<>();
        cmbTurma = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblGrupos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCancelarGrupo = new javax.swing.JButton();
        btnSalvarGrupo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setText("Grupo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-03 51x51.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel6.setText("Grupo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel7.setText("Evento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel8.setText("Turma:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, -1));

        txtGrupo.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        getContentPane().add(txtGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, -1));

        cmbEvento.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        cmbEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Evento", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, -1));

        cmbTurma.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        cmbTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Turma", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 140, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel2.setText("Novo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 11, -1, -1));

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

        lblGrupos.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblGrupos.setText("Grupos");
        lblGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGruposMouseClicked(evt);
            }
        });
        getContentPane().add(lblGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 11, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 9, -1, -1));

        btnCancelarGrupo.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnCancelarGrupo.setText("Cancelar");
        getContentPane().add(btnCancelarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 220, 80, -1));

        btnSalvarGrupo.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnSalvarGrupo.setText("Salvar");
        getContentPane().add(btnSalvarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        //CHAMANDO FORMULARIO PRINCIPAL
        FormPrincipal fp = new FormPrincipal();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGruposMouseClicked
        //CHAMANDO FORMULARIO GRUPOS(LISTA)
        FormGrupos fg = new FormGrupos();
        this.dispose();
        fg.setVisible(true);
    }//GEN-LAST:event_lblGruposMouseClicked

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
            java.util.logging.Logger.getLogger(FormNovoGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNovoGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNovoGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNovoGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNovoGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarGrupo;
    private javax.swing.JButton btnSalvarGrupo;
    private javax.swing.JComboBox<String> cmbEvento;
    private javax.swing.JComboBox<String> cmbTurma;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblGrupos;
    private javax.swing.JTextField txtGrupo;
    // End of variables declaration//GEN-END:variables
}
