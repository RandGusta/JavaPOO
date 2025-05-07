public class Aluno extends Pessoa{
  private int matricula;
  private String curso;

  public void cancelarMatricula(){
    System.out.println("Matricula cancelada");
  }

  public int getMatricula(){
    return this.matricula;
  }

  public String getCurso(){
    return this.curso;
  }

  public void setCurso(String curso){
    this.curso = curso;
  }
  
  
}
