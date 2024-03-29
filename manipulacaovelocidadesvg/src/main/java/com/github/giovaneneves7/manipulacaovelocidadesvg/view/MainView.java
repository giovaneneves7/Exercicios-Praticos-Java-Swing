/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.github.giovaneneves7.manipulacaovelocidadesvg.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovane Neves
 */
public class MainView extends javax.swing.JFrame {

    private boolean alavancaLigada = false;
    
    private ImageIcon ALAVANCA_ESTATICA = new ImageIcon(getClass().getResource("/images/alavanca.png"));
    
    private ImageIcon ALAVANCA_VELOCIDADE_1 = new ImageIcon(getClass().getResource("/gifs/alavanca_vel1.gif"));
    private ImageIcon ALAVANCA_VELOCIDADE_2 = new ImageIcon(getClass().getResource("/gifs/alavanca_vel2.gif"));
    private ImageIcon ALAVANCA_VELOCIDADE_3 = new ImageIcon(getClass().getResource("/gifs/alavanca_vel3.gif"));
    private ImageIcon ALAVANCA_VELOCIDADE_4 = new ImageIcon(getClass().getResource("/gifs/alavanca_vel4.gif"));
    
    private Color BTN_DESLIGAR_COLOR;
    private Color BTN_LIGAR_COLOR;
    
    public MainView() {
        
        initComponents();
        customInit();
        
    }

    private void customInit(){
        
        BTN_DESLIGAR_COLOR = btnDesligarAlavanca.getBackground();
        BTN_LIGAR_COLOR = btnLigarAlavanca.getBackground();
        
    }
    
    private void ligarAlavanca(){
        
      if(alavancaLigada)
          return;
      
      alavancaLigada = !alavancaLigada;
      
      spnControladorVelocidade.setValue(1);
      lblAlavanca.setIcon(ALAVANCA_VELOCIDADE_1);
      btnLigarAlavanca.setBackground(Color.green);
      btnDesligarAlavanca.setBackground(BTN_DESLIGAR_COLOR);
      
    }
    
    private void desligarAlavanca(){
      
        if(!alavancaLigada)
          return;
      
      
      spnControladorVelocidade.setValue(0);
      lblAlavanca.setIcon(ALAVANCA_ESTATICA);
      btnDesligarAlavanca.setBackground(Color.red);
      btnLigarAlavanca.setBackground(BTN_LIGAR_COLOR);
      alavancaLigada = !alavancaLigada;
        
    }
    
    private void aumentarVelocidade(int vel){
        
        switch(vel){
            case 2: 
                lblAlavanca.setIcon(ALAVANCA_VELOCIDADE_2);
                break;
            case 3:
                lblAlavanca.setIcon(ALAVANCA_VELOCIDADE_3);
                break;
            case 4:
                lblAlavanca.setIcon(ALAVANCA_VELOCIDADE_4);
                break;
                
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblAlavanca = new javax.swing.JLabel();
        btnLigarAlavanca = new javax.swing.JButton();
        btnDesligarAlavanca = new javax.swing.JButton();
        spnControladorVelocidade = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));

        lblAlavanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alavanca.png"))); // NOI18N

        btnLigarAlavanca.setBackground(new java.awt.Color(0, 102, 0));
        btnLigarAlavanca.setForeground(new java.awt.Color(255, 255, 255));
        btnLigarAlavanca.setText("ON");
        btnLigarAlavanca.setBorderPainted(false);
        btnLigarAlavanca.setFocusPainted(false);
        btnLigarAlavanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigarAlavancaActionPerformed(evt);
            }
        });

        btnDesligarAlavanca.setBackground(new java.awt.Color(102, 0, 0));
        btnDesligarAlavanca.setForeground(new java.awt.Color(255, 255, 255));
        btnDesligarAlavanca.setText("OFF");
        btnDesligarAlavanca.setBorderPainted(false);
        btnDesligarAlavanca.setFocusPainted(false);
        btnDesligarAlavanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesligarAlavancaActionPerformed(evt);
            }
        });

        spnControladorVelocidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        spnControladorVelocidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnControladorVelocidadeStateChanged(evt);
            }
        });
        spnControladorVelocidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnControladorVelocidadeMouseClicked(evt);
            }
        });
        spnControladorVelocidade.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                spnControladorVelocidadeCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        spnControladorVelocidade.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnControladorVelocidadePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(spnControladorVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlavanca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLigarAlavanca)
                    .addComponent(btnDesligarAlavanca))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblAlavanca, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnLigarAlavanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDesligarAlavanca)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(spnControladorVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );

        getContentPane().add(pnlBackground);
        pnlBackground.setBounds(0, 0, 620, 230);

        setSize(new java.awt.Dimension(636, 238));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigarAlavancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigarAlavancaActionPerformed

        
      ligarAlavanca();
      
    }//GEN-LAST:event_btnLigarAlavancaActionPerformed

    private void btnDesligarAlavancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesligarAlavancaActionPerformed
        
        desligarAlavanca();
        
    }//GEN-LAST:event_btnDesligarAlavancaActionPerformed

    private void spnControladorVelocidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnControladorVelocidadeMouseClicked

        
    }//GEN-LAST:event_spnControladorVelocidadeMouseClicked

    private void spnControladorVelocidadeCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_spnControladorVelocidadeCaretPositionChanged
        
    }//GEN-LAST:event_spnControladorVelocidadeCaretPositionChanged

    private void spnControladorVelocidadePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnControladorVelocidadePropertyChange
        
    }//GEN-LAST:event_spnControladorVelocidadePropertyChange

    private void spnControladorVelocidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnControladorVelocidadeStateChanged
        
        if(!alavancaLigada){
            JOptionPane.showMessageDialog(null, "A alavanca deve estar ligada!", "Ops!", JOptionPane.ERROR_MESSAGE);
            spnControladorVelocidade.setValue(0);
            return;
        }
        
        System.out.println("Valor atual" + spnControladorVelocidade.getValue());
        
        aumentarVelocidade(Integer.parseInt(spnControladorVelocidade.getValue().toString()));
        
    }//GEN-LAST:event_spnControladorVelocidadeStateChanged

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesligarAlavanca;
    private javax.swing.JButton btnLigarAlavanca;
    private javax.swing.JLabel lblAlavanca;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JSpinner spnControladorVelocidade;
    // End of variables declaration//GEN-END:variables
}
