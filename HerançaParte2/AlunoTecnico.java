package HerançaParte2;

public final class AlunoTecnico extends Aluno{

    private int registroProficional;

    public AlunoTecnico(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public int getRegistroProficional() {
        return registroProficional;
    }
    public void setRegistroProficional(int registroProficional) {
        this.registroProficional = registroProficional;
    }
    
    public void praticar(){
        System.out.println("O Aluno "+ this.getNome() +" Está Praticando");
    }
}
