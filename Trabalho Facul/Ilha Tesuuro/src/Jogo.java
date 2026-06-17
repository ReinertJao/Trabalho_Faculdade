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

    String[] itens = { "OURO", "DIAMANTE", "RUBI", "BURACO", "COBRA", "ESPINHOS", "VAZIO" };
    String[] ilha = new String[15];
    boolean[] explorador = new boolean[15];

    int pontuacao = 0;
    int tentativas = 8;
    int tesourosEncontrados = 0;
    int armadilhasEncontradas = 0;
    int vaziosEncontrados = 0;
    String respota;

    // opção 1 do Swith Case, Mostra a instrução do Jogo
    public void instrucoes() {
        System.out.println("       +======================================+\n" + //
                "        |          ISLAND PIRATES              |\n" + //
                "        +======================================+\n" + //
                "\n" + //
                "        Explore ilhas em busca de tesouros,\n" + //
                "        mas cuidado com as armadilhas!\n" + //
                "\n" + //
                "        Voce possui 8 tentativas e deve terminar\n" + //
                "        o jogo com pontuacao positiva.\n" + //
                "\n" + //
                "        TESOUROS:\n" + //
                "           OURO     -> +10 pontos\n" + //
                "           RUBI     -> +15 pontos\n" + //
                "           DIAMANTE -> +20 pontos\n" + //
                "\n" + //
                "        ARMADILHAS:\n" + //
                "           BURACO   ->  -5 pontos\n" + //
                "           ESPINHOS ->  -7 pontos\n" + //
                "           COBRA    -> -10 pontos\n" + //
                "\n" + //
                "        VAZIO      ->   0 pontos\n" + //
                "\n" + //
                "        +======================================+\n" + //
                "             Boa sorte, pirata!\n" + //
                "        +======================================+");
    }

    // Vai colocar cada item nas ilhas
    public void inicializarIlha() {
        Random rand = new Random();
        for (int i = 0; i < ilha.length; i++) {
            ilha[i] = itens[rand.nextInt(itens.length)];
        }
    }

    public void reiniciarJogo() {
        pontuacao = 0;
        tentativas = 8;
        tesourosEncontrados = 0;
        armadilhasEncontradas = 0;
        vaziosEncontrados = 0;

        for (int i = 0; i < explorador.length; i++) {
            explorador[i] = false;

        }
        inicializarIlha();
        System.out.println("Jogo Reiniciado");
    }

    // Vai mostrar o mapa de 1 a 15
    public void mostrarMapa() {
        for (int i = 0; i < ilha.length; i++) {
            if (explorador[i]) {
                System.out.println("[" + (i + 1) + "] " + ilha[i]);
            } else {
                System.out.println("[" + (i + 1) + "] ?");
            }
        }
    }

    // mostrar como vai estar o status do Player
    public void mostrarStatus() {

        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Tentativas: " + tentativas);
        System.out.println("Tesouros: " + tesourosEncontrados);
        System.out.println("Armadilhas: " + armadilhasEncontradas);
        System.out.println("Vazios: " + vaziosEncontrados);
    }

    // vai executar o game
    public void jogar() {

        System.out.print("Escolha uma posição (1 a 15): ");
        int pos = ler.nextInt() - 1;
        if (pos < 0 || pos >= ilha.length) {
            System.out.println("Posição inválida!");
            return;
        }
        if (explorador[pos]) {
            System.out.println("Posição já explorada!");
            return;
        }
        explorador[pos] = true;
        tentativas--;
        String item = ilha[pos];

        // Atualiza a pontuação do jogo
        if (item.equals("OURO")) {
            pontuacao += 10;
            tesourosEncontrados++;
        } else if (item.equals("DIAMENTE")) {
            pontuacao += 20;
            tesourosEncontrados++;
        } else if (item.equals("RUBI")) {
            pontuacao += 15;
            tesourosEncontrados++;
        } else if (item.equals("BURACO")) {
            pontuacao -= 5;
            armadilhasEncontradas++;
        } else if (item.equals("COBRA")) {
            pontuacao -= 10;
            armadilhasEncontradas++;
        } else if (item.equals("ESPINHO")) {
            pontuacao -= 7;
            armadilhasEncontradas++;
        } else if (item.equals("VAZIO")) {
            vaziosEncontrados++;
        }
        System.out.println("Você encontrou: " + item);
    }
}