package Igrac;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub {

    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> lista_igraca) {
        super(naziv, grad, lista_igraca);
    }

    @Override
    public int vrednostTima() {
        return ukupnoPoena() * 1000;
    }

    public String najboljiStrelac () {
        int max_poena = getLista_igraca().get(0).getBroj_poena();
        int index = 0;
        for (int i = 0; i < getLista_igraca().size(); i++) {
            if (max_poena < getLista_igraca().get(i).getBroj_poena()) {
                max_poena = getLista_igraca().get(i).getBroj_poena();
                index = i;
            }

        }
        String ime_igraca = getLista_igraca().get(index).getIme();
        return ime_igraca;
    }
}
