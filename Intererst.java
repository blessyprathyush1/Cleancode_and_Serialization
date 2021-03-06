

import java.io.*;
import java.util.*;

public class Interest 
{

	static
	{
		Scanner s = new Scanner(System.in);
		
		System.out.format("%s", "Enter principle amount");
		double principle = s.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double rate_of_interest = s.nextDouble();
		System.out.format("%s", "Enter number of years");
		double time = s.nextDouble();
		
		Compute com = new Compute(principle, rate_of_interest, time);
		
		System.out.format("%s","Select  1. Simple Interest  2. Compound Interest  3. Both");
		int choice = s.nextInt();
		
		switch (choice)
		{
	    	case 1:
			    System.out.format("%s",String.valueOf(com.SimpleInterest()));
			    break;
		    case 2:
			    System.out.format("%s",String.valueOf(com.CompoundInterest()));
			    break;
		    case 3:
		        System.out.format("%s\n",String.valueOf(com.SimpleInterest()));
		        System.out.format("%s",String.valueOf(com.CompoundInterest()));
			    break;

		}
		s.close();
		System.exit(0);
	}

	public static void main(String[] args) {

	}
}

class Compute 
{
	double principle, rate_of_interest, time;
	
	Compute(double principle, double rate_of_interest, double time)
	{
		this.principle = principle;
		this.rate_of_interest = rate_of_interest;
		this.time = time;
	}
	
	// calculating simple interest
	double SimpleInterest()
	{
		return (principle * rate_of_interest * time) / 100;
	}
	
	// calculating compound interest
	double CompoundInterest()
	{
		return (principle * (Math.pow(1 + rate_of_interest / 100, time)));
	}


}