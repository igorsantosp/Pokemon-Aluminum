/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

import GInterface.GameMainFrame;

/**
 *
 * @author junior
 */
public class Pokemon extends Monstro {

    private String elemento, nome;
    private int nivel = 0, life, xp, ataque, defesa, lifeFixo, id;
    private int[] atrBase = new int[3];
    private int[] habilidades = new int[4];
    private int[] wl = new int[2];
    private GameMainFrame frame;

    public GameMainFrame getFrame() {
        return frame;
    }

    public void setFrame(GameMainFrame frame) {
        this.frame = frame;
    }

    public int[] getWl() {
        return wl;
    }

    public void setWin(int w) {
        this.wl[0] = w;
    }

    public void setLose(int l) {
        this.wl[1] = l;
    }

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

    @Override
    public void reset() {

        this.ataque = (int) (this.atrBase[0] + (this.atrBase[0] * 0.1 * this.nivel));
        this.defesa = (int) (this.atrBase[1] + (this.atrBase[1] * 0.1 * this.nivel));
        this.lifeFixo = (int) (this.atrBase[2] + (this.atrBase[2] * 0.1 * this.nivel));
        this.life = (int) (this.atrBase[2] + (this.atrBase[2] * 0.1 * this.nivel));

    }

    @Override
    public void atualizaCampo() {
        this.frame.setData(this);
    }

}
