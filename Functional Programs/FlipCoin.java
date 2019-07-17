import java.util.Scanner;

class FlipCoin{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("How many  times you want to toss>> ");
int n=sc.nextInt();

double toss=1;

	for(int i=1;i<=n;i++){
		toss=toss*(0.5);
	}	
System.out.println("Percentage of Heads vs Tails >>"+toss);

}
}