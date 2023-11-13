package PolimorfismoPart2.Animais;

import PolimorfismoPart2.Mamifero;

public class Lobo extends Mamifero{

    public Lobo(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuuuuu");
    }
}
