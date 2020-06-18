import java.util.*;
public class Sample12{
public static void main(String args[]){
int val=Integer.parseInt(args[0]);
boolean checkprime=true;
int n;
for(int i=2;i<val;i++)
{
   n=val%i;
   if(n==0){
      checkprime=false;
      break;
	   }
	}
	
	if(checkprime){
	   System.out.println(val+" is a Prime Number");
	}else{
	   System.out.println(val+" is not a Prime Number");
   }}
}
