import java.util.Random;
public class EmbaralharPalavra {

    private String palavraEmbaralhada;
    private String palavraCorreta;


    public EmbaralharPalavra(String palavraSelecionada){
        this.palavraCorreta = palavraSelecionada;
        this.embaralhar();

    }

    public void embaralhar(){
        char[] letras = (this.getPalavraCorreta()).toCharArray();
        Random random = new Random();

        for (int i = 0; i < letras.length; i++) {
            int j = random.nextInt(letras.length);

            char aux = letras[i];
            letras[i] = letras[j];
            letras[j] = aux;
        }

        this.palavraEmbaralhada = "";
        for (int i = 0; i < letras.length; i++) {
            this.palavraEmbaralhada += letras[i];
        }

        this.setPalavraEmbaralhada(this.palavraEmbaralhada);

    }


    public String getPalavraCorreta(){
        return this.palavraCorreta;

    }

    public void setPalavraEmbaralhada(String palavraEmbaralhada){
        this.palavraEmbaralhada = palavraEmbaralhada;

    }

    public String getPalavraEmbaralhada(){

        return this.palavraEmbaralhada;
    }

}
