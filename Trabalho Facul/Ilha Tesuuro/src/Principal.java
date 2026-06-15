import java.util.Scanner;

public class Principal {

    public Principal() {
        Jogo jogo = new Jogo();
        Scanner ler = new Scanner(System.in);
        int ale;
        
        do{
        System.out.println("1 - Mostrar instruções\r\n" + //
                "2 - Mostrar mapa\r\n" + //
                "3 - Jogar\r\n" + //
                "4 - Mostrar status\r\n" + //
                "5 - Sair");
        ale = ler.nextInt();

        
        switch (ale) {
            case 1:
                jogo.instrucoes();
                break;
            case 2:
                jogo.mostrarMapa(null, null);
                break;
            case 3:
            jogo.jogando(ler);
                break;
            case 4:
                jogo.mostrarStatus(ale, ale, ale, ale, ale);
                break;
            case 5:
                System.out.println("Sistema encerrado.");
                break;

            default:
                System.out.println("Oque você digitou está incorreto, digite uma dasopções informadas");
                break;
        }

        
        } while( ale != 5);
        
    }

    public static void main(String[] args) {
        new Principal();
    }
}
