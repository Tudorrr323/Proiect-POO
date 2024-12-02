/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;
import com.mycompany.proiectpoo.Laptop;
/**
 *
 * @author va195
 */
public class AccesoriiLaptop extends Laptop{
    private boolean areGeanta, areCoolingPad, areCasti, areProtectieEcran;
    
    public void setAreGeanta(boolean areGeanta){
        this.areGeanta = areGeanta;
    }
    public boolean getAreGeanta(){
        return areGeanta;
    }
    
    public void setAreCoolingPad(boolean areCoolingPad){
        this.areCoolingPad = areCoolingPad;
    }
    public boolean getAreCoolingPad(){
        return areCoolingPad;
    }
    
    public void setAreCasti(boolean areCasti){
        this.areCasti = areCasti;
    }
    public boolean getAreCasti(){
        return areCasti;
    }
    
    public void setAreProtectieEcran(boolean areProtectieEcran){
        this.areProtectieEcran = areProtectieEcran;
    }
    public boolean getAreProtectieEcran(){
        return areProtectieEcran;
    }
    
    AccesoriiLaptop(){
        super();
        this.areGeanta = false;
        this.areCoolingPad = false;
        this.areCasti = false;
        this.areProtectieEcran = false;
    }
    
    AccesoriiLaptop(boolean areGeanta, boolean areCoolingPad, boolean areCasti, boolean areProtectieEcran, String numeMouse, float diagonalaMonitor, 
            float greutate, boolean esteIluminata, byte autonomieBaterie, String numePlacaVideo, String numeProcesor, String numePlacaDeBaza,
            byte memorieRam, short stocare, short sursaAlimentare){
        super(numeMouse, diagonalaMonitor, greutate, esteIluminata, autonomieBaterie, numePlacaVideo, numeProcesor, numePlacaDeBaza, memorieRam, 
                stocare, sursaAlimentare);
        this.areGeanta = areGeanta;
        this.areCoolingPad = areCoolingPad;
        this.areCasti = areCasti;
        this.areProtectieEcran = areProtectieEcran;
    }
    
    AccesoriiLaptop(AccesoriiLaptop aL){
        super(aL);
        this.areGeanta = aL.areGeanta;
        this.areCoolingPad = aL.areCoolingPad;
        this.areCasti = aL.areCasti;
        this.areProtectieEcran = aL.areProtectieEcran;
    }
    
    public void afisarePornire(){
        System.out.println("Laptopul a porint!");
    }
    
    public void afisareInchidere(){
        System.out.println("Laptopul s-a inchis!");
    }
    
    public String toString(){
        return super.toString() + "\nAre Geanta: " + areGeanta +
                "\nAre Cooling Pad: " + areCoolingPad +
                "\nAre Casti: " + areCasti +
                "\nAre Protectie Ecran: " + areProtectieEcran;
    }
}
