import java.util.Scanner;
public class Main3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        PalavrasAleatorias palavraaleatoria1 = new PalavrasAleatorias();
        VerificarResposta verificarresposta1 = new VerificarResposta(palavraaleatoria1.getPalavraSorteada());
        EmbaralharPalavra embaralhada = new EmbaralharPalavra(palavraaleatoria1.getPalavraSorteada());
        Dica dica1 =  new Dica(palavraaleatoria1.getPalavraSorteada());

        System.out.print("Vamos brincar de adivinhe a palavra você terá 5 tentativas, a palavra sorteada foi: ");
        System.out.println(embaralhada.getPalavraEmbaralhada());

        int cont = 0;

        for(int i =0; i<5; i++) {
            System.out.print("Informe a palavra que quer chutar: ");
            String chute = scanner.nextLine();
            cont++;
            boolean acertou = verificarresposta1.acertou(chute);
            if (!acertou) {
                if(cont == 2){
                    dica1.dicaPrimeiraLetra();

                } else if (cont==4) {
                    dica1.dicaUltimaLetra();

                } else if (cont==5) {
                    break;

                } else {
                    System.out.println("tente novamente...");

                }
            } else {
                System.out.println("PARABÉNS VOCÊ ACERTOU");
                break;
            }


        }
        PalavrasAleatorias palavraaleatoria2 = new PalavrasAleatorias();
        VerificarResposta verificarresposta2 = new VerificarResposta(palavraaleatoria2.getPalavraSorteada());
        CriarTabuleiro tabuleiroCriado = new CriarTabuleiro(palavraaleatoria2.getPalavraSorteada());

        Dica dica2 = new Dica(palavraaleatoria2.getPalavraSorteada());

        System.out.println("Vamos brincar CAÇA PALAVRAS  5 tentativas");
        tabuleiroCriado.printTabuleiro();

        int cont2 = 0;

        for(int i =0; i<5; i++) {
            System.out.print("Informe a palavra que quer chutar: ");
            String chute = scanner.nextLine();
            cont2++;
            boolean acertou = verificarresposta2.acertou(chute);
            if (!acertou) {
                if(cont2 == 2){
                    dica2.dicaPrimeiraLetra();

                } else if (cont2==4) {
                    dica2.dicaUltimaLetra();

                } else if (cont2==5) {
                    break;

                } else {
                    System.out.println("tente novamente...");

                }
            } else {
                System.out.println("PARABÉNS VOCÊ ACHOU");
                break;
            }


        }



    }
}
