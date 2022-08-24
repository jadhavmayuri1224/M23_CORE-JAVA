package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void division()
	{
		System.setProperty("Mayuri", "Ravina");
		//if assumption is true the printing statement will print otherwise not
		Assumptions.assumeTrue("Mayuri".equals(System.getProperty("Ravina")));
		System.out.println("Assumtion is True");
		//if Assumption is false the printing statement will print otherwise not
		Assumptions.assumeTrue("Mayu".equals(System.getProperty("Ravina")));
		System.out.println("Assumtion is false");
	}

}
