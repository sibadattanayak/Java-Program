import java.util.Scanner;

class HelloUser{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter your name>> ");
String name=sc.nextLine();

String sentence="Hello <<UserName>> ,How are you?";

	if(name.length()>3){
		sentence = sentence.replace("<<UserName>>", name);
		System.out.print(sentence);
	}else{
		System.out.println("String lengthis less than 3");
	}

}
}