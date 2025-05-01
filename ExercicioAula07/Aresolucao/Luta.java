import java.util.Random;
public class Luta{
  private Lutador desafiado;
  private Lutador desafiante;
  private int rouds;
  private boolean aprovado;

  public void marcarLuta(Lutador l1, Lutador l2){
    if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
      this.aprovado = true;
      this.desafiante = l1;
      this.desafiado = l2;
    } else {
      this.aprovado = false;
      this.desafiante = null;
      this.desafiado = null;
    }
    
    
  }

  public void apresentarLutadores(){
    if(aprovado){
    l1.apresentar();
    l2.apresentar();
    }
  }

  public void lutar(boolean aprovado){
      if(aprovado){
        Random random = new Random();
        int vencedor = random.nextInt(2);
      }
    
    
  }

  public Lutador getDesafiado(){
    return this.desafiado;
    
  }

  public Lutador getDesafiante(){
    return this.desafiante;
  }


  
}
