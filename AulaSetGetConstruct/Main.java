package AulaSetGetConstruct;

public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta("Bic", "Vermelho", 0.5f);
        Caneta c2 = new Caneta("Bic", "Preta", 1f);
        c1.status();
        c2.status();
    }
}