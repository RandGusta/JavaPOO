
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

    public Lutador(String nome, String nacionalidade, int idade, double altura,  double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    public void apresentar() {
        System.out.println("___________________________");
        System.out.println("Senhoras e senhores, com vocês " + this.getNome() + "!!!!!");
        System.out.println("Sendo " + this.nacionalidade);
        System.out.println("Com " + this.getPeso() + " quilos ");
        System.out.println("E " + this.getAltura() + "de altura");
    }

    public void status() {
        System.out.println("___________________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Vitorias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);

    }

    public void ganharLuta() {
        this.vitorias += 1;
    }

    public void perderLuta() {
        this.derrotas += 1;
    }

    public void empatarLuta() {
        this.empates += 1;
    }

    private void setPeso(double peso){
        this.peso = peso;
        this.categoria = definirCategoria(peso);
    }


    private String definirCategoria(double peso) {
        if(peso < 52.2){
            return "inválido";
        } else if(peso <= 70.3) {
            return "leve";
        } else if(peso <= 83.9){
            return "Médio";
        } else if(peso <= 120.2){
            return "Pesado";
        } else {
            return "Inválido";
        }
    }

        public double getPeso(){
            return this.peso;
        }

        public double getAltura(){
            return this.altura;
        }

        public int getIdade(){
            return this.idade;
        }
        public String getNome(){
            return this.nome;
        }
        public String getCategoria(){
            return this.categoria;
        }


    }
