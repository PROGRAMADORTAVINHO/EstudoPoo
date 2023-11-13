package ProjetoYoutube;

public class Main {
    public static void main(String[] args) {
        {Vidio video[] = new Vidio[3];
            video[0] = new Vidio("Dudu VS Jaya");
            video[1] = new Vidio("Brennuz VS JotaPê");
            video[2] = new Vidio("JotaPê e Barreto");
            //System.out.println(video[0].toString());
        
        Viewer viewer[] = new Viewer[3];
            viewer[0] = new Viewer("Tavinho", 19, "M", 0, "eae_joao127");
            viewer[1] = new Viewer("Akira", 21, "M", 0, "eae_akira");
            viewer[2] = new Viewer("Bia", 20, "F", 0, "eae_bia");
            //System.out.println(viewer[0].toString());

         Visualizacao vis[] = new Visualizacao[9];
            vis[0] = new Visualizacao(viewer[0], video[0]); // Tavinho Assiste Dudu VS Jaya
            vis[0].avaliar();
            System.out.println(vis[0].toString());
            System.out.println();
            vis[1] = new Visualizacao(viewer[0], video[1]); // Tavinho Assiste Brennuz VS JotaPê
            vis[0].avaliar(10);
            System.out.println(vis[0].toString());
            System.out.println();
            vis[2] = new Visualizacao(viewer[0], video[2]); // Tavinho Assiste JotaPê e Barreto
            vis[0].avaliar(87);
            System.out.println(vis[0].toString());
            System.out.println();

            vis[3] = new Visualizacao(viewer[1], video[0]);
            System.out.println(vis[1].toString());
            System.out.println();
            vis[4] = new Visualizacao(viewer[1], video[1]);
            System.out.println(vis[1].toString());
            System.out.println();
            vis[5] = new Visualizacao(viewer[1], video[2]);
            System.out.println(vis[1].toString());
            System.out.println();

            vis[6] = new Visualizacao(viewer[2], video[0]);
            System.out.println(vis[2].toString());
            System.out.println();
            vis[7] = new Visualizacao(viewer[2], video[1]);
            System.out.println(vis[2].toString());
            System.out.println();
            vis[8] = new Visualizacao(viewer[2], video[2]);
            System.out.println(vis[2].toString());
        }
    }
}
