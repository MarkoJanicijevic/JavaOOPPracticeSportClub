package Igrac;

import java.util.ArrayList;

public abstract class Klub {
    private String naziv;
    private String grad;
    private ArrayList<Igrac> lista_igraca;

    public Klub(String naziv, String grad, ArrayList<Igrac> lista_igraca) {
        this.naziv = naziv;
        this.grad = grad;
        this.lista_igraca = lista_igraca;
    }


    public String najiskusniji_igrac () {
        int max_godina = getLista_igraca().get(0).getGodine_iskustva();
        int index = 0;
        for (int i = 0; i < getLista_igraca().size(); i++) {
            if (max_godina < getLista_igraca().get(i).getGodine_iskustva()) {
                max_godina = getLista_igraca().get(i).getGodine_iskustva();
                index = i;
            }

        }
        String ime_igraca = getLista_igraca().get(index).getIme();
        return ime_igraca;

    }

    public abstract int vrednostTima();

    public int ukupnoPoena () {
        int ukupnoPoena = 0;
        for (int i = 0; i < getLista_igraca().size(); i++) {
            ukupnoPoena += getLista_igraca().get(i).getBroj_poena();
        }
        return ukupnoPoena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getLista_igraca() {
        return lista_igraca;
    }

    public void setLista_igraca(ArrayList<Igrac> lista_igraca) {
        this.lista_igraca = lista_igraca;
    }

    public String toString () {
        return "Ime kluba: " + getNaziv() + ", iz grada: " + getGrad() + ", i za njega igraju: " + getLista_igraca();
    }


}
