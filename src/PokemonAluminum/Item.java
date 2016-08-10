/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

import javax.swing.ImageIcon;

/**
 *
 * @author Igor
 */
public class Item implements java.io.Serializable{
private String name;
private String type;
private int id, cost,number=0;

public Item(int id,String n,int cost){
this.id=id;
this.name=n;
this.cost=cost;
this.number=1;
}
    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add1(){
        this.number+=+1;
    }
    public void addn(int i){
        this.number+=+i;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ImageIcon getIcon() {
        return new ImageIcon(System.getProperty("user.dir")+"\\src\\icons\\items\\"+this.name+".png","");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

