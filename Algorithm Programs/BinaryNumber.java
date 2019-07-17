import java.util.Scanner;
class BinaryNumber{
public static void toBinary(int dec){

	String bin="";
	while(dec!=0)
	{
	int r=dec%2;
	bin=r+bin;
	dec=dec/2;
	}
	System.out.println("The binary conversion of "+dec+" is "+bin);
	}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter an INTERGER in decimal format only>>");
int dec=sc.nextInt();
toBinary(dec);
}
}