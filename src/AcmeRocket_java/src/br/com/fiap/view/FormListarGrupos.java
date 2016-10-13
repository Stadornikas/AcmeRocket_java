/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.view;

import br.com.fiap.controller.CtrlDeletarGrupo;
import br.com.fiap.dao.EventoDAO;
import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.dao.TurmaDAO;
import java.awt.Color;
import br.com.fiap.entity.Grupo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Thiago
 */
public class FormListarGrupos extends javax.swing.JFrame {

    String[][] matrizGrupo;
    int codigoGrupo;

    public FormListarGrupos() {
        initComponents();
        setLocationRelativeTo(this);
        lblDashboard.setForeground(Color.blue);
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
        tabGrupos = new javax.swing.JTable();
        btnSalvarGrupo = new javax.swing.JButton();
        lblDashboard = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnEditarGrupo = new javax.swing.JButton();
        btnDeletarGrupo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(723, 420));
        setSize(new java.awt.Dimension(723, 420));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel3.setText("Grupos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-03 51x51.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        tabGrupos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "GRUPO", "TURMA", "EVENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabGruposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabGrupos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 680, 240));

        btnSalvarGrupo.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnSalvarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Mais 20x20.png"))); // NOI18N
        btnSalvarGrupo.setText("Novo");
        btnSalvarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 100, 40));

        lblDashboard.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel9.setText("Grupos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 11, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 9, -1, -1));

        btnEditarGrupo.setText("Alterar");
        btnEditarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 100, 40));

        btnDeletarGrupo.setText("Remover");
        btnDeletarGrupo.setPreferredSize(new java.awt.Dimension(71, 25));
        btnDeletarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        //CHAMANDO FORMULARIO PRINCIPAL
        FormPrincipal fp = new FormPrincipal();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void btnSalvarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarGrupoActionPerformed
        //CHAMANDO FORMULARIO NOVO GRUPO
        FormSalvarGrupo fng = new FormSalvarGrupo();
        this.dispose();
        fng.setVisible(true);
    }//GEN-LAST:event_btnSalvarGrupoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        atualizarTabela();

    }//GEN-LAST:event_formWindowOpened

    private void tabGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabGruposMouseClicked
        
    }//GEN-LAST:event_tabGruposMouseClicked

    private void btnEditarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGrupoActionPerformed
        int linha = tabGrupos.getSelectedRow();
        if (linha != -1) {
            FormSalvarGrupo fng = new FormSalvarGrupo();
            int obj = Integer.parseInt(String.valueOf(tabGrupos.getValueAt(linha, 0)));
            fng.setCodGrupo(obj);
            this.dispose();
            fng.setVisible(true);
        }

    }//GEN-LAST:event_btnEditarGrupoActionPerformed

    private void btnDeletarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarGrupoActionPerformed
        int linha = tabGrupos.getSelectedRow();
        if (linha != -1) {
            if (this.codigoGrupo != -1) {
                int codigoGrupo = Integer.parseInt(String.valueOf(tabGrupos.getValueAt(linha, 0)));
                CtrlDeletarGrupo ctrlGrupo = new CtrlDeletarGrupo();
                if (ctrlGrupo.confirmaExclusao()) {
                    ctrlGrupo.excluirGrupo(codigoGrupo);
                    //this.voltarParaLista();
                    atualizarTabela();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um período da lista para deletar", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um período da lista para deletar", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
        }
    }//GEN-LAST:event_btnDeletarGrupoActionPerformed

    public void atualizarTabela() {

        GrupoDAO daoGrupo = new GrupoDAO();
        TurmaDAO daoTurma = new TurmaDAO();
        EventoDAO daoEvento = new EventoDAO();

        List<Grupo> lista = daoGrupo.listar();
        matrizGrupo = new String[lista.size()][4];
        Grupo grupo;
        String[] colunas = {"ID", "GRUPO", "TURMA", "EVENTO"};
        for (int i = 0; i < lista.size(); i++) {

            grupo = lista.get(i);
            matrizGrupo[i][0] = String.valueOf(grupo.getCodGrupo());
            matrizGrupo[i][1] = grupo.getNomGrupo();
            matrizGrupo[i][2] = daoTurma.buscarNomeTurma(grupo.getCodTurma());
            matrizGrupo[i][3] = daoEvento.buscarNomeEvento(grupo.getCodEvento());
            // matrizLista[i][3] = jLabel5.setIcon(icon);
//            matrizLista[i][4] = evento.getCaminhoFoto();

        }

        TableModel modeloTabela = new DefaultTableModel(matrizGrupo, colunas);
        tabGrupos.setModel(modeloTabela);

    }

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
            java.util.logging.Logger.getLogger(FormListarGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormListarGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormListarGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormListarGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormListarGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletarGrupo;
    private javax.swing.JButton btnEditarGrupo;
    private javax.swing.JButton btnSalvarGrupo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTable tabGrupos;
    // End of variables declaration//GEN-END:variables
}
