import java.util.Scanner;
class DayOfWeek{
public static void main(String args[]){
Util  u = new Util();

int m=Integer.parseInt(args[0]);
int d=Integer.parseInt(args[1]);
int y=Integer.parseInt(args[2]);
String day=u.dayOfWeek(m,d,y);
System.out.println(day);
}
}