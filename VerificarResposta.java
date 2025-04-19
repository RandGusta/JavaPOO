public class VerificarResposta {
    private String palavraSelecionada;

    public VerificarResposta(String palavraSelecionada){
        this.palavraSelecionada = (palavraSelecionada).toLowerCase();

    }

    public boolean acertou(String chute){
        if(this.getPalavraSelecionada().equals(chute.toLowerCase())){

            return true;

        } else {
            return false;

        }

    }


    public String getPalavraSelecionada(){
        return this.palavraSelecionada;

    }




}
