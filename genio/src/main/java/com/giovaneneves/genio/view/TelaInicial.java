package com.giovaneneves.genio.view;

import com.giovaneneves.genio.model.Jogador;

/**
 *
 * @author GiovaneNeves
 */
public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        
        initComponents();
        componentesPersonalizados();
    }
    
    private void componentesPersonalizados(){
        
        int limite = 999;
        int numeroAleatorio = (int) (Math.random() * limite + 111);
        
        txtNomeUsuario.setText("player" + numeroAleatorio);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlBackground = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnJogar = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JTextField();
        lblNomeUsuario = new javax.swing.JLabel();
        lblImagemBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpnlBackground.setLayout(null);

        btnSair.setBackground(new java.awt.Color(255, 102, 0));
        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("SAIR");
        btnSair.setFocusPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jpnlBackground.add(btnSair);
        btnSair.setBounds(100, 170, 240, 50);

        btnJogar.setBackground(new java.awt.Color(255, 102, 0));
        btnJogar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnJogar.setForeground(new java.awt.Color(255, 255, 255));
        btnJogar.setText("JOGAR");
        btnJogar.setFocusPainted(false);
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        jpnlBackground.add(btnJogar);
        btnJogar.setBounds(100, 100, 240, 50);
        jpnlBackground.add(txtNomeUsuario);
        txtNomeUsuario.setBounds(100, 60, 230, 22);

        lblNomeUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNomeUsuario.setText("Nome do jogador:");
        jpnlBackground.add(lblNomeUsuario);
        lblNomeUsuario.setBounds(100, 40, 130, 15);

        lblImagemBackground.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiq8ykF29fjbdYQDcP7HqA1GpTn7wUFyqEUX2EE8sRCARJmcQuaBBKPQA-JsE4NheUOqwN_AIqE8tdjT0yRizjKhNPfJa7F7RzdEcrYZz6SxdZOPKnsAY9vf5CQyNZEUjVoKrWjSyhhg_6TGaV-f1PRb0zaz3hNkeYbk9jvP3jndZJ8tUZ_aUjT4EmwoA/s576/tela-jogar.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jpnlBackground.add(lblImagemBackground);
        lblImagemBackground.setBounds(0, 0, 580, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(576, 305));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        //Fecha a aplicação
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        
        
        Jogador jogador = new Jogador();
        jogador.setNome(txtNomeUsuario.getText());
        
        //Chama a TelaJogoIniciado
        new TelaJogoIniciado(jogador).setVisible(true);
        
        //Fecha a tela atual
        dispose();
    }//GEN-LAST:event_btnJogarActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jpnlBackground;
    private javax.swing.JLabel lblImagemBackground;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
