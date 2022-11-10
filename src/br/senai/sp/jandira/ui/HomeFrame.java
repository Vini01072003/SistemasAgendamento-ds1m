package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.ui.PanelEspecialidades;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import br.senai.sp.jandira.ui.*;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.getListaPlanosDeSaude();
        EspecialidadeDAO.ListagetEspecialidades();
        initPanels();
    }
    
    
    //Atributos da Classe
    PanelPlanosDeSaude panelPlanosDeSaude = new PanelPlanosDeSaude();
    
    //Criando Constantes das medidas do projeto
    private final int POS_X = 10;
    private final int POS_Y = 180;
    private final int LARGURA = 945;
    private final int ALTURA = 370;
    
    //Atributos da Classe
    PanelEspecialidades panelEspecialidades = new PanelEspecialidades();
    
    //Criando Constantes das medidas do projeto
    private final int POSX = 11;
    private final int POSY = 180;
    private final int LARGURAES = 945;
    private final int ALTURAES = 370;
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonHome = new javax.swing.JToggleButton();
        panelHome = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JLabel();
        panelDescricao = new javax.swing.JLabel();
        panelDadosContato = new javax.swing.JLabel();
        panelEmail = new javax.swing.JLabel();
        panelTelefone = new javax.swing.JLabel();
        panelSite = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 4, 61));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\22282103\\Documents\\SistemasAgendamento-ds1m\\src\\br\\senai\\sp\\jandira\\imagens\\calendar.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setBackground(new java.awt.Color(246, 246, 246));
        buttonSair.setForeground(new java.awt.Color(124, 145, 254));
        buttonSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\22282103\\Downloads\\sair.png")); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(875, 100, 80, 60);

        buttonAgenda.setBackground(new java.awt.Color(246, 246, 246));
        buttonAgenda.setForeground(new java.awt.Color(51, 0, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\22282103\\Downloads\\calendario.png")); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(110, 100, 80, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(51, 0, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon("C:\\Users\\22282103\\Downloads\\plano-de-saude (2).png")); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(470, 100, 80, 60);

        buttonEspecialidades.setBackground(new java.awt.Color(246, 246, 246));
        buttonEspecialidades.setForeground(new java.awt.Color(51, 0, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon("C:\\Users\\22282103\\Downloads\\registo-medico (1).png")); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(380, 100, 80, 60);

        buttonPacientes.setBackground(new java.awt.Color(246, 246, 246));
        buttonPacientes.setForeground(new java.awt.Color(51, 0, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\22282103\\Pictures\\Saved Pictures\\paciente (2).png")); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(200, 100, 80, 60);

        buttonMedicos.setBackground(new java.awt.Color(246, 246, 246));
        buttonMedicos.setForeground(new java.awt.Color(51, 0, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon("C:\\Users\\22282103\\Pictures\\Saved Pictures\\medico (2).png")); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(290, 100, 80, 60);

        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        buttonHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\22282103\\Pictures\\Saved Pictures\\casa.png")); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 100, 80, 60);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        panelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        panelTitulo.setForeground(new java.awt.Color(0, 153, 153));
        panelTitulo.setText("SISACON");
        panelHome.add(panelTitulo);
        panelTitulo.setBounds(40, 20, 320, 50);

        panelDescricao.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        panelDescricao.setText("Sistema para Agendamento de Consulta");
        panelHome.add(panelDescricao);
        panelDescricao.setBounds(40, 90, 360, 25);

        panelDadosContato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        panelDadosContato.setForeground(new java.awt.Color(0, 153, 153));
        panelDadosContato.setText("Dados para contato:");
        panelHome.add(panelDadosContato);
        panelDadosContato.setBounds(640, 200, 180, 20);

        panelEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        panelEmail.setText("Email: Sisacon.yoshie8075@uorak.com");
        panelHome.add(panelEmail);
        panelEmail.setBounds(640, 230, 251, 20);

        panelTelefone.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        panelTelefone.setText("Telefone: (11) 976543389");
        panelHome.add(panelTelefone);
        panelTelefone.setBounds(640, 260, 240, 20);

        panelSite.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        panelSite.setText("Site: sisacon.com");
        panelHome.add(panelSite);
        panelSite.setBounds(640, 290, 240, 20);

        jLabel3.setForeground(new java.awt.Color(255, 4, 61));
        jLabel3.setText("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        panelHome.add(jLabel3);
        jLabel3.setBounds(40, 130, 900, 20);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 180, 945, 370);

        setBounds(0, 0, 989, 599);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelHome.setVisible(true);
        panelPlanosDeSaude.setVisible(false);
        buttonPlanosDeSaude.setBackground(new java.awt.Color(255,4,61));
        buttonHome.setBackground(new java.awt.Color(255,4,61));
        buttonEspecialidades.setBackground(new java.awt.Color(255,4,61));
        
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed

        panelHome.setVisible(false);
        panelPlanosDeSaude.setVisible(true);
        buttonPlanosDeSaude.setBackground(new java.awt.Color(246,246,246));
        buttonHome.setBackground(new java.awt.Color(255,4,61));
        buttonEspecialidades.setBackground(new java.awt.Color(255,4,61));
        
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
            panelHome.setVisible(false);
            panelPlanosDeSaude.setVisible(false);
            panelEspecialidades.setVisible(true);
            buttonPlanosDeSaude.setBackground(new java.awt.Color(255,4,61));
            buttonHome.setBackground(new java.awt.Color(246,246,246));
            buttonEspecialidades.setBackground(new java.awt.Color(255,4,61));
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JToggleButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel panelDadosContato;
    private javax.swing.JLabel panelDescricao;
    private javax.swing.JLabel panelEmail;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel panelSite;
    private javax.swing.JLabel panelTelefone;
    private javax.swing.JLabel panelTitulo;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        panelPlanosDeSaude = new PanelPlanosDeSaude();
        panelPlanosDeSaude.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setVisible(false);
        
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(POSX, POSY, LARGURAES, ALTURAES);
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        
                
        
        
    }

}
