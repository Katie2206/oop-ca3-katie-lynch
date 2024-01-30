public class Question_2_Pair {
    private int r;
    private int c;

    public Question_2_Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Question_2_Pair{" +
                "r=" + r +
                ", c=" + c +
                '}';
    }
}
