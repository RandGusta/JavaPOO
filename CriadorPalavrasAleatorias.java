import java.util.Random;
public class CriadorPalavrasAleatorias {

    String[] palavrasAleatorias = {"agua", "jacare", "pomodoro", "universo", "pizza"};
    private String palavraEscolhida;


    String geradorIndiceAleatorio(String[] palavrasAleatorias){
//            Random random = new Random();
//            int indice1 = random.nextInt(5);
//            int indice2 = random.nextInt(5);
//            int indice3 = random.nextInt(5);
//            boolean diferente = true;
//            while(diferente) {
//                if ((indice1 == indice2) || (indice1 == indice3) || (indice3 == indice2)) {
//                    indice1 = random.nextInt(5);
//                    indice2 = random.nextInt(5);
//                    indice3 = random.nextInt(5);
//                } else {
//                    diferente = false;
//                }
//            }
//            String[] palavrasEscolhidas = new String[3];
//            palavrasEscolhidas[0] = palavrasAleatorias[indice1];
//            palavrasEscolhidas[1] = palavrasAleatorias[indice2];
//            palavrasEscolhidas[2] = palavrasAleatorias[indice3];
//
//            return palavrasEscolhidas;
//
//            _________________________________
        Random random = new Random();
        int indiceEscolhido = random.nextInt(5);
        this.palavraEscolhida = palavrasAleatorias[indiceEscolhido];
        return this.palavraEscolhida;

    }

    public String getPalavra(){
        return this.palavraEscolhida;

    }

}
