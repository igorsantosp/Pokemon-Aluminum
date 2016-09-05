package GInterface;




import PokemonAluminum.Personagem;
import PokemonAluminum.PokeData;
import PokemonAluminum.Pokemon;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import javafx.scene.input.KeyCode;
import javax.swing.ImageIcon;
import javax.tools.JavaFileManager.Location;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Igor
 */
public class Map extends javax.swing.JFrame {

    ImageIcon i,monst;
//    BackgroundMap m = new BackgroundMap();
  short n;
  File file = new File(System.getProperty("user.dir")+"\\src\\icons\\pokemons");
  boolean found;
  Pokemon b;
  Personagem p;
  FightFrame f1;
  PokeData data = new PokeData();
  float[] chance,perc;
  int[] pokeID;
  int lvBase;
  int[] nwalk={180,270,50,100};
  boolean up, down, right, left, borderUp=false, borderDown=false, borderRight=false, borderLeft=false;
    /**
     * Creates new form Map
     */
    @SuppressWarnings("empty-statement")
    public Map(Personagem p,int lvBase,BackgroundMap m,int[] pokeID, float[] perc) {
        this.p=p;
        this.lvBase=lvBase;
        this.pokeID=pokeID;
        this.perc=perc;
        chance= new float[perc.length+1];
        chance[0]=0;
        for(int count=0;count<perc.length;count++){
            chance[count+1]=chance[count]+perc[count];
        }
        initComponents();
        bg.add(m);
        headerEvento.setText("                      ");
        monsterimg.setText("                ");
        fightbutton.setVisible(false);
        leaveButton.setVisible(false);
   	i = new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\character\\"+p.getCharType()+"down0.png", "");
        personagem.setIcon(i);
        Component[] comp= this.getComponents();
        for (Component comp1 : comp) {
            comp1.setFocusable(true);
            comp1.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    formKeyPressed(evt);
                }
            });
        }
    }

    private Map() {
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

        upButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        personagem = new javax.swing.JLabel();
        eventoPanel = new javax.swing.JPanel();
        headerEvento = new javax.swing.JLabel();
        monsterimg = new javax.swing.JLabel();
        fightbutton = new javax.swing.JButton();
        leaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(213, 213, 253));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        upButton.setText("▲");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        leftButton.setText("◄ ");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        downButton.setText("▼");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        rightButton.setText("►");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        bg.setLayout(new java.awt.BorderLayout());

        personagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bg.add(personagem, java.awt.BorderLayout.CENTER);

        eventoPanel.setBackground(new java.awt.Color(196, 199, 211));
        eventoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        eventoPanel.setMinimumSize(new java.awt.Dimension(438, 85));
        eventoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerEvento.setText("Mensagem Oculta");
        eventoPanel.add(headerEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        monsterimg.setText("Fotinha");
        eventoPanel.add(monsterimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 89, 85));

        fightbutton.setText("Lutar!");
        fightbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightbuttonActionPerformed(evt);
            }
        });
        eventoPanel.add(fightbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 51, -1, -1));

        leaveButton.setText("Deixar");
        leaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtonActionPerformed(evt);
            }
        });
        eventoPanel.add(leaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 51, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eventoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(leftButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(upButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(downButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightButton)
                .addGap(75, 75, 75))
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(downButton)
                            .addComponent(leftButton)
                            .addComponent(rightButton)))
                    .addComponent(eventoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        move("up",0,-10);/*
        n = (short) Math.abs(n - 1);
        i = new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\character\\up" + String.valueOf(n) + ".png", "");
        personagem.setIcon(i);
        personagem.setLocation((int) personagem.getLocation().getX(), (int) personagem.getLocation().getY() - 10);
      */  
   
personagem.repaint();    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        // TODO add your handling code here:
        move("down",0,10);
        /*n = (short) Math.abs(n - 1);
        i = new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\character\\down"  + String.valueOf(n) + ".png", "");
        personagem.setIcon(i);
        personagem.setLocation((int) personagem.getLocation().getX(), (int) personagem.getLocation().getY() + 10);
*/
         
    }//GEN-LAST:event_downButtonActionPerformed

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        move("left",-10,0);
  /*      n = (short) Math.abs(n - 1);
        i = new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\character\\left" + String.valueOf(n) + ".png", "");
        personagem.setIcon(i);
        personagem.setLocation((int) personagem.getLocation().getX() - 10, (int) personagem.getLocation().getY());
*/
personagem.repaint();    }//GEN-LAST:event_leftButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        move("right",10,0);
  /*      n = (short) Math.abs(n - 1);
        i = new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\character\\right" + String.valueOf(n) + ".png", "");
        personagem.setIcon(i);
        personagem.setLocation((int) personagem.getLocation().getX() + 10, (int) personagem.getLocation().getY());
*/
personagem.repaint();    }//GEN-LAST:event_rightButtonActionPerformed

    private void leaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveButtonActionPerformed

               leftButton.setEnabled(left);
               rightButton.setEnabled(right);
               upButton.setEnabled(up);
               downButton.setEnabled(down);
              // TODO add your handling code here:
    }//GEN-LAST:event_leaveButtonActionPerformed

    private void fightbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightbuttonActionPerformed
        b.reset();
        f1= new FightFrame(p, b);
        f1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_fightbuttonActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
 int keyCode = evt.getKeyCode();   
 switch( keyCode ) { 
        case KeyEvent.VK_UP:
            move("up",0,-10);
            break;
        case KeyEvent.VK_DOWN:
            move("down",0,10);
            break;
        case KeyEvent.VK_LEFT:
            move("left",-10,0);
            break;
        case KeyEvent.VK_RIGHT :
            move("right",10,0);
            break;
     }        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton downButton;
    private javax.swing.JPanel eventoPanel;
    private javax.swing.JButton fightbutton;
    private javax.swing.JLabel headerEvento;
    private javax.swing.JButton leaveButton;
    private javax.swing.JButton leftButton;
    private javax.swing.JLabel monsterimg;
    private javax.swing.JLabel personagem;
    private javax.swing.JButton rightButton;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables


    void searchMonster() {
       up=upButton.isEnabled();
       down=downButton.isEnabled();
       left=leftButton.isEnabled();
       right=rightButton.isEnabled();
    double random=Math.random();
    found=false;
    for(int count=0;count<chance.length-1;count++){

	if (random>=chance[count] && random<chance[count+1]){
	b=data.getPoke(pokeID[count]);
        b.setNivel((int)(lvBase+Math.random()*6));
        headerEvento.setText(b.getNome()+" Lv "+b.getNivel()+" encontrado!");
	monst=new ImageIcon(file.toString()+"\\"+pokeID[count]+".png");
	monsterimg.setIcon(monst);
	fightbutton.setVisible(true);
	leaveButton.setVisible(true);
        leftButton.setEnabled(false);
        rightButton.setEnabled(false);
        upButton.setEnabled(false);              
        downButton.setEnabled(false);
	found=true;
	count=chance.length;
	}

}

if(!found){
headerEvento.setText("Você não encontrou nada=/");
monst= new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\pokemons\\0.png");
monsterimg.setIcon(monst);
fightbutton.setVisible(false);
leaveButton.setVisible(false);
leftButton.setEnabled(left);
rightButton.setEnabled(right);
upButton.setEnabled(up);
downButton.setEnabled(down);
found=false;
     }
    }

