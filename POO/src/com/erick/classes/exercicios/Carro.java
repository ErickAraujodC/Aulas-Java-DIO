package com.erick.classes.exercicios;

public class Carro {
    String cor;
    String modelo;
    String montadora;
    int capacidadeTanque;

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
    
    void setMontador(String montadora){
        this.montadora = montadora;
    }
    
    String setMontador(){
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
        return capacidadeTanque * valorCombustivel;
    }
    
    
}
