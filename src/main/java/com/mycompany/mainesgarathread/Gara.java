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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Gara {
    
    
    private int numeroCorridori;
    private ArrayList<ThreadNumCorridori> corridori = new ArrayList<>();

    public Gara() {
    }

    public void nuovoCorridore(ThreadNumCorridori a) {
        corridori.add(a);
    }

    public void aggiungiCorridori() {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader letturaInput = new BufferedReader(input);

        try {
            System.out.print("Scrivi il numero di corridori: ");
            numeroCorridori = Integer.valueOf(letturaInput.readLine()).intValue();
        } catch (Exception e) {
            System.out.println("ERRORE: " + e.getMessage());
        }

        for (int i = 0; i < numeroCorridori; i++) {
            try {
                System.out.print("Nome corridore del corridore " + (i + 1) + ": ");
                nuovoCorridore(new ThreadNumCorridori(letturaInput.readLine()));
            } catch (Exception e) {
                System.out.println("ERRORE: " + e.getMessage());
            }
        }
    }

    public void avviaGara() throws InterruptedException {
        for (ThreadNumCorridori c : corridori) {
            c.start();
        }
    }

    public void classifica() {
        Collections.sort(corridori, Comparator.comparing(ThreadNumCorridori::getTempoArrivo));
        stampaClassifica();
    }

    private void stampaClassifica() {
        for (int i = 0; i < corridori.size(); i++) {
            System.out.println((i + 1) + "° Classificato: " + corridori.get(i).getNome() + ", Tempo: " + corridori.get(i).getTempoArrivo());
        }
    }
    
    
    
}
