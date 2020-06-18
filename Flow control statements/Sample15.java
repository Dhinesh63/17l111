import java.util.*;
class Sample15{
 
public static void printstar(int row) {
int a=1;
 for(int i=1;i<=row;i++)
{
for(int j=1;j<=i;j++)
{
  System.out.print("*"+" ");
    a++;            
}
System.out.println();
}
 
}
public static void main(String args[]){
int row=Integer.parseInt(args[0]);

   printstar(row);


}
}