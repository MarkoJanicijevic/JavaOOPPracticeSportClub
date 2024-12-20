package Igrac;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub {

    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> lista_igraca) {
        super(naziv, grad, lista_igraca);
    }

    public String odbrambeniAs () {
        int max_poena = getLista_igraca().get(0).getBroj_poena();
        int index = 0;
        for (int i = 0; i < getLista_igraca().size(); i++) {
            if (max_poena < getLista_igraca().get(i).getBroj_poena() && getLista_igraca().get(i).getGodine_iskustva() < 3) {
                max_poena = getLista_igraca().get(i).getBroj_poena();
                index = i;
            }

        }
        String ime_igraca = getLista_igraca().get(index).getIme();
        return ime_igraca;
    }

    @Override
    public int vrednostTima() {
        return ukupnoPoena() * 100;
    }
}
