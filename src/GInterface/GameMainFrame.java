/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GInterface;

import PokemonAluminum.Controle;
import PokemonAluminum.Missao;
import PokemonAluminum.Personagem;
import PokemonAluminum.PokeData;
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
//Pokemon charmander = new Pokemon();
//Pokemon bulba = new Pokemon();
    int[] attrb1 = {100, 50, 80};
    int[] habil1 = {1, 2, 3, 4};
    Pokemon c;
    Map map;
    int hh, mm, ss;
    boolean activate=false;
    Missao mi= new Missao();
    Personagem p;
    Controle contr;
    /**
     * Creates new form GameMainFrame
     */
    public GameMainFrame(Personagem p) {
        this.p = p;
        c=p.getPoke(0);
        p.getPoke(0).setFrame(this);
        contr= new Controle();
        System.out.println(p.getPoke(0).getEvolutionLevel());
        initComponents();
        jTabbedPane1.setEnabledAt(4, false);
        avatar.setText("");
        icon = new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\pokegif\\" + c.getId() + ".gif", "");
        avatar.setIcon(icon);
        Timer time = new Timer(1000, ativar);
        time.start();
        evolveButton.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xpBar = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        nvTextField = new javax.swing.JTextField();
        winloseTextField = new javax.swing.JTextField();
        AtTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DefTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LifeTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        typeTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        evolveButton = new javax.swing.JButton();
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

        jLabel1.setText("Nome");

        jLabel3.setText("Nível");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Experiência");

        jLabel6.setText("W/L");

        NameTextField.setEditable(false);
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        nvTextField.setEditable(false);
        nvTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvTextFieldActionPerformed(evt);
            }
        });

        winloseTextField.setEditable(false);

        AtTextField.setEditable(false);

        jLabel7.setText("Ataque");

        DefTextField.setEditable(false);

        jLabel8.setText("Defesa");

        LifeTextField.setEditable(false);

        jLabel9.setText("HP");

        typeTextField.setEditable(false);

        jLabel10.setText("Tipo");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(96, 96));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pokegif/0.png"))); // NOI18N
        jPanel16.add(avatar, new java.awt.GridBagConstraints());

        jButton5.setText("Salvar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        evolveButton.setText("Evoluir");
        evolveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evolveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xpBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(135, 135, 135)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(winloseTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(nvTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LifeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(DefTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(AtTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                        .addComponent(typeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(143, 143, 143)
                                .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(evolveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(103, 103, 103))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AtTextField, DefTextField, LifeTextField, NameTextField, nvTextField, typeTextField, winloseTextField});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(evolveButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(winloseTextField))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AtTextField)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DefTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LifeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(xpBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AtTextField, DefTextField, LifeTextField, NameTextField, nvTextField, typeTextField, winloseTextField});

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
                .addContainerGap(284, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aventura", AventuraPanel);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PokeDex", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Potion", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Stone", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Pokeball", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
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
                                .addComponent(MissaoComboBox, 0, 136, Short.MAX_VALUE)
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
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Missão", MissaoPanel);

        javax.swing.GroupLayout GymPanelLayout = new javax.swing.GroupLayout(GymPanel);
        GymPanel.setLayout(GymPanelLayout);
        GymPanelLayout.setHorizontalGroup(
            GymPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        GymPanelLayout.setVerticalGroup(
            GymPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ginásios", GymPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int[] pokeID= {1,4,7,14};
        float[] perc={0.1f,0.03f,0.03f,0.02f};
        map = new Map(1,new BackgroundMap(1),pokeID,perc);
        map.a = c;
        map.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int[] pokeID= {4,7,10,11};
        float[] perc={0.05f,0.02f,0.1f,0.02f};
        map = new Map(5,new BackgroundMap(2),pokeID,perc);
        map.a = c;
        map.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int[] pokeID= {7,10,13,16};
        float[] perc={0.02f,0.02f,0.02f,0.15f};
        map = new Map(10,new BackgroundMap(3),pokeID,perc);
        map.a = c;
        map.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nvTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nvTextFieldActionPerformed

    private void missionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missionButtonActionPerformed
if(!activate){ 
  if(MissaoComboBox.getSelectedIndex()==0){
    tempoRestanteLabel.setText("00:00:10");}
  if(MissaoComboBox.getSelectedIndex()==1){
    tempoRestanteLabel.setText("00:00:10");}
  if(MissaoComboBox.getSelectedIndex()==2){
    tempoRestanteLabel.setText("00:00:10");}
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        contr.save(p,this);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void evolveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evolveButtonActionPerformed
        if(this.map != null){
        this.map.dispose();}
        p.setPoke(PokeData.getPoke(c.getEvolutionID()), 0);
        p.getPoke(0).getOldStatus(c);
        c=p.getPoke(0);
        c.reset();
        this.setData(c);
        icon = new ImageIcon(System.getProperty("user.dir") + "\\src\\icons\\pokegif\\" + c.getId() + ".gif", "");
        avatar.setIcon(icon);
        evolveButton.setVisible(false);
        if(p.getPoke(0).getEvolutionID()==0){
        p.getPoke(0).setEvolution(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_evolveButtonActionPerformed

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
    private javax.swing.JTextField AtTextField;
    private javax.swing.JPanel AventuraPanel;
    private javax.swing.JTextField DefTextField;
    private javax.swing.JPanel GymPanel;
    private javax.swing.JTextField LifeTextField;
    private javax.swing.JPanel LojaPanel;
    private javax.swing.JComboBox<String> MissaoComboBox;
    private javax.swing.JPanel MissaoPanel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel avatar;
    private javax.swing.JButton evolveButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton missionButton;
    private javax.swing.JTextField nvTextField;
    private javax.swing.JLabel tempoRestanteLabel;
    private javax.swing.JTextField typeTextField;
    private javax.swing.JTextField winloseTextField;
    private javax.swing.JProgressBar xpBar;
    // End of variables declaration//GEN-END:variables
public void setData(Pokemon p) {
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
    mi.calculaResultado(jTextArea2,c);
    this.setData(c);
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

 ActionListener ativar = (new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(activate){
            attclock();}
        }

    });
}
