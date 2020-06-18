import java.util.*;
class Sample8{
public static void main(String args[])
{ 

   String color=args[0];
   switch(color) {
         case "W":
            System.out.println("White"); 
            break;
         case "B":
            System.out.println("Blue"); 
            break;
         case "G":
            System.out.println("Green");
            break;
         case "O":
            System.out.println("Orange");
              break;  
       case"R":
            System.out.println("Red");
            break;
       case "Y":
            System.out.println("Yellow"); 
            break;
         default:
            System.out.println("Invalid Code");
      }
      
   }
}