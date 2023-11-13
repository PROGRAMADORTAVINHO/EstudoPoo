package HerançaPart1;

public class Aluno extends Pessoa {


    private String matri;
    private String curso;

    public void cancelarMatr(){
        System.out.println("Matricular Será Cancelada!!!");
    }

    public Aluno(String nome, int idade, String sexo, String matri, String curso) {
        super(nome, idade, sexo);
        this.matri = matri;
        this.curso = curso;
    }

    public String getMatri() {
        return matri;
    }
    public void setMatri(String matri) {
        this.matri = matri;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
