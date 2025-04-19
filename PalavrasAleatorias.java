import java.util.Random;
public class PalavrasAleatorias {
    private String[] palavras = {"agua", "jacare", "pomodoro", "universo", "pizza"};
    private String palavraSorteada;

    public PalavrasAleatorias(){
        sortearPalavra();

    }

    private void sortearPalavra(){
        Random random = new Random();
        this.palavraSorteada = this.palavras[random.nextInt(palavras.length)];

    }
    public String getPalavraSorteada(){
        return this.palavraSorteada;
    }

}
