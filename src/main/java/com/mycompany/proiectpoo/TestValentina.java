/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author va195
 */
public class TestValentina extends ValentinaGUI{
    
    //Instantele celor 3 vectori declarati global
    public static Calculator[] vectorCalculatoare = {
        new Calculator("NVIDIA RTX 3060", "Intel Core i5-12400", "ASUS Prime B660", (byte) 16, (short) 512, (short) 600),
        new Calculator("AMD Radeon RX 6700 XT", "AMD Ryzen 5 5600X", "MSI B450 TOMAHAWK", (byte) 32, (short) 1024, (short) 650),
        new Calculator("NVIDIA GTX 1660 Super", "Intel Core i3-12100F", "Gigabyte B660M DS3H", (byte) 8, (short) 256, (short) 500),
        new Calculator("AMD Radeon RX 570", "AMD Ryzen 3 3300X", "ASRock A520M-HDV", (byte) 16, (short) 512, (short) 450),
        new Calculator("NVIDIA RTX 4070", "Intel Core i7-13700K", "ASUS ROG Strix Z790-E", (byte) 64, (short) 2048, (short) 850),
        new Calculator("AMD Radeon RX 7900 XT", "AMD Ryzen 9 7950X", "MSI MEG X670E", (byte) 64, (short) 2048, (short) 1000),
        new Calculator("NVIDIA RTX 3050", "Intel Core i5-11400", "Gigabyte Z590 UD AC", (byte) 16, (short) 1024, (short) 550),
        new Calculator("AMD Radeon RX 6600", "AMD Ryzen 7 5800X", "ASUS TUF Gaming B550", (byte) 32, (short) 512, (short) 750),
        new Calculator("NVIDIA GTX 1650", "Intel Core i3-10100", "MSI H410M PRO", (byte) 8, (short) 256, (short) 400),
        new Calculator("NVIDIA RTX 3090", "Intel Core i9-12900K", "ASUS ROG Maximus Z690", (byte) 128, (short) 4096, (short) 1200)
    };
        
    public static Laptop[] vectorLaptop = {
        new Laptop("Logitech MX Master 3", 15.6f, 2.5f, true, (byte) 8,
        vectorCalculatoare[0].getNumePlacaVideo(), vectorCalculatoare[0].getNumeProcesor(), vectorCalculatoare[0].getNumePlacaDeBaza(), 
        vectorCalculatoare[0].getMemorieRam(), vectorCalculatoare[0].getStocare(), vectorCalculatoare[0].getSursaAlimentare()),
        new Laptop("Razer DeathAdder V2", 17.3f, 2.8f, true, (byte) 10,
        vectorCalculatoare[1].getNumePlacaVideo(), vectorCalculatoare[1].getNumeProcesor(), vectorCalculatoare[1].getNumePlacaDeBaza(), 
        vectorCalculatoare[1].getMemorieRam(), vectorCalculatoare[1].getStocare(), vectorCalculatoare[1].getSursaAlimentare()),
        new Laptop("Microsoft Surface Mouse", 14.0f, 1.8f, false, (byte) 6,
        vectorCalculatoare[2].getNumePlacaVideo(), vectorCalculatoare[2].getNumeProcesor(), vectorCalculatoare[2].getNumePlacaDeBaza(), 
        vectorCalculatoare[2].getMemorieRam(), vectorCalculatoare[2].getStocare(), vectorCalculatoare[2].getSursaAlimentare()),
        new Laptop("HP Wireless Mouse X3000", 13.3f, 1.5f, false, (byte) 5,
        vectorCalculatoare[3].getNumePlacaVideo(), vectorCalculatoare[3].getNumeProcesor(), vectorCalculatoare[3].getNumePlacaDeBaza(), 
        vectorCalculatoare[3].getMemorieRam(), vectorCalculatoare[3].getStocare(), vectorCalculatoare[3].getSursaAlimentare()),
        new Laptop("Logitech G Pro Wireless", 15.6f, 2.0f, true, (byte) 12,
        vectorCalculatoare[4].getNumePlacaVideo(), vectorCalculatoare[4].getNumeProcesor(), vectorCalculatoare[4].getNumePlacaDeBaza(), 
        vectorCalculatoare[4].getMemorieRam(), vectorCalculatoare[4].getStocare(), vectorCalculatoare[4].getSursaAlimentare()),
        new Laptop("SteelSeries Rival 650", 17.3f, 3.0f, true, (byte) 14,
        vectorCalculatoare[5].getNumePlacaVideo(), vectorCalculatoare[5].getNumeProcesor(), vectorCalculatoare[5].getNumePlacaDeBaza(), 
        vectorCalculatoare[5].getMemorieRam(), vectorCalculatoare[5].getStocare(), vectorCalculatoare[5].getSursaAlimentare()),
        new Laptop("Dell Wireless Mouse WM615", 15.0f, 2.2f, true, (byte) 9,
        vectorCalculatoare[6].getNumePlacaVideo(), vectorCalculatoare[6].getNumeProcesor(), vectorCalculatoare[6].getNumePlacaDeBaza(), 
        vectorCalculatoare[6].getMemorieRam(), vectorCalculatoare[6].getStocare(), vectorCalculatoare[6].getSursaAlimentare()),
        new Laptop("Corsair Dark Core RGB", 16.0f, 2.6f, true, (byte) 11,
        vectorCalculatoare[7].getNumePlacaVideo(), vectorCalculatoare[7].getNumeProcesor(), vectorCalculatoare[7].getNumePlacaDeBaza(), 
        vectorCalculatoare[7].getMemorieRam(), vectorCalculatoare[7].getStocare(), vectorCalculatoare[7].getSursaAlimentare()),
        new Laptop("Lenovo Yoga Mouse", 13.0f, 1.3f, false, (byte) 4,
        vectorCalculatoare[8].getNumePlacaVideo(), vectorCalculatoare[8].getNumeProcesor(), vectorCalculatoare[8].getNumePlacaDeBaza(), 
        vectorCalculatoare[8].getMemorieRam(), vectorCalculatoare[8].getStocare(), vectorCalculatoare[8].getSursaAlimentare()),
        new Laptop("Razer Basilisk Ultimate", 18.4f, 3.5f, true, (byte) 16,
        vectorCalculatoare[9].getNumePlacaVideo(), vectorCalculatoare[9].getNumeProcesor(), vectorCalculatoare[9].getNumePlacaDeBaza(), 
        vectorCalculatoare[9].getMemorieRam(), vectorCalculatoare[9].getStocare(), vectorCalculatoare[9].getSursaAlimentare())
    };
    
