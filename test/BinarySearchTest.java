import com.company.BinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by AmazingLu on 11/11/17.
 */
public class BinarySearchTest {

    private int[] testArr1 = {2, 3, 6, 7, 8, 10,15, 22, 25};

    @Test
    public void findTest1() throws Exception {
        int target = 10;
        BinarySearch bs = new BinarySearch(testArr1, target);
        int resIndex = bs.find();
        assertEquals(target, testArr1[resIndex]);
    }

    @Test
    public void findTest2() throws Exception {
        int target = 27;
        BinarySearch bs = new BinarySearch(testArr1, target);
        int resIndex = bs.find();
        assertEquals(testArr1.length, resIndex);
    }

    @Test
    public void findTest3() throws Exception {
        int target = 0;
        BinarySearch bs = new BinarySearch(testArr1, target);
        int resIndex = bs.find();
        assertEquals(-1, resIndex);
    }

    @Test
    public void findTest4() throws Exception {
        int target = 9;
        BinarySearch bs = new BinarySearch(testArr1, target);
        int resIndex = bs.find();
        assertEquals(-2, resIndex);
    }

}