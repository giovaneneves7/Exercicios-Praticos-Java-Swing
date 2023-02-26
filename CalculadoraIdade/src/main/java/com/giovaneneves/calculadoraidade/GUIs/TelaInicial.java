package com.giovaneneves.calculadoraidade.GUIs;

//<!--Imports-->//

import java.awt.Color;


//<!--Fim Imports-->//
/**
 *
 * @author GiovaneNeves
 */
public class TelaInicial extends javax.swing.JFrame {

    
    //<!--Carrega os componentes da TelaInicial-->//
    public TelaInicial() {
        initComponents();
    }
    //<!--Fim do Metódo-->//

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_TelaInicial = new javax.swing.JPanel();
        btnSair_TelaInicial = new javax.swing.JButton();
        txtAnoNascimento_TelaInicial = new javax.swing.JTextField();
        lblAnoNascimento_TelaInicial = new javax.swing.JLabel();
        txtAnoAtual_TelaInicial = new javax.swing.JTextField();
        lblAnoAtual_TelaInicial = new javax.swing.JLabel();
        btnCalcular_TelaInicial = new javax.swing.JButton();
        divSeparadorAnoAtual = new javax.swing.JSeparator();
        divSeparadorAnoNascimento = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblResultado_TelaInicial = new javax.swing.JLabel();
        lblUsuarioIcon_TelaInicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_TelaInicial.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_TelaInicial.setLayout(null);

        btnSair_TelaInicial.setBackground(new java.awt.Color(255, 0, 51));
        btnSair_TelaInicial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSair_TelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        btnSair_TelaInicial.setText("X");
        btnSair_TelaInicial.setFocusPainted(false);
        btnSair_TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair_TelaInicialActionPerformed(evt);
            }
        });
        jPanel_TelaInicial.add(btnSair_TelaInicial);
        btnSair_TelaInicial.setBounds(608, 6, 60, 40);

        txtAnoNascimento_TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoNascimento_TelaInicialActionPerformed(evt);
            }
        });
        jPanel_TelaInicial.add(txtAnoNascimento_TelaInicial);
        txtAnoNascimento_TelaInicial.setBounds(60, 170, 250, 30);

        lblAnoNascimento_TelaInicial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAnoNascimento_TelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        lblAnoNascimento_TelaInicial.setText("Insira o Ano do seu Nascimento:");
        jPanel_TelaInicial.add(lblAnoNascimento_TelaInicial);
        lblAnoNascimento_TelaInicial.setBounds(80, 130, 250, 40);
        jPanel_TelaInicial.add(txtAnoAtual_TelaInicial);
        txtAnoAtual_TelaInicial.setBounds(60, 100, 250, 30);

        lblAnoAtual_TelaInicial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAnoAtual_TelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        lblAnoAtual_TelaInicial.setText("Insira o Ano Atual:");
        jPanel_TelaInicial.add(lblAnoAtual_TelaInicial);
        lblAnoAtual_TelaInicial.setBounds(130, 60, 150, 40);

        btnCalcular_TelaInicial.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEje1poL_bqSHz80JUPfCj99gzOSKuoy5CgFPpGCsQ4fAWdq5Md0JGfch9DZ9dTI5jGMRxxQbh_VtHkybZlMkpbXO1r_P19kL2d4ZYRU9hYi6e9V4ToouJtEv7K1qp7sP2qpWN7WfSEt6MP5V0kyIdTL5uAP_g_WToS1gOiQb3IW2CY9cIfG-Ee-wef_Ow/s32/calculadoraIcon.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnCalcular_TelaInicial.setText("Calcular");
        btnCalcular_TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular_TelaInicialActionPerformed(evt);
            }
        });
        jPanel_TelaInicial.add(btnCalcular_TelaInicial);
        btnCalcular_TelaInicial.setBounds(90, 220, 200, 40);
        jPanel_TelaInicial.add(divSeparadorAnoAtual);
        divSeparadorAnoAtual.setBounds(90, 160, 200, 60);
        jPanel_TelaInicial.add(divSeparadorAnoNascimento);
        divSeparadorAnoNascimento.setBounds(90, 90, 200, 40);

        jPanel1.setLayout(null);
        jPanel_TelaInicial.add(jPanel1);
        jPanel1.setBounds(330, 30, 0, 240);

        lblResultado_TelaInicial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblResultado_TelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_TelaInicial.add(lblResultado_TelaInicial);
        lblResultado_TelaInicial.setBounds(390, 90, 160, 50);

        lblUsuarioIcon_TelaInicial.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjUwsl63HBv-4o1GYgR-F42MxT15xsd-uGTG9SwCeTHawHglDjShBBQ2zJflCumZNhE0oC9PBIdsSsbYyEVFeWerYKrlMjQYTTrOa-EeAKSUE4Cl3k5jNQ8-QrmrceMvYs6Uac9HJCSrEgJm7uDcs5JDJqsF9azrL5YulfLQotK12XerwiAXLnsd7Nfpw/s64/usuarioIcon.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel_TelaInicial.add(lblUsuarioIcon_TelaInicial);
        lblUsuarioIcon_TelaInicial.setBounds(170, 10, 70, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_TelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_TelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(674, 298));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //<!--Evento para fechar a tela e encerrar o programa-->//
    private void btnSair_TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair_TelaInicialActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSair_TelaInicialActionPerformed
    //<!--Fim do Evento-->//
    
    private void txtAnoNascimento_TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoNascimento_TelaInicialActionPerformed
       
    }//GEN-LAST:event_txtAnoNascimento_TelaInicialActionPerformed

    //<!--Evento para calcular a idade do usuário-->//
    private void btnCalcular_TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular_TelaInicialActionPerformed
       
        int anoAtual = Integer.parseInt(txtAnoAtual_TelaInicial.getText());
        int anoNascimento = Integer.parseInt(txtAnoNascimento_TelaInicial.getText());
        int soma = (anoAtual - anoNascimento);

        lblResultado_TelaInicial.setText("Você tem: \n" + soma + " Anos!");
        
    }//GEN-LAST:event_btnCalcular_TelaInicialActionPerformed
    //<!--Fim do Evento-->//
    
    //<!--Metódo principal da Classe-->//
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    //<!--Fim do Metódo principal-->//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular_TelaInicial;
    private javax.swing.JButton btnSair_TelaInicial;
    private javax.swing.JSeparator divSeparadorAnoAtual;
    private javax.swing.JSeparator divSeparadorAnoNascimento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_TelaInicial;
    private javax.swing.JLabel lblAnoAtual_TelaInicial;
    private javax.swing.JLabel lblAnoNascimento_TelaInicial;
    private javax.swing.JLabel lblResultado_TelaInicial;
    private javax.swing.JLabel lblUsuarioIcon_TelaInicial;
    private javax.swing.JTextField txtAnoAtual_TelaInicial;
    private javax.swing.JTextField txtAnoNascimento_TelaInicial;
    // End of variables declaration//GEN-END:variables
}
