/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAluminum;

import GInterface.GameMainFrame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor
 */
public class Controle {
    Personagem i;
   public Personagem read(){

    System.out.println(System.getProperty("user.dir")+"\\user.dat");
try{
    FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\user.dat"); 
    ObjectInputStream obi= new ObjectInputStream(fi);
     this.i=(Personagem)obi.readObject();
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(Personagem.class.getName()).log(Level.SEVERE, null, ex);
        
    } catch (IOException ex) {
        System.out.println("Impossível ler/escrever arquivo");
    }
    return i;
    
}

public void save(Personagem p, GameMainFrame f){
  try{
        FileOutputStream out = new FileOutputStream(System.getProperty("user.dir")+"\\user.dat");
        ObjectOutputStream obout= new ObjectOutputStream(out);
        p.getPoke(0).setFrame(null);
        obout.writeObject(p);
        p.getPoke(0).setFrame(f);
  } 
  catch (FileNotFoundException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
