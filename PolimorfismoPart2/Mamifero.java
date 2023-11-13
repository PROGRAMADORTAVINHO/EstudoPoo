package PolimorfismoPart2;

public class Mamifero  extends Animal{

    protected String corPelo;

    public Mamifero(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamífero");
    }
}