    public static AccesoriiLaptop[] vectorAccesoriiLaptop = {
        new AccesoriiLaptop(true, true, true, true,
        vectorLaptop[0].getNumeMouse(), vectorLaptop[0].getDiagonalaMonitor(), vectorLaptop[0].getGreutate(), 
        vectorLaptop[0].getEsteIluminata(), vectorLaptop[0].getAutonomieBaterie(),
        vectorCalculatoare[0].getNumePlacaVideo(), vectorCalculatoare[0].getNumeProcesor(), vectorCalculatoare[0].getNumePlacaDeBaza(), 
        vectorCalculatoare[0].getMemorieRam(), vectorCalculatoare[0].getStocare(), vectorCalculatoare[0].getSursaAlimentare()),
        new AccesoriiLaptop(false, true, true, false,
        vectorLaptop[1].getNumeMouse(), vectorLaptop[1].getDiagonalaMonitor(), vectorLaptop[1].getGreutate(), 
        vectorLaptop[1].getEsteIluminata(), vectorLaptop[1].getAutonomieBaterie(),
        vectorCalculatoare[1].getNumePlacaVideo(), vectorCalculatoare[1].getNumeProcesor(), vectorCalculatoare[1].getNumePlacaDeBaza(), 
        vectorCalculatoare[1].getMemorieRam(), vectorCalculatoare[1].getStocare(), vectorCalculatoare[1].getSursaAlimentare()),
        new AccesoriiLaptop(true, false, false, true,
        vectorLaptop[2].getNumeMouse(), vectorLaptop[2].getDiagonalaMonitor(), vectorLaptop[2].getGreutate(), 
        vectorLaptop[2].getEsteIluminata(), vectorLaptop[2].getAutonomieBaterie(),
        vectorCalculatoare[2].getNumePlacaVideo(), vectorCalculatoare[2].getNumeProcesor(), vectorCalculatoare[2].getNumePlacaDeBaza(), 
        vectorCalculatoare[2].getMemorieRam(), vectorCalculatoare[2].getStocare(), vectorCalculatoare[2].getSursaAlimentare()),
        new AccesoriiLaptop(false, false, true, false,
        vectorLaptop[3].getNumeMouse(), vectorLaptop[3].getDiagonalaMonitor(), vectorLaptop[3].getGreutate(), 
        vectorLaptop[3].getEsteIluminata(), vectorLaptop[3].getAutonomieBaterie(),
        vectorCalculatoare[3].getNumePlacaVideo(), vectorCalculatoare[3].getNumeProcesor(), vectorCalculatoare[3].getNumePlacaDeBaza(), 
        vectorCalculatoare[3].getMemorieRam(), vectorCalculatoare[3].getStocare(), vectorCalculatoare[3].getSursaAlimentare()),
        new AccesoriiLaptop(true, true, false, true,
        vectorLaptop[4].getNumeMouse(), vectorLaptop[4].getDiagonalaMonitor(), vectorLaptop[4].getGreutate(), 
        vectorLaptop[4].getEsteIluminata(), vectorLaptop[4].getAutonomieBaterie(),
        vectorCalculatoare[4].getNumePlacaVideo(), vectorCalculatoare[4].getNumeProcesor(), vectorCalculatoare[4].getNumePlacaDeBaza(), 
        vectorCalculatoare[4].getMemorieRam(), vectorCalculatoare[4].getStocare(), vectorCalculatoare[4].getSursaAlimentare()),
        new AccesoriiLaptop(false, true, true, true,
        vectorLaptop[5].getNumeMouse(), vectorLaptop[5].getDiagonalaMonitor(), vectorLaptop[5].getGreutate(), 
        vectorLaptop[5].getEsteIluminata(), vectorLaptop[5].getAutonomieBaterie(),
        vectorCalculatoare[5].getNumePlacaVideo(), vectorCalculatoare[5].getNumeProcesor(), vectorCalculatoare[5].getNumePlacaDeBaza(), 
        vectorCalculatoare[5].getMemorieRam(), vectorCalculatoare[5].getStocare(), vectorCalculatoare[5].getSursaAlimentare()),
        new AccesoriiLaptop(true, false, true, false,
        vectorLaptop[6].getNumeMouse(), vectorLaptop[6].getDiagonalaMonitor(), vectorLaptop[6].getGreutate(), 
        vectorLaptop[6].getEsteIluminata(), vectorLaptop[6].getAutonomieBaterie(),
        vectorCalculatoare[6].getNumePlacaVideo(), vectorCalculatoare[6].getNumeProcesor(), vectorCalculatoare[6].getNumePlacaDeBaza(), 
        vectorCalculatoare[6].getMemorieRam(), vectorCalculatoare[6].getStocare(), vectorCalculatoare[6].getSursaAlimentare()),
        new AccesoriiLaptop(false, true, false, true,
        vectorLaptop[7].getNumeMouse(), vectorLaptop[7].getDiagonalaMonitor(), vectorLaptop[7].getGreutate(), 
        vectorLaptop[7].getEsteIluminata(), vectorLaptop[7].getAutonomieBaterie(),
        vectorCalculatoare[7].getNumePlacaVideo(), vectorCalculatoare[7].getNumeProcesor(), vectorCalculatoare[7].getNumePlacaDeBaza(), 
        vectorCalculatoare[7].getMemorieRam(), vectorCalculatoare[7].getStocare(), vectorCalculatoare[7].getSursaAlimentare()),
        new AccesoriiLaptop(true, true, true, false,
        vectorLaptop[8].getNumeMouse(), vectorLaptop[8].getDiagonalaMonitor(), vectorLaptop[8].getGreutate(), 
        vectorLaptop[8].getEsteIluminata(), vectorLaptop[8].getAutonomieBaterie(),
        vectorCalculatoare[8].getNumePlacaVideo(), vectorCalculatoare[8].getNumeProcesor(), vectorCalculatoare[8].getNumePlacaDeBaza(), 
        vectorCalculatoare[8].getMemorieRam(), vectorCalculatoare[8].getStocare(), vectorCalculatoare[8].getSursaAlimentare()),
        new AccesoriiLaptop(false, false, false, true,
        vectorLaptop[9].getNumeMouse(), vectorLaptop[9].getDiagonalaMonitor(), vectorLaptop[9].getGreutate(), 
        vectorLaptop[9].getEsteIluminata(), vectorLaptop[9].getAutonomieBaterie(),
        vectorCalculatoare[9].getNumePlacaVideo(), vectorCalculatoare[9].getNumeProcesor(), vectorCalculatoare[9].getNumePlacaDeBaza(), 
        vectorCalculatoare[9].getMemorieRam(), vectorCalculatoare[9].getStocare(), vectorCalculatoare[9].getSursaAlimentare())
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clase -> Obiecte/Instante
        Calculator c1, c2, c3;
        Laptop l1, l2, l3;
        AccesoriiLaptop a1, a2, a3;
        
        //Initializam obiectele cu constructorii
        c1 = new Calculator();
        c2 = new Calculator("GTX 1650", "I9-14500", "Asus C652", (byte) 32, (short) 1500, (short) 800);
        c3 = new Calculator(c2);
        
        c1.afisarePornire();//Metoda din clasa abstracta(afiseaza un mesaj)
        System.out.println(c1.toString());//metoda toString()
        c1.afisareInchidere();//Metoda din clasa abstracta(afiseaza un mesaj)
        System.out.println();//Lasa un rand liber
        
        c2.afisarePornire();
        System.out.println(c2.toString());
        c2.afisareInchidere();
        System.out.println();
        
        c3.afisarePornire();
        System.out.println(c3.toString());
        c3.afisareInchidere();
        System.out.println();
        
        //Initializam obiectele cu constructorii
        l1 = new Laptop();
        l2 = new Laptop("Logitech", 15.6f, 2.3f, true, (byte) 6, 
                c2.getNumePlacaVideo(), c2.getNumeProcesor(), c2.getNumePlacaDeBaza(), 
                c2.getMemorieRam(), c2.getStocare(), c2.getSursaAlimentare());
        l3 = new Laptop(l2);
        
        l1.afisarePornire();
        System.out.println(l1.toString());//Afiseaza datele din Laptopul l1 folosind metoda toString()
        l1.afisareInchidere();
        System.out.println();
        
        l2.afisarePornire();
        System.out.println(l2.toString());
        l2.afisareInchidere();
        System.out.println();
        
        l3.afisarePornire();
        System.out.println(l3.toString());
        l3.afisareInchidere();
        System.out.println();
        
        a1 = new AccesoriiLaptop();
        a2 = new AccesoriiLaptop(true, true, false, false,
               l2.getNumeMouse(), l2.getDiagonalaMonitor(), l2.getGreutate(), l2.getEsteIluminata(), l2.getAutonomieBaterie(),
               c2.getNumePlacaVideo(), c2.getNumeProcesor(), c2.getNumePlacaDeBaza(), 
               c2.getMemorieRam(), c2.getStocare(), c2.getSursaAlimentare());
        a3 = new AccesoriiLaptop(a2);
        
        a1.afisarePornire();
        System.out.println(a1.toString());
        a1.afisareInchidere();
        System.out.println();
        
        a2.afisarePornire();
        System.out.println(a2.toString());
        a2.afisareInchidere();
        System.out.println();
        
        a3.afisarePornire();
        System.out.println(a3.toString());
        a3.afisareInchidere();
        System.out.println();
        
        for(int i = 0; i < vectorCalculatoare.length; i++){
            System.out.println("Calculatorul " + (i + 1));// Am pus i+1 intre paranteze ca sa faca calcul, nu afisare
            System.out.println(vectorCalculatoare[i].toString());
            System.out.println();
        }
        
        for(int i = 0; i < vectorLaptop.length; i++){
            System.out.println("Laptopul " + (i + 1));
            System.out.println(vectorLaptop[i].toString());
            System.out.println();
        }
        
        for(int i = 0; i < vectorAccesoriiLaptop.length; i++){
            System.out.println("Laptopul " + (i + 1));
            System.out.println(vectorAccesoriiLaptop[i].toString());
            System.out.println();
        }
        
        System.out.println("Vectorul de Calculatoare cu 2 conditii\n");
        for(int i = 0; i < vectorCalculatoare.length; i++){
            if(vectorCalculatoare[i].getNumeProcesor().startsWith("Intel Core") && vectorCalculatoare[i].getStocare() == 512){
                System.out.println("Calculatorul " + (i + 1));
                System.out.println(vectorCalculatoare[i].toString());
                System.out.println();
            }
        }
        
        System.out.println("Vectorul de Laptopuri cu 2 conditii\n");
        for(int i = 0; i < vectorLaptop.length; i++){
            if(vectorLaptop[i].getNumeMouse().startsWith("Logitech") || vectorLaptop[i].getNumePlacaDeBaza().contains("ASUS")){
                System.out.println("Laptopul " + (i + 1));
                System.out.println(vectorLaptop[i].toString());
                System.out.println();
            }
        }
        
        System.out.println("Vectorul de Accesorii Laptop cu 2 conditii\n");
        for(int i = 0; i < vectorAccesoriiLaptop.length; i++){
            if(!vectorAccesoriiLaptop[i].getAreGeanta() && vectorAccesoriiLaptop[i].getAutonomieBaterie() >= 5){
                System.out.println("Laptopul " + (i + 1));
                System.out.println(vectorAccesoriiLaptop[i].toString());
                System.out.println();
            }
        }
        /*
        sir.startsWith("text") - verifica daca textul incepe cu textul din paranteze
        sir.contains("text") - verifica daca sirul contine "text" oriunde in sir(ori la inceput/mijloc/final)
        sir.compareTo("text") == 0 - verifica daca textul din sir este fix "text"(0 adevarat, 1 fals)
        */
    }
    public static Calculator[] getCalculator(){
        return vectorCalculatoare;
    }
    public static Laptop[] getLaptop(){
        return vectorLaptop;
    }
    public static AccesoriiLaptop[] getAccesoriiLaptop(){
        return vectorAccesoriiLaptop;
    }
}
