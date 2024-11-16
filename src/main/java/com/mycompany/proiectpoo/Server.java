/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author tb173
 */
public class Server extends Calculator{
    private int nrProcesoare, nrPorturiUSB, nrDiscuriStocare;
    private boolean reteaGigabit;
    private String sistemRacire;
    
    Server(){
        this.nrProcesoare = 0;
        this.nrPorturiUSB = 0;
        this.nrDiscuriStocare = 0;
        this.reteaGigabit = false;
        this.sistemRacire = "Nespecificat";
    }
    
    Server(int nrProcesoare, int nrPorturiUSB, int nrDiscuriStocare, boolean reteaGigabit, String sistemRacire){
        this.nrProcesoare = nrProcesoare;
        this.nrPorturiUSB = nrPorturiUSB;
        this.nrDiscuriStocare = nrDiscuriStocare;
        this.reteaGigabit = reteaGigabit;
        this.sistemRacire = sistemRacire;
    }
    
    Server(Server s){
        this.nrProcesoare = s.nrProcesoare;
        this.nrPorturiUSB = s.nrPorturiUSB;
        this.nrDiscuriStocare = s.nrDiscuriStocare;
        this.reteaGigabit = s.reteaGigabit;
        this.sistemRacire = s.sistemRacire;
    }
    
    public String toString(){
        return super.toString() + "Numar Procesoare: " + nrProcesoare +
                "\nNumar Porturi USB: " + nrPorturiUSB +
                "\nNumar Discuri de Stocare: " + nrDiscuriStocare +
                "\nRetea Gigabit: " + reteaGigabit + 
                "\nSistem de Racire: " + sistemRacire + "\n";
    }
}
