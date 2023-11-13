package PolimorfismoPart1;

public class Mamifero extends Animal{

    private String corPelo;

    public Mamifero(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamífero");
    }
}
