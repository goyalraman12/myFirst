//Merge Arrays of  different different sizes


import java.util.*;

 class mergeArrays1 {  
	public static void main(String[] args)  
	{  	
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the number of elements in firstArray: ");
		n1=sc.nextInt();
		int[] firstArray = new int[n1];  
		System.out.println("Enter the number of elements in secondArray: ");
		n2=sc.nextInt();
		int[] secondArray = new int[n2];  
		System.out.println("Enter "+n1+" integer elements in First Array: ");
		for(int i=0;i<n1;i++)
		{
			firstArray[i]=sc.nextInt();
		}
		System.out.println("Enter "+n2+" integer elements in First Array: ");
		for(int i=0;i<n2;i++)
		{
			secondArray[i]=sc.nextInt();
		}
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