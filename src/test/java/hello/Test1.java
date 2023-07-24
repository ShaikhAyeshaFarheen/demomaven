package hello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test1 {
	 @Test
	    public void testApp() {
	    Apptest t=new Apptest();
	        String expected = "madam";
	        String actual =t.palindrome(expected);

	        Assertions.assertEquals(expected, actual);
	    }
	 @Test
	    public void testApp1() {
	    Apptest t=new Apptest();
	        String expected = "sir";
	        String actual =t.palindrome(expected);

	        Assertions.assertEquals(expected, actual);
	    }
}
