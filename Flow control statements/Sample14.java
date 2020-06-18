import java.util.*;
public class Sample14{
public static void main(String args[]){
int num=Integer.parseInt(args[0]);
int sum=0;
int rem;
if(num>0){
for(sum=0;num>0;num=num/10)
{
 rem=num%10;
  sum=sum+rem;
}
}
System.out.println(sum);
}
}