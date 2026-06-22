import java.util.Random;
import java.util.Scanner;

public class Jogo {
    Scanner ler = new Scanner(System.in);
    String[] ilha = new String[15];
    boolean[] explorado = new boolean[15];
    String[] itens = {
            "OURO",
            "DIAMANTE",
            "RUBI",
            "BURACO",
            "COBRA",
            "ESPINHOS",
            "VAZIO"
    };
    int pontos = 0;
    int tentativas = 8;
    int tesouros = 0;
    int armadilhas = 0;
    int vazios = 0;
    public void iniciar(){
        pontos = 0;
        tentativas = 8;
        tesouros = 0;
        armadilhas = 0;
        vazios = 0;
        for(int i = 0; i < explorado.length; i++){
            explorado[i] = false;
        }
        colocarItens();
    }
    public void colocarItens(){
        Random aleatorio = new Random();
        for(int i = 0; i < ilha.length; i++){
            ilha[i] = itens[aleatorio.nextInt(itens.length)];
        }
    }
    public void mostrarInstrucoes(){
        System.out.println("===== ILHA DOS TESOUROS =====");
        System.out.println("Escolha uma posição da ilha para explorar.");
        System.out.println("\nTesouros:");
        System.out.println("OURO +10");
        System.out.println("DIAMANTE +20");
        System.out.println("RUBI +15");
        System.out.println("\nArmadilhas:");
        System.out.println("BURACO -5");
        System.out.println("COBRA -10");
        System.out.println("ESPINHOS -7");
        System.out.println("\nVocê tem 8 tentativas.");
    }
    public void mostrarMapa(){
        System.out.println("Mapa da ilha:");
        for(int i = 0; i < ilha.length; i++){
            if(explorado[i] == true){
                System.out.println("[" + i + "] " + ilha[i]);
            }else{
                System.out.println("[" + i + "] ?");
            }
        }
    }
    public void jogar(){
        System.out.print("Escolha uma posição: ");
        int posicao = ler.nextInt();
        if(posicao < 0 || posicao >= 15){
            System.out.println("Posição inválida!");
            return;
        }
        if(explorado[posicao] == true){
            System.out.println("Essa posição já foi explorada!");
            return;
        }
        explorado[posicao] = true;
        tentativas--;
        String item = ilha[posicao];
        System.out.println("Você encontrou: " + item);
        if(item.equals("OURO")){
            pontos += 10;
            tesouros++;
        }else if(item.equals("DIAMANTE")){
            pontos += 20;
            tesouros++;
        }else if(item.equals("RUBI")){
            pontos += 15;
            tesouros++;
        }else if(item.equals("BURACO")){
            pontos -= 5;
            armadilhas++;
        }else if(item.equals("COBRA")){
            pontos -= 10;
            armadilhas++;
        }else if(item.equals("ESPINHOS")){
            pontos -= 7;
            armadilhas++;
        }else if(item.equals("VAZIO")){
            vazios++;
        }
    }
    public void mostrarStatus(){
        System.out.println("Pontuação: " + pontos);
        System.out.println("Tentativas: " + tentativas);
        System.out.println("Tesouros encontrados: " + tesouros);
        System.out.println("Armadilhas encontradas: " + armadilhas);
        System.out.println("Vazios encontrados: " + vazios);
    }
    public boolean fimDeJogo(){
        if(tentativas == 0){
            return true;
        }
        return false;
    }
}