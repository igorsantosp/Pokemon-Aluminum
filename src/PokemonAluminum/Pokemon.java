/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

/**
 *
 * @author junior
 */
public class Pokemon {
    private String  elemento,nome;
    private int nivel, life, xp, ataque, defesa, dano,lifeFixo,id;
    private int[] atrBase=new int[3];
    private int[] habilidades= new int[4];

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getElemento() {
        return elemento;
    }

    public int getLifeFixo() {
        return lifeFixo;
    }

    public void setLifeFixo(int lifeFixo) {
        this.lifeFixo = lifeFixo;
    }

    public int[] getAtrBase() {
        return atrBase;
    }

    public void setAtrBase(int[] atrBase) {
        this.atrBase = atrBase;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(int[] habilidades) {
        this.habilidades = habilidades;
    }
    
    void reset(){
    this.ataque=atrBase[0];
    this.defesa=atrBase[1];
    this.life=atrBase[2];
    }
}
