public class Usuario {
    public static void main (String [] args) {
   
        Controle controle = new Controle();

        controle.ligar();
        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.aumentarVolume();
        
        System.out.println("TV ligada? " + controle.on);
        System.out.println("Volume: " + controle.volume);
        System.out.println("O canal atual é: " + controle.canal);
    }
}