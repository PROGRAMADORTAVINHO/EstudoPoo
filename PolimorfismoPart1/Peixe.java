package PolimorfismoPart1;

public class Peixe extends Animal{

    private String corEscama;

    public Peixe(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Soutou Uma Bolha");
    }  
    
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Substância");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe Não Faz Som");
    }
}
