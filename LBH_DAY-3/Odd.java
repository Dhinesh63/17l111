	import java.util.Scanner;
	public class Odd {
		public static Boolean isOdd(int i) {
	        return (i%2)!=0;
	    }
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int i=sc.nextInt();
	        if(isOdd(i)) 
	        {
	            System.out.print("2");
	        }
	        else {
	        	System.out.print("1");
	        }}
	}