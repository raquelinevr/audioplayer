package audioPlayer;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();  
        player.next();  

        System.out.println("Tentando parar o player...");
        player.stop();  

        System.out.println("Tentando tocar novamente...");
        player.play();  

        System.out.println("Tentando voltar à faixa anterior...");
        player.previous();  
    }
}
