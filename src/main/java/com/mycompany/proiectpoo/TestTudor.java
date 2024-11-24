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
        c2 = new Calculator("RTX 3050", "I5-10600K", "Asrock B456-M", (byte) 16, (short) 2000, (short) 650);
        c3 = new Calculator(c2);
        
        c1.afisarePornire();
        System.out.println(c1.toString());
        c1.afisareInchidere();
        System.out.println();
        
        c2.afisarePornire();
        System.out.println(c2.toString());
        c2.afisareInchidere();
        System.out.println();
        
        c3.afisarePornire();
        System.out.println(c3.toString());
        c3.afisareInchidere();
        System.out.println();
        
        d1 = new Desktop();
        d2 = new Desktop("Redragon MK-257", "Logitech G502", "Asus VS228DE", 21.5f, 
                c2.getNumePlacaVideo(), c2.getNumeProcesor(), c2.getNumePlacaDeBaza(), c2.getMemorieRam(),
        c2.getStocare(), c2.getSursaAlimentare());
        d3 = new Desktop(d2);
        
        d1.afisarePornire();
        System.out.println(d1.toString());
        d1.afisareInchidere();
        System.out.println();
        
        d2.afisarePornire();
        System.out.println(d2.toString());
        d2.afisareInchidere();
        System.out.println();
        
        d3.afisarePornire();
        System.out.println(d3.toString());
        d3.afisareInchidere();
        System.out.println();
        
        s1 = new Server();
        s2 = new Server((byte) 8, (byte) 20, (byte) 12, true, "Water Cooling", c2.getNumePlacaVideo(), c2.getNumeProcesor(), 
                c2.getNumePlacaDeBaza(), c2.getMemorieRam(), c2.getStocare(), c2.getSursaAlimentare());
        s3 = new Server(s2);
        
        s1.afisarePornire();
        System.out.println(s1.toString());
        s1.afisareInchidere();
        System.out.println();
        
        s2.afisarePornire();
        System.out.println(s2.toString());
        s2.afisareInchidere();
        System.out.println();
        
        s3.afisarePornire();
        System.out.println(s3.toString());
        s3.afisareInchidere();
        System.out.println();
        
        Calculator[] vectorCalculatoare = new Calculator[10];
        Desktop[] vectorDesktop = new Desktop[10];
        Server[] vectorServer = new Server[10];
        
        vectorCalculatoare[0] = new Calculator("NVIDIA RTX 3090", "Intel i9", "ASUS ROG STRIX", (byte) 32, (short) 2000, (short) 850);
        vectorCalculatoare[1] = new Calculator("AMD Radeon RX 6700", "AMD Ryzen 7", "MSI MPG", (byte) 16, (short) 1000, (short) 750);
        vectorCalculatoare[2] = new Calculator("NVIDIA GTX 1660", "Intel i5", "Gigabyte Aorus", (byte) 8, (short) 512, (short) 500);
        vectorCalculatoare[3] = new Calculator("AMD Radeon RX 7900", "AMD Ryzen 9", "ASRock Phantom", (byte) 64, (short) 4000, (short) 1000);
        vectorCalculatoare[4] = new Calculator("NVIDIA RTX 3070", "Intel i7", "MSI B450", (byte) 16, (short) 1500, (short) 650);
        vectorCalculatoare[5] = new Calculator("NVIDIA GTX 1080", "Intel i3", "ASUS Prime", (byte) 4, (short) 256, (short) 450);
        vectorCalculatoare[6] = new Calculator("AMD Radeon RX 6800", "AMD Ryzen 5", "Gigabyte Ultra Durable", (byte) 12, (short) 750, (short) 600);
        vectorCalculatoare[7] = new Calculator("NVIDIA RTX 4060", "Intel i9", "ASUS TUF Gaming", (byte) 32, (short) 2000, (short) 800);
        vectorCalculatoare[8] = new Calculator("NVIDIA GTX 1050", "Intel Pentium", "MSI Pro", (byte) 4, (short) 128, (short) 400);
        vectorCalculatoare[9] = new Calculator("AMD Radeon RX 7600", "AMD Ryzen 7", "ASUS Crosshair", (byte) 16, (short) 1200, (short) 700);
        
        vectorDesktop[0] = new Desktop("Logitech G213", "Logitech G502", "Samsung Odyssey G7", 27.0f, 
        vectorCalculatoare[0].getNumePlacaVideo(), vectorCalculatoare[0].getNumeProcesor(), vectorCalculatoare[0].getNumePlacaDeBaza(), 
        vectorCalculatoare[0].getMemorieRam(), vectorCalculatoare[0].getStocare(), vectorCalculatoare[0].getSursaAlimentare());
        vectorDesktop[1] = new Desktop("Corsair K95", "Razer DeathAdder", "LG UltraFine", 32.0f,
        vectorCalculatoare[1].getNumePlacaVideo(), vectorCalculatoare[1].getNumeProcesor(), vectorCalculatoare[1].getNumePlacaDeBaza(), 
        vectorCalculatoare[1].getMemorieRam(), vectorCalculatoare[1].getStocare(), vectorCalculatoare[1].getSursaAlimentare());
        vectorDesktop[2] = new Desktop("Razer BlackWidow", "SteelSeries Rival 3", "Acer Predator", 24.5f,
        vectorCalculatoare[2].getNumePlacaVideo(), vectorCalculatoare[2].getNumeProcesor(), vectorCalculatoare[2].getNumePlacaDeBaza(), 
        vectorCalculatoare[2].getMemorieRam(), vectorCalculatoare[2].getStocare(), vectorCalculatoare[2].getSursaAlimentare());
        vectorDesktop[3] = new Desktop("HyperX Alloy FPS", "Logitech MX Master 3", "Dell UltraSharp", 34.0f, 
        vectorCalculatoare[3].getNumePlacaVideo(), vectorCalculatoare[3].getNumeProcesor(), vectorCalculatoare[3].getNumePlacaDeBaza(), 
        vectorCalculatoare[3].getMemorieRam(), vectorCalculatoare[3].getStocare(), vectorCalculatoare[3].getSursaAlimentare());
        vectorDesktop[4] = new Desktop("Microsoft Sculpt", "Microsoft Bluetooth Mouse", "HP Z24n G2", 23.8f,
        vectorCalculatoare[4].getNumePlacaVideo(), vectorCalculatoare[4].getNumeProcesor(), vectorCalculatoare[4].getNumePlacaDeBaza(), 
        vectorCalculatoare[4].getMemorieRam(), vectorCalculatoare[4].getStocare(), vectorCalculatoare[4].getSursaAlimentare());
        vectorDesktop[5] = new Desktop("Corsair K55", "Corsair M65 RGB Elite", "Asus ProArt", 27.0f, 
        vectorCalculatoare[5].getNumePlacaVideo(), vectorCalculatoare[5].getNumeProcesor(), vectorCalculatoare[5].getNumePlacaDeBaza(), 
        vectorCalculatoare[5].getMemorieRam(), vectorCalculatoare[5].getStocare(), vectorCalculatoare[5].getSursaAlimentare());
        vectorDesktop[6] = new Desktop("Logitech K380", "Logitech M720 Triathlon", "BenQ EX3501R", 35.0f, 
        vectorCalculatoare[6].getNumePlacaVideo(), vectorCalculatoare[6].getNumeProcesor(), vectorCalculatoare[6].getNumePlacaDeBaza(), 
        vectorCalculatoare[6].getMemorieRam(), vectorCalculatoare[6].getStocare(), vectorCalculatoare[6].getSursaAlimentare());
        vectorDesktop[7] = new Desktop("Razer Ornata V2", "Razer Basilisk V3", "ViewSonic VP3881", 38.0f, 
        vectorCalculatoare[7].getNumePlacaVideo(), vectorCalculatoare[7].getNumeProcesor(), vectorCalculatoare[7].getNumePlacaDeBaza(), 
        vectorCalculatoare[7].getMemorieRam(), vectorCalculatoare[7].getStocare(), vectorCalculatoare[7].getSursaAlimentare());
        vectorDesktop[8] = new Desktop("Redragon K552", "Redragon M908", "MSI Optix MAG272CQR", 27.0f, 
        vectorCalculatoare[8].getNumePlacaVideo(), vectorCalculatoare[8].getNumeProcesor(), vectorCalculatoare[8].getNumePlacaDeBaza(), 
        vectorCalculatoare[8].getMemorieRam(), vectorCalculatoare[8].getStocare(), vectorCalculatoare[8].getSursaAlimentare());
        vectorDesktop[9] = new Desktop("SteelSeries Apex 5", "SteelSeries Sensei Ten", "Samsung Smart Monitor M8", 32.0f, 
        vectorCalculatoare[9].getNumePlacaVideo(), vectorCalculatoare[9].getNumeProcesor(), vectorCalculatoare[9].getNumePlacaDeBaza(), 
        vectorCalculatoare[9].getMemorieRam(), vectorCalculatoare[9].getStocare(), vectorCalculatoare[9].getSursaAlimentare());
        
        vectorServer[0] = new Server((byte) 4, (byte) 8, (byte) 10, true, "Water Cooling", 
        vectorCalculatoare[0].getNumePlacaVideo(), vectorCalculatoare[0].getNumeProcesor(), vectorCalculatoare[0].getNumePlacaDeBaza(), 
        vectorCalculatoare[0].getMemorieRam(), vectorCalculatoare[0].getStocare(), vectorCalculatoare[0].getSursaAlimentare());
        vectorServer[1] = new Server((byte) 8, (byte) 4, (byte) 12, false, "Air Cooling", 
        vectorCalculatoare[1].getNumePlacaVideo(), vectorCalculatoare[1].getNumeProcesor(), vectorCalculatoare[1].getNumePlacaDeBaza(), 
        vectorCalculatoare[1].getMemorieRam(), vectorCalculatoare[1].getStocare(), vectorCalculatoare[1].getSursaAlimentare());
        vectorServer[2] = new Server((byte) 16, (byte) 16, (byte) 24, true, "Hybrid Cooling", 
        vectorCalculatoare[2].getNumePlacaVideo(), vectorCalculatoare[2].getNumeProcesor(), vectorCalculatoare[2].getNumePlacaDeBaza(), 
        vectorCalculatoare[2].getMemorieRam(), vectorCalculatoare[2].getStocare(), vectorCalculatoare[2].getSursaAlimentare());
        vectorServer[3] = new Server((byte) 2, (byte) 6, (byte) 8, false, "Passive Cooling", 
        vectorCalculatoare[3].getNumePlacaVideo(), vectorCalculatoare[3].getNumeProcesor(), vectorCalculatoare[3].getNumePlacaDeBaza(), 
        vectorCalculatoare[3].getMemorieRam(), vectorCalculatoare[3].getStocare(), vectorCalculatoare[3].getSursaAlimentare());
        vectorServer[4] = new Server((byte) 10, (byte) 12, (byte) 18, true, "Liquid Cooling", 
        vectorCalculatoare[4].getNumePlacaVideo(), vectorCalculatoare[4].getNumeProcesor(), vectorCalculatoare[4].getNumePlacaDeBaza(), 
        vectorCalculatoare[4].getMemorieRam(), vectorCalculatoare[4].getStocare(), vectorCalculatoare[4].getSursaAlimentare());
        vectorServer[5] = new Server((byte) 6, (byte) 10, (byte) 16, true, "Custom Cooling", 
        vectorCalculatoare[5].getNumePlacaVideo(), vectorCalculatoare[5].getNumeProcesor(), vectorCalculatoare[5].getNumePlacaDeBaza(), 
        vectorCalculatoare[5].getMemorieRam(), vectorCalculatoare[5].getStocare(), vectorCalculatoare[5].getSursaAlimentare());
        vectorServer[6] = new Server((byte) 12, (byte) 20, (byte) 32, true, "Immersion Cooling", 
        vectorCalculatoare[6].getNumePlacaVideo(), vectorCalculatoare[6].getNumeProcesor(), vectorCalculatoare[6].getNumePlacaDeBaza(), 
        vectorCalculatoare[6].getMemorieRam(), vectorCalculatoare[6].getStocare(), vectorCalculatoare[6].getSursaAlimentare());
        vectorServer[7] = new Server((byte) 1, (byte) 4, (byte) 6, false, "Air Cooling", 
        vectorCalculatoare[7].getNumePlacaVideo(), vectorCalculatoare[7].getNumeProcesor(), vectorCalculatoare[7].getNumePlacaDeBaza(), 
        vectorCalculatoare[7].getMemorieRam(), vectorCalculatoare[7].getStocare(), vectorCalculatoare[7].getSursaAlimentare());
        vectorServer[8] = new Server((byte) 8, (byte) 10, (byte) 20, true, "Water Cooling", 
        vectorCalculatoare[8].getNumePlacaVideo(), vectorCalculatoare[8].getNumeProcesor(), vectorCalculatoare[8].getNumePlacaDeBaza(), 
        vectorCalculatoare[8].getMemorieRam(), vectorCalculatoare[8].getStocare(), vectorCalculatoare[8].getSursaAlimentare());
        vectorServer[9] = new Server((byte) 4, (byte) 6, (byte) 14, false, "Active Cooling", 
        vectorCalculatoare[9].getNumePlacaVideo(), vectorCalculatoare[9].getNumeProcesor(), vectorCalculatoare[9].getNumePlacaDeBaza(), 
        vectorCalculatoare[9].getMemorieRam(), vectorCalculatoare[9].getStocare(), vectorCalculatoare[9].getSursaAlimentare());
        
        for(int i = 0; i < vectorCalculatoare.length; i++){
            System.out.println("Calculatorul " + (i + 1));
            System.out.println(vectorCalculatoare[i].toString());
            System.out.println();
        }
        
        for(int i = 0; i < vectorDesktop.length; i++){
            System.out.println("Calculatorul " + (i + 1));
            System.out.println(vectorDesktop[i].toString());
            System.out.println();
        }
        
        for(int i = 0; i < vectorServer.length; i++){
            System.out.println("Serverul " + (i + 1));
            System.out.println(vectorServer[i].toString());
            System.out.println();
        }
    }
}
