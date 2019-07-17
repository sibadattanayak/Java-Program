import java.util.Scanner;

public class Util{

public static boolean isPalindrome(int n){

int x=n;
int sum=0;
int i=0;

	while(n!=0){
		i=n%10;
		sum=sum*10+i;
		n=n/10;
	}

	if(sum==x)
		return true;
	else
		return false;
	}
/**===================================================================**/

public static void isPrime(int n){

int count=0;

	for(int i=2;i<=n/2;i++){
		if(n%i==0){
			count=count+1;
		}
	}

	if(count<2)
		System.out.println(n+" is a prime number");
	else
		System.out.println(n+" is not a prime number");
}

/*========================================================================*/

public static void dayOfWeek(int m, int d, int y){ 

if(m>0 && m<=12 && d>0 && d<=31){
switch (m){
case 1:m=31;
break;
case 2:
	if(y%400==0 ||((y%100!=0)&&(y%4==0))){
		m=29;
		System.out.println("leap");
	}
	else{
		System.out.println("Not leap");
		m=28;
	}
break;
case 3:m=31;
break;
case 4:m=30;
break;
case 5:m=31;
break;
case 6:m=30;
System.out.println("2==>");
break;
case 7:m=31;
break;
case 8:m=31;
break;
case 9:m=30;
break;
case 10:m=31;
break;
case 11:m=30;
break;
case 12:m=31;
break;
}

System.out.println("3==>");


int y0=(y-(14-m)/12)-1;
System.out.println("4==>"+y0);
int x=y0+y0/4-y0/100+y0/400;
System.out.println("5==>"+x);
int m0=m+12*((14-m)/12)-2;
System.out.println("6==>"+m0);
int d0=(d+x+31*m0/12)%7;
System.out.println("7==>"+d0);



switch (d0){
case 0:System.out.println("Sunday");
break;
case 1:System.out.println("Monday");
System.out.println("8==>");
break;
case 2:System.out.println("Tuesday");
break;
case 3:System.out.println("Wednesday");
break;
case 4:System.out.println("Thu");
break;
case 5:System.out.println("Friday");
break;
case 6:System.out.println("Saturday");
break;
}
}else{
System.out.println("Invalid Input");
}
}

/*=====================================================*/

public static void temperatureConversion(int n, double t){

double F=0.0;
double C=0.0;

if(n>=0 && n<=3){
	switch (n){
	case 1:System.out.println(F=(t*9/5)+32);
	break;
	case 2:System.out.println(C=(t-32)*5/9);
	break;
	}
}else{
	System.out.println("Invalid Input");
	}
}

/*============================================================*/


public static void monthlyPayment(double P, int Y, double R){ 

double n=12*Y;
double r=R/(12*100);

double payment=(P*r)/1-Math.pow((1+r),(-n));

System.out.println("Monthly payment is "+payment);
}


/*==========================================================*/


} 