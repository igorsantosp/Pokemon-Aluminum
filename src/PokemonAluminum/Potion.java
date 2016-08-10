/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

/**
 *
 * @author Igor
 */
public class Potion extends Item {
private String effect;
private int qt;

public Potion(int id,String n,int cost,String ef,int qt){
super(id,n,cost);
super.setType("Potion");
this.effect=ef;
this.qt=qt;
}

    public String getEffect() {
        return effect;
    }
    
    public int getQt() {
        return qt;
    }

    

}
