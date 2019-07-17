import java.util.*;

class PowerOf2{
public static void main(String args[]){

int N=Integer.parseInt(args[0]);

	if(N+1<31 && N>0)
	{
		for(int i=1;i<N+1;i++){
			System.out.println(Math.pow(2,i));
			}
		}else{
	System.out.println("According to the condition INT range out of bound");
	}

}
}