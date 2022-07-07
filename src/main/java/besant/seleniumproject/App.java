package besant.seleniumproject;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	//Priority class
	
	@Test(priority=1)
		// TODO Auto-generated method stub
		public  void Computer() {
		System.out.println("keyboard");
		}
}
