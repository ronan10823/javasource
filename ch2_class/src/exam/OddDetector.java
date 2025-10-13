package exam;

public abstract class OddDetector {
   
    private int n;

    public abstract boolean isOdd();

    public int getN() {
        return n;
    }

    public OddDetector(int n) {
        this.n = n;
    }

}
