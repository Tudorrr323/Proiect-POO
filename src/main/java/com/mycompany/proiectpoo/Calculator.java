/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author tb173
 */
public class Calculator extends ClasaAbstracta{
    private String numePlacaVideo, numeProcesor, numePlacaDeBaza;
    private byte memorieRam;
    private short stocare, sursaAlimentare;
    
    public void setNumePlacaVideo(String numePlacaVideo){
        this.numePlacaVideo = numePlacaVideo;
    }
    public String getNumePlacaVideo(){
        return numePlacaVideo;
    }
    
    public void setNumeProcesor(String numeProcesor){
        this.numeProcesor = numeProcesor;
    }
    public String getNumeProcesor(){
        return numeProcesor;
    }
    
    public void setNumePlacaDeBaza(String numePlacaDeBaza){
        this.numePlacaDeBaza = numePlacaDeBaza;
    }
    public String getNumePlacaDeBaza(){
        return numePlacaDeBaza;
    }
    
    public void setMemorieRam(byte memorieRam){
        this.memorieRam = memorieRam;
    }
    public byte getMemorieRam(){
        return memorieRam;
    }
    
    public void setStocare(short stocare){
        this.stocare = stocare;
    }
    public short getStocare(){
        return stocare;
    }
    
    public void setSursaAlimentare(short sursaAlimentare){
        this.sursaAlimentare = sursaAlimentare;
    }
    public short getSursaAlimentare(){
        return sursaAlimentare;
    }
    
    Calculator(){
        this.numePlacaDeBaza = "Nespecificat";
        this.numePlacaVideo = "Nespecificat";
        this.numeProcesor = "Nespecificat";
        this.memorieRam = 0;
        this.stocare = 0;
        this.sursaAlimentare = 0;
    }
    
    Calculator(String numePlacaVideo, String numeProcesor, String numePlacaDeBaza, byte memorieRam, short stocare, short sursaAlimentare){
        this.numePlacaVideo = numePlacaVideo;
        this.numeProcesor = numeProcesor;
        this.numePlacaDeBaza = numePlacaDeBaza;
        this.memorieRam = memorieRam;
        this.stocare = stocare;
        this.sursaAlimentare = sursaAlimentare;
    }
    
    Calculator(Calculator c){
        this.numePlacaVideo = c.numePlacaVideo;
        this.numeProcesor = c.numeProcesor;
        this.numePlacaDeBaza = c.numePlacaDeBaza;
        this.memorieRam = c.memorieRam;
        this.stocare = c.stocare;
        this.sursaAlimentare = c.sursaAlimentare;
    }
    
    public void afisarePornire(){
        System.out.println("Calculatorul a pornit!");
    }
    
    public void afisareInchidere(){
        System.out.println("Calculatorul s-a inchis!");
    }
    
    public String toString(){
        return "\nPlaca de baza: " + numePlacaDeBaza + 
                "\nProcesor: " + numeProcesor +
                "\nPlaca video: " + numePlacaVideo +
                "\nMemorie Ram: " + memorieRam + "GB" +
                "\nStocare: " + stocare + "GB" +
                "\nSursa de Alimentare: " + sursaAlimentare + "W";
    }
}
