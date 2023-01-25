package com.erick.exercicios.classes;

public class RodarCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Prata");
        carro1.setModelo("Uno");
        carro1.setMontadora("Fiat");
        carro1.setCapacidadeTanque(48);

        System.out.println(carro1.cor);
        System.out.println(carro1.modelo);
        System.out.println(carro1.montadora);
        System.out.println(carro1.totalValorTanque(4.39d));

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        //Carro 2
        Carro carro2 = new Carro("Cinza", "Tracker", "Chevrolet", 55);

        System.out.println(carro2.cor);
        System.out.println(carro2.modelo);
        System.out.println(carro2.montadora);
        System.out.println(carro2.totalValorTanque(5.89));




        
    }
    
}

