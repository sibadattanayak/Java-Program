import java.util.Scanner;
class MonthlyPayment{
public static void main(String args[]){
Util  u= new Util();
double P=Double.parseDouble(args[0]);
int Y=Integer.parseInt(args[1]);
double R=Double.parseDouble(args[2]);
double payment  = u.monthlyPayment(P, Y, R);

}
}