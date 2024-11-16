/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author tb173
 */
public class Calculator {
    private String numePlacaVideo, numeProcesor, numePlacaDeBaza;
    private int memorieRam, stocare, sursaAlimentare;
    
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
    
    public void setMemorieRam(int memorieRam){
        this.memorieRam = memorieRam;
    }
    public int getMemorieRam(){
        return memorieRam;
    }
    
    public void setStocare(int stocare){
        this.stocare = stocare;
    }
    public int getStocare(){
        return stocare;
    }
    
    public void setSursaAlimentare(int sursaAlimentare){
        this.sursaAlimentare = sursaAlimentare;
    }
    public int getSursaAlimentare(){
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
    
    Calculator(String numePlacaVideo, String numeProcesor, String numePlacaDeBaza, int memorieRam, int stocare, int sursaAlimentare){
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
    
    public String toString(){
        return "Placa de baza: " + numePlacaDeBaza + 
                "\nProcesor: " + numeProcesor +
                "\nPlaca video: " + numePlacaVideo +
                "\nMemorie Ram: " + memorieRam + "GB" +
                "\nStocare: " + stocare + "GB" +
                "\nSursa de Alimentare: " + sursaAlimentare + "W\n";
    }
}
