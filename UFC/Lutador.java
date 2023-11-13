package UFC;

public class Lutador implements Controlador{

    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    public Lutador(String no, String na, int id, float al, float pe,
            int vi, int de, int em) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Lutador Inválido, Abaixo do Peso";
        }else if(this.peso <= 70.3 ){
            this.categoria = "Categoria Peso Akira";
        }else if(this.peso <= 83.3){
            this.categoria = "Categoria Peso Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Categoria Peso Pessado";
        }else{
            this.categoria = "Lutador Invalido, Acima do Peso";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void aprsentar() {
       System.out.println("Lutador " + this.getNome());
       System.out.println("Nacionalidade " + this.getNacionalidade());
       System.out.println(this.getIdade() + " anos");
       System.out.println(this.getAltura() + "m de altura");
       System.out.println("Pesando " + this.getPeso() + "Kg");
       System.out.println("Ganhou " + this.getVitorias());
       System.out.println("Perdeu " + this.getDerrotas());
       System.out.println("Empatou " + this.getEmpates());
    }

    @Override
    public void Status() {
        System.out.println(getNome());
        System.out.println("A Categoria dele é " + getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }

    @Override
    public void ganharLuta() {
       this.setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }
    
}
