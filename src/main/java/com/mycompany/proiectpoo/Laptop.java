/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author va195
 */
public class Laptop extends Calculator{
    private String numeMouse;
    private double diagonalaMonitor, greutate;
    private boolean esteIluminata;
    private int autonomieBaterie;
    
    Laptop(){
        this.numeMouse = "Nespecificat";
        this.diagonalaMonitor = 0.0;
        this.greutate = 0.0;
        this.esteIluminata = false;
        this.autonomieBaterie = 0;
    }
    
    Laptop(String numeMouse, double diagonalaMonitor, double greutate, boolean esteIluminate, int autonomieBaterie){
        this.numeMouse = numeMouse;
        this.diagonalaMonitor = diagonalaMonitor;
        this.greutate = greutate;
        this.esteIluminata = esteIluminata;
        this.autonomieBaterie = autonomieBaterie;
    }
    
    Laptop(Laptop l){
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
