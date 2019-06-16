import org.junit.Test;

import junit.framework.Assert;

public class Login 
{
	@Test
	public void LoginTest()
	{
		int exepectedData=20;
		int actualData=10;
		System.out.println("a"); 
		try
		{
			
	
	Assert.assertEquals(exepectedData,actualData);
	
		}catch(Throwable t)
		{
			
		}
System.out.println("b");
}
}