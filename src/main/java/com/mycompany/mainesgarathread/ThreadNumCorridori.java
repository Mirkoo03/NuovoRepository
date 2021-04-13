/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mainesgarathread;

/**
 *
 * @author macbook
 */
public class ThreadNumCorridori extends Thread{
    
    private String nome;
    private long tempoPartenza;
    private long tempoArrivo;
    
    public ThreadNumCorridori(String nome) {
        this.nome = nome;
        this.tempoArrivo = 0;
        this.tempoPartenza = 0;
    }
    
    @Override
    public void run() {
        tempoPartenza = System.nanoTime(); //variabile long perchè int dava errore
        for (int j = 0; j <= 100; j++) { 
            if (j == 100) {
                System.out.println("Il corridore: " + nome + ", è arrivato!");
            }
        }
        tempoArrivo = System.nanoTime() - tempoPartenza; //variabile long perchè int dava errore
    }
    
    
    public String getNome() {
        return nome;
    }
    
      public long getTempoArrivo() {
        return tempoArrivo;
    }
    
    
}
