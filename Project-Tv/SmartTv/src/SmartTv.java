public class SmartTv {
    boolean ligada;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }  

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    
}