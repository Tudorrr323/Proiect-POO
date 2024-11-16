/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author tb173
 */
public class Desktop extends Calculator{
    private String numeTastatura, numeMouse, numeMonitor;
    private double diagonalaMonitorInch;
    
    Desktop(){
        this.numeTastatura = "Nespecificat";
        this.numeMouse = "Nespecificat";
        this.numeMonitor = "Nespecificat";
        this.diagonalaMonitorInch = 0;
    }
    
    Desktop(String numeTastatura, String numeMouse, String numeMonitor, double diagonalaMonitorInch){
        this.numeTastatura = numeTastatura;
        this.numeMouse = numeMouse;
        this.numeMonitor = numeMonitor;
        this.diagonalaMonitorInch = diagonalaMonitorInch;
    }
    
    Desktop(Desktop d){
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
