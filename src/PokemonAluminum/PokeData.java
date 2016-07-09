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
    Pokemon[] poke= new Pokemon[5];
        Pokemon bulba= new Pokemon();
	int[]attrib1 = {80,70,160};
	int[]habil1={1,2,3,7};
        Pokemon charmander = new Pokemon();
	int[]attrib2={100,50,140};
	int[]habil2={1,2,3,4};
        Pokemon squirtle = new Pokemon();
	int[]attrib3={90,80,130};
	int[]habil3={1,2,3,5};
        Pokemon caterpie = new Pokemon();
	int[]attrib4={40,30,150};
	int[]habil4={1,2,3,7};
        Pokemon pidgey = new Pokemon();
	int[]attrib5={70,50,140};
	int[]habil5={1,2,3,6};
        
        public PokeData(){
        bulba.setId(1);
        bulba.setNome("Bulbassauro");
        bulba.setAtrBase(attrib1);
        bulba.setAtaque(attrib1[0]);
        bulba.setDefesa(attrib1[1]);
        bulba.setLifeFixo(attrib1[2]);
        bulba.setLife(attrib1[2]);
        bulba.setHabilidades(habil1);
        bulba.setElemento("Planta");
		
	charmander.setId(2);
        charmander.setNome("Charmander");
        charmander.setAtrBase(attrib2);
        charmander.setAtaque(attrib2[0]);
        charmander.setDefesa(attrib2[1]);
        charmander.setLifeFixo(attrib2[2]);
        charmander.setLife(attrib2[2]);
        charmander.setHabilidades(habil2);
        charmander.setElemento("Fogo");
        
	squirtle.setId(3);
        squirtle.setNome("Squirtle");
        squirtle.setAtrBase(attrib3);
        squirtle.setAtaque(attrib3[0]);
        squirtle.setDefesa(attrib3[1]);
        squirtle.setLifeFixo(attrib3[2]);
        squirtle.setLife(attrib3[2]);
        squirtle.setHabilidades(habil3);
        squirtle.setElemento("Água");
	
	
	caterpie.setId(4);
        caterpie.setNome("Caterpie");
        caterpie.setAtrBase(attrib4);
        caterpie.setAtaque(attrib4[0]);
        caterpie.setDefesa(attrib4[1]);
        caterpie.setLifeFixo(attrib4[2]);
        caterpie.setLife(attrib4[2]);
        caterpie.setHabilidades(habil4);
        caterpie.setElemento("Inseto");

	
	
	pidgey.setId(5);
        pidgey.setNome("Pidgey");
        pidgey.setAtrBase(attrib5);
        pidgey.setAtaque(attrib5[0]);
        pidgey.setDefesa(attrib5[1]);
        pidgey.setLifeFixo(attrib5[2]);
        pidgey.setLife(attrib5[2]);
        pidgey.setHabilidades(habil5);
        pidgey.setElemento("Voador");

	poke[0]=bulba;
        poke[1]=charmander;
        poke[2]=squirtle;
        poke[3]=caterpie;
        poke[4]=pidgey;
        
        
        }
        
      Pokemon getPoke(int id){
          return poke[id-1];
      }
      int getNumPoke(){
          return poke.length;
      }
}
