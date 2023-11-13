package HerançaParte2;

public final class Bolsista extends Aluno {

    private float bolsa;

    public Bolsista(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void RenovarBolsa(){
        System.out.println("Renovando Bolde de " + this.getNome());
    }

    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + " é Bolsista! Pagamento Facilitado");
    }
}
