import org.junit.Assert;
import org.junit.Test;

/**
 * @author yanliu
 * @create 2020-10-19-14:24
 */
public class TestOffByN {
    @Test
    public void testEqualChars() {
        CharacterComparator offByN = new OffByN(3);

        Assert.assertEquals(true, offByN.equalChars('a', 'd'));
    }
}
