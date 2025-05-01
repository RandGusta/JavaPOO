
public class Lutador{
private String nome;
private String nacionalidade;
private int idade;
private double altura;
private double peso;
private String categoria;
private int vitorias;
private int derrotas;
private int empates;

public Lutador(String nome, String nacionalidade, int idade, double altura,  double peso, String categoria, int vitorias, int derrotas, int empates){
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.categoria = categoria;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates 
}


public void apresentar() {
    System.out.println("Senhoras e senhores, com vocês " + this.getNome() + "!!!!!");
    System.out.println("Sendo " + this.getNacionalidade());
    System.out.println("Com " + this.getPeso() + " quilos ");
    System.out.println("E " + this.getAltura() + "de altura");
}

public void status() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("Nacionalidade: " + this.getNacionalidade());
    System.out.println("Peso: " + this.getPeso());
    System.out.println("Altura: " + this.getAltura());
    System.out.println("Vitorias: " + this.getVitoria());
    System.out.println("Derrotas: " + this.getDerrotas());
    System.out.println("Empates: " + this.getEmpates());

}

public void ganharLuta() {
    this.setVitoria(1);
}

public void perderLuta() {
    this.setDerrotas(1);
}

public void empatarLuta() {
    this.setEmpates(1);
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public void setAltura(double altura) {
    this.altura = altura;
}

public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public void setVitoria(int vitoria) {
    this.vitorias += vitoria;
}

public void setDerrotas(int derrotas) {
    this.derrotas += derrotas;
}

public void setEmpates(int empates) {
    this.empates += empates;
}

public String getNome() {
    return this.nome;

}

public String getNacionalidade() {
    return this.nacionalidade;

}

public int getIdade() {
    return this.idade;

}

public double getAltura() {
    return this.altura;

}

public double getPeso() {
    return this.peso;
}

public String getCategoria() {
    return this.categoria;

}

public int getVitoria() {
    return this.vitorias;
}

public int getDerrotas() {
    return this.derrotas;
}

public int getEmpates() {
    return this.empates;
}




}
