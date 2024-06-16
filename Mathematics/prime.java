// import java.util.Scanner;

// class gfg{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();

//         for(int i=2;i<a;i++){
//             if(a%i==0){
//                 System.out.println("not prime");
                
//             }
        

//         }
//         System.out.println(" prime");

        
//     }
// }
import java.lang.*;
import java.util.*;

class GFG {

	// Check for number prime or not
	static boolean isPrime(int n)
	{

		// Check if number is less than
		// equal to 1
		if (n <= 1)
			return false;

		// Check if number is 2
		else if (n == 2)
			return true;

		// Check if n is a multiple of 2
		else if (n % 2 == 0)
			return false;

		// If not, then just check the odds
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
		if (isPrime(19))
			System.out.println("true");

		else
			System.out.println("false");
	}
}