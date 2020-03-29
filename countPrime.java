import java.util.Scanner;
class prime {

    public static void main(String[] args) {

        int i;
        int num;
        int max; // max limit till which we want to find prime numbers
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural number upto which you want to check prime numbers: ");
		max=sc.nextInt();
		System.out.println("Prime numbers from 1 to " + max + " are:");
		if(max<=1){
			System.out.println("Error!! INVALID INPUT");
			System.out.println("Prime numbers are those natural numbers greater than 1 divisible by itslef and 1 only");
		}
        for (i = 2; i <= max; i++)
		{
			boolean prime;		
            prime = CheckPrime(i);
            if (prime)
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