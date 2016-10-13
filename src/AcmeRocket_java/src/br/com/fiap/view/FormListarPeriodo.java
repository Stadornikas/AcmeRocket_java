<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.view;

import br.com.fiap.controller.CtrlDeletarPeriodo;
import br.com.fiap.controller.CtrlListarPeriodo;
import br.com.fiap.entity.Periodo;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Thiago
 */
public class FormListarPeriodo extends javax.swing.JFrame {

    private String matrizLista[][];
    int codPeriodo;

    public FormListarPeriodo() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPeriodos = new javax.swing.JTable();
        btnNovoPeriodo = new javax.swing.JButton();
        lblDashboard = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeletarPeriodo = new javax.swing.JButton();
        btnALterarPeriodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(723, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(723, 420));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabPeriodos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabPeriodos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabPeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PERÍODO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPeriodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPeriodosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPeriodos);
        if (tabPeriodos.getColumnModel().getColumnCount() > 0) {
            tabPeriodos.getColumnModel().getColumn(0).setResizable(false);
            tabPeriodos.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 150, 630, 210));

        btnNovoPeriodo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnNovoPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Mais 20x20.png"))); // NOI18N
        btnNovoPeriodo.setText("Novo");
        btnNovoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPeriodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 100, 100, 40));

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-01 51x51.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel4.setText("Período");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        btnDeletarPeriodo.setText("Deletar");
        btnDeletarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarPeriodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletarPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 100, 40));

        btnALterarPeriodo.setText("Alterar");
        btnALterarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALterarPeriodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnALterarPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 100, 40));

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
        FormSalvarPeriodo fnp = new FormSalvarPeriodo();
        this.dispose();
        fnp.setVisible(true);
    }//GEN-LAST:event_btnNovoPeriodoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizarTabela();
    }//GEN-LAST:event_formWindowOpened

    private void tabPeriodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPeriodosMouseClicked

    }//GEN-LAST:event_tabPeriodosMouseClicked

    private void btnDeletarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarPeriodoActionPerformed
        int linha = tabPeriodos.getSelectedRow();

        if (linha != -1) {

            if (this.codPeriodo != -1) {
                int codigoPeriodo = Integer.parseInt(String.valueOf(tabPeriodos.getValueAt(linha, 0)));
                CtrlDeletarPeriodo ctrlPeriodo = new CtrlDeletarPeriodo();
                if (ctrlPeriodo.confirmaExclusao()) {
                    ctrlPeriodo.excluirPeriodo(codigoPeriodo);
                    atualizarTabela();
                }
            } else {
                //JOptionPane.showMessageDialog(this, "Selecione um período da lista para deletar", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um período da lista para deletar", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
        }

    }//GEN-LAST:event_btnDeletarPeriodoActionPerformed

    private void btnALterarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALterarPeriodoActionPerformed
        int linha = tabPeriodos.getSelectedRow();
        if (linha != -1) {
            if (this.codPeriodo != -1) {
            FormSalvarPeriodo fng = new FormSalvarPeriodo();
            int obj = Integer.parseInt(String.valueOf(tabPeriodos.getValueAt(linha, 0)));
            fng.setCodPeriodo(obj);
            this.dispose();
            fng.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(this, "teste");
        }
    }//GEN-LAST:event_btnALterarPeriodoActionPerformed

    /**
     * Atualiza a tabela de registros
     */
    private void atualizarTabela() {
        CtrlListarPeriodo controle = new CtrlListarPeriodo();
        List<Periodo> lista = controle.CarregarRegistros();
        Periodo periodo;

        if (lista.size() > 0) {

            matrizLista = new String[lista.size()][3];
            String[] colunas = {"ID", "PERÍODOS"};

            for (int i = 0; i < lista.size(); i++) {
                periodo = lista.get(i);
                matrizLista[i][0] = Integer.toString(periodo.getCodPeriodo());
                matrizLista[i][1] = periodo.getNomPeriodo();
            }

            TableModel modeloTabela = new DefaultTableModel(matrizLista, colunas);
            tabPeriodos.setModel(modeloTabela);
        }
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
            java.util.logging.Logger.getLogger(FormListarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormListarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormListarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormListarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormListarPeriodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALterarPeriodo;
    private javax.swing.JButton btnDeletarPeriodo;
    private javax.swing.JButton btnNovoPeriodo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTable tabPeriodos;
    // End of variables declaration//GEN-END:variables
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.view;

import br.com.fiap.controller.CtrlDeletarPeriodo;
import br.com.fiap.controller.CtrlListarPeriodo;
import br.com.fiap.entity.Periodo;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Thiago
 */
public class FormListarPeriodo extends javax.swing.JFrame {

    private String matrizLista[][];

    public FormListarPeriodo() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPeriodos = new javax.swing.JTable();
        btnNovoPeriodo = new javax.swing.JButton();
        lblDashboard = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeletarPeriodo = new javax.swing.JButton();
        btnALterarPeriodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(723, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(723, 420));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabPeriodos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabPeriodos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabPeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PERÍODO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPeriodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPeriodosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPeriodos);
        if (tabPeriodos.getColumnModel().getColumnCount() > 0) {
            tabPeriodos.getColumnModel().getColumn(0).setResizable(false);
            tabPeriodos.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 150, 630, 210));

        btnNovoPeriodo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnNovoPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Mais 20x20.png"))); // NOI18N
        btnNovoPeriodo.setText("Novo");
        btnNovoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPeriodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 100, 100, 40));

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-01 51x51.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel4.setText("Período");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        btnDeletarPeriodo.setText("Deletar");
        btnDeletarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarPeriodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletarPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 100, 40));

        btnALterarPeriodo.setText("Alterar");
        btnALterarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALterarPeriodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnALterarPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 100, 40));

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
        FormSalvarPeriodo fnp = new FormSalvarPeriodo();
        this.dispose();
        fnp.setVisible(true);
    }//GEN-LAST:event_btnNovoPeriodoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizarTabela();
    }//GEN-LAST:event_formWindowOpened

    private void tabPeriodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPeriodosMouseClicked

    }//GEN-LAST:event_tabPeriodosMouseClicked

    private void btnDeletarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarPeriodoActionPerformed
        int linha = tabPeriodos.getSelectedRow();

        if (linha != -1) {

            int codigoPeriodo = Integer.parseInt(String.valueOf(tabPeriodos.getValueAt(linha, 0)));
            CtrlDeletarPeriodo ctrlPeriodo = new CtrlDeletarPeriodo();
            if (ctrlPeriodo.confirmaExclusao()) {
                ctrlPeriodo.excluirPeriodo(codigoPeriodo);
                atualizarTabela();
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um período da lista para deletar", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
        }

    }//GEN-LAST:event_btnDeletarPeriodoActionPerformed

    private void btnALterarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALterarPeriodoActionPerformed
        int linha = tabPeriodos.getSelectedRow();
        if (linha != -1) {
            FormSalvarPeriodo fng = new FormSalvarPeriodo();
            int obj = Integer.parseInt(String.valueOf(tabPeriodos.getValueAt(linha, 0)));
            fng.setCodPeriodo(obj);
            this.dispose();
            fng.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um período da lista para alterar", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
        }
    }//GEN-LAST:event_btnALterarPeriodoActionPerformed

    /**
     * Atualiza a tabela de registros
     */
    private void atualizarTabela() {
        CtrlListarPeriodo controle = new CtrlListarPeriodo();
        List<Periodo> lista = controle.CarregarRegistros();
        Periodo periodo;

        if (lista.size() > 0) {

            matrizLista = new String[lista.size()][3];
            String[] colunas = {"ID", "PERÍODOS"};

            for (int i = 0; i < lista.size(); i++) {
                periodo = lista.get(i);
                matrizLista[i][0] = Integer.toString(periodo.getCodPeriodo());
                matrizLista[i][1] = periodo.getNomPeriodo();
            }

            TableModel modeloTabela = new DefaultTableModel(matrizLista, colunas);
            tabPeriodos.setModel(modeloTabela);
        }
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
            java.util.logging.Logger.getLogger(FormListarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormListarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormListarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormListarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormListarPeriodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALterarPeriodo;
    private javax.swing.JButton btnDeletarPeriodo;
    private javax.swing.JButton btnNovoPeriodo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTable tabPeriodos;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> 9a896d582a8802476520bed594c38d90eeac3c0d
