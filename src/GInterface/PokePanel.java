/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GInterface;

import PokemonAluminum.Personagem;
import PokemonAluminum.PokeData;
import PokemonAluminum.Pokemon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Igor
 */
public class PokePanel extends javax.swing.JPanel {
Pokemon e;
Personagem p;
    /**
     * Creates new form PokePanel
     */
    public PokePanel() {
    initComponents();
    evolveButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PokeDat = new javax.swing.JLabel();
        PokeXp = new javax.swing.JProgressBar();
        PokeElement = new javax.swing.JLabel();
        Element = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PokeAvatar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        evolveButton = new javax.swing.JButton();
        Element1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setForeground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PokeDat.setText("NomePoke  Lv xxx");
        add(PokeDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 22, -1, -1));
        add(PokeXp, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 100, 300, -1));

        PokeElement.setText("Elemento");
        add(PokeElement, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 56, -1, -1));

        Element.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/types/Fogo.png"))); // NOI18N
        add(Element, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 56, -1, 16));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(96, 96));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        PokeAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokeAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pokemons/0.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 4);
        jPanel1.add(PokeAvatar, gridBagConstraints);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 100, 100));

        jButton1.setText("Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 36, -1, -1));

        evolveButton.setText("Evolve");
        evolveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evolveButtonActionPerformed(evt);
            }
        });
        add(evolveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 36, -1, -1));

        Element1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/types/Fogo.png"))); // NOI18N
        add(Element1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 57, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
PokeInfo inf=new PokeInfo(p,e,this);
inf.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void evolveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evolveButtonActionPerformed
       if(e.getFrame().map!=null){
            e.getFrame().map.dispose();
        }
        int ind= p.getPokes().indexOf(e);
        p.setPoke(PokeData.getPoke(e.getEvolutionID()), ind);
        p.getPoke(ind).getOldStatus(e);
        e=p.getPoke(ind);
        e.reset();
        this.setPokeData(e);
        PokeAvatar.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\pokegif\\" + e.getId() + ".gif", ""));
        evolveButton.setVisible(false);
        if(p.getPoke(ind).getEvolutionID()==0){
            p.getPoke(ind).setEvolution(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_evolveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Element;
    private javax.swing.JLabel Element1;
    protected javax.swing.JLabel PokeAvatar;
    private javax.swing.JLabel PokeDat;
    private javax.swing.JLabel PokeElement;
    private javax.swing.JProgressBar PokeXp;
    private javax.swing.JButton evolveButton;
    private javax.swing.JButton jButton1;
    protected javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
void setPokeData(Pokemon e){
    this.e=e;
    this.PokeAvatar.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\pokegif\\" + e.getId() + ".gif", ""));
    this.PokeDat.setText(e.getNome()+"   Lv:"+e.getNivel());
    if(e.getElemento().contains("/")){
        String[] el=e.getElemento().split("/");
        this.Element.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\types\\" + el[0] + ".png",""));
        this.Element1.setVisible(true);
        this.Element1.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\types\\" + el[1] + ".png",""));
    }
    else{
        this.Element.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\types\\" + e.getElemento() + ".png",""));
        this.Element1.setVisible(false);
    }
    this.PokeXp.setValue((int)100*e.getXp()/e.getXpNext());
       if(e.isEvolution()){
            evolveButton.setVisible(true);}
}

}
