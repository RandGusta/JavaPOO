public class DescobertaCacaPalavras {

    CriadorPalavrasAleatorias palavra;

    public DescobertaCacaPalavras(){
        this.palavra = new CriadorPalavrasAleatorias();
        this.palavra.geradorIndiceAleatorio(palavra.palavrasAleatorias);
    }

    boolean acertou(String chute){
        boolean acertou = false;
        String palavraCorreta = palavra.getPalavra();
        if((palavraCorreta.toLowerCase()).equals(chute.toLowerCase())){
            System.out.println("Acertou!!!");
            return true;

        } else {
            return false;

        }



    }

    void dicaLetraInicial(String chute){
        String palavraCorreta = palavra.getPalavra();
        if(!((palavraCorreta.toLowerCase()).equals(chute.toLowerCase()))){
            char[] palavraCorretaChar = palavraCorreta.toCharArray();
            for(int x=0; x<palavraCorretaChar.length; x++){
                if(x==0){
                    System.out.println("DICA!! A primeira letra da palavra é: " +  (palavraCorretaChar[x]));

                }
            }

        }



    }



    void dicaQuantidadeLetras(String chute){
        String palavraCorreta = palavra.getPalavra();
        char [] palavraCorretaChar = palavraCorreta.toCharArray();
        int cont = 0;
        for(int y=0; y<palavraCorretaChar.length; y++){
            cont ++;
        }
        System.out.println("A palavra escolhida tem "+ cont +" letras");



    }



}




