import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assumption {
	@Test
	void testOnDev()
	{
		System.setProperty("ENV", "DEV"); //TRUE
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));//TRUE
	}
	@Test
	void testOnprod()
	{
		System.setProperty("ENV", "PROD"); //T
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")), Assumption::message);
		//remainder of test will be aborted
	}
	private static String message() {
		return "Today,s TEST Executive Failed::";
	}
}
