import java.util.Scanner;
public class Main{
    public static void main(String args[]){

        CriadorPalavrasAleatorias criador = new CriadorPalavrasAleatorias();
        DescobertaCacaPalavras teste1 = new DescobertaCacaPalavras();
        GerarTabuleiro teste2 = new GerarTabuleiro(criador);
        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        while(true) {
            System.out.print("Informe a palavra que quer chutar: ");
            String chute = scanner.nextLine();
            cont++;
            boolean acertou = teste1.acertou(chute);
            if (!acertou) {

                if (cont == 1) {
                    teste1.dicaLetraInicial();
                } else if (cont == 2) {
                    teste1.dicaQuantidadeLetras();

                } else if (cont == 3) {
                    teste1.dicaUltimaLetra();

                } else if (cont == 4) {
                    System.out.print("Deseja desistir?[s/n]");
                    String opcao = scanner.nextLine();
                    if ((opcao.toLowerCase()).equals("s")) {
                        break;
                    } else if((opcao.toLowerCase()).equals("n")) {
                        continue;
                    } else {
                        System.out.println("Opção inválida");

                            }
                        }
                    }


        else {
                    break;
                }
            }




        }


    }


