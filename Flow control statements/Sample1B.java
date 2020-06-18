import java.util.*;
class Sample1B{
 

public static void lastDigit(int a,int b) {
         if (a%10==b%10){
           System.out.println("true");
}
        else{ 
           System.out.println("false");
}
}
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
    lastDigit(a,b);

}
}