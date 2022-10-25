/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacaoEspecialidade;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class DailogEspecialidade extends javax.swing.JDialog {
    
    private TipoOperacaoEspecialidade tipoOperacaoEspecialidade;
    private Especialidade especialidade;
    
    public DailogEspecialidade(
          java.awt.Frame parent,
            boolean modal,
            TipoOperacaoEspecialidade tipoOperacaoEspecialidade,
            Especialidade especialidade){
            
            super(parent, modal);
            initComponents();
            this.tipoOperacaoEspecialidade = tipoOperacaoEspecialidade;
            this.especialidade = especialidade;
            
            if (this.tipoOperacaoEspecialidade == TipoOperacaoEspecialidade.ALTERAR){
                preencherFormularioEspecialidade();
            }
        }
    
    private void preencherFormularioEspecialidade(){
        labelTitulo.setText("Especialidade " + tipoOperacaoEspecialidade);
        labelIcon.setIcon(new ImageIcon("C:\\Users\\22282099\\Desktop\\Nova pasta\\projetos NetBeans\\projetoAgendaNetBeans\\src\\br\\senai\\sp\\jandira\\imagens\\.png"));
        labelIcon.setBounds(20, 20, 80, 80);
        fieldCodigo.setText(especialidade.getCodigoEspecialiade().toString());
        fieldNomeEspecialidade.setText(especialidade.getNomeEspecialidade());
        fieldDescricaoEspecialidade.setText(especialidade.getDescricao());
    }
    
    private void atualizarEspecialidade(){
        especialidade.setNomeEspecialidade(fieldNomeEspecialidade.getText());
        especialidade.setDescricao(fieldDescricaoEspecialidade.getText());
        EspecialidadeDAO.atualizarEspecialidade(especialidade);
        JOptionPane.showMessageDialog(null,
                "Especialidade atualizada com sucesso!",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void gravarEspecialidade(){
        Especialidade especialidade = new Especialidade();
        especialidade.setNomeEspecialidade(fieldNomeEspecialidade.getText());
        especialidade.setDescricao(fieldDescricaoEspecialidade.getText());
        especialidade.setNomeEspecialidade(fieldDescricaoEspecialidade.getText());
        especialidade.setDescricao(fieldDescricaoEspecialidade.getText());
        
        if (validarEspecialidade()){
            
            EspecialidadeDAO.gravarEspecialidade(especialidade);
            JOptionPane.showMessageDialog(this,
                    "Especialidade gravada com sucesso",
                    "Especialidade",
                    JOptionPane.QUESTION_MESSAGE);
            
            dispose();
        }
    }
    
    private boolean validarEspecialidade(){
        if(fieldNomeEspecialidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "O nome da especialidade esTá vazio! Por favor preencher",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            
            fieldNomeEspecialidade.requestFocus();
            
            return false;
        }
        
        if (fieldDescricaoEspecialidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "A descrição da especialidade está vazio! Por favor preencher!",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            
            fieldDescricaoEspecialidade.requestFocus();
            
            return false;
        }
        return true;
    }
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHome = new javax.swing.JPanel();
        panelEspecialidade = new javax.swing.JLabel();
        panelDescricaoEspecialidade = new javax.swing.JLabel();
        panelCodigo = new javax.swing.JLabel();
        panelNomeEspecialidade = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        fieldDescricaoEspecialidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonSair1 = new javax.swing.JButton();
        fieldNomeEspecialidade = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(255, 4, 61));
        panelHome.setLayout(null);

        panelEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        panelEspecialidade.setForeground(new java.awt.Color(255, 4, 61));
        panelEspecialidade.setText("Detalhes da Especialidade:");
        panelHome.add(panelEspecialidade);
        panelEspecialidade.setBounds(30, 20, 300, 30);

        panelDescricaoEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelDescricaoEspecialidade.setText("Descrição da Especialidade");
        panelHome.add(panelDescricaoEspecialidade);
        panelDescricaoEspecialidade.setBounds(30, 240, 240, 16);

        panelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCodigo.setText("Código:");
        panelHome.add(panelCodigo);
        panelCodigo.setBounds(30, 70, 240, 20);

        panelNomeEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelNomeEspecialidade.setText("Nome da Especialidade");
        panelHome.add(panelNomeEspecialidade);
        panelNomeEspecialidade.setBounds(30, 150, 240, 16);

        fieldCodigo.setEditable(false);
        fieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodigoActionPerformed(evt);
            }
        });
        panelHome.add(fieldCodigo);
        fieldCodigo.setBounds(30, 100, 180, 40);

        fieldDescricaoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescricaoEspecialidadeActionPerformed(evt);
            }
        });
        panelHome.add(fieldDescricaoEspecialidade);
        fieldDescricaoEspecialidade.setBounds(30, 270, 540, 40);

        buttonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/diskette.png"))); // NOI18N
        buttonSalvar.setToolTipText("Sair do sistema");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelHome.add(buttonSalvar);
        buttonSalvar.setBounds(690, 290, 80, 60);

        buttonSair1.setForeground(new java.awt.Color(124, 145, 254));
        buttonSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit32.png"))); // NOI18N
        buttonSair1.setToolTipText("Sair do sistema");
        buttonSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSair1ActionPerformed(evt);
            }
        });
        panelHome.add(buttonSair1);
        buttonSair1.setBounds(820, 290, 80, 60);

        fieldNomeEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeEspecialidadeActionPerformed(evt);
            }
        });
        panelHome.add(fieldNomeEspecialidade);
        fieldNomeEspecialidade.setBounds(30, 180, 540, 40);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 120, 950, 380);

        jPanel3.setBackground(new java.awt.Color(255, 4, 61));
        jPanel3.setLayout(null);

        labelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTitulo.setText("Especialidade - Adicionar");
        jPanel3.add(labelTitulo);
        labelTitulo.setBounds(120, 30, 460, 40);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cuidados-de-saude (1).png"))); // NOI18N
        jPanel3.add(labelIcon);
        labelIcon.setBounds(20, 20, 80, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 980, 110);

        setBounds(0, 0, 996, 595);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodigoActionPerformed

    private void fieldDescricaoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescricaoEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDescricaoEspecialidadeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if(tipoOperacaoEspecialidade == tipoOperacaoEspecialidade.ADICIONAR){
            gravarEspecialidade();
        } else {
            atualizarEspecialidade();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSair1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSair1ActionPerformed

    private void fieldNomeEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeEspecialidadeActionPerformed

    }//GEN-LAST:event_fieldNomeEspecialidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSair1;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldDescricaoEspecialidade;
    private javax.swing.JTextField fieldNomeEspecialidade;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel panelCodigo;
    private javax.swing.JLabel panelDescricaoEspecialidade;
    private javax.swing.JLabel panelEspecialidade;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel panelNomeEspecialidade;
    // End of variables declaration//GEN-END:variables
}
