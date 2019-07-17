import java.util.Scanner;  
public class PrimeAndPalindrome{  

public static void main(String[] args) {  
Scanner s = new Scanner(System.in);
Util u = new Util();  

System.out.print("Enter a number>> ");  
int n = s.nextInt();
boolean prime = u.isPrime(n);
boolean palindrome=u.isPalindrome(n);
	if(prime){
		if(palindrome)
			System.out.println("The number is both prime and palindrome");
		else
			System.out.println("The number is prime but not palindrom");
		}else{
		System.out.println("The number is not prime");
		}

}
}  