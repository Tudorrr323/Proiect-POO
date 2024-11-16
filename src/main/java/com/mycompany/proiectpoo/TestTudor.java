/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proiectpoo;

/**
 *
 * @author tb173
 */
public class TestTudor {
    public static void main(String[] args) {
        Calculator c1, c2, c3;
        Desktop d1, d2, d3;
        Server s1, s2, s3;
        
        c1 = new Calculator();
        c2 = new Calculator("RTX 3050", "I5-10600K", "Asrock B456-M", 16, 2000, 650);
        c3 = new Calculator(c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
        d1 = new Desktop();
        
        d2 = new Desktop("Redragon MK-257", "Logitech G502", "Asus VS228DE", 21.5);
        d2.setNumePlacaVideo(c2.getNumePlacaVideo());
        d2.setNumeProcesor(c2.getNumeProcesor());
        d2.setNumePlacaDeBaza(c2.getNumePlacaDeBaza());
        d2.setMemorieRam(c2.getMemorieRam());
        d2.setStocare(c2.getStocare());
        d2.setSursaAlimentare(c2.getSursaAlimentare());
        
        d3 = new Desktop(d2);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        
        s1 = new Server();
        
        s2 = new Server(8, 20, 12, true, "Liquid Cooling");
        s2.setNumePlacaVideo(c2.getNumePlacaVideo());
        s2.setNumeProcesor(c2.getNumeProcesor());
        s2.setNumePlacaDeBaza(c2.getNumePlacaDeBaza());
        s2.setMemorieRam(c2.getMemorieRam());
        s2.setStocare(c2.getStocare());
        s2.setSursaAlimentare(c2.getSursaAlimentare());
        
        s3 = new Server(s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
