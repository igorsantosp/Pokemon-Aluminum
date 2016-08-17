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
public class Habil implements java.io.Serializable {
    int id, turnos;
    String nome, tipo, elemento, efeito; 
    float multiplicador,chance;
    //Ataque
    public Habil(int id, String nome,String tipo,String elemento,float multiplicador){
        this.id=id;
        this.nome=nome;
        this.tipo=tipo;
        this.elemento=elemento;
        this.multiplicador=multiplicador;
    }
    //Buff || Debuff COM Multiplicador
    public Habil(int id, String nome,String tipo,int turnos, String efeito,float chance, float multiplicador){
        this.id=id;
        this.nome=nome;
        this.tipo=tipo;
        this.turnos=turnos;
        this.efeito=efeito;
        this.chance=chance;
        this.multiplicador= multiplicador;
    }
    //Buff || Debuff sem multiplicador
    public Habil(int id, String nome,String tipo,int turnos, String efeito,float chance){
        this.id=id;
        this.nome=nome;
        this.tipo=tipo;
        this.turnos=turnos;
        this.efeito=efeito;
        this.chance=chance;
    }
//Ataque + Buff || Debuff
    public Habil(int id, String nome,String tipo,String elemento,float multiplicador,int turnos, String efeito,float chance){
        this.id=id;
        this.nome=nome;
        this.tipo=tipo;
        this.elemento=elemento;
        this.multiplicador=multiplicador;
        this.turnos=turnos;
        this.efeito=efeito;
        this.chance=chance;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public float getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }

    public float getChance() {
        return chance;
    }

    public void setChance(float chance) {
        this.chance = chance;
    }
    
}
