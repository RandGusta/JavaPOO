public class Main {
  public static void main(String[] args){
      Lutador l1 = new Lutador("Calango lulinha", "Brasileiro", 23, 1.71, 78.34, 4, 3, 1);
      
      Lutador l2 = new Lutador("Laranjinha comunista", "Americano", 27, 1.69, 75.90, 3, 5, 2);

      l2.apresentar();
      System.out.println("_______________");
      l2.status();
      System.out.println("_______________");
      l1.apresentar();
      System.out.println("_______________");
      l1.status();
    
      int pontos1 = 0;
      int pontos2 = 0;
      if(l2.getPeso() > l1.getPeso()){
        pontos2 += 1;
      } else {
        pontos1 += 1;
      }
    if(l2.getAltura() > l1.getAltura()){
        pontos2 += 1;
      } else {
        pontos1 += 1;
      } 
      if (l2.getIdade() > l1.getIdade()){
        pontos1 += 1;
      } else {
        pontos2 += 1;
      }
    if(pontos1 > pontos2){
        l1.ganharLuta();
        l2.perderLuta();
        System.out.println("O vencedor foi: " + l1.getNome());
    } else if(pontos1<pontos2){
        l2.ganharLuta();
        l1  .perderLuta();
        System.out.println("O vencedor foi: " + l2.getNome());
    } else {
        l1.empatarLuta();
        l2.empatarLuta();
        System.out.println("Houve um empate senhoras e senhors!!");
    }

    l2.status();
    l1.status();
      
      

    
  }
  
}
