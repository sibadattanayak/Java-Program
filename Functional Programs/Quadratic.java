import java.util.*;
class Quadratic{
public static void main(String args[]){

double a=Double.parseDouble(args[0]);
double b=Double.parseDouble(args[1]);
double c=Double.parseDouble(args[2]);

double delta =b*b-4*a*c;

double rootx1=(-b+Math.sqrt(delta))/(2*a);
double rootx2=(-b-Math.sqrt(delta))/(2*a);

System.out.println("The two root are "+rootx1+" and "+rootx2);
}
}