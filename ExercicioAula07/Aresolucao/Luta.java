import java.util.Random;
public class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;


    public void marcarLuta(Lutador l1, Lutador l2) {
        if (podeLutar(l1, l2)) {
            this.aprovado = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
        private boolean podeLutar(Lutador l1, Lutador l2){
            if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
                return true;
            } else {
                return false;
    }
    }

    private void apresentarLutadores(){
        if(this.aprovado){
            this.desafiante.apresentar();
            this.desafiado.apresentar();
        }
    }

    public void lutar(){
        if(this.aprovado){
            apresentarLutadores();
            Random random = new Random();
            int vencedor = random.nextInt(2);
            definirVencedor(vencedor);
        } else {
            System.out.println("A luta não foi aprovada!!");
        }
    }

        private void definirVencedor(int numero){
            if(numero == 1){
                System.out.print("Palmas para o vencedor ");
                System.out.println(this.desafiante);
            } else if (numero ==2 ){
                System.out.print("Palmas para o vencedor ");
                System.out.print(this.desafiado);
            } else {
                System.out.println("Empate senhoras e senhores!!");
            }

        }
}



