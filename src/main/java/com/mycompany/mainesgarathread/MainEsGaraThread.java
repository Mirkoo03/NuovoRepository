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
public class MainEsGaraThread {
    
    public static void main(String[] args) throws InterruptedException {
        Gara gara1 = new Gara();
        gara1.aggiungiCorridori();
        gara1.avviaGara();
        gara1.classifica();
        
    }
    
    
    
}
