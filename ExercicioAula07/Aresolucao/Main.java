public class Main {
    public static void main(String[] args){
        Lutador l1 = new Lutador("Calango lulinha", "Brasileiro", 23, 1.71, 78.34, 4, 3, 1);
        Lutador l2 = new Lutador("Laranjinha comunista", "Americano", 27, 1.69, 75.90, 3, 5, 2);

        Luta luta1 = new Luta();
        luta1.marcarLuta(l1, l2);
        luta1.lutar();



    }

}
