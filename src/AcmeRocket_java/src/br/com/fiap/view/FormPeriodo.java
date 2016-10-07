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
public class FormPeriodo extends javax.swing.JFrame {

    /**
     * Creates new form FormPeriodo
     */
    public FormPeriodo() {
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPeriodos = new javax.swing.JTable();
        btnNovoPeriodo = new javax.swing.JButton();
        lblDashboard = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-01 51x51.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setText("Períodos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        tabPeriodos.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        tabPeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PERÍODOS", "ALTERAR", "DELETAR"
            }
        ));
        jScrollPane1.setViewportView(tabPeriodos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 375, 147));

        btnNovoPeriodo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnNovoPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Mais 20x20.png"))); // NOI18N
        btnNovoPeriodo.setText("Novo");
        btnNovoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPeriodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        lblDashboard.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel8.setText("Períodos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 11, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 9, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        //CHAMANDO FORMULARIO PRINCIPAL
        FormPrincipal fp = new FormPrincipal();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void btnNovoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPeriodoActionPerformed
        //CHAMANDO FORMULARIO NOVO PERIODO
        FormNovoPeriodo fnp = new FormNovoPeriodo();
        this.dispose();
        fnp.setVisible(true);
    }//GEN-LAST:event_btnNovoPeriodoActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeriodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoPeriodo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTable tabPeriodos;
    // End of variables declaration//GEN-END:variables
}
