package audioPlayer;

public class LockedState implements State {
    @Override
    public void play(Player player) {
        System.out.println("Desbloqueando player...");
        player.changeState(new ReadyState());
    }

    @Override
    public void stop(Player player) {
        if (player.isPlaying()) {
            System.out.println("Parando reprodução e desbloqueando...");
            player.setPlaying(false);
            player.changeState(new ReadyState());
        } else {
            System.out.println("Player está travado.");
        }
    }

    @Override
    public void next(Player player) {
        System.out.println("Player está travado, não pode avançar.");
    }

    @Override
    public void previous(Player player) {
        System.out.println("Player está travado, não pode retroceder.");
    }
}
