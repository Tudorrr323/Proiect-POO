/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;
import com.mycompany.proiectpoo.Calculator;

/**
 *
 * @author tb173
 */
public class Server extends Calculator{
    private byte nrProcesoare, nrPorturiUSB, nrDiscuriStocare;
    private boolean reteaGigabit;
    private String sistemRacire;
    
    public void setSistemRacire(String sistemRacire){
        this.sistemRacire = sistemRacire;
    }
    public String getSistemRacire(){
        return sistemRacire;
    }
    
    public void setReteaGigabit(boolean reteaGigabit){
        this.reteaGigabit = reteaGigabit;
    }
    public boolean getReteaGigabit(){
        return reteaGigabit;
    }
    
    public void setNrProcesoare(byte nrProcesoare){
        this.nrProcesoare = nrProcesoare;
    }
    public byte getNrProcesoare(){
        return nrProcesoare;
    }
    
    public void setNrPorturiUSB(byte nrPorturiUSB){
        this.nrPorturiUSB = nrPorturiUSB;
    }
    public byte getNrPorturiUSB(){
        return nrPorturiUSB;
    }
    
    public void setnrDiscuriStocare(byte nrDiscuriStocare){
        this.nrDiscuriStocare = nrDiscuriStocare;
    }
    public byte getNrDiscuriStocare(){
        return nrDiscuriStocare;
    }
    
    Server(){
        super();
        this.nrProcesoare = 0;
        this.nrPorturiUSB = 0;
        this.nrDiscuriStocare = 0;
        this.reteaGigabit = false;
        this.sistemRacire = "Nespecificat";
    }
    
    Server(byte nrProcesoare, byte nrPorturiUSB, byte nrDiscuriStocare, boolean reteaGigabit, String sistemRacire,
            String numePlacaVideo, String numeProcesor, String numePlacaDeBaza, byte memorieRam, short stocare, short sursaAlimentare){
        super(numePlacaVideo, numeProcesor, numePlacaDeBaza, memorieRam, stocare, sursaAlimentare);
        this.nrProcesoare = nrProcesoare;
        this.nrPorturiUSB = nrPorturiUSB;
        this.nrDiscuriStocare = nrDiscuriStocare;
        this.reteaGigabit = reteaGigabit;
        this.sistemRacire = sistemRacire;
    }
    
    Server(Server s){
        super(s);
        this.nrProcesoare = s.nrProcesoare;
        this.nrPorturiUSB = s.nrPorturiUSB;
        this.nrDiscuriStocare = s.nrDiscuriStocare;
        this.reteaGigabit = s.reteaGigabit;
        this.sistemRacire = s.sistemRacire;
    }
    
    public void afisarePornire(){
        System.out.println("Serverul a pornit!");
    }
    
    public void afisareInchidere(){
        System.out.println("Serverul s-a inchis!");
    }
    
    public String toString(){
        return super.toString() + "\nNumar Procesoare: " + nrProcesoare +
                "\nNumar Porturi USB: " + nrPorturiUSB +
                "\nNumar Discuri de Stocare: " + nrDiscuriStocare +
                "\nRetea Gigabit: " + reteaGigabit + 
                "\nSistem de Racire: " + sistemRacire;
    }
}
