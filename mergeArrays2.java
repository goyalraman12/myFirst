// Construct third Array having all elemnts of first two arrays in an alternative increasing order


import java.util.*;
import java.io.*;

public class mergeArrays2 {  
	public static void main(String[] args)  
	{  
		int[] firstArray = {1,3,5,7,9,11};  
		int[] secondArray = {2,4,6,8,10,12};  
		System.out.println("First Array = "+Arrays.toString(firstArray));
		System.out.println("Second Array = "+Arrays.toString(secondArray));
		int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray  
		int[] mergedArray = new int[length];    //resultant array  
		
		for (int i =0;i<firstArray.length;i++)
		{	
			mergedArray[i*2]=firstArray[i];
		}
		for (int i =0;i<secondArray.length;i++)
		{	
			mergedArray[2*i+1]=secondArray[i];
		}
				
		System.out.println("Resultant Array = "+Arrays.toString(mergedArray));
		
		PrintStream o = new PrintStream(new File("b.txt"));
		PrintStream console = System.out;
		System.setOut(o);
		System.setout(Console);
	}  
} 