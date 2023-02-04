package com.erick.exercicios.ex_map.Ex5_Map;

public class Contato implements Comparable<Contato>{
    private String nome;
    private Integer numero;
 
    public String getNome() {
        return nome;
    }
    public Integer getNumero() {
        return numero;
    }
    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }
    @Override
    public int compareTo(Contato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
    
}
