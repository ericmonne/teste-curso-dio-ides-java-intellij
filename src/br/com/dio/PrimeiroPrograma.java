package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro1 = new Livro("O Código DaVinci", 300);
        System.out.println(gato);
        System.out.println(livro1);
        /*int a = 5;
        int b = 3;
        System.out.println("Olá, enfermeira! " + (a+b));*/
    }

}
class Livro{
    public String nome;
    public int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
