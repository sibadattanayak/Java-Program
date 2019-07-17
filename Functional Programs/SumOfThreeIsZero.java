import java.util.Scanner;

class SumOfThreeIsZero{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of elements in an Integer Array>> ");
int n=sc.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

for(int i=0;i<n;i++){
System.out.println("Entered array elements are>> "+arr[i]);
}

if(arr.length>2){
for(int i=0;i<arr.length;i++){
for(int j=1;i<arr.length;j++){
for(int k=2;i<arr.length;k++){
if(arr[i]!=arr[j] && arr[i]!=arr[k] && arr[j]!=arr[k]){

if(arr[i]+arr[j]+arr[k]==0){
System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" are disttinct triplets");
}
}
}


}
}
}
}
}