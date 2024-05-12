public class smartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void canalAtual(){

    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal ++;
        System.out.println("Aumentando canal: " + canal);
    }
    public void diminuirCanal(){
        canal --;
        System.out.println("Diminuindo Canal: " + canal);
    }
    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume: " + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo volume: " + volume);
    }
}