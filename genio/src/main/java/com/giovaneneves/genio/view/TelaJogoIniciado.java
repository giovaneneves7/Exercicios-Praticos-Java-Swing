package com.giovaneneves.genio.view;

import com.giovaneneves.genio.model.Jogador;

/**
 *
 * @author GiovaneNeves
 */
public class TelaJogoIniciado extends javax.swing.JFrame {

    
    public static Jogador jogador;
    /**
     * Creates new form TelaJogoIniciado
     */
    public TelaJogoIniciado(Jogador jogador) {
        
        this.jogador = jogador;
        
        initComponents();
        componentesPersonalizados();
    }

    
    //Edita os componentes padrões
    private void componentesPersonalizados(){
    
        lblBalao.setText("<html>Eu vou pensar em <br> um número entre 1 e 5 <br> Tente adivinhar! </html>");
        lblNomeJogador.setText(jogador.getNome());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlTelaJogoIniciado = new javax.swing.JPanel();
        spinPalpite = new javax.swing.JSpinner();
        btnPalpitar = new javax.swing.JButton();
        lblBalao = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblAcertos = new javax.swing.JLabel();
        lblNumeroAcertos = new javax.swing.JLabel();
        lblJogador = new javax.swing.JLabel();
        lblNomeJogador = new javax.swing.JLabel();
        lblImagemBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpnlTelaJogoIniciado.setLayout(null);

        spinPalpite.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spinPalpite.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jpnlTelaJogoIniciado.add(spinPalpite);
        spinPalpite.setBounds(60, 180, 90, 30);

        btnPalpitar.setBackground(new java.awt.Color(255, 102, 0));
        btnPalpitar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPalpitar.setForeground(new java.awt.Color(255, 255, 255));
        btnPalpitar.setText("Palpitar");
        btnPalpitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpitarActionPerformed(evt);
            }
        });
        jpnlTelaJogoIniciado.add(btnPalpitar);
        btnPalpitar.setBounds(60, 220, 90, 50);

        lblBalao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jpnlTelaJogoIniciado.add(lblBalao);
        lblBalao.setBounds(200, 30, 200, 100);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpnlTelaJogoIniciado.add(jButton1);
        jButton1.setBounds(10, 10, 100, 40);

        lblAcertos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAcertos.setText("Acertos:");
        jpnlTelaJogoIniciado.add(lblAcertos);
        lblAcertos.setBounds(60, 280, 80, 15);

        lblNumeroAcertos.setText("0");
        jpnlTelaJogoIniciado.add(lblNumeroAcertos);
        lblNumeroAcertos.setBounds(110, 280, 70, 16);

        lblJogador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblJogador.setText("Jogador:");
        jpnlTelaJogoIniciado.add(lblJogador);
        lblJogador.setBounds(170, 280, 80, 15);

        lblNomeJogador.setText("null");
        jpnlTelaJogoIniciado.add(lblNomeJogador);
        lblNomeJogador.setBounds(230, 280, 150, 16);

        lblImagemBackground.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjqqRvqb8SkaitZT4yKYQb75mkeYqyMJ2WnArKW0mfmBgKRCEaEY5bKgyaSDEkOL4lqx_J6mgtgRn_NfKEVG2YxoxwlC87qy8YuysWBxnW_NbbWfcqhBbFjJ_NQ4GEwBme6ELbY7IBXVbDdJSDb6ffXmkmuMBqigSlQui-WCzAMcysZSXr4qKXm2R0xLA/s576/telaJogoIniciado.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jpnlTelaJogoIniciado.add(lblImagemBackground);
        lblImagemBackground.setBounds(0, 0, 576, 305);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlTelaJogoIniciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlTelaJogoIniciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(576, 305));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpitarActionPerformed
        
        int limite = 5;
        int numero = (int) (Math.random() * limite + 1);
        int palpite = (int) spinPalpite.getValue();
        
        //Verifica se o palpite é igaul ao número pensado
        String resultado = (palpite == numero) ? "Acertou!" : "Errou! O número era " + numero;
        
        if(resultado.contains("Acertou!")) jogador.setAcertos((jogador.getAcertos() + 1));
        
        lblBalao.setText(resultado);
        lblNumeroAcertos.setText(String.valueOf(jogador.getAcertos()));
        
    }//GEN-LAST:event_btnPalpitarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Volta para a tela inicial
        new TelaInicial().setVisible(true);
        //Fecha a tela atual
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogoIniciado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogoIniciado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogoIniciado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogoIniciado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaJogoIniciado(jogador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpitar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jpnlTelaJogoIniciado;
    private javax.swing.JLabel lblAcertos;
    private javax.swing.JLabel lblBalao;
    private javax.swing.JLabel lblImagemBackground;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblNomeJogador;
    private javax.swing.JLabel lblNumeroAcertos;
    private javax.swing.JSpinner spinPalpite;
    // End of variables declaration//GEN-END:variables
}
