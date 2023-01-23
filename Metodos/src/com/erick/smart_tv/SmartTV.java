package com.erick.smart_tv;
public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;


    public void ligarDesligarSmartTV() {
        if(ligada==false){
            ligada = true;
            System.out.println("A SmartTV LIGOU.");

        } else {
            ligada = false;
            System.out.println("A SmartTV DESLIGOU.");

        }
    }


    public void selecionarCanal(int canalEscolhido) {
        if(ligada==true){    
            if (canalEscolhido > 0 && canalEscolhido < 13){
                canal = canalEscolhido;  

                System.out.println("Mudando para canal: " + canal);
            
            } else {
                System.out.println("ERRO: Canais disponíveis somente do 0 ao 13.");
            }
        }
    }

    public void aumentarCanal() {
        if(ligada==true){  
            if(canal<13){
                canal++;
            } else if(canal==13){
                canal = 0;
            }

            System.out.println("A SmartTV aumentou canal e esta no canal: " + canal);
        }else{
            System.out.println("ERRO: SmartTV está desligada.");
        }
    }

    
    public void diminuirCanal() {
        if(ligada==true){  
            if(canal>0){
                canal--;
            } else if(canal==0){
                canal = 13;
            }

            System.out.println("A SmartTV diminuiu canal esta no canal: " + canal);
        }else{
            System.out.println("ERRO: SmartTV está desligada.");
        }
    }

    public void aumentarVolume() {
        if(ligada==true){  
            volume = volume<=100?volume+1:100;

            System.out.println("Subindo volume para: " + volume);
        }else{
            System.out.println("ERRO: SmartTV está desligada.");
        }
    }


    public void diminuirVolume() {
        if(ligada==true){          
            volume = volume>0?volume-1:0;

            System.out.println("Abaixando volume para: " + volume);
        }else{
            System.out.println("ERRO: SmartTV está desligada.");
        }
    }

}
