import java.util.Scanner;
class VendingMachine{
public  static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter an amount you want to change>> ");
int n=sc.nextInt();
	
int arr[]= new int[]{1, 2, 5, 10, 50, 100, 500, 1000};
int count =0;

	for(int i=arr.length-1;i>=0;i--){
		if(n!=0){
			while(n>arr[i]){
				n=n-arr[i];
				count++;
					if(n==arr[i]){
						n=n-arr[i];
						count++;
						}
					}
			}
		if(n==0)
			break;
		}

System.out.println("Minimum "+count+" notes are to be returned ");

}
}