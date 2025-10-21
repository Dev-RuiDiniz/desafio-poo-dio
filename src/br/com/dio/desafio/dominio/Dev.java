package br.com.dio.desafio.dominio;

import java.util.*;

/**
 * Classe que representa um Desenvolvedor (Dev)
 * Gerencia os conteúdos inscritos e concluídos pelo desenvolvedor
 * Calcula o XP total baseado nos conteúdos concluídos
 */
public class Dev {
    // Nome do desenvolvedor
    private String nome;
    
    // Conjunto de conteúdos em que o dev está inscrito (mantém ordem de inserção)
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    
    // Conjunto de conteúdos que o dev já concluiu (mantém ordem de inserção)
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Inscreve o desenvolvedor em um bootcamp
     * Adiciona todos os conteúdos do bootcamp aos conteúdos inscritos
     * Adiciona o dev à lista de devs inscritos no bootcamp
     * @param bootcamp bootcamp no qual se inscrever
     */
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Faz o desenvolvedor progredir no bootcamp
     * Move o primeiro conteúdo inscrito para os conteúdos concluídos
     * Se não houver conteúdos inscritos, exibe mensagem de erro
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            // Move o conteúdo de inscrito para concluído
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    /**
     * Calcula o XP total do desenvolvedor baseado nos conteúdos concluídos
     * Soma o XP de todos os conteúdos que foram concluídos
     * @return total de XP acumulado
     */
    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        /* Versão alternativa usando Stream API (comentada):
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();*/
    }


    // Métodos getters e setters
    
    /**
     * Retorna o nome do desenvolvedor
     * @return nome do desenvolvedor
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do desenvolvedor
     * @param nome novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna os conteúdos em que o dev está inscrito
     * @return conjunto de conteúdos inscritos
     */
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    /**
     * Define os conteúdos inscritos
     * @param conteudosInscritos novo conjunto de conteúdos inscritos
     */
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    /**
     * Retorna os conteúdos concluídos pelo dev
     * @return conjunto de conteúdos concluídos
     */
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * Define os conteúdos concluídos
     * @param conteudosConcluidos novo conjunto de conteúdos concluídos
     */
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    /**
     * Compara dois objetos Dev para verificar se são iguais
     * Dois devs são iguais se tiverem o mesmo nome, conteúdos inscritos e concluídos
     * @param o objeto a ser comparado
     * @return true se os objetos são iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    /**
     * Gera o código hash do objeto Dev
     * Baseado no nome, conteúdos inscritos e concluídos
     * @return código hash do objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
