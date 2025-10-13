package inheritance;

public abstract class Player {
    boolean pause;
    int currentPos;

    final int num = 0; // 산수 선언

    // 생성자 부르기
    

    abstract void play(int pos);
    public Player() {
    }
    abstract void stop();

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }

    }
    public Player(boolean pause, int currentPos) {
        this.pause = pause;
        this.currentPos = currentPos;
    }
}
