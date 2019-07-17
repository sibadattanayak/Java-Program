import java.util.*;

class CouponNumbers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Random randomNumGenerator = new Random();

int count=0;
System.out.println("Enter the number of coupons you want>> ");
int n=sc.nextInt();
System.out.println("Enter the number of try>> ");
int tries=sc.nextInt();
int tr=tries;

	while(tries>0){
		int random = randomNumGenerator.nextInt(n);
		System.out.println("Enter your coupon number>> ");
		int coupon =sc.nextInt();

			if(coupon==random){
				System.out.println("You won");
				break;
			}else{
				System.out.println("Sorry....... Better luck next time.");
				}
	tries=tries-1;
	count=count+1;

	if(count==tr)
	System.out.println(" Winning nuumber was "+random);

}

}
}