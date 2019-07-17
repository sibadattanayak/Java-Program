import java.util.*;

class Binary{
public static void halfReverse(String []binary){
for(int i=0;i<binary.length/2;i++){
System.out.println("Doubt");
}
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter a decimal number");
int dec=sc.nextInt();
System.out.println(Integer.toBinaryString(dec));
String arr=Integer.toBinaryString(dec);

String binary[] =new String[arr.length()];

halfReverse(binary);

}
}