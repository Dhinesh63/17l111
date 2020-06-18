import java.util.*;
public class Sample5{
   public static void main(String args[])
{
char val='!';
if((val>=65&&val<=90)||(val>=97&&val<=122))
{
System.out.println("Alphabet");
}
else if(val>=48&val<=57)
{
System.out.println("Digit");
}
else
{
System.out.println("Special Character");
}}}
