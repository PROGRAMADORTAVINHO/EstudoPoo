package PolimorfismoPart1.Animais;

import PolimorfismoPart1.Mamifero;

public class Canguru extends Mamifero{

    public Canguru(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("Saltando");
    }    
}
