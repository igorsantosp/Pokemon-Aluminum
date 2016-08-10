/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

import GInterface.GameMainFrame;
import java.io.Serializable;

/**
 *
 * @author junior
 */
public class Pokemon extends Monstro implements Serializable {

    private String elemento, nome,debuff="";
    private int nivel = 0, life, xp, ataque, defesa, lifeFixo, id, evolutionID,evolutionLevel;
    private int xpNext=50,turnos;
    private boolean evolution=false;
    private int[] atrBase = new int[3];
    private Habil[] habilidades = new Habil[4];
    private int[] wl = new int[2];
    private GameMainFrame frame;
    private int[] bonus= new int[3];
    SkillDataBase Skills= new SkillDataBase();
    public Pokemon(){
    
    }
    
    public Pokemon(int id, String name,int atq,int def,int hp, String element, int... habil){
        this.id=id;
        this.nome=name;
        this.atrBase[0]=atq;
        this.atrBase[1]=Math.round(def*1.2f);
        this.atrBase[2]=Math.round(hp*1.5f);; 
        this.lifeFixo=this.atrBase[2];
        for(int i=0;i<habil.length;i++){
        this.habilidades[i]=Skills.getHabilidade(habil[i]);
        }
        this.elemento=element;
        this.reset();
    }
    
    public Pokemon(int id, String name,int atq,int def,int hp,int idEv, int lvEv, String element, int... habil){
        this.id=id;
        this.nome=name;
        this.evolutionID=idEv;
        this.evolutionLevel=lvEv;
        this.atrBase[0]=atq;
        this.atrBase[1]=Math.round(def*1.2f);
        this.atrBase[2]=Math.round(hp*1.5f);; 
        this.lifeFixo=this.atrBase[2];
        for(int i=0;i<habil.length;i++){
        this.habilidades[i]=Skills.getHabilidade(habil[i]);
        }
        this.elemento=element;
        this.reset();
    }

    public int getXpNext() {
        return xpNext;
    }

    public void setXpNext(int xpNext) {
        this.xpNext = xpNext;
    }

    
    
    public int getEvolutionID() {
        return evolutionID;
    }

    public void setEvolutionID(int evolutionID) {
        this.evolutionID = evolutionID;
    }

    public int getEvolutionLevel() {
        return evolutionLevel;
    }

    public void setEvolutionLevel(int evolutionLevel) {
        this.evolutionLevel = evolutionLevel;
    }

    public boolean isEvolution() {
        return evolution;
    }

    public void setEvolution(boolean evolution) {
        this.evolution = evolution;
    }

    public String getDebuff() {
        return debuff;
    }

    public void setDebuff(String debuff) {
        this.debuff = debuff;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }
    
    
    public GameMainFrame getFrame() {
        return frame;
    }

    public void setFrame(GameMainFrame frame) {
        this.frame = frame;
    }

    public int[] getWl() {
        return wl;
    }

    public void setWin() {
        this.wl[0] += 1;
    }

    public void setLose() {
        this.wl[1] += 1;
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
        if(xp>0)
        this.xp = this.xp+xp;
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

    public Habil[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habil[] habilidades) {
        this.habilidades = habilidades;
    }
    public void setAtaqueBonus(int i){
    bonus[0]=bonus[0]+i;
    }
    public void setDefesaBonus(int i){
    bonus[0]=bonus[1]+i;
    }
    public void setLifeBonus(int i){
    bonus[0]=bonus[2]+i;
    }

    public int[] getBonus() {
        return bonus;
    }

    public void setBonus(int[] bonus) {
        this.bonus = bonus;
    }
    
    
    
    @Override
    public void reset() {
        while(this.xp>=this.xpNext){
        this.nivel++;
        this.xp=this.xp-this.xpNext;
        this.xpNext=50+this.nivel*10;
        }
        this.ataque = (int) (this.atrBase[0] + (this.atrBase[0] * 0.05 * this.nivel))+bonus[0];
        this.defesa = (int) (this.atrBase[1] + (this.atrBase[1] * 0.05 * this.nivel))+bonus[1];
        this.lifeFixo = (int) (this.atrBase[2] + (this.atrBase[2] * 0.05 * this.nivel))+bonus[2];
        this.life = (int) (this.atrBase[2] + (this.atrBase[2] * 0.1 * this.nivel));
        if(this.nivel>=this.evolutionLevel && this.evolutionLevel>1){
            this.evolution=true;
        }else{
        this.evolution=false;
        }
    }
    
    public void getOldStatus(Pokemon e){
    this.bonus=e.getBonus();
    this.nivel=e.getNivel();
    this.wl=e.getWl();
    this.frame=e.getFrame();
    }

    @Override
    public void atualizaCampo() {
        this.frame.setData();
    }

}
