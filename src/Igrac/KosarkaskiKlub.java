package Igrac;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub {
    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> lista_igraca) {
        super(naziv, grad, lista_igraca);
    }

    @Override
    public int vrednostTima() {
        return ukupnoPoena() * 50;
    }


        public ArrayList<String> sampionTima () {
            ArrayList<String> sampioni_tima = new ArrayList<>();

            for (int i = 0; i < getLista_igraca().size(); i++) {
                if (getLista_igraca().get(i).getBroj_poena() > 1000) {
                    sampioni_tima.add(getLista_igraca().get(i).getIme());
                }

            }

            return sampioni_tima;

            //ako sam dobro razumeo zadatak - trazili ste jednog igraca ali sta ako imaju vise njih 1000 poena;
        }

    }
