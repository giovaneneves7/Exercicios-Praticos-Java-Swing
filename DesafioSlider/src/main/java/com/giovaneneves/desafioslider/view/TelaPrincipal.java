package com.giovaneneves.desafioslider.view;

/**
 *
 * @author GiovaneNeves
 */
public class TelaPrincipal extends javax.swing.JFrame {

    //Variáveis globais
    private int inicio = 0;
    private int passo  = 0;
    private int fim = 0;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlBackground = new javax.swing.JPanel();
        sldrInicio = new javax.swing.JSlider();
        sldrPasso = new javax.swing.JSlider();
        sldrFim = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPnlResultado = new javax.swing.JTextPane();
        btnSair = new javax.swing.JButton();
        lblInicio = new javax.swing.JLabel();
        txtFim = new javax.swing.JTextField();
        lblPasso = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        txtPasso = new javax.swing.JTextField();
        btnContar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpnlBackground.setLayout(null);

        sldrInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sldrInicioMouseDragged(evt);
            }
        });
        sldrInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sldrInicioMouseClicked(evt);
            }
        });
        jpnlBackground.add(sldrInicio);
        sldrInicio.setBounds(80, 70, 240, 20);

        sldrPasso.setMaximum(10);
        sldrPasso.setMinimum(1);
        sldrPasso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sldrPassoMouseDragged(evt);
            }
        });
        sldrPasso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sldrPassoMouseClicked(evt);
            }
        });
        jpnlBackground.add(sldrPasso);
        sldrPasso.setBounds(80, 100, 240, 20);

        sldrFim.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sldrFimMouseDragged(evt);
            }
        });
        sldrFim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sldrFimMouseClicked(evt);
            }
        });
        jpnlBackground.add(sldrFim);
        sldrFim.setBounds(80, 130, 240, 20);

        jScrollPane2.setViewportView(txtPnlResultado);

        jpnlBackground.add(jScrollPane2);
        jScrollPane2.setBounds(400, 20, 130, 240);

        btnSair.setBackground(new java.awt.Color(255, 0, 0));
        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("X");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jpnlBackground.add(btnSair);
        btnSair.setBounds(545, 10, 70, 40);

        lblInicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblInicio.setText("Inicío:");
        jpnlBackground.add(lblInicio);
        lblInicio.setBounds(40, 70, 50, 16);

        txtFim.setEditable(false);
        jpnlBackground.add(txtFim);
        txtFim.setBounds(320, 130, 70, 22);

        lblPasso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPasso.setText("Passo:");
        jpnlBackground.add(lblPasso);
        lblPasso.setBounds(40, 100, 50, 16);

        lblFim.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFim.setText("Fim:");
        jpnlBackground.add(lblFim);
        lblFim.setBounds(40, 130, 50, 16);

        txtInicio.setEditable(false);
        jpnlBackground.add(txtInicio);
        txtInicio.setBounds(320, 70, 70, 22);

        txtPasso.setEditable(false);
        jpnlBackground.add(txtPasso);
        txtPasso.setBounds(320, 100, 70, 22);

        btnContar.setText("Contar");
        btnContar.setFocusPainted(false);
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });
        jpnlBackground.add(btnContar);
        btnContar.setBounds(120, 170, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(626, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        // Fecha o programa quando o botão é pressionado
        System.exit(0);
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void sldrInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldrInicioMouseClicked
        
        // Atualiza o textField quando a slider 'Inicio' é clicado        
        
        atualizarEAtribuir(sldrInicio.getValue(), txtInicio, inicio);
    }//GEN-LAST:event_sldrInicioMouseClicked

    private void sldrInicioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldrInicioMouseDragged
        
        // Atualiza o textFild quando o slider 'Inicio' é movido
        atualizarEAtribuir(sldrInicio.getValue(), txtInicio, inicio);
        
    }//GEN-LAST:event_sldrInicioMouseDragged

    private void sldrPassoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldrPassoMouseDragged
        
        
        // Atualiza o textFild quando o slider 'Passo' é movido
        atualizarEAtribuir(sldrPasso.getValue(), txtPasso, passo);
        
    }//GEN-LAST:event_sldrPassoMouseDragged

    private void sldrPassoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldrPassoMouseClicked
        
        // Atualiza o textFild quando o slider 'Passo' é clicado
        atualizarEAtribuir(sldrPasso.getValue(), txtPasso, passo);
        
    }//GEN-LAST:event_sldrPassoMouseClicked

    private void sldrFimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldrFimMouseClicked
        
        // Atualiza o textFild quando o slider 'Fim' é clicado
        atualizarEAtribuir(sldrFim.getValue(), txtFim, fim);
        
    }//GEN-LAST:event_sldrFimMouseClicked

    private void sldrFimMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldrFimMouseDragged
        
        // Atualiza o textFild quando o slider 'Fim' é movido
        atualizarEAtribuir(sldrFim.getValue(), txtFim, fim);
    }//GEN-LAST:event_sldrFimMouseDragged

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        
        //Faz o contagem de acordo com os parâmatros passados pelo usuário
        while(inicio < fim){
            
            String resultado = "";
            resultado += txtPnlResultado.getText() + Integer.toString(inicio) + "\n";
                    
            txtPnlResultado.setText(resultado);
            
            inicio = (inicio + (passo - 1));
        }
    }//GEN-LAST:event_btnContarActionPerformed

    //Metódo para atualizar os campos de textos e atruibuir valor à varável global
    private void atualizarEAtribuir(int valor, javax.swing.JTextField textField, int variavelGlobal){
        
        textField.setText(String.valueOf(valor));
        if(variavelGlobal == inicio)
            inicio = valor;
        else if(variavelGlobal == passo)
            passo = valor;
        else
            fim = valor;
            
        
    }
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnlBackground;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblPasso;
    private javax.swing.JSlider sldrFim;
    private javax.swing.JSlider sldrInicio;
    private javax.swing.JSlider sldrPasso;
    private javax.swing.JTextField txtFim;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtPasso;
    private javax.swing.JTextPane txtPnlResultado;
    // End of variables declaration//GEN-END:variables
}
