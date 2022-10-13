import static org.junit.Assert.*;
import org.junit.*;
import java.util.*; 

public class ListsTests {
	@Test 
	public void testMerge() {
    List<String> input1 = Arrays.asList("a","b","c");
    List<String> input2 = Arrays.asList("d","e","f");

   List<String> result = ListExamples.merge(input1, input2);
   //System.out.println(result);
   List<String> actual = Arrays.asList("a","b","c","d","e","f");
   Assert.assertEquals(result, actual);

   //assertTrue(result.size() == actual.size() && result.containsAll(second) && actual.containsAll(first));
	}
}

//can a failure be when we pass an unsorted array. 
//javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
//java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListsTests
