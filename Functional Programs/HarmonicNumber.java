import java.util.Scanner;

class HarmonicNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the value of N to find its Nth Harmonic Number");
int nThHarmonic=sc.nextInt();

double harmonic=0.0;

	for(double i=1;i<=nThHarmonic;i++){
		harmonic=harmonic+(1/i);
	}

System.out.println(nThHarmonic+"th Harmonic number is "+harmonic);

}
}