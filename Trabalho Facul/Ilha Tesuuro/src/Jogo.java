import java.util.Random;
import java.util.Scanner;

public class Jogo {
    Scanner ler = new Scanner(System.in);
    /*
     * Item encontrado Tipo Pontuação
     * "OURO" Tesouro +10 pontos
     * "DIAMANTE" Tesouro +20 pontos
     * "RUBI" Tesouro +15 pontos
     *  
     * "BURACO" Armadilha -5 pontos
     * "COBRA" Armadilha -10 pontos
     * "ESPINHOS" Armadilha -7 pontos
     * 
     * "VAZIO" Nenhum 0 pontos
     */

    String[] itens = {"OURO", "DIAMANTE", "RUBI", "BURACO", "COBRA", "ESPINHOS", "VAZIO"};
    String[] ilha = new String[15];
    boolean[] explorador = new boolean[15];

    int pontuacao = 0;
    int tentativas = 8;
    int tesourosEncontrados = 0;
    int armadilhasEncontradas = 0;
    int vaziosEncontrados = 0;
    
    // opção 1 do Swith Case
    public void instrucoes() {
        System.out.println(" Bem-vindo ao Island Pirates! \r\n" + //
                "\r\n" + //
                "Explore as ilhas em busca de tesouros, mas cuidado com as armadilhas!\r\n" + //
                "\r\n" + //
                "Você possui 8 tentativas e deve terminar o jogo com pontuação positiva.\r\n" + //
                "\r\n" + //
                " Tesouros:\r\n" + //
                " OURO -> +10 pontos\r\n" + //
                " RUBI -> +15 pontos\r\n" + //
                " DIAMANTE -> +20 pontos\r\n" + //
                "\r\n" + //
                " Armadilhas:\r\n" + //
                " BURACO -> -5 pontos\r\n" + //
                " ESPINHOS -> -7 pontos\r\n" + //
                " COBRA -> -10 pontos\r\n" + //
                "\r\n" + //
                " VAZIO -> 0 pontos\r\n" + //
                "\r\n" + //
                "Boa sorte, pirata! \r\n" + //
                "");
    }
    
    public void inicializarIlha() {
        Random rand = new Random();
        for (int i = 0; i < ilha.length; i++) {
            ilha[i] = itens[rand.nextInt(itens.length)];
        }
    }
    
    public void mostrarMapa() {
        for (int i = 0; i < ilha.length; i++) {
            if (explorador[i]) {
                System.out.println("[" + (i + 1) + "] " + ilha[i] );
            } else {
                System.out.println("[" + (i + 1)+ "] ?");
            }
        }
    }

    
    public void mostrarStatus(int pontuacao, int tentativas, int tesourosEncontrados, int armadilhasEncontradas,
            int vaziosEncontrados) {
        System.out.println("Status do Jogo: ");
        System.out.println("Pontuação " + pontuacao + " pontos");
        System.out.println("Tentativas restanrtes: " + tentativas);
        System.out.println("Tesouros encontrados: " + tesourosEncontrados);
        System.out.println("Armadilhas encontradas: " + armadilhasEncontradas);
        System.out.println("Posições vazias exploradas: " + vaziosEncontrados);

    }

}
