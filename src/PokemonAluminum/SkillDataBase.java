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
public class SkillDataBase {
static Habil[] habil;


public static void criaSkillDatabase(){
Habil[] lista={
    //       ID,Nome,tipo,elemento,multiplicador
    new Habil(1,"Investida","Ataque","Normal",1.0f),
    //       ID,Nome,tipo,turnos,efeito,chance de acerto
    new Habil(2,"Assustar","Debuff",1,"Ataque-",0.5f,0.2f),
    new Habil(3,"Foco","Buff",1,"Ataque+",0.5f,0.3f),
    new Habil(4,"Brasa","Ataque","Fogo",1.5f),
    new Habil(5,"Bolhas","Ataque","Água",1.5f),
    new Habil(6,"Cortina De Vento","Ataque","Voador",1.5f),
    new Habil(7,"Folha Navalha","Ataque","Planta",1.5f),
    new Habil(8,"Tiro De Teia","Debuff",1,"Paralysis",0.5f),
    new Habil(9,"Ferroada De Inseto","Ataque/Debuff","Inseto",1.6f,3,"Poison",0.3f),
    new Habil(10,"Endurecer","Buff",1,"Defesa+",0.5f,0.3f),
    new Habil(11,"Pó Venenoso","Debuff",2,"Poison",0.5f),
    new Habil(12,"Pó do Sono","Debuff",2,"Sleep",0.3f),
    new Habil(13,"Semente Sanguessuga","Ataque/Buff","Planta",1.1f,3,"Life+",0.2f),
    new Habil(14,"Raio Solar","Ataque","Planta",1.7f),
    new Habil(15,"Lança Chamas","Ataque/Debuff","Fogo",1.6f,2,"Burn",0.3f),
    new Habil(16,"Investida de Chamas","Ataque/Debuff","Fogo",1.7f,2,"Burn",0.3f),
    new Habil(17,"Ataque de Asa","Ataque","Voador",1.6f),
    new Habil(18,"Furacão","Ataque/Debuff","Voador",1.7f,2,"Stun",0.3f),
    new Habil(19,"Jato D'Água","Ataque","Água",1.7f),
    new Habil(20,"Hydro Bomba","Ataque/Debuff","Água",1.7f,2,"Stun",0.2f),
};
habil=lista;
}
public static Habil getHabilidade(int id){
return habil[id-1];
}
}
