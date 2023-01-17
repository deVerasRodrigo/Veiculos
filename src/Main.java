public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(4);
        Carro carro = new Carro("FireFly 1.3");
        Carro carro2 = new Carro("V8 dos velozes e furiosos");

        for (int i = 0; i < 20; i++) {
            aviao.acelerar();
        }

        System.out.println(aviao);

        aviao.pousar(true);

        for (int i = 0; i < 8; i++) {
            carro.acelerar();
        }
        System.out.println(carro);

        for (int i = 0; i < 8; i++) {
            carro2.acelerar(true);
        }
        System.out.println(carro2);
    }
}