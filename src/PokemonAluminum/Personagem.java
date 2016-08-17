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
private ArrayList<Item> itens;
private int silver;
private int id;
private String nome;
private char charType;

public Personagem(){
pokes= new ArrayList();
itens=new ArrayList();
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

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
    
    public Item getItem(int position) {
        return itens.get(position);
    }

    public void addNewItem(Item i) {
        if(this.itens.contains(i)){
        this.itens.get(this.itens.indexOf(i)).add1();
        }else{
        this.itens.add(i);
        }
    }
    public void addNewItem(int position,Item i) {
        this.itens.add(position,i);
    }

    public char getCharType() {
        return charType;
    }

    public void setCharType(char charType) {
        this.charType = charType;
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
