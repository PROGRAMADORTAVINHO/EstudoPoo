package ProjetoLivro;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Tavinho", 19, "M");
        p[1] = new Pessoa("Bia", 21, "F");

        l[0] = new Livro("Diario de um Banana", "Dan", 200, p[0]);
        l[1] = new Livro("Biblia Sagrada","João Ferreira de Almeida", 1500, p[1]);
        l[2] = new Livro("Fisíca Avançada", "Jorge",1500,p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        l[1].folhear(100);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());

        l[2].abrir();
        l[2].folhear(100);
        l[2].avancarPag();
        System.out.println(l[2].detalhes());
    }
}
