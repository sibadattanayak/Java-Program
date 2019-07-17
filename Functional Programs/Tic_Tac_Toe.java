import java.util.Scanner;
class Tic_Tac_Toe{
public static void main(String args[]){

Matrix m=new Matrix();
m.readMat();
m.displayMatrix();
}
}


class Matrix{
int [][]readMat(){
Scanner sc=new Scanner(System.in);

System.out.println("Enter how many rows and columns you want: ");
int r=sc.nextInt();
int c=sc.nextInt();
int mat[][]=new int[r][c];
System.out.println("Enter "+r*c+" elements row wise :");

for(int i=0;i<mat.length;i++){
	for(int j=0;j<mat[i].length;j++){
		mat[i][j]=sc.nextInt();
		}
	}
return mat;
}


void displayMatrix(int mat[][])
{
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[i].length;j++){
			System.out.print(mat[i][j]+" ");

		}
	System.out.println();
	}
}
}
