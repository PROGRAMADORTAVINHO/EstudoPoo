package UFC;

public class Main {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[7]; 
        
        lutador[0] = new Lutador("Akira", "Coreano", 21 , 1.80f, 60.9f , 0 , 50 , 0);
        lutador[1] = new Lutador("Dan", "Japones", 19, 1.63f, 68.89f, 2 , 5 , 3);
        lutador[2] = new Lutador("Navagol", "EUA", 21, 1.50f, 80.10f, 10, 5, 2);
        lutador[3] = new Lutador("Tavinho", "Grajaú", 19, 1.71f, 89.40f, 80, 0, 2);
        lutador[4] = new Lutador("Marcelinho", "Frances", 19, 1.70f, 70.60f, 5, 20, 10);
        lutador[5] = new Lutador("Felpão", "Academia", 20, 1.90f, 90.80f, 8, 5, 4);
        lutador[6] = new Lutador("Matheus", "Chines", 80, 1.65f, 110.10f, 8, 5, 9);
    
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(lutador[4] , lutador[6]);
        UFC01.lutar();
    }
}
