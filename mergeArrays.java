//Merge Two Arrays into Third Array


import java.util.*;
public class mergeArrays {  
	public static void main(String[] args)  
	{  
		int[] firstArray = {10,20,30,40,50};  
		int[] secondArray = {60,70,80,90,100};  
		System.out.println("First Array = "+Arrays.toString(firstArray));
		System.out.println("Second Array = "+Arrays.toString(secondArray));
		int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray  
		int[] mergedArray = new int[length];    //resultant array  
		int pos = 0;  
		for (int element : firstArray) 
		/*copying elements of firstArray using for-each loop  
			for (int element : firstArray)
			{
				code
			}	
			
			is equivalent to:
			
			for (int i=0; i<firstArray.length; i++) 
			{ 
				int element = firstArray[i];
				code
			}
	
		*/	
			{  
				mergedArray[pos] = element;  
				pos++;               
			}  
		for (int element : secondArray) //copying elements of secondArray using for-each loop  
		{  	
			mergedArray[pos] = element;  
			pos++;  
		}  
		System.out.println("Merged Array = "+Arrays.toString(mergedArray));   //prints the resultant array  
	}  
} 