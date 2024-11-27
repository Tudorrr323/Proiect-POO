/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo; 
import com.mycompany.proiectpoo.Calculator;

/**
 *
 * @author va195
 */
public class Laptop extends Calculator{
    private String numeMouse;
    private float diagonalaMonitor, greutate;
    private boolean esteIluminata;
    private byte autonomieBaterie;
    
    public void setNumeMouse(String numeMouse){
        this.numeMouse = numeMouse;
    }
    public String getNumeMouse(){
        return numeMouse;
    }
    
    public void setDiagonalaMonitor(float diagonalaMonitor){
        this.diagonalaMonitor = diagonalaMonitor;
    }
    public float getDiagonalaMonitor(){
        return diagonalaMonitor;
    }
    
    public void setGreutate(float greutate){
        this.greutate = greutate;
    }
    public float getGreutate(){
        return greutate;
    }
    
    public void setEsteIluminata(boolean esteIluminata){
        this.esteIluminata = esteIluminata;
    }
    public boolean getEsteIluminata(){
        return esteIluminata;
    }
    
    public void setAutonomieBaterie(byte autonomieBaterie){
        this.autonomieBaterie = autonomieBaterie;
    }
    public byte getAutonomieBaterie(){
        return autonomieBaterie;
    }
    
    public void afisarePornire(){
        System.out.println("Laptopul a porint!");
    }
    
    public void afisareInchidere(){
        System.out.println("Laptopul s-a inchis!");
    }
    
    Laptop(){
        super();
        this.numeMouse = "Nespecificat";
        this.diagonalaMonitor = 0.0f;
        this.greutate = 0.0f;
        this.esteIluminata = false;
        this.autonomieBaterie = 0;
    }
    
    Laptop(String numeMouse, float diagonalaMonitor, float greutate, boolean esteIluminate, byte autonomieBaterie,
            String numePlacaVideo, String numeProcesor, String numePlacaDeBaza, byte memorieRam, short stocare, short sursaAlimentare){
        super(numePlacaVideo, numeProcesor, numePlacaDeBaza, memorieRam, stocare, sursaAlimentare);
        this.numeMouse = numeMouse;
        this.diagonalaMonitor = diagonalaMonitor;
        this.greutate = greutate;
        this.esteIluminata = esteIluminata;
        this.autonomieBaterie = autonomieBaterie;
    }
    
    Laptop(Laptop l){
        super(l);
        this.numeMouse = l.numeMouse;
        this.diagonalaMonitor = l.diagonalaMonitor;
        this.greutate = l.greutate;
        this.esteIluminata = l.esteIluminata;
        this.autonomieBaterie = l.autonomieBaterie;
    }
    
    public String toString(){
        return super.toString() + "\nNume Mouse: " + numeMouse +
                "\nDiagonala Monitor: " + diagonalaMonitor +
                "\nGreutate: " + greutate +
                "\nTastatura este iluminata: " + esteIluminata +
                "\nAutonomia Bateriei: " + autonomieBaterie;
    }
}
