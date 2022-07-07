package besant.seleniumproject;


import org.testng.annotations.Test;
@Test(priority = 1)


public class PriorityClass {

	//Priority class
	
	@Test(priority = 2)
		
		public void age () {
		System.out.println("23");
		}
    @Test(priority = 3)
		public void book() {
			System.out.println("English");
		}

}
