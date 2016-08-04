/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

import java.util.ArrayList;


/**
 *
 * @author Igor
 */
public class Personagem implements java.io.Serializable, java.lang.Cloneable{
private ArrayList <Pokemon> pokes;
private Pokemon[] mainteam = new Pokemon[4];
private Item[] itens;
private int silver;
private int id;
private String nome;

public Personagem(){
pokes= new ArrayList();
}

    public ArrayList<Pokemon> getPokes() {
        return pokes;
    }
    public Pokemon getPoke(int i) {

    return pokes.get(i);
    }

    public void setPokes(ArrayList<Pokemon> pokes) {
        this.pokes = pokes;
    }
    public void setPoke(Pokemon e) {
        pokes.add(e);
    }
    
    public void setPoke(Pokemon e, int i){
    pokes.remove(i);
    pokes.add(i, e);
    }
    
    public Pokemon[] getMainteam() {
        return mainteam;
    }

    public void setMainteam(Pokemon[] mainteam) {
        this.mainteam = mainteam;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
