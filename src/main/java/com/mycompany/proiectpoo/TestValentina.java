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
        l2 = new Laptop("Logitech", 15.6f, 2.3f, true, 6, c2.getNumePlacaVideo(), c2.getNumeProcesor(), c2.getNumePlacaDeBaza(), c2.getMemorieRam(), 
        c2.getStocare(), c2.getSursaAlimentare());
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
