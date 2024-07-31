package br.com.dio.desafio.dominio;

//abstract - significa que não é possível instanciar a classe conteudo
//classe conteudo serve para implementar as variaveis e metodo nas classes filhas para evitar a repetição de codigo, herança
public abstract class Conteudo {
    //static - significa que vou poder acessar fora dessa classe, mas somente que herda de conteudo, ou seja os filhos, devido estar protected
    //final - signfica que é uma constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // calcularSP - metodo abstrato
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
