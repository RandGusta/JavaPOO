public class Aluno extends Pessoa{
  private String matricula;
  private String curso;

  public void cancelarMatricula(){
    this.matricula = "Matricula Não encontrada";
  }

  public String getMatricula(){
    return this.matricula;
  }

  public String getCurso(){
    return this.curso;
  }
  
}
