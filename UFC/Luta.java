package UFC;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private  boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada) {
            System.out.println("### Desafiado ###");
            this.desafiado.aprsentar();
            System.out.println();
            System.out.println("### Desafiante  ###");
            this.desafiante.aprsentar();
            System.out.println();

            System.out.println("======  Resultado da Luta ======");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("A Luta Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O Lutador(a) " + desafiado.getNome() + " Ganhou a Luta!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O Lutador(a) "+ desafiante.getNome() + " Ganhou a Luta!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println();
        } else{
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean gteAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}