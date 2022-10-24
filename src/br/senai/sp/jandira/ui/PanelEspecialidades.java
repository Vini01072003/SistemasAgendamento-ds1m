/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.model.TipoOperacaoEspecialidade;
import br.senai.sp.jandira.ui.DailogEspecialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282099
 */
public class PanelEspecialidades extends javax.swing.JPanel {
    int linha;
    
    public PanelEspecialidades() {
        initComponents();
        criarTabelaEspecialidades();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonAlterarEspecialidade = new javax.swing.JButton();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setToolTipText("");
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(228, 0, 124));
        jLabel3.setText("Especialidade");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableEspecialidades);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 910, 230);

        buttonAlterarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarEspecialidade.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAlterarEspecialidade);
        buttonAlterarEspecialidade.setBounds(770, 290, 70, 60);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(690, 290, 70, 60);

        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(850, 290, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAlterarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEspecialidadeActionPerformed
        linha = tableEspecialidades.getSelectedRow();

        if (linha != -1){
            editar();
        }else{
            JOptionPane.showMessageDialog(this,
                "Selecione a Especialidade que deseja alterar",
                "Especialidade",
                JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_buttonAlterarEspecialidadeActionPerformed

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed

        //Obtemos o índice de linhas selecionadas na tabela
        linha = tableEspecialidades.getSelectedRow();

        //Verficamos se a linha é diferente de -1
        //Caso for -1, significa que o usuário não selecionou nada
        if (linha != -1){
            excluir(linha);
        }else{
            JOptionPane.showMessageDialog(this,
                "Você não selecionou nenhuma linha",
                "Exclusão da Especialidade",
                JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed

        DailogEspecialidade dialogEspecialidade = new DailogEspecialidade(
            null,
            true,
            TipoOperacaoEspecialidade.ADICIONAR,
            null);

        dialogEspecialidade.setVisible(true);
        criarTabelaEspecialidades();

    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    
    public void excluir(int a){
            
            int resposta = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja excluir essa Especialidade?",
                "Exclusão Especialidade",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            
            System.out.println(resposta);           
           
            if(resposta == 0){  
                
                EspecialidadeDAO.excluirEspecialidade(returnCodigo());
                criarTabelaEspecialidades();
         }
        }   
    
    private Integer returnCodigo(){
            String codigoString =  tableEspecialidades.getValueAt(linha, 0).toString();
            return Integer.valueOf(codigoString);
        }
           
     private void editar(){
    
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(returnCodigo());
        
         DailogEspecialidade dialogEspecialidade = new DailogEspecialidade(
                null, 
                true, 
                TipoOperacaoEspecialidade.ALTERAR,
                especialidade);
                 
        dialogEspecialidade.setVisible(true);
        
        criarTabelaEspecialidades();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonAlterarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidades(){
        tableEspecialidades.setModel(EspecialidadeDAO.getTableEspecialidades());
        
        //Desativando o redimensionamento do JTable
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        //Definindo a largura de cada coluna
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(400);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(367);
        
        //Impedir/Bloquear a movimenação de colunas pelo usuário
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição de células
        tableEspecialidades.setDefaultEditor(Object.class, null);
    }
    
}