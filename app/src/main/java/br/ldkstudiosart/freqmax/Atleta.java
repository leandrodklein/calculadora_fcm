package br.ldkstudiosart.freqmax;

public class Atleta {
    private String nome;
    private String idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        //return "Atleta{" +
        //        "nome='" + nome + '\'' +
        //        ", idade='" + idade + '\'' +
        //        '}';
        return "Nome: " + nome + " Idade: " + idade;
    }
}
