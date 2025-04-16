import java.util.Random;
public class GerarTabuleiro{
    char[][] tabuleiro = new char[10][10];
    CriadorPalavrasAleatorias  criadorpalavras;
    public GerarTabuleiro(CriadorPalavrasAleatorias criadorpalavras){
        this.criadorpalavras = criadorpalavras;

    }


    void EspacoVazio(){
        for(int i=0; i<this.tabuleiro.length; i++){
            for(int j=0; j<this.tabuleiro.length; j++){
                this.tabuleiro[i][j] = ' ';
            }
        }
    }

    char[][] inserirPalavras(){
        String[] palavras = criadorpalavras.PalavraAleatoriaTabuleiro();

        for(int x=0; x<palavras.length; x++){
            for(int y=0; y<palavras.length; y++){
                this.tabuleiro[x][y] = palavras[x].charAt(y);
            }
        }
        return tabuleiro;

    }

    void imprimirTabuleiro(){
        for(int l=0; l<this.tabuleiro.length; l++){
            for(int k=0; k<this.tabuleiro.length; k++){
                System.out.print(tabuleiro[l][k]);

            }
            System.out.println();
        }

    }

}
