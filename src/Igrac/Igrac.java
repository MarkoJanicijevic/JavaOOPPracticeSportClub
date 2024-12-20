package Igrac;

public class Igrac {
    private String ime;
    private int godine_iskustva;
    private int broj_poena;

    public Igrac(String ime, int godine_iskustva, int broj_poena) {
        this.ime = ime;
        this.godine_iskustva = godine_iskustva;
        this.broj_poena = broj_poena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine_iskustva() {
        return godine_iskustva;
    }

    public void setGodine_iskustva(int godine_iskustva) {
        this.godine_iskustva = godine_iskustva;
    }

    public int getBroj_poena() {
        return broj_poena;
    }

    public void setBroj_poena(int broj_poena) {
        this.broj_poena = broj_poena;
    }

    public String toString () {
        return "Ime: " + getIme() + ", godine iskustva: " + getGodine_iskustva() + ", ukupno poena: " + getBroj_poena();
    }
}
