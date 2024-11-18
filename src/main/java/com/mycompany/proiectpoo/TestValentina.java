/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author va195
 */
public class TestValentina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator c1, c2, c3;
        Laptop l1, l2, l3;
        AccesoriiLaptop a1, a2, a3;
        
        c1 = new Calculator();
        c2 = new Calculator("GTX 1650", "I9-14500", "Asus C652", 32, 1500, 800);
        c3 = new Calculator(c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
        l1 = new Laptop();
        
        l2 = new Laptop("Logitech", 15.6, 2.3, true, 6);
        l2.setNumePlacaVideo(c2.getNumePlacaVideo());
        l2.setNumeProcesor(c2.getNumeProcesor());
        l2.setNumePlacaDeBaza(c2.getNumePlacaDeBaza());
        l2.setMemorieRam(c2.getMemorieRam());
        l2.setStocare(c2.getStocare());
        l2.setSursaAlimentare(c2.getSursaAlimentare());
        
        l3 = new Laptop(l2);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        
        a1 = new AccesoriiLaptop();
        a2 = new AccesoriiLaptop(true, true, false, false);
        a3 = new AccesoriiLaptop(a2);
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
    
}
