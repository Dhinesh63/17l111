import java.util.Scanner;

public class LastDigit {

	  public static int lastDigit(int n) 
	  { 
	        return (n%10); 
	    }
		public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   String s=String.valueOf(n);
		  if(s.contains("-")) {
			  System.out.println(-lastDigit(n)); 
		  }
		  else {
	        System.out.println(lastDigit(n)); 
	        
		  }   } 
	} 
	  