package PolimorfismoPart2;

import PolimorfismoPart2.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        {Cachorro c = new Cachorro(0, 0, 0);
            System.out.println(c.toString());
            c.emitirSom();
            c.reagir("Toma Comida");
            c.reagir("Vai apanhar");
            c.reagir(11, 45);
            c.reagir(21, 0);
            c.reagir(true);
            c.reagir(false);
            c.reagir(2,15.5f);
            c.reagir(17, 4.5f);
        }
    }
}
