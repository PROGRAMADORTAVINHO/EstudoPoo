package PolimorfismoPart1.Animais;

import PolimorfismoPart1.Mamifero;

public class Cachorro extends Mamifero{

    public Cachorro(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }
    public void enterrarOsso(){
        System.out.println("Enterrando o Osso");
    }
    public void abanarRabo(){
        System.out.println("Abanar o Rabo");
    }

    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Ração");
    }
    @Override
    public void emitirSom(){
        System.out.println("Latindo Au Au");
    }    
}
