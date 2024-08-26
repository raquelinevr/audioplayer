package audioPlayer;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;
    private boolean isPlaying = false;

    public Player() {
        this.state = new ReadyState();
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void startPlayback() {
        if (isPlaying) {
            System.out.println("Playing: " + playlist.get(currentTrack));
        }
    }

    public void nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        System.out.println("Next Track: " + playlist.get(currentTrack));
    }

    public void previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        System.out.println("Previous Track: " + playlist.get(currentTrack));
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void next() {
        state.next(this);
    }

    public void previous() {
        state.previous(this);
    }
}
