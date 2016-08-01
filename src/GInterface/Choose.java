
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GInterface;

import PokemonAluminum.Personagem;
import PokemonAluminum.PokeData;
import PokemonAluminum.Pokemon;
import static javax.swing.BorderFactory.createRaisedBevelBorder;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author Igor
 */
public class Choose extends javax.swing.JFrame {

    Pokemon s;
    PokeData data = new PokeData();
    Border border;
    Personagem p;
    /**
     * Creates new form Choose
     */
    public Choose() {
        border = createRaisedBevelBorder();
        p=new Personagem();
        initComponents();
        bulbabutton.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\pokegif\\1.gif"));
        charbutton.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\pokegif\\4.gif"));
        sqbutton.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\pokegif\\7.gif"));
        pidbutton.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\pokegif\\16.gif"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bulbabutton = new javax.swing.JRadioButton();
        charbutton = new javax.swing.JRadioButton();
        sqbutton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        pidbutton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(bulbabutton);
        bulbabutton.setSelected(true);
        bulbabutton.setText("Bulbassauro");
        bulbabutton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bulbabutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bulbabuttonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bulbabuttonFocusLost(evt);
            }
        });
        getContentPane().add(bulbabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        buttonGroup1.add(charbutton);
        charbutton.setText("Charmander");
        charbutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                charbuttonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                charbuttonFocusLost(evt);
            }
        });
        charbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(charbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        buttonGroup1.add(sqbutton);
        sqbutton.setText("Squirtle");
        sqbutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sqbuttonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sqbuttonFocusLost(evt);
            }
        });
        getContentPane().add(sqbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 160, -1));

        jButton1.setText("Escolher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        buttonGroup1.add(pidbutton);
        pidbutton.setText("Pidgey");
        pidbutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pidbuttonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pidbuttonFocusLost(evt);
            }
        });
        pidbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pidbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pidbuttonMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pidbuttonMouseReleased(evt);
            }
        });
        pidbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(pidbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 180, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void charbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_charbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (bulbabutton.isSelected()) {
            p.setPoke( data.getPoke(1));
        }
        if (charbutton.isSelected()) {
            p.setPoke( data.getPoke(4));
        }
        if (sqbutton.isSelected()) {
            p.setPoke( data.getPoke(7));
        }
        if (pidbutton.isSelected()) {
            p.setPoke( data.getPoke(16));
        }
        GameMainFrame j = new GameMainFrame(p);
       j.setData(p.getPoke(0));
        j.setVisible(true);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pidbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidbuttonActionPerformed

    private void pidbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pidbuttonMouseClicked

// TODO add your handling code here:
    }//GEN-LAST:event_pidbuttonMouseClicked

    private void pidbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pidbuttonMouseReleased

// TODO add your handling code here:
    }//GEN-LAST:event_pidbuttonMouseReleased

    private void pidbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pidbuttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pidbuttonMouseEntered

    private void pidbuttonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pidbuttonFocusGained
        pidbutton.setForeground(java.awt.Color.white);
        pidbutton.setBorder(border);// TODO add your handling code here:
    }//GEN-LAST:event_pidbuttonFocusGained

    private void pidbuttonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pidbuttonFocusLost
        pidbutton.setForeground(java.awt.Color.black);
        pidbutton.setBorder(null);// TODO add your handling code here:
    }//GEN-LAST:event_pidbuttonFocusLost

    private void sqbuttonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sqbuttonFocusGained
        sqbutton.setForeground(java.awt.Color.white);
        sqbutton.setBorder(border);// TODO add your handling code here:
    }//GEN-LAST:event_sqbuttonFocusGained

    private void sqbuttonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sqbuttonFocusLost
        sqbutton.setForeground(java.awt.Color.black);
        sqbutton.setBorder(null);// TODO add your handling code here:
    }//GEN-LAST:event_sqbuttonFocusLost

    private void charbuttonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_charbuttonFocusGained
        charbutton.setForeground(java.awt.Color.white);
        charbutton.setBorder(border);// TODO add your handling code here:
    }//GEN-LAST:event_charbuttonFocusGained

    private void charbuttonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_charbuttonFocusLost
        charbutton.setForeground(java.awt.Color.black);
        charbutton.setBorder(null);// TODO add your handling code here:
    }//GEN-LAST:event_charbuttonFocusLost

    private void bulbabuttonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bulbabuttonFocusGained
        bulbabutton.setForeground(java.awt.Color.white);
        bulbabutton.setBorder(border);// TODO add your handling code here:
    }//GEN-LAST:event_bulbabuttonFocusGained

    private void bulbabuttonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bulbabuttonFocusLost
        bulbabutton.setForeground(java.awt.Color.black);
        bulbabutton.setBorder(null);// TODO add your handling code here:
    }//GEN-LAST:event_bulbabuttonFocusLost

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
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Choose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bulbabutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton charbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton pidbutton;
    private javax.swing.JRadioButton sqbutton;
    // End of variables declaration//GEN-END:variables
}
