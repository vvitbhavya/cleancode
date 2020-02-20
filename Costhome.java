package com.epam.Cleancode;
import java.util.Scanner;
public class Costhome extends Home{
	Scanner s=new Scanner(System.in);
    
	void Costhome()
	  	{
	  		
	Scanner sc=new Scanner(System.in);

	System.out.format("Enter the choice if you need fully automated home\n1.YES\n2.NO");
	  		
	int choice=sc.nextInt();
		
System.out.format("Enter the area of site in square feet");
		
float area=sc.nextFloat();
		
	  		
	if (choice==1)
	  		{
	  			
	System.out.format("select the type of house you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
	  			
	int choice1=sc.nextInt();
	  			
	if (choice1<1 && choice1>3)
	  			{
	  				
	System.out.format("Enter valid choice");
	  			
	}
	  			
	else
	  			{
	  				
	System.out.format("cost of house construction : "+home_cost(choice1,area));
	  			
	}
	  		
	}
	  		
	
	  		
	else
	  		
	{
	  			
	System.out.format("Enter valid choice");
	  	
		}
	  
		}
	  	
	public static void main(String args[])
	  	{
	  	
		Costhome obj1=new Costhome();
	  		
	obj1.Costhome();
	  	
	}


}
