package HerançaParte2;

public final class Professor extends Pessoa {
    private String especificação;
    private float salario;

    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public String getEspecificação() {
        return especificação;
    }
    public void setEspecificação(String especificação) {
        this.especificação = especificação;
    }

    public float getSalario() {
        return salario;
     }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAumento(){
        System.out.println("O Professor "+ this.getNome() + " Está Recebendo um Aumento");
    }
}
