package HerançaPart1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, 0, null);
        Aluno p2 = new Aluno(null, 0, null, null, null);
        Professor p3 = new Professor(null, 0, null, null, 0);
        Funcionario p4 = new Funcionario(null, 0, null, null, false);

        p1.setNome("Tavinho");
        p1.setIdade(30);
        p1.setSexo("M");

        p2.setNome("Maria");
        p2.setIdade(20);
        p2.setSexo("F");
        p2.setCurso("Engenharia da Computação");
        p2.setMatri("");
        p2.cancelarMatr();

        p3.setNome("Akira");
        p3.setIdade(10);
        p3.setSexo("M");
        p3.setSalario(2500.75f);
        p3.receberAum(500.20f);

        p4.setNome("Marcelinho");
        p4.setIdade(19);
        p4.setSexo("M");
        p4.setSetor("Estoque");
        p4.setTabalhando(false);
        p4.mudarTabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}