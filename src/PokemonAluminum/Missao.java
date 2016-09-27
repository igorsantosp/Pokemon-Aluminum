/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Igor
 */
public class Missao {
private    int mission;
private    boolean activate;
private Personagem p;
private JLabel label;

 public  void calculaResultado(JTextArea a, Personagem p){
        this.p=p;
        double ran= Math.random();
        switch(mission){
        
        case 0:
        if (ran>0.1){
        a.setText("Você ganhou: \n "+(mission+1)*5+" silver e uma pokebola");
        p.setSilver(p.getSilver()+(mission+1)*5);
        p.addNewItem(ItemData.getItem(1));
        p.getPoke(0).setXp(100);
        p.getPoke(0).reset();
        }else{
        a.setText("Você não encontrou nada");
        }    
            
            break;
        case 1:
        if (ran>0.1){
        a.setText("Você ganhou:\n "+(mission+1)*5+" Silver e uma greatball");
        p.setSilver(p.getSilver()+(mission+1)*5);
        p.addNewItem(ItemData.getItem(2));
        p.getPoke(0).setXp(200);
        p.getPoke(0).reset();
        }else{
        a.setText("Você não encontrou nada");
        }        
            break;
        case 2:
        if (ran>0.1){
        a.setText("Você ganhou:\n "+(mission+1)*5+" silver e uma masterball");
        p.setSilver(p.getSilver()+(mission+1)*5);
        p.addNewItem(ItemData.getItem(4));
        p.getPoke(0).setXp(300);
        p.getPoke(0).reset();}else{
        a.setText("Você não encontrou nada");
        }        
            break;
        case 3:
        if (ran>0.1){
        a.setText("Você ganhou:\n "+(mission+1)*5+" silver e 15 de ataque");
        p.setSilver(p.getSilver()+(mission+1)*5);
        p.getPoke(0).setAtaqueBonus(15);
        p.getPoke(0).setXp(400);
        p.getPoke(0).reset();
        }else{
        a.setText("Você não encontrou nada");
        }        
            break;
    
    }
    
    
    
    }

    public void setMission(int mission) {
        this.mission = mission;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}
