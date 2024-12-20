package Igrac;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Igrac> lista_igraca = new ArrayList<>();
        Igrac i = new Igrac("Pera", 10, 1000);
        Igrac i1 = new Igrac("Mika", 15, 2000);
        Igrac i2 = new Igrac("Laza", 20, 3000);
        lista_igraca.add(i);
        lista_igraca.add(i1);
        lista_igraca.add(i2);
        Klub partizan = new KosarkaskiKlub("Partizan", "Beograd", lista_igraca);
        Klub mancester = new FudbalskiKlub("Mancester United", "Mancester", lista_igraca);
        Klub ne_znam_ni_jedan_odbojkaski_klub = new OdbojkaskiKlub("WhoCares", "Ndzmena", lista_igraca);
        System.out.println(partizan);
        System.out.println(mancester);
        System.out.println(ne_znam_ni_jedan_odbojkaski_klub);
        System.out.println(partizan.ukupnoPoena());
        System.out.println(mancester.najiskusniji_igrac());
        System.out.println(ne_znam_ni_jedan_odbojkaski_klub.vrednostTima());




    }
}
