import java.util.*;
public class Sample13{
public static void main(String[] args) 
{
   int num,count;	
   for(num=10;num<100;num++)
   {count = 0;
   for(int i=2;i<=num/2;i++)
   {
	if(num%i==0)
        {
        count++;
	break;
} }
  if(count==0&&num!=1){
System.out.print(num+" ");
}}}}