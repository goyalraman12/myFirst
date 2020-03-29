import java.util.Scanner;
class prime {

    public static void main(String[] args) {

        int i;
        int num;
        int max; // max limit till which we want to find prime numbers
        boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural number upto which you want to check prime numbers: ");
		max=sc.nextInt();
		System.out.println("Prime numbers from 1 to " + max + " are:");
		if(max<=1){
			System.out.println("Error");
			System.out.println("Prime numbers are natural numbers greater than 1 divisible by itslef and 1 only");
		}
        for (i = 2; i <= max; i++)
		{	
            isPrime = CheckPrime(i);
            if (isPrime)
			{
                num = i;
                System.out.print(num+",");
            }
        }
        
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheck is not prime 
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }

}