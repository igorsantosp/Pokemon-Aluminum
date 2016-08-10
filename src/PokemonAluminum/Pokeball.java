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
public class Pokeball extends Item {
private float chance;


public Pokeball(int id,String n,int cost,float chance){
super(id,n,cost);
super.setType("Potion");
this.chance=chance;
}

    public float getChance() {
        return chance;
    }


}
