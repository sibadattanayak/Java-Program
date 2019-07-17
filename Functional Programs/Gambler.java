import java.util.*;

class Gambler{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Random rand=new Random();

System.out.println("Enter the turnOver>>");
int $Stake=sc.nextInt();
System.out.println("Enter the goal>>");
int $Goal=sc.nextInt();
System.out.println("Enter the number of times you want to play>>");
int n=sc.nextInt();

	if($Stake<=0){
		System.out.println("You dont have money left to play");
	}else{

	while(n>0){
		int RandomNumber=rand.nextInt(2);

			if(RandomNumber==0){
				$Stake=$Stake-1;
				n--;
			}else{
				$Stake=$Stake+1;
				n--;
			}
		}

if($Stake==$Goal){
System.out.println("You Won");
}else{
System.out.println("You loose");
}
}

}
}