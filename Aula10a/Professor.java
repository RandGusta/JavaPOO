public class Professor{
  private String especialidade;
  private double salario;

  public void receberAumento(int aumento){
    this.salario += aumento;
  }

  public String getEspecialidade(){
    return this.especialidade;
  }
  
}
