/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

import GInterface.FightFrame;

/**
 *
 * @author junior
 */
public class Habilidades {

    private String nome;
    private Pokemon pl, ad;
    private FightFrame f;
    private int dmg;

    public String getNome() {
        return nome;
    }

    public FightFrame getF() {
        return f;
    }

    public void setF(FightFrame f) {
        this.f = f;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pokemon getPl() {
        return pl;
    }

    public void setPl(Pokemon pl) {
        this.pl = pl;
    }

    public Pokemon getAd() {
        return ad;
    }

    public void setAd(Pokemon ad) {
        this.ad = ad;
    }

    public Habilidades(FightFrame f) {
        this.f = f;
    }

    public void usaSkill(int id) {
        switch (id) {
            case 1:
                investida(pl, ad);
                break;
            case 2:
                assustar(pl, ad);
                break;
            case 3:
                foco(pl, ad);
                break;
            case 4:
                brasa(pl, ad);
                break;
            case 5:
                bolhas(pl, ad);
                break;
            case 6:
                rajada(pl, ad);
                break;
            case 7:
                folhaNavalha(pl, ad);
                break;
        }
    }

    public void setButtonsName(int[] a) {
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 1:
                    f.setHabils("Investida");
                    break;
                case 2:
                    f.setHabils("Assustar");
                    break;
                case 3:
                    f.setHabils("Foco");
                    break;
                case 4:
                    f.setHabils("Brasa");
                    break;
                case 5:
                    f.setHabils("Bolhas");
                    break;
                case 6:
                    f.setHabils("Rajada de Vento");
                    break;
                case 7:
                    f.setHabils("Folha Navalha");
                    break;
            }
        }
    }

    public void investida(Pokemon a, Pokemon b) {
        dmg = a.getAtaque() - b.getDefesa();
        if (dmg > 0) {
            b.setLife(b.getLife() - dmg);
            f.setEvent(a.getNome() + " usou investida com: " + dmg + " de dano\n");
            f.baixaLife(a, (dmg * 100 / b.getLifeFixo()));
        } else {
            f.setEvent(a.getNome() + " usou investida, e falhou!\n");
        }
    }

    public void assustar(Pokemon a, Pokemon b) {
        if (Math.random() > 0.5) {
            b.setDefesa((int) (b.getDefesa() * 0.8f));
            f.setEvent(a.getNome() + " usou assustar com sucesso\n");
        } else {
            f.setEvent(a.getNome() + " usou assustar,e falhou!\n");
        }
    }

    public void foco(Pokemon a, Pokemon b) {
        if (Math.random() > 0.5) {
            a.setAtaque((int) (a.getAtaque() * 1.2f));
            f.setEvent(a.getNome() + " usou foco com sucesso\n");
        } else {
            f.setEvent(a.getNome() + " usou foco,e falhou!\n");
        }
    }

    public void brasa(Pokemon a, Pokemon b) {
        dmg = (int) ((a.getAtaque() - b.getDefesa()) * 1.5);
        if (dmg > 0) {
            b.setLife(b.getLife() - dmg);
            f.setEvent(a.getNome() + " usou brasa com: " + dmg + " de dano\n");
            f.baixaLife(a, (dmg * 100 / b.getLifeFixo()));
        } else {
            f.setEvent(a.getNome() + " usou brasa, e falhou!\n");
        }
    }

    public void bolhas(Pokemon a, Pokemon b) {
        dmg = (int) ((a.getAtaque() - b.getDefesa()) * 1.5);
        if (dmg > 0) {
            b.setLife(b.getLife() - dmg);
            f.setEvent(a.getNome() + " usou bolhas com: " + dmg + " de dano\n");
            f.baixaLife(a, (dmg * 100 / b.getLifeFixo()));
        } else {
            f.setEvent(a.getNome() + " usou bolhas, e falhou!\n");
        }
    }

    public void rajada(Pokemon a, Pokemon b) {

        dmg = (int) ((a.getAtaque() - b.getDefesa()) * 1.5);
        if (dmg > 0) {
            b.setLife(b.getLife() - dmg);
            f.setEvent(a.getNome() + " usou rajada com: " + dmg + " de dano\n");
            f.baixaLife(a, (dmg * 100 / b.getLifeFixo()));
        } else {
            f.setEvent(a.getNome() + " usou rajada, e falhou!\n");
        }
    }

    public void folhaNavalha(Pokemon a, Pokemon b) {

        dmg = (int) ((a.getAtaque() - b.getDefesa()) * 1.5);
        if (dmg > 0) {
            b.setLife(b.getLife() - dmg);
            f.setEvent(a.getNome() + " usou folha navalha com: " + dmg + " de dano\n");
            f.baixaLife(a, (dmg * 100 / b.getLifeFixo()));
        } else {
            f.setEvent(a.getNome() + " usou folha navalha, e falhou!\n");
        }
    }
}
