import java.util.*;
public class PatternPrograms {

	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.print("Please enter the no. of lines: ");
		int n = scr.nextInt();
		
		/*
		
		*
		**
		***
		****
		
		*/
		
		for(int i=n;i>0;i--)                           
		{
			for(int j=i;j<=n;j++)                         
				System.out.print("*");              
			System.out.println(); 
		} 
		
		System.out.println();
		
		/*
		
		****
		***
		**
		*
		
		*/
		
		for(int i=0;i<n;i++)           
		{                                          
			for(int j=i;j<n;j++)                         
				System.out.print("*");               
			System.out.println(); 

		}  
		
		
		System.out.println();
		
		
		/*
		
		  *
		 ***
		*****

		*/

		for(int i=1;i<=n;i++)
		{
			for(int space=1;space<=n-i;space++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
			System.out.println();
		
		
		/*
		
		4
			*
           ***
          *****
         *******
          *****
           ***
            *
 
		*/
		
		
		for(int i=1;i<n;i++)
		{
			for(int space=0;space<=n-i;space++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
		//System.out.println();
		for(int i=n;i>=1;i--)
		{
			for(int space=n-i;space>=0;space--)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}

			System.out.println();
		
		
		/*
		
		8
		*
		**
		***
		****
		****
		***
		**
		*

		*/
		
		for(int i=1;i<=n/2;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n;i>=n/2+1;i--)
		{
			for(int j=n/2+1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
			System.out.println();
		
	}
}
