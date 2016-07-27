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
private Pokemon p;
private JLabel label;

 public  void calculaResultado(JTextArea a, Pokemon p){
        this.p=p;
        double ran= Math.random();
        switch(mission){
        
        case 0:
        if (ran>0.5){
        a.setText("Você ganhou: \n "+(mission+1)*5+" doláres e uma pokebola");
        p.setNivel(p.getNivel()+1);
        p.reset();
        }else{
        a.setText("Você não encontrou nada");
        }    
            
            break;
        case 1:
        if (ran>0.5){
        a.setText("Você ganhou:\n "+(mission+1)*5+" doláres e uma greatball");
        p.setNivel(p.getNivel()+1);
        p.reset();
        }else{
        a.setText("Você não encontrou nada");
        }        
            break;
        case 2:
        if (ran>0.5){
        a.setText("Você ganhou:\n "+(mission+1)*5+" doláres e uma masterball");
        p.setNivel(p.getNivel()+1);
        p.reset();}else{
        a.setText("Você não encontrou nada");
        }        
            break;
        case 3:
        if (ran>0.5){
        a.setText("Você ganhou:\n "+(mission+1)*5+" doláres e 15 de ataque");
        p.setAtaqueBonus(15);
        p.setNivel(p.getNivel()+1);
        p.reset();
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
