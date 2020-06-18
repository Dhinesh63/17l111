public class Sample16 {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]); 
       int reversed=0;
        while(num!=0) {
            int a=num%10;
            reversed=reversed*10+a;
            num=num/10;
        }
        System.out.println(reversed);
    }
}