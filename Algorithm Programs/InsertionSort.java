import java.util.Arrays;
import java.util.Scanner;
class InsertionSort{ 
    
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
  
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
   
    public static void main(String args[]) 
    { 	
	Scanner sc=new Scanner(System.in);
	Util u = new Util();
	System.out.println("Enetr the length of the Array>> ");
	int length=sc.nextInt();
	System.out.println("Enetr the array elements>> ");
        int arr[] = new int[length]; 
  	
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
         
        u.sort(arr); 
 	System.out.println();
        printArray(arr); 
    }}