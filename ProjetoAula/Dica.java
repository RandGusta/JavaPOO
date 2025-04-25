public class Dica {
    private String palavraCorreta;

    public Dica(String palavraCorreta){
        this.palavraCorreta = palavraCorreta.toLowerCase();

    }

    public String getPalavraCorreta(){
        return this.palavraCorreta;

    }

    public void dicaPrimeiraLetra(){
        char[] palavraChar = (this.getPalavraCorreta()).toCharArray();
        for(int i=0; i<palavraChar.length; i++){
            if(i==0){
                System.out.println(" Dica : A primeira letra é " + palavraChar[i]);
            }
        }


    }


    public void dicaUltimaLetra(){
        char[] palavraChar = (this.getPalavraCorreta()).toCharArray();
        for(int i=0; i<palavraChar.length; i++){
            if(i==palavraChar.length-1){
                System.out.println(" Dica : A ultima letra é " + palavraChar[i]);
            }
        }



    }




}

