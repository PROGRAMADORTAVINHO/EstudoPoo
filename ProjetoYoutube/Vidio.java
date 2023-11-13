package ProjetoYoutube;

public class Vidio implements AcoesVideo{
    
    private String titulo;
    private int avaliacao, views,curtidade;
    private boolean reproduzindo;

    public Vidio(String vidio) {
        this.titulo = vidio;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidade = 0;
        this.reproduzindo = false;
    }   

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidade() {
        return curtidade;
    }
    public void setCurtidade(int curtidade) {
        this.curtidade = curtidade;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidade ++;
    }

    @Override
    public String toString() {
        return "Vidio: \nTitulo = " + titulo + "\nAvaliacao = " + avaliacao + "\nViews = " + views + "\nCurtidade = " + curtidade
                + "\nReproduzinda = " + reproduzindo;
    }
    
}
