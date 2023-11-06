package com.github.giovaneneves7.objetostamanhosdinamicos.view;

// ======================================== //
// ============= [ IMPORTS ] ============== //
// ======================================== //
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author Giovane Neves
 * @since V0.0.1
 */
public class MainView extends javax.swing.JFrame implements MouseListener, MouseMotionListener{

    // ======================================== //
    // ============ [ ATRIBUTOS ] ============= //
    // ======================================== //
    
    private Point _pontoInicial;
    private Point _manivelaBombaPosicaoInicial;
    private int _pressaoSelecionada;
    private boolean _pressaoEstaSelecionada;
    
    private Point PRESSAO_5;
    private Point PRESSAO_10;
    private Point PRESSAO_20;
    private Point PRESSAO_30;
    
    // ======================================== //
    // =========== [ CONSTRUTOR ] ============= //
    // ======================================== //
    
    /**
     * Construtor da classe.
     */
    public MainView() {
        initComponents();
        _inicializadorCustomizado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlInterfaceBomba = new javax.swing.JPanel();
        pnlManivelaBomba = new javax.swing.JPanel();
        lblPressao30 = new javax.swing.JLabel();
        lblPressao5 = new javax.swing.JLabel();
        lblPressao10 = new javax.swing.JLabel();
        lblPressao20 = new javax.swing.JLabel();
        lblBalao = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBackground.setLayout(null);

        pnlInterfaceBomba.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout pnlInterfaceBombaLayout = new javax.swing.GroupLayout(pnlInterfaceBomba);
        pnlInterfaceBomba.setLayout(pnlInterfaceBombaLayout);
        pnlInterfaceBombaLayout.setHorizontalGroup(
            pnlInterfaceBombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlInterfaceBombaLayout.setVerticalGroup(
            pnlInterfaceBombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pnlBackground.add(pnlInterfaceBomba);
        pnlInterfaceBomba.setBounds(140, 220, 30, 150);

        pnlManivelaBomba.setBackground(new java.awt.Color(255, 51, 51));
        pnlManivelaBomba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlManivelaBombaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlManivelaBombaLayout = new javax.swing.GroupLayout(pnlManivelaBomba);
        pnlManivelaBomba.setLayout(pnlManivelaBombaLayout);
        pnlManivelaBombaLayout.setHorizontalGroup(
            pnlManivelaBombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlManivelaBombaLayout.setVerticalGroup(
            pnlManivelaBombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        pnlBackground.add(pnlManivelaBomba);
        pnlManivelaBomba.setBounds(150, 200, 10, 170);

        lblPressao30.setText("30 -");
        pnlBackground.add(lblPressao30);
        lblPressao30.setBounds(110, 80, 37, 16);

        lblPressao5.setText("05 -");
        pnlBackground.add(lblPressao5);
        lblPressao5.setBounds(110, 170, 37, 16);

        lblPressao10.setText("10 -");
        pnlBackground.add(lblPressao10);
        lblPressao10.setBounds(110, 140, 37, 16);

        lblPressao20.setText("20 -");
        pnlBackground.add(lblPressao20);
        lblPressao20.setBounds(110, 110, 37, 16);

        lblBalao.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout lblBalaoLayout = new javax.swing.GroupLayout(lblBalao);
        lblBalao.setLayout(lblBalaoLayout);
        lblBalaoLayout.setHorizontalGroup(
            lblBalaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        lblBalaoLayout.setVerticalGroup(
            lblBalaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlBackground.add(lblBalao);
        lblBalao.setBounds(310, 280, 70, 50);

        getContentPane().add(pnlBackground);
        pnlBackground.setBounds(0, 0, 750, 370);

        setSize(new java.awt.Dimension(762, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ======================================== //
    // ============ [ MÉTODOS ] =============== //
    // ======================================== //

    private void _inicializadorCustomizado(){
        
        _manivelaBombaPosicaoInicial = pnlManivelaBomba.getLocation();
        
        PRESSAO_5 = lblPressao5.getLocation();
        PRESSAO_10 = lblPressao10.getLocation();
        PRESSAO_20 = lblPressao20.getLocation();
        PRESSAO_30 = lblPressao30.getLocation();
        
    }
    private void pnlManivelaBombaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlManivelaBombaMouseClicked
        
        System.out.println("Clicando...");
        
        pnlManivelaBomba.addMouseListener(this);
        pnlManivelaBomba.addMouseMotionListener(this);
        
    }//GEN-LAST:event_pnlManivelaBombaMouseClicked
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    /**
     * Evento acionando quando o mouse é pressionado.
     * 
     * @author Giovane Neves
     * @since V0.0.1
     * @param me O evento do mouse.
     */
    @Override
    public void mousePressed(final MouseEvent me) {
        
        System.out.println("Pressionando...");
        
        _pontoInicial = SwingUtilities.convertPoint(pnlManivelaBomba, me.getPoint(), pnlManivelaBomba.getParent());
        
        //pnlInterfaceBomba.setOpaque(false);
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        ((Graphics2D) pnlInterfaceBomba.getGraphics()).setComposite(alphaComposite);
        pnlInterfaceBomba.setBackground(new Color(0, 0, 255, 128));
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        pnlInterfaceBomba.setOpaque(true);
        pnlInterfaceBomba.setBackground(Color.BLUE);
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(final MouseEvent me) {
        
        //System.out.println("Arrastando...");
        
        Point localAtual = SwingUtilities.convertPoint(pnlManivelaBomba, me.getPoint(), pnlManivelaBomba.getParent());
        
        // System.out.println("Posição da pressão: " + PRESSAO_5.y + "\nPosição da manivela: " + pnlManivelaBomba.getLocation().y + "\nLocal atual:" + localAtual);
       
        
        // Verifica se a manivela ainda está dentro do seu container.
        if(pnlManivelaBomba.getParent().getBounds().contains(localAtual)){
            
            Point novoLocal = pnlManivelaBomba.getLocation();
            novoLocal.translate((localAtual.x - _pontoInicial.x), (localAtual.y - _pontoInicial.y));
            novoLocal.x = Math.max(novoLocal.x, 0);
            novoLocal.y = Math.max(novoLocal.y, 0);
            novoLocal.x = Math.min(novoLocal.x, (pnlManivelaBomba.getParent().getWidth() - pnlManivelaBomba.getWidth()));
            novoLocal.y= Math.min(novoLocal.y, (pnlManivelaBomba.getParent().getHeight() - pnlManivelaBomba.getHeight()));
            
            pnlManivelaBomba.setLocation(novoLocal);
           _pontoInicial = localAtual;
           
        }
        
        if(PRESSAO_5.y == pnlManivelaBomba.getLocation().y && _pressaoSelecionada < 6){
            _pressaoSelecionada = 5;
            _pressaoEstaSelecionada = true;
        }
        else if(pnlManivelaBomba.getLocation().y == PRESSAO_10.y && _pressaoSelecionada < 11){
            _pressaoSelecionada = 10;
            _pressaoEstaSelecionada = true;
        } else if(pnlManivelaBomba.getLocation().y == PRESSAO_20.y && _pressaoSelecionada < 21){
            _pressaoSelecionada = 20;
            _pressaoEstaSelecionada = true;
        } else if(pnlManivelaBomba.getLocation().y == PRESSAO_30.y ){
            _pressaoSelecionada = 30;
            _pressaoEstaSelecionada = true;
        }
        
        if(_pressaoEstaSelecionada)
            System.out.println("\nPressão selecionada: ".concat(String.valueOf(_pressaoSelecionada)));
        
        if(pnlManivelaBomba.getLocation().y == _manivelaBombaPosicaoInicial.y){
            
            if(!_pressaoEstaSelecionada)
                return;
     
            System.out.println("Tamanho antes:" + lblBalao.getSize());
            lblBalao.setSize((lblBalao.getWidth() + _pressaoSelecionada), (lblBalao.getHeight() + _pressaoSelecionada));;
            
            System.out.println("Tamanho depois:" + lblBalao.getSize());
            _pressaoEstaSelecionada = false;
            _pressaoSelecionada = 0;
            
        }
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
    /**
     * Classe principal.
     * 
     * @param args Argumentos da classe principal.
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel lblBalao;
    private javax.swing.JLabel lblPressao10;
    private javax.swing.JLabel lblPressao20;
    private javax.swing.JLabel lblPressao30;
    private javax.swing.JLabel lblPressao5;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlInterfaceBomba;
    private javax.swing.JPanel pnlManivelaBomba;
    // End of variables declaration//GEN-END:variables
    

}
