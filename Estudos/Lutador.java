// Aula POO 07a

// Exercicio --> Emoji combat 
// Atributos dados: nome, nacionalidade, idade, altura, peso, categoria, vitorias, derrotas, empates 

public Class Lutador{
  private String nome;
  private String nacionalidade;
  private int idade;
  private double altura;
  private double peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;
  

	public void apresentar(){

	System.out.println("Senhoras e senhores, com vocês " + this.getNome() "!!!!!");
	System.out.println("Sendo "  + this.getNacionalidade());
	System.println("Com " + this.getPeso() + " quilos ");
	System.out.println("E " + this.getAltura() + "de altura");
	}

	public void status(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Vitorias" + this.getVitorias());
		
	}

  	public boolean ganhaLuta(){}

	public boolean perderLuta(){}

	public boolean empatarLuta(){}
	
	public void setNome(String nome){
		this.nome = nome;

	}

	public void setNacionalidade(String nacionalidade){
		this.Nacionalidade = nacionalidade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public void setPeso(double peso){
		this.peso = peso;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public void setCategoria(String categoria){
		this.categoria = categoria;
	}

	public void setVitoria(int vitoria){
		this.vitoria = vitória;
	}
	
	public void setDerrotas(int derrotas){
		this.derrotas = derrotas;
	}

	public void setEmpates(int empates){
		this.empates = empates;
	}

	public String getNome(){
		return this.nome;
	
	}

	public String getNacionalidade(){
		return this.nacionalidade;
	
	}

	public int getIdade(){
		return this.idade;
		
	}

	public double getAltura(){
		return this.altura;
	
	}

	public double getPeso(){
		return this.peso;
	}

	public double getCategoria(){
		return this.categoria;
	
	}

	public int vitoria(){
		return this.vitorias;
	}

	public int derrotas(){
		return this.derrotas;
	}

	public int empates(){
		return this.empates;
	}

	

	

  
}
