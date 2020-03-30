//Write a Java method to find all twin prime numbers less than 100
class twinPrimes {

    public static void main(String[] args) {

        int i;
        int num;
        int max = 100;
		System.out.println("\nTwin Primes are those prime numbers whose difference is 2,and only one composite number is in between them.");
		System.out.println("Twin prime numbers less than 100 are: ");
        for (i = 2; i <= max; i++)
		{
            if (checkPrime(i)&&checkPrime(i+2))
			{        
                System.out.printf("(%d,%d)\n", i,i+2);
            }
        }
    }
    public static boolean checkPrime(int numberToCheck) {
		if(numberToCheck<2)
		return false;
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