package Oblig2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Tallspill {
    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
        return (int) (Math.random() *201);
    }

    public void visMelding(String melding){
        showMessageDialog(null,melding);
    }

    private void forLite(int tall){
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        showMessageDialog(null,tall + " er for lite, prøv igjen");
    }

    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        showMessageDialog(null,tall + " er for stort, prøv igjen");
    }

    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        showMessageDialog(null,gjetning + " er riktig, du brukte " + antall + " forsøk ");
    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
        int antall = 0;
       int g = -1;
        int tall = nyttTall();
        while(g != tall){
            antall++;
            String gjetning = showInputDialog("Skriv inn et tall");
             g = Integer.parseInt(gjetning);
        if(g < tall){
            forLite(g);
        }
        else if(g > tall){
            forStort(g);
        }
        else avsluttRunde(antall, g);
        }
    }
}
