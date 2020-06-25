import java.util.Scanner;
public class SecondlastDigit {
		  public static int slastDigit(int n) 
		  { 
		        return (n/10)%10; 
		    }
			public static void main(String[] args) {
			  Scanner sc=new Scanner(System.in);
			   int n=sc.nextInt();
			   String s=String.valueOf(n);
			  if(s.contains("-")) {
				  System.out.println(-slastDigit(n)); 
			  }
			  else if(s.length()==1)
			  {
				  System.out.print("-1");
			  }
			  else {
		        System.out.println(slastDigit(n)); 
		        
			  }  
			  
			   
			   
			} 
		} 
		  