public class Sample17 {
public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int reversed=0,remainder;
     int palin=num;
        while(num!=0)
        {
            remainder=num%10;
            reversed=reversed*10+remainder;
            num=num/10;
        }
       if(palin==reversed){
            System.out.println(palin+" is a palindrome");
           }
       else
         {

            System.out.println(palin+" is not a palindrome");
}    }
}