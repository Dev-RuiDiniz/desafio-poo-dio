package br.com.dio.desafio.dominio;

/**
 * Classe que representa um Curso
 * Herda de Conteudo e implementa a lógica específica para cursos
 * O XP de um curso é calculado multiplicando o XP_PADRAO pela carga horária
 */
public class Curso extends Conteudo{

    // Carga horária do curso em horas
    private int cargaHoraria;

    /**
     * Calcula o XP do curso baseado na carga horária
     * Fórmula: XP_PADRAO * cargaHoraria
     * @return valor de XP calculado
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    /**
     * Construtor padrão da classe Curso
     */
    public Curso() {
    }


    // Métodos getters e setters
    
    /**
     * Retorna a carga horária do curso
     * @return carga horária em horas
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Define a carga horária do curso
     * @param cargaHoraria nova carga horária em horas
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Retorna uma representação em string do objeto Curso
     * @return string formatada com os dados do curso
     */
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
