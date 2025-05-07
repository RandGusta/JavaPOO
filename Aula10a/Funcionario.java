public class Funcionario extends Pessoa{
  private String setor;
  private boolean trabalhando;


  public void mudarTrabalho(){
    this.trabalhando = !this.trabalhando;
  }

  public String getSetor(){
    return this.setor;
  }

  public boolean getTrabalhando(){
    return this.trabalhando;
  }
  public void setSetor(String setor){
    this.setor = setor;
  }
  
}
