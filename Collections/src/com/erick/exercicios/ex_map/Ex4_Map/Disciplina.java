package com.erick.exercicios.ex_map.Ex4_Map;

public class Disciplina implements Comparable<Disciplina> {
    private String nome;
    private Integer duracao;
    public Disciplina(String nome, Integer duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }
    public String getNome() {
        return nome;
    }
    public Integer getDuracao() {
        return duracao;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((duracao == null) ? 0 : duracao.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disciplina other = (Disciplina) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (duracao == null) {
            if (other.duracao != null)
                return false;
        } else if (!duracao.equals(other.duracao))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Disciplina [nome=" + nome + ", duracao=" + duracao + "]";
    }
    @Override
    public int compareTo(Disciplina o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
    
}
