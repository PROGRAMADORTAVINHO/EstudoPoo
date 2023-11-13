package ProjetoYoutube;

public class Visualizacao{

    private Viewer espectador;
    private Vidio filme;

    public Visualizacao(Viewer espectador, Vidio filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }    

    public Viewer getEspectador() {
        return espectador;
    }
    public void setEspectador(Viewer espectador) {
        this.espectador = espectador;
    }

    public Vidio getFilme() {
        return filme;
    }
    public void setFilme(Vidio filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao \nEspectador = " + espectador + "\nFilme = " + filme;
    }
}
