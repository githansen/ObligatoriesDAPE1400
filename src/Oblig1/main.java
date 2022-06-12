package Oblig1;

import static Oblig1.Sirkel.*;

public class main {
    public static void main(String[] args)  {
        //  Sett en variabel lik en verdi for radius
        double radius = 3;

        System.out.println("Arealet av sirkelen er " +  String.format("%.2f",areal(radius)));
        System.out.println("Omkrets av sirkelen er " +  String.format("%.2f",omkrets(radius)));
        System.out.println("Diameteren av sirkelen er " + String.format("%.2f", diameter(radius)));
    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)
       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00
    */
        Vare t = new Vare("J", 2, 3);
    }
}