public void move(String direction,int nx, int ny){
int x=(int)personagem.getLocation().getX();
int y=(int)personagem.getLocation().getY();
System.out.println(x+","+y);
 x+=nx;
 y+=ny;
 boolean border=false;
 
 for(int t=0;t<nwalk.length-3;t+=4){
    if(//x>=nwalk[t]&& x<=nwalk[t+1] && y>=nwalk[t+2] &&y<=nwalk[t+3]
       Math.abs(x-nwalk[t])  ==10  && y>=nwalk[t+2] &&y<=nwalk[t+3]  || 
       Math.abs(x-nwalk[t+1])==10  && y>=nwalk[t+2] &&y<=nwalk[t+3]  ||
       Math.abs(y-nwalk[t+2])==10  && x>=nwalk[t]   &&x<=nwalk[t+1]  ||
       Math.abs(y-nwalk[t+3])==10  && x>=nwalk[t]   &&x<=nwalk[t+1]  ){
        System.out.println("área não andável");
        border=true;
        if(nwalk[t]-x==10){
         rightButton.setEnabled(false);
         borderRight=true;
         borderLeft=false;
         borderDown=false;
         borderUp=false;
        }
        else{
            if(nwalk[t+1]-x==-10){
            leftButton.setEnabled(false);
            borderLeft=true;
            borderUp=false;
            borderRight=false;
            borderDown=false;
            
            }
            else{
            if(Math.abs(y-nwalk[t+2])==10){
            downButton.setEnabled(false);
            borderDown=true;
            borderUp=false;
            borderLeft=false;
            borderRight=false;
            }
            else{
            upButton.setEnabled(false);
            borderUp=true;
            borderDown=false;
            borderRight=false;
            borderLeft=false;
            }
            }
        }
    }else{
    borderUp=false;
    borderLeft=false;
    borderRight=false;
    borderDown=false;
    }
    }
 
if(y<=-150){
    upButton.setEnabled(false);
}
else{
    if(!borderUp){
    upButton.setEnabled(true);
    }}
if(y>=150){
    downButton.setEnabled(false);
    }
else{
    if(!borderDown){
    downButton.setEnabled(true);}
    }
if(x<0){
    leftButton.setEnabled(false);
    }
else{
    if(!borderLeft){
    leftButton.setEnabled(true);
    }}
if(x>670){
    rightButton.setEnabled(false);
    }
else{
    if(!borderRight){
    rightButton.setEnabled(true);
    }}
    if(n<2){
        n+=1;
    }
    else{
        n=0;
    }
   
    personagem.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\character\\"+p.getCharType()+direction+n+".png",""));
    personagem.setLocation(x, y);
    this.searchMonster();
    
}    

public void setPersonagemIcon(String var){
personagem.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\character\\"+var+".png",""));
}
}
