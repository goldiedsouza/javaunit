package JUNITProgram;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DiaabledClassDemo {
	 @Test
     void testWillBeSkipped() {
   System.out.println("this test class is not disabled...");
   }
   
   @Disabled
   @Test
   public void testWillBeDisabled() {
   	System.out.println("This test is disabled...");
   }
}
