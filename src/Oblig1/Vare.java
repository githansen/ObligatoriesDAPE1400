package Oblig1;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter

    public Vare(String navn, int antall, double pris) {
        if(antall < 0 || pris < 0) throw new UnsupportedOperationException("Vare eller pris må være >= 0");
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
    // get / set metoder
    // antall og pris må være større enn null

    // metode for å beregne totalpris (pris * antall)
    public double totalpris(){
        return pris*antall;
    }
}
