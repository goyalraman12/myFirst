//Dump User Input and Outputs of the program to seperate Text Files


import java.util.*;
import java.io.*;

 class mergeArrays1 {  
	public static void main(String[] args)  throws FileNotFoundException 
	{
		PrintStream inp = new PrintStream(new File("userInputs.txt"));
		PrintStream out = new PrintStream(new File("Outputs.txt"));
		PrintStream console = System.out;
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.setOut(console);
		System.out.println("Enter the number of elements in firstArray: ");
		n1=sc.nextInt();
		System.setOut(inp);
		System.out.println(+n1);
		int[] firstArray = new int[n1];  
		System.setOut(console);
		System.out.println("Enter the number of elements in secondArray: ");
		n2=sc.nextInt();
		System.setOut(inp);
		System.out.println(+n2);
		int[] secondArray = new int[n2];  
		System.setOut(console);
		System.out.println("Enter "+n1+" integer elements in First Array: ");
		for(int i=0;i<n1;i++)
		{	
			System.setOut(inp);
			firstArray[i]=sc.nextInt();
			System.out.printf(+firstArray[i]+" ");
		}
		System.out.printf("\n");
		System.setOut(console);
		System.out.println("Enter "+n2+" integer elements in First Array: ");
		for(int i=0;i<n2;i++)
		{	
			System.setOut(inp);
			secondArray[i]=sc.nextInt();
			System.out.printf(+secondArray[i]+" ");
		}
		
		System.setOut(out);
		System.out.println("\nOutput of the program is: ");
		System.out.println("First Array = "+Arrays.toString(firstArray));
		System.out.println("Second Array = "+Arrays.toString(secondArray));
		int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray  
		int[] mergedArray = new int[length];    //resultant array  
		
		if(firstArray.length<secondArray.length)
		{
			for (int i =0;i<firstArray.length;i++)
			{
				mergedArray[i*2]=firstArray[i];
			}
			for (int i=0;i<firstArray.length;i++)
			{	
				mergedArray[2*i+1]=secondArray[i];
			}
			int temp=2*firstArray.length;
			for(int i=firstArray.length;i<secondArray.length;i++)
			{	
				mergedArray[temp]=secondArray[i];
				temp++;
			}
		}	
		if(firstArray.length>secondArray.length)
		{
			for (int i =0;i<secondArray.length;i++)
			{
				mergedArray[i*2]=firstArray[i];
			}
			for (int i=0;i<secondArray.length;i++)
			{	
				mergedArray[2*i+1]=secondArray[i];
			}
			int temp=2*secondArray.length;
			for(int i=secondArray.length;i<firstArray.length;i++)
			{	
				mergedArray[temp]=firstArray[i];
				temp++;
			}
		}
		if(firstArray.length == secondArray.length)
		{
			for (int i =0;i<firstArray.length;i++)
			{	
				mergedArray[i*2]=firstArray[i];
			}
			for (int i =0;i<secondArray.length;i++)
			{	
				mergedArray[2*i+1]=secondArray[i];
			}
		}
			
		System.out.println("Resultant Array = "+Arrays.toString(mergedArray));
	}  
} 