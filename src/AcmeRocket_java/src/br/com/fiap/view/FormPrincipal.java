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
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormAluno
     */
    public FormPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblGrupos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblEventos = new javax.swing.JLabel();
        lblPeriodos = new javax.swing.JLabel();
        lblTurmas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAluno = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblLancamentos = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblRanking = new javax.swing.JLabel();
        lblSobre = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acme Rocket");
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(723, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(723, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel5.setText("Sistema de Controle Para Space Cup Fiap");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 660, 90));

        lblGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-03 51x51.png"))); // NOI18N
        lblGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGruposMouseClicked(evt);
            }
        });
        getContentPane().add(lblGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Evento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel4.setText("Gerenciamento de Eventos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Período");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 50, -1));

        jLabel17.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel17.setText("Gerenciamento de períodos");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel20.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Turmas");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 50, -1));

        jLabel23.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel23.setText("Gerenciamento de turmas");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Grupos");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 50, -1));

        jLabel27.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel27.setText("Gerenciamento de grupos");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        lblEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-06 51x51.png"))); // NOI18N
        lblEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEventosMouseClicked(evt);
            }
        });
        getContentPane().add(lblEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        lblPeriodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-01 51x51.png"))); // NOI18N
        lblPeriodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPeriodosMouseClicked(evt);
            }
        });
        getContentPane().add(lblPeriodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        lblTurmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-02 51x51.png"))); // NOI18N
        lblTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTurmasMouseClicked(evt);
            }
        });
        getContentPane().add(lblTurmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alunos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 50, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel6.setText("Gerenciamento de alunos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        lblAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-04 51x51.png"))); // NOI18N
        lblAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlunoMouseClicked(evt);
            }
        });
        getContentPane().add(lblAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Lançamento");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 80, -1));

        jLabel18.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel18.setText("Gerenciamento de lançamento");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        lblLancamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-05 51x51.png"))); // NOI18N
        lblLancamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLancamentosMouseClicked(evt);
            }
        });
        getContentPane().add(lblLancamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Ranking");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 50, -1));

        jLabel24.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel24.setText("Informações sobre o grupo");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        lblRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-07 51x51.png"))); // NOI18N
        lblRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRankingMouseClicked(evt);
            }
        });
        getContentPane().add(lblRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        lblSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-08 51x51.png"))); // NOI18N
        lblSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSobreMouseClicked(evt);
            }
        });
        getContentPane().add(lblSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        jLabel35.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Sobre");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 50, -1));

        jLabel25.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel25.setText("Visualização de ranking");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/br.com.fiap.images.png"))); // NOI18N
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventosMouseClicked
        //CHAMANDO FORMULARIO EVENTO
        FormEvento fe = new FormEvento();
        this.dispose();
        fe.setVisible(true);
        
    }//GEN-LAST:event_lblEventosMouseClicked

    private void lblPeriodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPeriodosMouseClicked
        //CHAMANDO FORMULARIO PERIODO
        FormPeriodo fp = new FormPeriodo();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_lblPeriodosMouseClicked

    private void lblTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTurmasMouseClicked
        //CHAMANDO FORMULARIO TURMA
        FormTurmas ft = new FormTurmas();
        this.dispose();
        ft.setVisible(true);
    }//GEN-LAST:event_lblTurmasMouseClicked

    private void lblGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGruposMouseClicked
        //CHAMANDO FORMULARIO GRUPO
        FormGrupos fg = new FormGrupos();
        this.dispose();
        fg.setVisible(true);
    }//GEN-LAST:event_lblGruposMouseClicked

    private void lblAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlunoMouseClicked
        //CHAMANDO FORMULARIO ALUNO
        FormAluno fa = new FormAluno();
        this.dispose();
        fa.setVisible(true);
    }//GEN-LAST:event_lblAlunoMouseClicked

    private void lblLancamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLancamentosMouseClicked
        //CHAMANDO FORMULARIO LANÇAMENTO
        FormLancamento fl = new FormLancamento();
        this.dispose();
        fl.setVisible(true);
    }//GEN-LAST:event_lblLancamentosMouseClicked

    private void lblRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRankingMouseClicked
        //CHAMANDO FORMULARIO RANKING
        FormRanking fr = new FormRanking();
        this.dispose();
        fr.setVisible(true);
    }//GEN-LAST:event_lblRankingMouseClicked

    private void lblSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSobreMouseClicked
        //CHAMANDO FORMULARIO SOBRE
        FormSobre fs = new FormSobre();
        this.dispose();
        fs.setVisible(true);
    }//GEN-LAST:event_lblSobreMouseClicked

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblEventos;
    private javax.swing.JLabel lblGrupos;
    private javax.swing.JLabel lblLancamentos;
    private javax.swing.JLabel lblPeriodos;
    private javax.swing.JLabel lblRanking;
    private javax.swing.JLabel lblSobre;
    private javax.swing.JLabel lblTurmas;
    // End of variables declaration//GEN-END:variables
}
