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
public class PokeData {

    private static Pokemon[] poke;

    public PokeData() {
       
        Pokemon[] list = {
        new Pokemon(1,"Bulbasaur",80,70,160,2,6,"Planta", 1,2,3,7),
        new Pokemon(2,"Ivysaur",100,90,200,3,16,"Planta",1,2,3,7),
        new Pokemon(3,"Venusaur",120,100,250,"Planta",1,2,3,7),
        new Pokemon(4,"Charmander",100,50,140,5,6,"Fogo",1,2,3,4),
        new Pokemon(5,"Charmeleon",120,60,170,6,16,"Fogo",1,2,3,4),
        new Pokemon(6,"Charizard",150,70,180,"Fogo",1,2,3,4),
        new Pokemon(7,"Squirtle",90,80,130,8,6,"Água",1,2,3,5),
        new Pokemon(8,"Wartortle",110,100,150,9,16,"Água",1,2,3,5),
        new Pokemon(9,"Blastoise",130,170,200,"Água",1,2,3,5),
        new Pokemon(10,"Caterpie",40,30,150,11,6,"Inseto",1,2,3,7),
        new Pokemon(11,"Metapod",50,90,160,12,16,"Inseto",1,2,3,7),
        new Pokemon(12,"Butterfree",90,90,180,"Inseto",1,2,3,7),
        new Pokemon(13,"Weedle",40,20,150,14,6,"Inseto",1,2,3,7),
        new Pokemon(14,"Kakuna",50,90,160,15,16,"Inseto",1,2,3,7),
        new Pokemon(15,"Beedrill",100,90,150,"Inseto",1,2,3,7),
        new Pokemon(16,"Pidgey",70,50,140,17,6,"Voador",1,2,3,6),
        new Pokemon(17,"Pidgeotto",90,70,160,18,16,"Voador",1,2,3,6),
        new Pokemon(18,"Pidgeot",130,90,190,"Voador",1,2,3,6),        
        };
        poke=list;
    }

    public static Pokemon getPoke(int id) {
        return poke[id - 1];
    }

    public int getNumPoke() {
        return poke.length;
    }
}
