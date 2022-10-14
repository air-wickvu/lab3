import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListsTests {
	@Test(timeout=500)
	public void testMerge() {
    //input
    //String[] inputChar = new String[]{"a","b","c"};
    //String[] inputChar2 = new String[]{"d","e","f"};

    String[] inputChar3 = new String[]{"a"};
    String[] inputChar4 = new String[]{"b"};


    
    List<String> input1 = Arrays.asList(inputChar3);
    List<String> input2 = Arrays.asList(inputChar4);

    //action 
   List<String> result = ListExamples.merge(input1, input2);
   //System.out.println(result);
   //test 
   String[] expected = new String[]{"a","b","c","d","e","f"};
   List<String> actual = Arrays.asList(expected);

   Assert.assertEquals(result,actual);
   //assertTrue(result.size() == actual.size() && result.containsAll(second) && actual.containsAll(first));
	}
}

//can a failure be when we pass an unsorted array. 
//javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
//java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListsTests
