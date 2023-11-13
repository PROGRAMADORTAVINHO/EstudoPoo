package HerançaPart1;

public final class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor, boolean tabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = tabalhando;
    }

    public void mudarTabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTabalhando() {
        return trabalhando;
    }
    public void setTabalhando(boolean tabalhando) {

    }
}
