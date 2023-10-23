public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        if(volume > 0){
            volume --;
            System.out.println("Diminuindo volume para: " + volume);
        }else
            System.out.println("Você chegou no limite.");
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println("Aumentando canal para: " + canal);
    }

    public void diminuirCanal(){
        if(canal > 0){
            canal --;
            System.out.println("Diminuindo canal para: " + canal);
        }else
            System.out.println("Você chegou no limite.");
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
