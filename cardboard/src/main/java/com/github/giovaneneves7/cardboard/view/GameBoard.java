// ================================================= //
// =============== [ PACKAGE ]  ==================== //
// ================================================= //

package com.github.giovaneneves7.cardboard.view;

// ================================================= //
// =============== [ IMPORTS ]  ==================== //
// ================================================= //
    
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.text.Position;

/**
 *
 * @author Giovane Neves
 * @since V1.0.1
 */
public class GameBoard extends javax.swing.JFrame implements MouseListener, MouseMotionListener{

    // ================================================= //
    // ============ [ ATTRIBUTES ]  ==================== //
    // ================================================= //
    
    private Point _startPoint;
    private Integer _totalCards = 0;
    private final ImageIcon CLOSED_BOX_ICON = new ImageIcon(getClass().getResource("/images/closed_box.png"));
    private final ImageIcon OPEN_BOX_ICON = new ImageIcon(getClass().getResource("/images/open_box.png"));
    private Point CARD_INITIAL_POSITION;
    
    // ================================================= //
    // =========== [ CONSTRUCTOR ]  ==================== //
    // ================================================= //
    
    public GameBoard() {
        
        initComponents();
        customInitializr();
        
    }

    // ================================================= //
    // =============== [ METHODS ]  ==================== //
    // ================================================= //
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCard = new javax.swing.JLabel();
        lblBox = new javax.swing.JLabel();
        lblTotalCards = new javax.swing.JLabel();
        lblCountTotalCards = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        lblCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card.png"))); // NOI18N
        lblCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCardMouseClicked(evt);
            }
        });
        jPanel1.add(lblCard);
        lblCard.setBounds(150, 30, 60, 70);

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open_box.png"))); // NOI18N
        jPanel1.add(lblBox);
        lblBox.setBounds(560, 300, 64, 70);

        lblTotalCards.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalCards.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCards.setText("Total de cartas");
        jPanel1.add(lblTotalCards);
        lblTotalCards.setBounds(540, 230, 126, 30);

        lblCountTotalCards.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCountTotalCards.setForeground(new java.awt.Color(255, 255, 255));
        lblCountTotalCards.setText("0");
        jPanel1.add(lblCountTotalCards);
        lblCountTotalCards.setBounds(580, 260, 30, 30);

        jButton1.setText("drop");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 340, 60, 20);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(120, -110, 770, 620);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 400);

        setSize(new java.awt.Dimension(761, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCardMouseClicked
        
        System.out.println("Adicionando....");
        lblCard.addMouseListener(this);
        lblCard.addMouseMotionListener(this);
        
    }//GEN-LAST:event_lblCardMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(_totalCards == 5)
            lblCountTotalCards.setForeground(Color.white);
            lblBox.setIcon(OPEN_BOX_ICON);
        
        if(_totalCards != 0){
            lblCountTotalCards.setText(String.valueOf(--_totalCards));
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void customInitializr(){
        
        CARD_INITIAL_POSITION = lblCard.getLocation();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblCard;
    private javax.swing.JLabel lblCountTotalCards;
    private javax.swing.JLabel lblTotalCards;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(final MouseEvent me) {
    
        System.out.println("Pressionando....");
        _startPoint = SwingUtilities.convertPoint(lblCard, me.getPoint(), lblCard.getParent());
        
    }

    @Override
    public void mouseReleased(final MouseEvent me) {
        
        
        System.out.println("Soltando....");
        _startPoint = null;
        
        if(calculateDistance(lblCard.getLocation(), lblBox.getLocation()) < 30){
            if(_totalCards < 5){
                
                ++_totalCards;
                
                if(_totalCards == 5){
                    lblCountTotalCards.setForeground(Color.red);
                    lblBox.setIcon(CLOSED_BOX_ICON);
                }
                
                lblCountTotalCards.setText(String.valueOf(_totalCards));
                lblCard.setLocation(CARD_INITIAL_POSITION);
                
                
            }
                
            
        }
        
    }
    
    public int calculateDistance(final Point _motionElementPosition, final Point _staticElementPosition){
        
        int _xDistance = _staticElementPosition.x - _motionElementPosition.x;
        int _yDistance = _staticElementPosition.y - _motionElementPosition.y;
        
        return (int) Math.sqrt(_xDistance * _xDistance + _yDistance + _yDistance);
    }

    @Override
    public void mouseEntered(final MouseEvent me) {
    }

    @Override
    public void mouseExited(final MouseEvent me) {
    }

    @Override
    public void mouseDragged(final MouseEvent me) {
        
        System.out.println("Arrastando");
        Point _location = SwingUtilities.convertPoint(lblCard, me.getPoint(), lblCard.getParent());
        
        if(lblCard.getParent().getBounds().contains(_location)){
            
            Point _newLocation = lblCard.getLocation();
            _newLocation.translate(_location.x - _startPoint.x, _location.y - _startPoint.y);
            _newLocation.x = Math.max(_newLocation.x, 0);
            _newLocation.y = Math.max(_newLocation.y, 0);
            _newLocation.x = Math.min(_newLocation.x, lblCard.getParent().getWidth() - lblCard.getWidth());
            _newLocation.y = Math.min(_newLocation.y, lblCard.getParent().getHeight()- lblCard.getHeight());
            
            lblCard.setLocation(_newLocation);
            _startPoint = _location;
        }
        
    }

    @Override
    public void mouseMoved(final MouseEvent me) {
    
    }
}
