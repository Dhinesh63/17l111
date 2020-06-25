import java.util.*;

public class AddLastdigit {
	public static int addLastDigits(int input1,int input2){
	input1=Math.abs(input1%10);
	input2=Math.abs(input2%10);
	int sum=Math.abs(input1+input2);
	return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();		
		System.out.print(addLastDigits(input1,input2));
	}
	}