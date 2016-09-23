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
        new Pokemon(2,"Ivysaur",50,45,85,3,16,"Planta/Venenoso",11,13,3,7),
                  //ID, NOME    ,at,df,hp,,Tipo,[ID Habilidade];
        new Pokemon(3,"Venusaur",60,50,105,"Planta/Venenoso",11,13,3,14),
        new Pokemon(4,"Charmander",55,35,70,5,6,"Fogo",1,2,3,4),
        new Pokemon(5,"Charmeleon",60,40,80,6,16,"Fogo",1,3,15,4),
        new Pokemon(6,"Charizard",70,45,90,"Fogo/Voador",1,15,16,17),
        new Pokemon(7,"Squirtle",50,45,65,8,6,"Água",1,2,3,5),
        new Pokemon(8,"Wartortle",55,50,75,9,16,"Água",1,19,3,5),
        new Pokemon(9,"Blastoise",65,60,80,"Água",1,19,20,5),
        new Pokemon(10,"Caterpie",35,30,90,11,6,"Inseto",1,2,3,8),
        new Pokemon(11,"Metapod",30,65,75,12,16,"Inseto",1,10,3,8),
        new Pokemon(12,"Butterfree",55,75,90,"Inseto/Voador",1,11,12,8),
        new Pokemon(13,"Weedle",35,30,90,14,6,"Inseto",1,2,10,8),
        new Pokemon(14,"Kakuna",30,65,75,15,16,"Inseto",1,10,3,8),
        new Pokemon(15,"Beedrill",60,70,90,"Inseto/Voador",1,2,3,9),
        new Pokemon(16,"Pidgey",50,40,70,17,6,"Normal/Voador",1,2,3,6),
        new Pokemon(17,"Pidgeotto",55,45,80,18,16,"Normal/Voador",1,17,3,6),
        new Pokemon(18,"Pidgeot",65,50,90,"Normal/Voador",1,17,18,6),        
        new Pokemon(19,"Ratata",50,35,80,20,12,"Normal",1,25,3,33),
        new Pokemon(20,"Raticate",55,40,85,"Normal",22,25,23,33),
        new Pokemon(21,"Spearow",45,45,75,21,12,"Voador",1,23,3,6),
        new Pokemon(22,"Fearow",55,45,80,"Voador",17,23,3,6),
        new Pokemon(23,"Ekans",50,35,80,24,12,"Venenoso",1,27,3,25),
        new Pokemon(24,"Arbok",60,40,80,"Venoso",1,27,26,25),
        new Pokemon(25,"Pikachu",50,45,85,25,16,"Elétrico",1,30,28,33),
        new Pokemon(25,"Raichu",60,50,90,"Elétrico",1,31,28,33),
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
