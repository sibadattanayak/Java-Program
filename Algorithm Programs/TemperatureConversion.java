import java.util.Scanner;

public class TemperatureConversion{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Util u = new Util();

System.out.println("Enter 1 to input the  temperature  in Celsius");
System.out.println("Enter 2 to input the  temperature  in Fahrenheit");
int n=sc.nextInt();

System.out.println("Enter the Temperature >>");
double t=sc.nextInt();

double Temp  =  u.temperatureConversion(n,t);

}
}