public class Main{
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("João Almeida", 23, 'M');
        Pessoa p2 = new Pessoa("Sabrina Oliveira", 19, 'F');
        Pessoa p3 = new Pessoa("Felipe Oliveira", 21, 'M');

        Livro l1 = new Livro("Os dois morrem no final", "Adam Levi", 200, p1);
        Livro l2 = new Livro("Percy Jackson: O ladrão de raios", "Rick Riordan", 340, p2);
        Livro l3 = new Livro("Jogos Vorazes: Em chamas", "Jhoana Lucicard", 312, p3);




    }
}
