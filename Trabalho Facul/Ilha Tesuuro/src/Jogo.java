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

     String ilha[] = new String[15];
     boolean explorador[] = new boolean[15];
    int pontuacao = 0;
    int tentativas = 8;
    int tesourosEncontrados;
    int armadilhasEncontradas;
    int vaziosEncontrados;
    
    
    
    
    

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
    
    

    // Contar de 0 a 14
    public void mostrarMapa(String ilha[], boolean explorador[]) {
        for (int i = 0; i < ilha.length; i++) {
            ilha[i] = "?";

            if (explorador[i]) {
                System.out.println("[" + i + "] Explorado");
            } else {
                System.out.println("[" + i + "] ? ");
            }
        }
        
    }

    public void jogando(Scanner s) {
        if (tentativas <= 0) {
            System.out.println("Sem tentativas.");
            return;
        }
        System.out.print("Escolha uma posição: ");
        int posicao = s.nextInt();
        if (posicao < 0 || posicao >= ilha.length) {
            System.out.println("Posição inválida.");
            return;
        }
        if (explorador[posicao]) {
            System.out.println("Posição já explorada.");
            return;
        }
        explorador[posicao] = true;
        tentativas--;

        String item = ilha[posicao];
        if (item.equals("OURO")) {
            pontuacao += 10;
            tesourosEncontrados++;
            System.out.println("Você encontrou OURO! +10");
        } else if (item.equals("DIAMANTE")) {
            pontuacao += 20;
            tesourosEncontrados++;
            System.out.println("Você encontrou DIAMANTE! +20");
        } else if (item.equals("RUBI")) {
            pontuacao += 15;
            tesourosEncontrados++;
            System.out.println("Você encontrou RUBI! +15");
        } else if (item.equals("BURACO")) {
            pontuacao -= 5;
            armadilhasEncontradas++;
            System.out.println("Você caiu em um BURACO! -5");
        } else if (item.equals("COBRA")) {
            pontuacao -= 10;
            armadilhasEncontradas++;
            System.out.println("Você encontrou uma COBRA! -10");
        } else if (item.equals("ESPINHOS")) {
            pontuacao -= 7;
            armadilhasEncontradas++;
            System.out.println("Você encontrou ESPINHOS! -7");
        } else {
            vaziosEncontrados++;
            System.out.println("Posição vazia.");
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
