package PolimorfismoPart1;

import PolimorfismoPart1.Animais.Cachorro;
import PolimorfismoPart1.Animais.Canguru;
import PolimorfismoPart1.Animais.Tartaruga;

public class Main {
    public static void main(String[] args) {

       { Mamifero m = new Mamifero(0, 0, 0);
            m.setPeso(85.3f);
            m.setCorPelo("Preto");
            m.setIdade(2);
            m.setMembros(4);
            System.out.println(m.toString());
            m.locomover();
            m.alimentar();
            m.emitirSom();
            System.out.println();
        }
        { Reptil r = new Reptil(0, 0, 0);
            r.setPeso(15.50f);
            r.setCorEscama("Vermelho");
            r.setIdade(5);
            r.setMembros(4);
            System.out.println(r.toString());
            r.locomover();
            r.alimentar();
            r.emitirSom();
            System.out.println();
        }     

        { Peixe p = new Peixe(0, 0, 0);
            p.setPeso(1.50f);
            p.setCorEscama("Azul");
            p.setIdade(6);
            p.setMembros(2);
            System.out.println(p.toString());
            p.locomover();
            p.alimentar();
            p.emitirSom();
            p.soltarBolha();
            System.out.println();
        }
        
        { Ave a = new Ave(0, 0, 0);
            a.setPeso(20.50f);
            a.setCorPena("Branco");
            a.setIdade(40);
            a.setMembros(2);
            System.out.println(a.toString());
            a.locomover();
            a.alimentar();
            a.emitirSom();
            a.fazerNinho();
            System.out.println();
        }
        
        {Canguru canguru = new Canguru(0, 0, 0);
            canguru.setPeso(20.50f);
            canguru.setCorPelo("Marrom");
            canguru.setIdade(15);
            canguru.setMembros(4);
            System.out.println(canguru.toString());
            canguru.locomover();
            canguru.alimentar();
            canguru.emitirSom();
            canguru.usarBolsa();
            System.out.println();
        }

        {Cachorro cachorro = new Cachorro(0, 0, 0);
            cachorro.setPeso(55.30f);
            cachorro.setCorPelo("Malhado");
            cachorro.setIdade(3);
            cachorro.setMembros(4);
            System.out.println(cachorro.toString());
            cachorro.locomover();
            cachorro.alimentar();
            cachorro.emitirSom();
            cachorro.enterrarOsso();
            cachorro.abanarRabo();
            System.out.println();
        }

        {Tartaruga tartaruga = new Tartaruga(0, 0, 0);
            tartaruga.setPeso(55.30f);
            tartaruga.setCorEscama("Verde");
            tartaruga.setIdade(3);
            tartaruga.setMembros(4);
            System.out.println(tartaruga.toString());
            tartaruga.locomover();
            tartaruga.alimentar();
            tartaruga.emitirSom();
            System.out.println();
        }
    }
}

