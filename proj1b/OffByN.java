/**
 * @author yanliu
 * @create 2020-10-19-10:08
 */
public class OffByN implements CharacterComparator{
    private int n;

    public OffByN(int N) {
        n = N;
    }
    /**
     * Returns true if characters are equal by the rules of the implementing class.
     *
     * @param x
     * @param y
     */
    @Override
    public boolean equalChars(char x, char y) {
        return Math.abs(x - y) == n;
    }
}
