package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Classe que representa um Bootcamp
 * Um bootcamp possui um conjunto de conteúdos e desenvolvedores inscritos
 * Tem duração fixa de 45 dias a partir da data de criação
 */
public class Bootcamp {
    // Nome do bootcamp
    private String nome;
    
    // Descrição detalhada do bootcamp
    private String descricao;
    
    // Data de início do bootcamp (definida automaticamente na criação)
    private final LocalDate dataInicial = LocalDate.now();
    
    // Data final do bootcamp (45 dias após o início)
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    
    // Conjunto de desenvolvedores inscritos no bootcamp
    private Set<Dev> devsInscritos = new HashSet<>();
    
    // Conjunto de conteúdos do bootcamp (mantém ordem de inserção)
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    // Métodos getters e setters
    
    /**
     * Retorna o nome do bootcamp
     * @return nome do bootcamp
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do bootcamp
     * @param nome novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a descrição do bootcamp
     * @return descrição do bootcamp
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do bootcamp
     * @param descricao nova descrição
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a data inicial do bootcamp
     * @return data de início
     */
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    /**
     * Retorna a data final do bootcamp
     * @return data de término
     */
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
     * Retorna os desenvolvedores inscritos no bootcamp
     * @return conjunto de desenvolvedores inscritos
     */
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
     * Define os desenvolvedores inscritos
     * @param devsInscritos novo conjunto de desenvolvedores
     */
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    /**
     * Retorna os conteúdos do bootcamp
     * @return conjunto de conteúdos
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * Define os conteúdos do bootcamp
     * @param conteudos novo conjunto de conteúdos
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    /**
     * Compara dois objetos Bootcamp para verificar se são iguais
     * Dois bootcamps são iguais se tiverem os mesmos atributos
     * @param o objeto a ser comparado
     * @return true se os objetos são iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    /**
     * Gera o código hash do objeto Bootcamp
     * Baseado em todos os atributos do bootcamp
     * @return código hash do objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
