import java.util.*;
class FindNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Random rand=new Random();

System.out.println("Enter a range from O to ->");
int range=sc.nextInt();
int guess=rand.nextInt(range);
int numberOfTries=0;
int temp=0;
boolean win=false;

	while(win==false){
		System.out.println("Enter the number>> ");
		int number=sc.nextInt();
		numberOfTries++;

			if(number==guess){
				win=true;
				}
			else if(number<guess){
				System.out.println("Your guess is less");
				}
			else if(number>guess){
				System.out.println("Your guess is more");
				}
			temp=number;
		}

System.out.println("You win!!!!!!");
System.out.println("Your number was "+temp);
System.out.println("You took "+numberOfTries+" tries");
}
}