package HerançaParte2;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        {Visitante v1 = new Visitante(null, 0, null);
        v1.setNome("Tavinho");
        v1.setIdade(19);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println();
        }

        {Aluno a1 = new Aluno(null, 0, null);
        a1.setNome("Akira");
        a1.setIdade(21);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Engenharia da Computação");
        a1.PagarMensalidade();
    }

        System.out.println();

        {Bolsista b1 = new Bolsista(null, 0, null);
        b1.setNome("Dan");
        b1.setIdade(19);
        b1.setSexo("M");
        b1.setCurso("Engenharia da Computação");
        b1.setBolsa(50.60f);
        b1.setMatricula(2222);
        b1.PagarMensalidade();
    }
        
        System.out.println();
    
        {AlunoTecnico at1 = new AlunoTecnico(null, 0, null);
            at1.setNome("João Otavio");
            at1.setIdade(19);
            at1.setSexo("M");
            at1.setMatricula(3333);
            at1.setCurso("Técnioco Em Informática");
            at1.setRegistroProficional(1234);
            at1.praticar();
        }

        System.out.println();
    
        {Professor p1 = new Professor(null, 0, null);
            p1.setNome("Jorge");
            p1.setIdade(50);
            p1.setSexo("M");
            p1.setEspecificação("Fisico Nuclear");
            p1.setSalario(10000.50f);
            p1.receberAumento();
        }
    }
}
