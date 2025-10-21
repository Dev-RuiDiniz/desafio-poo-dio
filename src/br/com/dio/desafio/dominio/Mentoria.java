package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Classe que representa uma Mentoria
 * Herda de Conteudo e implementa a lógica específica para mentorias
 * O XP de uma mentoria é fixo: XP_PADRAO + 20 pontos extras
 */
public class Mentoria extends Conteudo{

    // Data em que a mentoria será realizada
    private LocalDate data;

    /**
     * Calcula o XP da mentoria
     * Fórmula: XP_PADRAO + 20 pontos extras
     * @return valor de XP calculado (30 pontos)
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * Construtor padrão da classe Mentoria
     */
    public Mentoria() {
    }

    // Métodos getters e setters
    
    /**
     * Retorna a data da mentoria
     * @return data da mentoria
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da mentoria
     * @param data nova data da mentoria
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna uma representação em string do objeto Mentoria
     * @return string formatada com os dados da mentoria
     */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
