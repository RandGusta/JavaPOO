import java.util.Scanner;
public class Main{
    public static void main(String args[]){

        DescobertaCacaPalavras teste1 = new DescobertaCacaPalavras();
        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        while(true){
            System.out.print("Informe a palavra que quer chutar: ");
            String chute = scanner.nextLine();
            cont ++;
            boolean acertou = teste1.acertou(chute);
            if(!acertou){

                if(cont == 1){
                    teste1.dicaLetraInicial(chute);
                } else if(cont == 2){
                    teste1.dicaQuantidadeLetras(chute);

                }



            } else {
                break;
            }
        }


    }
}


