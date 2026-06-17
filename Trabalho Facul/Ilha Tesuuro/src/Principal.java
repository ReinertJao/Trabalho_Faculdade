import java.util.Scanner;

public class Principal {
    public Principal() {
        Jogo jogo = new Jogo();
        jogo.inicializarIlha();
        Scanner ler = new Scanner(System.in);
        int ale;
        

             
        
        do {

            System.out.println("╔════════════════════════════╗");
            System.out.println("║     ILHA DOS TESOUROS      ║");
            System.out.println("╚════════════════════════════╝");
            System.out.println("1 - Mostrar instruções");
            System.out.println("2 - Mostrar mapa");
            System.out.println("3 - Jogar");
            System.out.println("4 - Mostrar status");
            System.out.println("5 - Sair");

            ale = ler.nextInt();

            switch (ale) {
                case 1:
                    jogo.instrucoes();
                    break;
                case 2:
                    jogo.mostrarMapa();
                    break;
                case 3:
                    jogo.jogar();
                    break;
                case 4:
                    jogo.mostrarStatus();
                    break;
                case 5:
                    System.out.println("Jogo encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (ale != 5 && jogo.tentativas > 0);
        ler.close();
    }
    public static void main(String[] args) {
        new Principal();
    }
}