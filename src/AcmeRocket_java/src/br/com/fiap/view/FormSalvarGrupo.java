/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.view;

import br.com.fiap.controller.CtrlListarEvento;
import br.com.fiap.controller.CtrlListarTurma;
import br.com.fiap.entity.Evento;
import br.com.fiap.entity.Grupo;
import br.com.fiap.entity.Turma;
import br.com.fiap.controller.CtrlSalvarGrupo;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class FormSalvarGrupo extends javax.swing.JFrame {

    private int codigoGrupo = -1;

    public void setCodGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public FormSalvarGrupo() {
        initComponents();
        setLocationRelativeTo(this);
        lblDashboard.setForeground(Color.blue);
        lblGrupos.setForeground(Color.blue);
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
        jLabel2 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblGrupos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCancelarGrupo = new javax.swing.JButton();
        btnSalvarGrupo = new javax.swing.JButton();
        cmbEvento = new javax.swing.JComboBox();
        cmbTurma = new javax.swing.JComboBox();

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
        jLabel3.setText("Grupo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-03 51x51.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setText("Grupo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setText("Evento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setText("Turma:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        txtGrupo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 320, -1));

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
        btnCancelarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarGrupoMouseClicked(evt);
            }
        });
        btnCancelarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 100, -1));

        btnSalvarGrupo.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnSalvarGrupo.setText("Salvar");
        btnSalvarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 100, -1));

        cmbEvento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o evento" }));
        getContentPane().add(cmbEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 320, -1));

        cmbTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a turma" }));
        getContentPane().add(cmbTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        //CHAMANDO FORMULARIO PRINCIPAL
        this.dispose();
        FormPrincipal fp = new FormPrincipal();
        fp.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGruposMouseClicked
        //CHAMANDO FORMULARIO GRUPOS(LISTA)
        FormListarGrupos fg = new FormListarGrupos();
        this.dispose();
        fg.setVisible(true);
    }//GEN-LAST:event_lblGruposMouseClicked

    private void btnCancelarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarGrupoActionPerformed

    private void btnCancelarGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarGrupoMouseClicked
        if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar ?", "Selecione uma opção", JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
            FormListarGrupos lf = new FormListarGrupos();
            lf.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelarGrupoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        if (codigoGrupo == -1) {
            CtrlSalvarGrupo ctrlGrupo = new CtrlSalvarGrupo();
            ArrayList<Turma> listaTurma = ctrlGrupo.carregarRegistrosTurma();
            ArrayList<Evento> listaEvento = ctrlGrupo.carregarRegistrosEvento();

            for (Turma t : listaTurma) {
                cmbTurma.addItem(t.getNomTurma());
            }

            for (Evento e : listaEvento) {
                cmbEvento.addItem(e.getNomEvento());
            }
        } else {
            //Em caso de edicao os campos vem carregados com os dados da turma
            CtrlSalvarGrupo ctrlGrupo = new CtrlSalvarGrupo();
            Grupo g = ctrlGrupo.carregarGrupo(codigoGrupo);
            ArrayList<Turma> lista = ctrlGrupo.carregarRegistrosTurma();
            ArrayList<Evento> listaEvento = ctrlGrupo.carregarRegistrosEvento();

            if (g == null) {
                this.voltarParaLista();
            }

            for (Turma t : lista) {
                cmbTurma.addItem(t.getNomTurma());
            }

            for (Evento e : listaEvento) {
                cmbEvento.addItem(e.getNomEvento());
            }

            txtGrupo.setText(g.getNomGrupo());
            cmbTurma.setSelectedItem(ctrlGrupo.carregarComboTurma(g.getCodTurma()));
            cmbEvento.setSelectedItem(ctrlGrupo.carregarComboEvento(g.getCodEvento()));


    }//GEN-LAST:event_formWindowOpened
    }

    private void btnSalvarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarGrupoActionPerformed

        String nomePeriodo = txtGrupo.getText();
        String evento = String.valueOf(cmbEvento.getSelectedItem());
        String turma = String.valueOf(cmbTurma.getSelectedItem());

        CtrlSalvarGrupo ctrlGrupo = new CtrlSalvarGrupo();
        CtrlListarTurma ctrlTurma = new CtrlListarTurma();
        CtrlListarEvento ctrlEvento = new CtrlListarEvento();
        if (this.codigoGrupo == -1) {

            ctrlGrupo.inserirGrupo(nomePeriodo, ctrlTurma.buscarIdComboTurma(turma), ctrlEvento.buscarIdComboEvento(evento));
       
        } else {
            ctrlGrupo.alterarGrupo(codigoGrupo, nomePeriodo, ctrlTurma.buscarIdComboTurma(turma), ctrlEvento.buscarIdComboEvento(evento));
       
        }
        ctrlGrupo = null;


    }//GEN-LAST:event_btnSalvarGrupoActionPerformed

    private void voltarParaLista() {//
        this.dispose();
        FormListarGrupos fg = new FormListarGrupos();
        fg.setVisible(true);
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
            java.util.logging.Logger.getLogger(FormSalvarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSalvarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSalvarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSalvarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSalvarGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarGrupo;
    private javax.swing.JButton btnSalvarGrupo;
    private javax.swing.JComboBox cmbEvento;
    private javax.swing.JComboBox cmbTurma;
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
/**
 * COLOCANDO OS DADOS DA TURMA DO BANCO NO COMBOBOX
 */
//        List<Turma> listaTurma = new ArrayList();
//        TurmaDAO daoTurma = new TurmaDAO();
//        listaTurma = daoTurma.listar();
//        for (Turma t : listaTurma) {
//            cmbTurma.addItem(t.getNomTurma());
//        }

/**
 * COLOCANDO OS DADOS DO EVENTO DO BANCO NO COMBOBOX
 */
//        List<Evento> listaEvento = new ArrayList();
//        EventoDAO daoEvento = new EventoDAO();
//        listaEvento = daoEvento.listar();
//        for (Evento e : listaEvento) {
//            cmbEvento.addItem(e.getNomEvento());
//        }
