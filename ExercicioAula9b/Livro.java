public class Livro{
  private String titulo;
  private String autor;
  private int totPag;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;
  private boolean emprestado;


  public void detalhes(){
    System.out.println("titulo: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Total de páginas: " + this.totPag);
    System.out.println("Emprestado: " + this.emprestado);
  }

  public void fazerEmprestimo(){
    this.emprestado = true;
  }

  public void devolver(){
    this.emprestado = false;
  }
  
}
