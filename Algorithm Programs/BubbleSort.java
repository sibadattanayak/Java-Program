import java.util.Scanner;
class BubbleSort{ 

void bubbleSort(int arr[]) { 

int n = arr.length; 

	for (int i = 0; i < n-1; i++) 
		for (int j = 0; j < n-1; j++) 
			if (arr[j] > arr[j+1]) 
			{ 
				int temp = arr[j]; 
				arr[j] = arr[j+1]; 
				arr[j+1] = temp; 
			} 
} 


void printArray(int arr[]) { 
		
int n = arr.length; 
		
	for (int i=0; i<n; ++i) 
		System.out.print(arr[i] + " "); 
		System.out.println(); 
} 
	
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
BubbleSort ob = new BubbleSort(); 
		
	System.out.println("Enter the length of the Array>> ");
	int length=sc.nextInt();
	System.out.println("Enter the array elements>> ");
        int arr[] = new int[length]; 
  	
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	} 
		ob.bubbleSort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
} 
} 
