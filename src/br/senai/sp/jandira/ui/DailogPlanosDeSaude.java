/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282099
 */
public class DailogPlanosDeSaude extends javax.swing.JDialog {

    /**
     * Creates new form DailogPlanosDeSaude
     * @param parent
     * @param modal
     */
    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;
    
    public DailogPlanosDeSaude (
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude){
 
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;   
        
        if(tipoOperacao == TipoOperacao.ALTERAR){
            preencherFormulario();
        }
        
    }

    private void preencherFormulario(){
        labelTitulo.setText("Plano de Saúde " + tipoOperacao);
        labelIcon.setIcon(new ImageIcon("C:\\Users\\22282099\\Desktop\\Nova pasta\\projetos NetBeans\\projetoAgendaNetBeans\\src\\br\\senai\\sp\\jandira\\imagens\\edit32.png"));
        labelIcon.setBounds(20, 20, 80, 80);
        fieldCodigo.setText(planoDeSaude.getCodigo().toString());
        fieldOperadora1.setText(planoDeSaude.getOperadora());
        fieldTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());
                
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHome = new javax.swing.JPanel();
        panelDetalhes = new javax.swing.JLabel();
        panelTipoDoPlano = new javax.swing.JLabel();
        panelCodigo = new javax.swing.JLabel();
        panelOperadora = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        fieldTipoDoPlano = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonSair1 = new javax.swing.JButton();
        fieldOperadora1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        panelDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        panelDetalhes.setForeground(new java.awt.Color(255, 4, 61));
        panelDetalhes.setText("Detalhes do Plano de Saúde:");
        panelHome.add(panelDetalhes);
        panelDetalhes.setBounds(30, 20, 300, 30);

        panelTipoDoPlano.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelTipoDoPlano.setText("Tipo do Plano:");
        panelHome.add(panelTipoDoPlano);
        panelTipoDoPlano.setBounds(30, 240, 240, 16);

        panelCodigo.setBackground(new java.awt.Color(0, 0, 0));
        panelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCodigo.setText("Código:");
        panelHome.add(panelCodigo);
        panelCodigo.setBounds(30, 70, 240, 20);

        panelOperadora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelOperadora.setText("Nome da operadora:");
        panelHome.add(panelOperadora);
        panelOperadora.setBounds(30, 150, 240, 16);

        fieldCodigo.setEditable(false);
        fieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodigoActionPerformed(evt);
            }
        });
        panelHome.add(fieldCodigo);
        fieldCodigo.setBounds(30, 100, 180, 40);

        fieldTipoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTipoDoPlanoActionPerformed(evt);
            }
        });
        panelHome.add(fieldTipoDoPlano);
        fieldTipoDoPlano.setBounds(30, 270, 540, 40);

        buttonSalvar.setForeground(new java.awt.Color(124, 145, 254));
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

        fieldOperadora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldOperadora1ActionPerformed(evt);
            }
        });
        panelHome.add(fieldOperadora1);
        fieldOperadora1.setBounds(30, 180, 540, 40);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 120, 950, 380);

        jPanel3.setBackground(new java.awt.Color(255, 4, 61));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        labelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTitulo.setText("Plano de Saúde - Adicionar");
        jPanel3.add(labelTitulo);
        labelTitulo.setBounds(110, 30, 460, 40);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/health-insurance.png"))); // NOI18N
        jPanel3.add(labelIcon);
        labelIcon.setBounds(20, 20, 80, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 980, 110);

        setSize(new java.awt.Dimension(990, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodigoActionPerformed

    private void fieldTipoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTipoDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTipoDoPlanoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        if(tipoOperacao == TipoOperacao.ADICIONAR){
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed
     
    private void atualizar(){
        planoDeSaude.setOperadora(fieldOperadora1.getText());
        planoDeSaude.setTipoDoPlano(fieldTipoDoPlano.getText());
        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        JOptionPane.showMessageDialog(null,
                "Plano de Saúde ataulizado com sucesso!",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();  
    }
    
    
    private void gravar(){
        //Criar objeto plano de saude
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(fieldOperadora1.getText());
        planoDeSaude.setTipoDoPlano(fieldTipoDoPlano.getText());
        
        
        if (validarPlanoDeSaude()){
            
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            JOptionPane.showMessageDialog(this, 
                    "Plano de Saúde gravado com sucesso!",
                    "Plano De saude",
                    JOptionPane.WARNING_MESSAGE);
            
            dispose(); 
        }
    }
    
    
    
    private boolean validarPlanoDeSaude(){
        if (fieldOperadora1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Você não digitou nenhum plano de saude! Por favor, preencha com um!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
            
            fieldOperadora1.requestFocus();
            
            return false;
        }
        if (fieldTipoDoPlano.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Você não digitou nenhum tipo de plano! Por favor, preencha com um!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
            
            fieldTipoDoPlano.requestFocus();
            
            return false;    
        }
        return true;
        
    }
    
    
    private void buttonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSair1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSair1ActionPerformed

    private void fieldOperadora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldOperadora1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldOperadora1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSair1;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldOperadora1;
    private javax.swing.JTextField fieldTipoDoPlano;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel panelCodigo;
    private javax.swing.JLabel panelDetalhes;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel panelOperadora;
    private javax.swing.JLabel panelTipoDoPlano;
    // End of variables declaration//GEN-END:variables
}
