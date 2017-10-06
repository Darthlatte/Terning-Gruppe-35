package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {
	Dice DiceUnderTest = new Dice();


	public int n,i=0;
	int value1, value2, value3, value4, value5, value6;
	double value11, value22, value33, value44, value55, value66;

	@Test
	public void testmutiplerolls() 
	{




		do 
		{
			n = DiceUnderTest.roll();
			switch(n)
			{
			case 1:
			{
				value1 = value1 + 1;
				break;
			}
			case 2:
			{
				value2 = value2 + 1;
				break;
			}
			case 3:
			{
				value3 = value3 + 1;
				break;
			}
			case 4:
			{
				value4 = value4 + 1;
				break;
			}
			case 5:
			{
				value5 = value5 + 1;
				break;
			}
			case 6:
			{
				value6 = value6 + 1;
				break;
			}
			
			}
			i = i + 1;
			
		}
		while(i != 60000);

		
		
		value11	= (value1*100)/60000;
		value22	= (value2*100)/60000;
		value33	= (value3*100)/60000;
		value44	= (value4*100)/60000;
		value55	= (value5*100)/60000;
		value66	= (value6*100)/60000;
		System.out.println("for 1: "+value11+"%");
		System.out.println("for 2: "+value22+"%");
		System.out.println("for 3: "+value33+"%");
		System.out.println("for 4: "+value44+"%");
		System.out.println("for 5: "+value55+"%");
		System.out.println("for 6: "+ value66+"%");
	}
}

