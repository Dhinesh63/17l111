import java.util.Scanner;

public class Sample7{
    public static void main(String[] args)
    { 
        Scanner scanner= new Scanner(System.in);
        char c=scanner.next().charAt(0);
        int n;
         n=(int)c;
      if(n>=65&&n<=91){
          n=n+32;
    System.out.print(c+"->");
        c=(char)n;
        System.out.println(c);
    }
else if(n>=97&&n<=123){
n=n-32;
 System.out.print(c+"->");
c=(char)n;
System.out.print(c);

}}}