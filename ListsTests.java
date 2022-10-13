import static org.junit.Assert.*;
import org.junit.*;
import java.util.*; 

public class ListsTests {
	@Test 
	public void testMerge() {
    List<String> input1 = Arrays.asList("sup1","sup2","sup3");
    List<String> input2 = Arrays.asList("1","2","3");

    ListExamples.merge(input1, input2);

    //assertArrayEquals(new int[]{ 3 }, input1);
	}
}