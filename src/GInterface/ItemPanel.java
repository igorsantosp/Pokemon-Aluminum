/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GInterface;

import PokemonAluminum.Item;
import static javax.swing.BorderFactory.createRaisedBevelBorder;

/**
 *
 * @author Igor
 */
public class ItemPanel extends javax.swing.JPanel {
Item i;
    /**
     * Creates new form ItemPanel
     */
    public ItemPanel(Item i) {
        this.i=i;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        itemIcon = new javax.swing.JLabel();
        itemNumber = new javax.swing.JLabel();

        setBackground(new java.awt.Color(219, 219, 219));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemName.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        itemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemName.setText("a");
        itemName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 75, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(96, 96));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        itemIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/items/greatball.png"))); // NOI18N
        jPanel1.add(itemIcon, new java.awt.GridBagConstraints());

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        itemNumber.setFont(new java.awt.Font("MS Gothic", 1, 11)); // NOI18N
        itemNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemNumber.setText("1");
        itemNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(itemNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
  this.setBorder(createRaisedBevelBorder());      // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
this.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
try{if(this.getParent().getParent().getParent().getParent().getParent().getParent().getParent() instanceof FightFrame){
FightFrame ff =(FightFrame)this.getParent().getParent().getParent().getParent().getParent().getParent().getParent();
ff.useItem(this.i);
}}catch(NullPointerException ex){

}       
    }//GEN-LAST:event_formMouseClicked
    
                                     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel itemIcon;
    private javax.swing.JLabel itemName;
    private javax.swing.JLabel itemNumber;
    protected javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
public void setData(){
this.itemIcon.setIcon(this.i.getIcon());
this.itemName.setText(i.getName());
this.itemNumber.setText(String.valueOf(i.getNumber()));
}
}
