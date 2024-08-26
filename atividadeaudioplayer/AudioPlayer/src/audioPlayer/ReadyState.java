package audioPlayer;

public class ReadyState implements State {
    @Override
    public void play(Player player) {
        player.setPlaying(true);
        player.startPlayback();
    }

    @Override
    public void stop(Player player) {
        System.out.println("Parando e bloqueando...");
        player.setPlaying(false);
        player.changeState(new LockedState());
    }

    @Override
    public void next(Player player) {
        player.nextTrack();
    }

    @Override
    public void previous(Player player) {
        player.previousTrack();
    }
}
