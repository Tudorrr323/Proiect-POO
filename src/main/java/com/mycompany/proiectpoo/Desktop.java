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
public class Desktop extends Calculator{
    private String numeTastatura, numeMouse, numeMonitor;
    private float diagonalaMonitorInch;
    
    public void setNumeTastatura(String numeTastatura){
        this.numeTastatura = numeTastatura;
    }
    public String getNumeTastatura(){
        return numeTastatura;
    }
    
    public void setNumeMouse(String numeMouse){
        this.numeMouse = numeMouse;
    }
    public String getNumeMouse(){
        return numeMouse;
    }
    
    public void setNumeMonitor(String numeMonitor){
        this.numeMonitor = numeMonitor;
    }
    public String getNumeMonitor(){
        return numeMonitor;
    }
    
    public void setDiagonalaMonitorInch(float diagonalaMonitorInch){
        this.diagonalaMonitorInch = diagonalaMonitorInch;
    }
    public float getDiagonalaMonitorInch(){
        return diagonalaMonitorInch;
    }
    
    Desktop(){
        super();
        this.numeTastatura = "Nespecificat";
        this.numeMouse = "Nespecificat";
        this.numeMonitor = "Nespecificat";
        this.diagonalaMonitorInch = 0.0f;
    }
    
    Desktop(String numeTastatura, String numeMouse, String numeMonitor, float diagonalaMonitorInch, 
            String numePlacaVideo, String numeProcesor, String numePlacaDeBaza, byte memorieRam, short stocare, short sursaAlimentare){
        super(numePlacaVideo, numeProcesor, numePlacaDeBaza, memorieRam, stocare, sursaAlimentare);
        this.numeTastatura = numeTastatura;
        this.numeMouse = numeMouse;
        this.numeMonitor = numeMonitor;
        this.diagonalaMonitorInch = diagonalaMonitorInch;
    }
    
    Desktop(Desktop d){
        super(d);
        this.numeTastatura = d.numeTastatura;
        this.numeMouse = d.numeMouse;
        this.numeMonitor = d.numeMonitor;
        this.diagonalaMonitorInch = d.diagonalaMonitorInch;
    }
    
    public void afisarePornire(){
        System.out.println("Calculatorul a pornit!");
    }
    
    public void afisareInchidere(){
        System.out.println("Calculatorul s-a inchis!");
    }
    
    public String toString(){
        return super.toString() + "\nNume Tastatura: " + numeTastatura +
                "\nNume Mouse: " + numeMouse + 
                "\nNume Monitor: " + numeMonitor +
                "\nDiagonala Monitor Inch: " + diagonalaMonitorInch + " inch";
    }
}
