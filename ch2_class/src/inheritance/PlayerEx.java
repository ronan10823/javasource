package inheritance;

public class PlayerEx {
    public static void main(String[] args) {
        Player player = new CDPlayer();
        CDPlayer cdPlayer = new CDPlayer();

        player.pause = true;
        player.currentPos = 7;
        player.play(8);
        player.stop();

        cdPlayer.currentPos = 8;
        cdPlayer.pause = false;
        cdPlayer.currentTrack = 9;
        cdPlayer.play(1);
        cdPlayer.nextTrack();

    }
}
