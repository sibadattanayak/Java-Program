import java.util.Scanner;
import java.io.*;
import java.lang.*;

class UnorderedList{
public static void main(String args[])throws Exception{

int count=0;
String[] words=null;

Scanner sc=new Scanner(System.in);

File file = new File("C:/Users/shiba/Desktop/BridgeLabz/Data Structure Programs/OrderedList.txt");

BufferedReader br = new BufferedReader(new FileReader(file));
FileReader fr = new FileReader(file);
StringBuilder sb = new StringBuilder(fr);

System.out.println("Enter a word to find in the file>> ");
String findWord=sc.nextLine();

String str =br.readLine();
while(str!=null){
		words=s.split(" ");
			for(String Word :words ){
				if(Word.equals(findWord)){
					count++;
				}
			}
		}

if(count!=0){
         System.out.println("The given word is present for "+count+ " Times in the file");
      }else{
	sb.append(findWord);
         System.out.println("The given word was not present in the file.We appended it >> ");
      }

}
}