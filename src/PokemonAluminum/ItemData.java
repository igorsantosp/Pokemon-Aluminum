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
public class ItemData {
    static Item[] item;

    
    
 public static void CriaItens(){
 Item[] i={
     new Pokeball(1,"Pokeball",10,0.4f),
     new Pokeball(2,"Greatball",100,0.6f),
     new Pokeball(3,"Ultraball",400,0.8f),
     new Pokeball(4,"Masterball",800,1.0f),
     new Pokeball(5,"Safariball",600,0.8f),
     new Potion(6,"Potion",200,"hp+",80),
     new Potion(7,"SuperPotion",600,"hp+",200),
     new Potion(8,"HyperPotion",1500,"hp+",450),
     
 };
 item= i;
 }
    public static Item getItem(int id){
return item[id-1];
}
}
