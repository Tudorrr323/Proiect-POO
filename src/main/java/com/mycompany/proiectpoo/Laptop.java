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
        return super.toString() + "Nume Mouse: " + numeMouse +
                "\nDiagonala Monitor: " + diagonalaMonitor +
                "\nGreutate: " + greutate +
                "\nTastatura este iluminata: " + esteIluminata +
                "\nAutonomia Bateriei: " + autonomieBaterie + "\n";
    }
}
