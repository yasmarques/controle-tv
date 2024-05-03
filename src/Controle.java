public class Controle {
    
    boolean on = true;
    int canal = 1;
    int volume = 0;

    public void ligar(){
        on = true;
    }

    public void desligar(){
        on = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;
    }
}
