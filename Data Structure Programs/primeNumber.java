import java.io.*;
public class primeNumber{
public static void main(String args[]) throws IOException{

String primeNumbers = "";
int arr[][] = new int[1000][300];
	int counter = 0;
int index = 0;
	
for(int i=0;i<=1000;i++){
	int count =0;
	for(int j = i;j>=1;j--){
		if(i%j==0){
			
			count = count+1;
			}
		}
	if(count ==2){
		counter = counter + 1;
		primeNumbers=primeNumbers+i+" ";
		}
	}		

String prime[] = primeNumbers.split(" ");		
	for(int a=0;a<arr.length;a++){
		for(int b=0;b<arr[a].length;b++){
			if(index==prime.length){
				return;
				}
		arr[a][b] =Integer.parseInt(prime[index++]+"");
		System.out.println(arr[a][b]);				
			}
		}

}
}
