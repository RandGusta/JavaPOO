
    public class Pessoa {
        private String nome;
        private int idade;
        private char sexo;

        public Pessoa(String nome, int idade, char sexo) {
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;

        }

        public void fazerAniversario() {
            this.idade += 1;
        }

        public String toString(){
            return this.nome;
        }

    }
