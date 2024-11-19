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
    
    public String toString(){
        return super.toString() + "Nume Tastatura: " + numeTastatura +
                "\nNume Mouse: " + numeMouse + 
                "\nNume Monitor: " + numeMonitor +
                "\nDiagonala Monitor Inch: " + diagonalaMonitorInch + " inch\n";
    }
}
