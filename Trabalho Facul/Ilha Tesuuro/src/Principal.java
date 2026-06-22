import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Jogo jogo = new Jogo();
        jogo.iniciar();
        int opcao;
        do{
            System.out.println("\n===== ILHA DOS TESOUROS =====");
            System.out.println("1 - Mostrar instruções");
            System.out.println("2 - Mostrar mapa");
            System.out.println("3 - Jogar");
            System.out.println("4 - Mostrar status");
            System.out.println("5 - Sair");
            opcao = ler.nextInt();
            switch(opcao){
                case 1:
                    jogo.mostrarInstrucoes();
                    break;
                case 2:
                    jogo.mostrarMapa();
                    break;
                case 3:
                    jogo.jogar();
                    if(jogo.fimDeJogo()){
                        System.out.println("Fim de jogo!");
                        jogo.mostrarStatus();
                        System.out.println("Deseja jogar novamente? S/N");
                        String resposta = ler.next();
                        if(resposta.equals("S") || resposta.equals("s")){
                            jogo.iniciar();
                        }else{
                            opcao = 5;
                        }
                    }
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
        }while(opcao != 5);
        ler.close();
    }
}