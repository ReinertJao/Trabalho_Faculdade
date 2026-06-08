import java.util.Scanner;

public class Principal {

    public Principal() {
        Jogo jogo = new Jogo();
        
        Scanner ler = new Scanner(System.in);
        int ale;

        System.out.println("===== ILHA DOS TESOUROS =====\r\n" + //
                "1 - Mostrar instruções\r\n" + //
                "2 - Mostrar mapa\r\n" + //
                "3 - Jogar\r\n" + //
                "4 - Mostrar status\r\n" + //
                "5 - Sair");
        ale = ler.nextInt();

        switch (ale) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                System.out.println("Sistema encerrado.");
                break;

            default:
                break;
        }

    }

    public static void main(String[] args) {
        new Principal();
    }
}
