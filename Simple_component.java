package com.epam.Cleancode;

public class Simple_component {
	float simple_interest(float princpal,int y,float rate)
	{

 return (princpal*y*rate)/100;
	
}
	
float compound_interest(float principal,int times_calc,int years,float rate_of_interest)
	{

		return principal*power((1+(rate_of_interest/times_calc)),times_calc*years);
	
}
	

float power(float n,int f)
	{
		
float t=1;
		
for(int i=0;i<f;i++)
		{
	
		t=t*n;
		}
		
return t;
	
}


}
