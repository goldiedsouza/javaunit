package JUNITProgram;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

 class HelloWorld implements TestLifecycleLogger
{

	@Test
	@RepeatedTest(10)
	void test() 
	{
		System.out.println("First Test Case");
	}
}
