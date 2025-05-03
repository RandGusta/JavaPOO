public class Livro implements Publicacao{
  private String titulo;
  private String autor;
  private int totPag;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  public Livro(String titulo, String autor, int totPag, Pessoa leitor){
    this.titulo = titulo;
    this.autor = autor;
    this.totPag = totPag;
    this.pagAtual = 0;
    this.aberto = false;
    this.leitor = leitor;
  }


  public void detalhes(){
    System.out.println("titulo: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Total de páginas: " + this.totPag);
    System.out.println("Emprestado: " + this.emprestado);
  }

  
  @Override
  public void abrir(){
    this.aberto = true;
  }
  
  @Override
  public void fechar(){
    this.aberto = false;
  }
  
  @Override 
  public void folhear(int pag){
    this.abrir();
    this.pagAtual = pag;
  }
  
  @Override 
  public void avancarPagina(){
    this.abrir();
    this.pagAtual += 1;
  }
  
  @Override
  public void voltarPagina(){
    this.abrir();
    this.pagAtual -= 1;
  }
  
  
}
