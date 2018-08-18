package FundTransfer;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGsp {

	Arithmetics obj = new Arithmetics();

	@BeforeClass
	public void befclass()
	{
		
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@Test
	public void multi() {
		obj.multiplication(6, 6);
	}

	@Test
	public void div() {
		obj.division(6, 2);
	}

}
