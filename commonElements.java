class commonElements{
	public static void main (String [] Args){
		String[] s1 = {"Bathinda","Chandigarh","Banglore","Gurgaon","Hyderabad","Noida"};
		String[] s2 = {"Bathinda","Goa","Pune","Gurgaon","New York","Los Angeles","Mumbai"};
		
		System.out.println("Common Elements between both String Arrays are: ");
		for(int i=0; i<s1.length; i++)
		{
			for (int j=0; j<s2.length; j++)
			{
				if(s1[i]==s2[j])
				{
					System.out.println(s1[i]);
				}	
			}
		}
	}
}