/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GInterface;

import PokemonAluminum.Personagem;
import PokemonAluminum.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author Igor
 */
public class ChangeTeam extends javax.swing.JFrame {
Personagem p;
int size;
Pokemon e1,e2;
boolean teamSelect=false,storageSelect=false;
MiniPokePanel[] pp;
ArrayList<Pokemon> tempArray;
/**
     * Creates new form ChangeTeam
     */
    public ChangeTeam(Personagem p) {
        this.p=p;
        initComponents();
        size=p.getPokes().size();
        TeamPanel.removeAll();
        AllPokesPanel.removeAll();
        pp= new MiniPokePanel[size];
        for(int i=0;i<size && i<4;i++){
        pp[i]= new MiniPokePanel(p.getPokes().get(i));
        pp[i].setData();
        TeamPanel.add(pp[i]);
        }
        if(size>4){
            for(int i=4;i<size;i++){
                pp[i]= new MiniPokePanel(p.getPokes().get(i));
                pp[i].setData();
                AllPokesPanel.add(pp[i]);
            }
        
        }
        tempArray=p.getPokes();
    }

    private ChangeTeam() {
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

        jPanel1 = new javax.swing.JPanel();
        TeamPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllPokesPanel = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Time Atual");

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Pokemons Capturados");

        jScrollPane1.setViewportView(AllPokesPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(194, 194, 194))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addComponent(TeamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        confirmButton.setText("Confirmar");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(91, 91, 91)
                .addComponent(confirmButton)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    this.setData();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
    p.setPokes(tempArray);
    p.getPoke(0).getFrame().setData();
    p.getPoke(0).getFrame().focus();
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeTeam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AllPokesPanel;
    private javax.swing.JPanel TeamPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

public void setPoke(Pokemon e){
int position= tempArray.indexOf(e);
    //System.out.println(position);
if (position<4){
    if(teamSelect==false){
        e1=e;
        pp[position].setPokeClicked();
        teamSelect=true;
    }
    else{
        if(this.e1==e){
            pp[position].setPokeUnclicked();
            e1=null;
            teamSelect=false;
        }
        else{
            int oldPosition= tempArray.indexOf(e1);
            tempArray.set(oldPosition,e);
            tempArray.set(position,e1);
            pp[oldPosition].e=e;
            pp[oldPosition].setPokeUnclicked();
            pp[oldPosition].setData();
            pp[position].e=e1;
            pp[position].setPokeUnclicked();
            pp[position].setData();
            e1=null;
            teamSelect=false;
        
    }
}
    
}
else{
    if(storageSelect==false){
        e2=e;
        pp[position].setPokeClicked();
        storageSelect=true;
    }
    else{
    if(this.e2==e){
            pp[position].setPokeUnclicked();
            e2=null;
            storageSelect=false;
        }
    else{
            int oldPosition= tempArray.indexOf(e2);
            tempArray.set(oldPosition,e);
            tempArray.set(position,e2);
            pp[oldPosition].e=e;
            pp[oldPosition].setData();
            pp[oldPosition].setPokeUnclicked();
            pp[position].e=e2;
            pp[position].setPokeUnclicked();
            pp[position].setData();
            e2=null;
            storageSelect=false;
        }
    }
}
if(teamSelect && storageSelect){
int teamPosition= tempArray.indexOf(e1);
int storagePosition= tempArray.indexOf(e2);
pp[teamPosition].e=e2;
pp[storagePosition].e=e1;
pp[teamPosition].setData();
pp[storagePosition].setData();
pp[teamPosition].setPokeUnclicked();
pp[storagePosition].setPokeUnclicked();
tempArray.set(teamPosition,e2);
tempArray.set(storagePosition,e1);
e1=null;
e2=null;
teamSelect=false;
storageSelect=false;
}
/*for(int contador=0;contador<tempArray.size();contador++){
    System.out.println(contador+" "+tempArray.get(contador).getNome()+ " "+tempArray.get(contador).getNivel());
}*/

}

public void setData(){
        TeamPanel.removeAll();
        AllPokesPanel.removeAll();
        pp= new MiniPokePanel[size];
        for(int i=0;i<size && i<4;i++){
        pp[i]= new MiniPokePanel(p.getPokes().get(i));
        pp[i].setData();
        TeamPanel.add(pp[i]);
        }
        if(size>4){
            for(int i=4;i<size;i++){
                pp[i]= new MiniPokePanel(p.getPokes().get(i));
                pp[i].setData();
                AllPokesPanel.add(pp[i]);
            }
        
        }

}
}
