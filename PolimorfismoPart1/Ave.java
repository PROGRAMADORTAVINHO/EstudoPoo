package PolimorfismoPart1;

public class Ave extends Animal{

    private String corPena;

    public Ave(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Construiu Um Ninho");
    }

    @Override
    public void locomover(){
        System.out.println("Voando");
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
