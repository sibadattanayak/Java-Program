import java.util.Scanner;

class NewtonMethod{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Eneter the value of C >>");
double c=sc.nextDouble();

double t=c;
double epsilone=1e-15;
 
	while(Math.abs(t-(c/t))>epsilone*t){
		t=((c/t)+t)/2;
		}

System.out.println(Math.abs(t-(c/t)));

}
}