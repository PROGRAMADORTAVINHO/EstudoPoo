package ProjetoYoutube;

public class Viewer  extends Pessoa{

    private String login;
    private int totAssistindo;

    public Viewer(String nome, int idade, String sexo, float experiencia, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }
    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Viewer \n" + super.toString() + "\nLogin = " + login + "\nTotAssistindo = " + totAssistindo;
    }    
}
