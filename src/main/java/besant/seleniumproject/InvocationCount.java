package besant.seleniumproject;

import org.testng.annotations.Test;
//invocationcount
@Test 

public class InvocationCount {

	
		// TODO Auto-generated method stub
		@Test(invocationCount=2,timeOut = 2000)

		public  void Computer() {
		System.out.println("keyboard");
		}
	@Test(invocationCount  = 3,timeOut = 3000)
		
		public void age () {
		System.out.println("23");
		}
    @Test(invocationCount  = 3,timeOut = 3000)
		public void book() {
			System.out.println("English");
		}
	}


