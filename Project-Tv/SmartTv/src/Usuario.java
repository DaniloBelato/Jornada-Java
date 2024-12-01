public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
         smartTv.ligar();
         smartTv.aumentarVolume();

         System.out.println("qual o canal da tv ? : " + smartTv.canal);
         System.out.println("Qual o Volume da TV : " + smartTv.volume);
         System.out.println("tv esta Ligada ? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("tv esta Ligada ? : " + smartTv.ligada);

        smartTv.mudarCanal(22);
        System.out.println("qual o canal da tv ? : " + smartTv.canal);
    }
}
