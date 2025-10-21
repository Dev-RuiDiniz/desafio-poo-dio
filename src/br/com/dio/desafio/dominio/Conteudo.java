package br.com.dio.desafio.dominio;

/**
 * Classe abstrata que representa um conteúdo educacional
 * Esta é a classe base para todos os tipos de conteúdo (Cursos, Mentorias, etc.)
 * Define a estrutura comum que todos os conteúdos devem ter
 */
public abstract class Conteudo {

    // Constante que define o XP padrão para todos os conteúdos
    protected static final double XP_PADRAO = 10d;

    // Atributos comuns a todos os conteúdos
    private String titulo;    // Título do conteúdo
    private String descricao; // Descrição detalhada do conteúdo

    /**
     * Método abstrato para calcular a experiência (XP) do conteúdo
     * Cada tipo de conteúdo implementa sua própria lógica de cálculo
     * @return valor de XP calculado
     */
    public abstract double calcularXp();

    // Métodos getters e setters para os atributos
    
    /**
     * Retorna o título do conteúdo
     * @return título do conteúdo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do conteúdo
     * @param titulo novo título
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Retorna a descrição do conteúdo
     * @return descrição do conteúdo
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do conteúdo
     * @param descricao nova descrição
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
