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
                 //ID, NOME    ,at,df,hp,evID,evLv,Tipo,[ID Habilidade];
        new Pokemon(1,"Bulbasaur",45,40,75,2,6,"Planta", 1,11,3,7),
        new Pokemon(2,"Ivysaur",55,45,100,3,16,"Planta/Venenoso",11,13,3,7),
                  //ID, NOME    ,at,df,hp,,Tipo,[ID Habilidade];
        new Pokemon(3,"Venusaur",75,65,110,"Planta/Venenoso",11,13,3,14),
        new Pokemon(4,"Charmander",55,35,70,5,6,"Fogo",1,2,3,4),
        new Pokemon(5,"Charmeleon",70,40,90,6,16,"Fogo",1,3,15,4),
        new Pokemon(6,"Charizard",90,60,100,"Fogo/Voador",1,15,16,17),
        new Pokemon(7,"Squirtle",50,45,65,8,6,"Água",1,2,3,5),
        new Pokemon(8,"Wartortle",60,50,90,9,16,"Água",1,19,3,5),
        new Pokemon(9,"Blastoise",75,70,105,"Água",1,19,20,5),
        new Pokemon(10,"Caterpie",30,30,90,11,6,"Inseto",1,2,3,8),
        new Pokemon(11,"Metapod",30,75,85,12,16,"Inseto",1,10,3,8),
        new Pokemon(12,"Butterfree",55,75,90,"Inseto/Voador",1,11,12,8),
        new Pokemon(13,"Weedle",30,30,90,14,6,"Inseto",1,2,10,8),
        new Pokemon(14,"Kakuna",30,75,85,15,16,"Inseto",1,10,3,8),
        new Pokemon(15,"Beedrill",60,70,90,"Inseto/Voador",1,2,3,9),
        new Pokemon(16,"Pidgey",50,40,70,17,6,"Normal/Voador",1,2,3,6),
        new Pokemon(17,"Pidgeotto",60,50,90,18,16,"Normal/Voador",1,17,3,6),
        new Pokemon(18,"Pidgeot",80,70,100,"Normal/Voador",1,17,18,6),        
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
