import java.util.Random;
public class CriarTabuleiro {

    private char[][] tabuleiro;
    private String palavraCorreta;

    public CriarTabuleiro(String palavraSelecionada){
        this.palavraCorreta = palavraSelecionada.toUpperCase();
        this.tabuleiro = new char[10][10];
        this.gerarTabuleiro();
    }

    public void printTabuleiro(){
       for(int i=0; i<10; i++){
           for(int j=0; j<10; j++){
               System.out.print(" " + this.tabuleiro[i][j]);
           }
           System.out.println();
       }

    }

    public void setTabuleiro(char[][] tabuleiro){
        this.tabuleiro = tabuleiro;

    }

    public String getPalavraCorreta(){
        return this.palavraCorreta;

    }

    public void gerarTabuleiro(){
        if (palavraCorreta.length() > 10) {
            System.out.println("Erro: palavra muito longa para o tabuleiro!");
            return;
        }

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10; j++) {
                this.tabuleiro[i][j] = (char) (random.nextInt(26) + 'A');
            }
        }

        int linha = random.nextInt(10);
        int maxInicioColuna = 10 - this.palavraCorreta.length();
        int coluna = random.nextInt(maxInicioColuna + 1);

        for (int i = 0; i < this.palavraCorreta.length(); i++) {
            this.tabuleiro[linha][coluna + i] = this.palavraCorreta.charAt(i);
        }

//        for (int i = 0; i < this.tabuleiro.length; i++) {
//            for (int j = 0; j < this.tabuleiro[i].length; j++) {
//                System.out.print(this.tabuleiro[i][j] + " ");
//            }
//            System.out.println();
        }
    }



