package AulaEmpacotamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override //Override é sobescrever 
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("-----Menu-----");
            System.out.println("Está Ligado? " + this.getLigado());
            System.out.println("Está Tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());

            for (int i = 0; i <= this.getVolume(); i += 10){
                System.out.print("|");
            }
        } else {
            System.out.println("Impossível Abrir O Menu");
        }
    }
    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Fechando Menu...");
        } else {
            System.out.println("Impossivel Fechar o Menu");
        }
    }
    @Override
    public void maisVolume() {
        if  (this.getLigado()){
            this.setVolume(this.getVolume() + 5 );
        } else {
            System.out.println("Impossível Aumentar Volume");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5 );
        } else {
            System.out.println("Impossível Diminuir Volume");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0 ){
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
        System.out.println("Não Foi Possivel Dar Play");
    }
    }
    @Override
    public void pause() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(false);
        } else {
            System.out.println("Não Foi Possivel Dar Pouse");
        }
    }
}