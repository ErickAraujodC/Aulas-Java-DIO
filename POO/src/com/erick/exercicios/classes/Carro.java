package com.erick.exercicios.classes;

public class Carro {
    String cor;
    String modelo;
    String montadora;
    int capacidadeTanque;

    Carro(){

    }

    Carro(String cor, String modelo, String montadora, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.montadora = montadora;
        this.capacidadeTanque = capacidadeTanque;
    }

    //set e get

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }
    
    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }
    
    void setMontadora(String montadora){
        this.montadora = montadora;
    }
    
    String setMontadora(){
        return montadora;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    } 

    //

    double totalValorTanque(double valorCombustivel){
        double resultado = capacidadeTanque * valorCombustivel;
        return Math.floor(resultado);
    }
    
    
}
