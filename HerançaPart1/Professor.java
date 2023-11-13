package HerançaPart1;

public class Professor extends Pessoa{

    private String especeialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especeialidade, float salario) {
        super(nome, idade, sexo);
        this.especeialidade = especeialidade;
        this.salario = salario;
    }

    public void receberAum(float aum){
        this.salario += aum;
    }

    public String getEspeceialidade() {
        return especeialidade;
    }
    public void setEspeceialidade(String especeialidade) {
        this.especeialidade = especeialidade;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    
}
