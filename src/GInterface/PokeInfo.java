/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GInterface;

import PokemonAluminum.Personagem;
import PokemonAluminum.PokeData;
import PokemonAluminum.Pokemon;
import java.awt.GridBagConstraints;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Igor
 */
public class PokeInfo extends javax.swing.JFrame {
Pokemon c;
Personagem p;
ImageIcon icon;
JLabel[] hNameLabels= new JLabel[3]; 
JLabel[] hPowerLabels= new JLabel[3]; 
JLabel[] hTypeLabels= new JLabel[3]; 
GridBagConstraints grid = new GridBagConstraints();
    /**
     * Creates new form PokeInfo
     */
    public PokeInfo(Personagem p, Pokemon e,PokePanel pane) {
        this.c=e;
        this.p=p;
        initComponents();
        this.setData(e);
    }

    private PokeInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xpBar = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nvLabel = new javax.swing.JLabel();
        winloseLabel = new javax.swing.JLabel();
        atLabel = new javax.swing.JLabel();
        defLabel = new javax.swing.JLabel();
        lifeLabel = new javax.swing.JLabel();
        element1Label = new javax.swing.JLabel();
        element2Label = new javax.swing.JLabel();
        hPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        hName = new javax.swing.JLabel();
        hType = new javax.swing.JLabel();
        hPower = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PokeAvatar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 153, -1, -1));

        jLabel3.setText("Nível");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 199, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Experiência");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 466, -1, -1));
        jPanel1.add(xpBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 488, 396, -1));

        jLabel6.setText("W/L");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 239, 27, -1));

        jLabel7.setText("Ataque");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 277, -1, 20));

        jLabel8.setText("Defesa");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 327, -1, -1));

        jLabel9.setText("HP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 365, 35, -1));

        jLabel10.setText("Tipo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 407, 40, -1));

        nameLabel.setText("-----------");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 153, -1, -1));

        nvLabel.setText("----------");
        jPanel1.add(nvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 199, -1, -1));

        winloseLabel.setText("----------");
        jPanel1.add(winloseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 239, -1, -1));

        atLabel.setText("---------");
        jPanel1.add(atLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 279, -1, -1));

        defLabel.setText("--------");
        jPanel1.add(defLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 327, -1, -1));

        lifeLabel.setText("---------");
        jPanel1.add(lifeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 365, -1, -1));

        element1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/types/Normal.png"))); // NOI18N
        jPanel1.add(element1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 407, -1, -1));

        element2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/types/Elétrico.png"))); // NOI18N
        jPanel1.add(element2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 407, -1, -1));

        hPanel.setBackground(new java.awt.Color(204, 204, 204));
        hPanel.setForeground(new java.awt.Color(0, 0, 0));
        hPanel.setLayout(new java.awt.GridBagLayout());

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 18, 0, 18);
        hPanel.add(jLabel12, gridBagConstraints);

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Força");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 22, 0, 9);
        hPanel.add(jLabel13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 1);
        hPanel.add(jSeparator1, gridBagConstraints);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 9);
        hPanel.add(jLabel11, gridBagConstraints);

        hName.setForeground(new java.awt.Color(0, 0, 0));
        hName.setText("jLabel14");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 1, 0);
        hPanel.add(hName, gridBagConstraints);

        hType.setForeground(new java.awt.Color(0, 0, 0));
        hType.setText("jLabel18");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 15, 1, 0);
        hPanel.add(hType, gridBagConstraints);

        hPower.setForeground(new java.awt.Color(0, 0, 0));
        hPower.setText("jLabel22");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 15, 1, 0);
        hPanel.add(hPower, gridBagConstraints);

        jPanel1.add(hPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 280, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(96, 96));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        PokeAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokeAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pokemons/0.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 4);
        jPanel2.add(PokeAvatar, gridBagConstraints);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PokeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokeInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel PokeAvatar;
    private javax.swing.JLabel atLabel;
    private javax.swing.JLabel defLabel;
    private javax.swing.JLabel element1Label;
    private javax.swing.JLabel element2Label;
    private javax.swing.JLabel hName;
    private javax.swing.JPanel hPanel;
    private javax.swing.JLabel hPower;
    private javax.swing.JLabel hType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lifeLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nvLabel;
    private javax.swing.JLabel winloseLabel;
    private javax.swing.JProgressBar xpBar;
    // End of variables declaration//GEN-END:variables
public void setData(Pokemon p) {
    this.PokeAvatar.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\pokegif\\" + p.getId() + ".gif", ""));
        xpBar.setValue((int)100*p.getXp()/p.getXpNext());
        nameLabel.setText(p.getNome());
        nvLabel.setText(String.valueOf(p.getNivel()));
        atLabel.setText(String.valueOf(p.getAtaque()));
        defLabel.setText(String.valueOf(p.getDefesa()));
        lifeLabel.setText(String.valueOf(p.getLife()));
        winloseLabel.setText(String.valueOf(p.getWl()[0]) + " / " + String.valueOf(p.getWl()[1]));
    if(c.getElemento().contains("/")){
        String[] el=c.getElemento().split("/");
        this.element1Label.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\types\\" + el[0] + ".png",""));
        this.element2Label.setVisible(true);
        this.element2Label.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\types\\" + el[1] + ".png",""));
    }
    else{
        this.element1Label.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\types\\" + c.getElemento() + ".png",""));
        this.element2Label.setVisible(false);
    }
    hName.setText(p.getHabilidades()[0].getNome());
    hPower.setText(String.valueOf((p.getHabilidades()[0].getMultiplicador()-1.0f)*100.0f)+"%");
    if(p.getHabilidades()[0].getTipo().contains("Ataque")){
    hType.setText("");
    hType.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\types\\"+p.getHabilidades()[0].getElemento()+".png",""));
    }else{
    hType.setText(p.getHabilidades()[0].getEfeito());
    }
    for(int count=1;p.getHabilidades()[count]!=null;count++){
    hNameLabels[count-1]=new JLabel();
    hTypeLabels[count-1]=new JLabel();
    hPowerLabels[count-1]=new JLabel();
    hNameLabels[count-1].setText(p.getHabilidades()[count].getNome());
    if(p.getHabilidades()[count].getTipo().contains("Ataque")){
    hTypeLabels[count-1].setText("");
    hTypeLabels[count-1].setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\types\\"+p.getHabilidades()[count].getElemento()+".png",""));
    hPowerLabels[count-1].setText(String.valueOf((p.getHabilidades()[count].getMultiplicador()-1.0f)*100.0f).substring(0, 4)+"%");
    }else{
    hTypeLabels[count-1].setText(p.getHabilidades()[count].getEfeito());
       hPowerLabels[count-1].setText("---");

    }
    hNameLabels[count-1].setLocation(hName.getLocation().x+(count*17),hName.getLocation().y+(count*17));
    hTypeLabels[count-1].setLocation(hType.getLocation().x+(count*17),hType.getLocation().y+(count*17));
    hPowerLabels[count-1].setLocation(hPower.getLocation().x+(count*17),hPower.getLocation().y+(count*17));
    grid.gridx=1;
    grid.gridy=count+2;
    hPanel.add(hNameLabels[count-1],grid);
    grid.gridx=3;
    grid.gridy=count+2;
    hPanel.add(hTypeLabels[count-1],grid);
    grid.gridx=4;
    grid.gridy=count+2;
    hPanel.add(hPowerLabels[count-1],grid);
        if(count==(p.getHabilidades().length-1)){
        break;
        }
    }
    
}

}
