//Classe mãe/progenitóra ou Super classe --> classe que da origem a outras classes 
// Classes filhas/Sub classes --> herdam todas suas caracteristicas e comportamentos 

public class Pessoa{
private String nome;
private int idade;
private String sexo;

public void fazerAniversario(){
  this.idade += 1;
}

public String getNome(){
  return this.nome;
}

public int getIdade(){
  return this.idade;
}

public void setNome(String nome){
  this.nome = nome;
}

public void setIdade(int idade){
  this.idade = idade; 
}

public void setSexo(String sexo){
  this.sexo = sexo;
}

  
}
