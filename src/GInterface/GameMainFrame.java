/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GInterface;

import PokemonAluminum.Controle;
import PokemonAluminum.Missao;
import PokemonAluminum.Personagem;
import PokemonAluminum.Pokemon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Igor
 */
public class GameMainFrame extends javax.swing.JFrame {

    ImageIcon icon;

   
   
    Map map;
    int hh, mm, ss;
    boolean activate=false;
    Missao mi= new Missao();
    Personagem p;
    Controle contr;
    PokePanel[] panels = new PokePanel[4];
    /**
     * Creates new form GameMainFrame
     */
    public GameMainFrame(Personagem p) {
        this.p = p;
        for(int i=0;i<p.getPokes().size();i++){
        p.getPoke(i).setFrame(this);
        }
        contr= new Controle();
        initComponents();
        avatar.setText("");
        idLabel.setText("ID: "+p.getId());
        nameLabel.setText(p.getNome());
        this.setData();
        icon = new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\mugshot\\" + p.getCharType() + ".png", "");
        avatar.setIcon(icon);
        Timer time = new Timer(1000, ativar);
        time.start();
        //evolveButton.setVisible(false);
    }

    private GameMainFrame() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        silverLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        AventuraPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        LojaPanel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        MissaoPanel = new javax.swing.JPanel();
        MissaoComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        missionButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        tempoRestanteLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        GymPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(654, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 664));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 164));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jButton5.setText("Mudar o Time");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pokemons/0.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Time Atual");

        silverLabel.setText("Silver: xxx.xx$");

        nameLabel.setText("Nome do personagem");

        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        idLabel.setText("ID:xxx");

        jButton6.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 102));
        jButton6.setText("Inventário");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(silverLabel)
                                .addComponent(nameLabel)))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton)
                            .addComponent(idLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(nameLabel))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(silverLabel)
                            .addComponent(saveButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Principal", jPanel1);

        jButton3.setText("Rota 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Rota 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Rota 3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AventuraPanelLayout = new javax.swing.GroupLayout(AventuraPanel);
        AventuraPanel.setLayout(AventuraPanelLayout);
        AventuraPanelLayout.setHorizontalGroup(
            AventuraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AventuraPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AventuraPanelLayout.setVerticalGroup(
            AventuraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AventuraPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(AventuraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(464, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aventura", AventuraPanel);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PokeDex", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Potion", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Stone", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Pokeball", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Item", jPanel10);

        javax.swing.GroupLayout LojaPanelLayout = new javax.swing.GroupLayout(LojaPanel);
        LojaPanel.setLayout(LojaPanelLayout);
        LojaPanelLayout.setHorizontalGroup(
            LojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        LojaPanelLayout.setVerticalGroup(
            LojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Loja", LojaPanel);

        MissaoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floresta de Hoen", "Campos de Johto", "Ilhas Laranja", "Parque de Kanto" }));

        jLabel11.setText("Selecione a missão");

        missionButton.setText("Ir");
        missionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missionButtonActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel12.setText("Tempo restante: ");

        tempoRestanteLabel.setText("00:00:00");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MissaoPanelLayout = new javax.swing.GroupLayout(MissaoPanel);
        MissaoPanel.setLayout(MissaoPanelLayout);
        MissaoPanelLayout.setHorizontalGroup(
            MissaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MissaoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(167, 167, 167))
            .addGroup(MissaoPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(MissaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MissaoPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tempoRestanteLabel)
                        .addGap(186, 186, 186))
                    .addGroup(MissaoPanelLayout.createSequentialGroup()
                        .addGroup(MissaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MissaoPanelLayout.createSequentialGroup()
                                .addComponent(missionButton)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MissaoPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(MissaoComboBox, 0, 199, Short.MAX_VALUE)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        MissaoPanelLayout.setVerticalGroup(
            MissaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MissaoPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MissaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MissaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MissaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(missionButton)))
                .addGap(64, 64, 64)
                .addGroup(MissaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MissaoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tempoRestanteLabel))
                    .addComponent(jButton1))
                .addContainerGap(426, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Missão", MissaoPanel);

        javax.swing.GroupLayout GymPanelLayout = new javax.swing.GroupLayout(GymPanel);
        GymPanel.setLayout(GymPanelLayout);
        GymPanelLayout.setHorizontalGroup(
            GymPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        GymPanelLayout.setVerticalGroup(
            GymPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ginásios", GymPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int[] pokeID= {1,4,7,14};
        float[] perc={0.1f,0.03f,0.03f,0.02f};
        map = new Map(p,1,new BackgroundMap(6),pokeID,perc);
        int[] nwalk={190,270, 50,90, -10,150, -140,-10, 190,680, -140,-10, 180,680, 120,150, -10,20, 120,150};
        map.nwalk=nwalk;
        map.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int[] pokeID= {4,7,10,11};
        float[] perc={0.05f,0.02f,0.1f,0.02f};
        map = new Map(p,5,new BackgroundMap(2),pokeID,perc);
        int[] nwalk={0,0,-150,-150};
        map.nwalk=nwalk;
        map.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int[] pokeID= {7,10,13,16};
        float[] perc={0.02f,0.02f,0.02f,0.15f};
        map = new Map(p,10,new BackgroundMap(3),pokeID,perc);
        int[] nwalk={50,190, -150,-20, 400,550, -150,-120};
        map.nwalk=nwalk;
        map.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void missionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missionButtonActionPerformed
if(!activate){ 
  if(MissaoComboBox.getSelectedIndex()==0){
    tempoRestanteLabel.setText("00:00:5");}
  if(MissaoComboBox.getSelectedIndex()==1){
    tempoRestanteLabel.setText("00:00:5");}
  if(MissaoComboBox.getSelectedIndex()==2){
    tempoRestanteLabel.setText("00:00:5");}
  if(MissaoComboBox.getSelectedIndex()==3){
    tempoRestanteLabel.setText("00:00:5");}
mi.setMission(MissaoComboBox.getSelectedIndex());
  activate=true;
}

// TODO add your handling code here:
    }//GEN-LAST:event_missionButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
activate=false;
tempoRestanteLabel.setText("00:00:00");// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
contr = new Controle();
contr.save(p, this);// contr.save(p,this);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Inventory inv= new Inventory(p);
inv.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 ChangeTeam ct = new ChangeTeam(p); 
 ct.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(GameMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AventuraPanel;
    private javax.swing.JPanel GymPanel;
    private javax.swing.JPanel LojaPanel;
    private javax.swing.JComboBox<String> MissaoComboBox;
    private javax.swing.JPanel MissaoPanel;
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton missionButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel silverLabel;
    private javax.swing.JLabel tempoRestanteLabel;
    // End of variables declaration//GEN-END:variables
/*public void setData(Pokemon p) {
        xpBar.setValue((int)100*p.getXp()/p.getXpNext());
        NameTextField.setText(p.getNome());
        nvTextField.setText(String.valueOf(p.getNivel()));
        AtTextField.setText(String.valueOf(p.getAtaque()));
        DefTextField.setText(String.valueOf(p.getDefesa()));
        LifeTextField.setText(String.valueOf(p.getLife()));
        typeTextField.setText(p.getElemento());
        winloseTextField.setText(String.valueOf(p.getWl()[0]) + " / " + String.valueOf(p.getWl()[1]));
        if(p.isEvolution())
            evolveButton.setVisible(true);
}*/

    public void setData(){
        silverLabel.setText("Silver: "+p.getSilver()+"$");
        this.jPanel2.removeAll();
         for(int i=0;i<p.getPokes().size()&& i<4;i++){
           panels[i]= new PokePanel();
           panels[i].p=p;
           panels[i].setPokeData(p.getPoke(i));
           jPanel2.add(panels[i]);
       }
    
    
    }
    
void attclock() {
    String[] timestr= tempoRestanteLabel.getText().split(":");
    //System.out.println(timestr.length);
    //System.out.println(timestr[0]+":"+timestr[1]+":"+timestr[2]);
    hh=Integer.parseInt(timestr[0]);
    mm=Integer.parseInt(timestr[1]);
    ss=Integer.parseInt(timestr[2]);
    if(ss==0){
    if(mm==0){
    if(hh==0){
    JOptionPane.showMessageDialog(null,"Missão concluída!");
    activate=false;
    mi.calculaResultado(jTextArea2,p);
    this.setData();
    }else{
    hh=hh-1;
    mm=59;
    ss=59;
    }
    }else{
    mm=mm-1;
    ss=59;
    }
    }else{
    ss=ss-1;
    }    
        
        tempoRestanteLabel.setText(String.valueOf(hh) + ":" + String.valueOf(mm) + ":" + String.valueOf(ss));

    }
public void focus(){
this.jPanel2.requestFocus();
this.jPanel2.revalidate();
}

 ActionListener ativar = (new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(activate){
            attclock();}
        }

    });
}
