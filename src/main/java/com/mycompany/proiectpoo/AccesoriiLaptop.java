/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author va195
 */
public class AccesoriiLaptop extends Laptop{
    private boolean areGeanta, areCoolingPad, areCasti, areProtectieEcran;
    
    AccesoriiLaptop(){
        this.areGeanta = false;
        this.areCoolingPad = false;
        this.areCasti = false;
        this.areProtectieEcran = false;
    }
    
    AccesoriiLaptop(boolean areGeanta, boolean areCoolingPad, boolean areCasti, boolean areProtectieEcran){
        this.areGeanta = areGeanta;
        this.areCoolingPad = areCoolingPad;
        this.areCasti = areCasti;
        this.areProtectieEcran = areProtectieEcran;
    }
    
    AccesoriiLaptop(AccesoriiLaptop aL){
        this.areGeanta = aL.areGeanta;
        this.areCoolingPad = aL.areCoolingPad;
        this.areCasti = aL.areCasti;
        this.areProtectieEcran = aL.areProtectieEcran;
    }
    
    public String toString(){
        return super.toString() + "Are Geanta: " + areGeanta +
                "\nAre Cooling Pad: " + areCoolingPad +
                "\nAre Casti: " + areCasti +
                "\nAre Protectie Ecran: " + areProtectieEcran + "\n";
    }
}
