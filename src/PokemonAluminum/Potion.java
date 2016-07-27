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

public Potion(){
super.setTipo("Potion");
}

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }


}
