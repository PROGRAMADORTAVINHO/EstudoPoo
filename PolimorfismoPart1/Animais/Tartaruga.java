package PolimorfismoPart1.Animais;

import PolimorfismoPart1.Reptil;

public class Tartaruga extends Reptil{

    public Tartaruga(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover(){
        System.out.println("Anda Bem Devagar");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Frutas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }    
}
