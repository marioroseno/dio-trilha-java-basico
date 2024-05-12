public class usuario {
    public static void main(String[] args) throws Exception {
       
        smartTv smartTv = new smartTv();

        System.out.println("Ligar tv: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
                 
            smartTv.desligar();
            System.out.println("Tv desligada: " + smartTv.ligada);
            
            smartTv.ligar();
            System.out.println("Tv ligada: " +smartTv.ligada);

            smartTv.mudarCanal(10);
            System.out.println("Novo canal: " + smartTv.canal);
                                                 
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();

            System.out.println("Volume: " + smartTv.volume);

            smartTv.diminuirCanal();
            smartTv.diminuirCanal();
            smartTv.diminuirCanal();
            smartTv.diminuirCanal();
            smartTv.aumentarCanal();

            System.out.println("Canal: " + smartTv.canal);

            System.out.println("Desligando Smart TV Bye Bye");



           
    }
}
