/*
Daniel Hsu
CSE 142 AI 
TA=Rebecca Yuen
4-9-15
HW 2A

Creates spaceship going pew pew pew!
*/
public class AsciiArt {
   public static void main(String[] args) {
   front();
   center();
   rear();
   exhaust();
   }
   public static void front() {
      //Nose cone tip
      for (int line=1; line<=2; line++) {
         for (int space=1; space<=-1*line+21; space++) {
            System.out.print(" ");
         }
         System.out.print("/");
         for (int slash=1; slash<=line-1; slash++) {
            System.out.print("/");
         }
         for (int slash=1; slash<=line-1; slash++) {
            System.out.print("\\");
         }
         System.out.println("\\");
      }    
      System.out.println("  _               //  \\\\               _");
      System.out.println(" (_)             // /\\ \\\\             (_)");
      System.out.println("                 |\\/__\\/|");
      System.out.println("                 \\[(__)]/");
      System.out.println("  _               [ == ]               _");
      System.out.println(" (_)              [|==|]              (_)");
      System.out.println("                  [|[]|]");
      }
   public static void center() {     
      System.out.println("                  /|[]|\\");
      System.out.println(" /^\\            _/-|[]|-\\_            /^\\");
      System.out.println(" {I}          _//===[]===\\\\_          {I}");
      System.out.println(" {I}        _/ /===:[]:===\\ \\_        {I}");
      System.out.println("/---\\     _/  /===::__::===\\  \\_     /---\\");
      System.out.println("\\::::\\___/___/===::[__]::===\\___\\___/::::/");
      System.out.println(" \\:::::::::::===:: [__] ::===:::::::::::/");
      System.out.println("  \\:::::::::::===::[__]::===:::::::::::/");
      System.out.println("   \\:::::::::::===::  ::===:::::::::::/");
   }
   public static void rear() {     
      System.out.println("   /---\\::::::::===:[]:===::::::::/---\\");      
      System.out.println("  {_____}------\\|===[]===|/------{_____}");
      System.out.println("   \\___/        \\|||[]|||/        \\___/");
      System.out.println("    VVV          \\|____|/          VVV");      
      }     
   public static void exhaust() {     
      //Initiating plasma propulsion protocol
      System.out.println("    |||            ||||            |||");
      System.out.println("     |            ///\\\\\\            |  "); 
      for (int line=1; line<=2; line++) {
         for (int space=1; space<=line+16; space++) {
            System.out.print(" ");
         } 
         System.out.print("(~");
         for (int slash=1; slash<=-1*line+3; slash++) {
            System.out.print("\\");
         }
         for (int slash=1; slash<=-1*line+3; slash++) {
            System.out.print("/");
         }
         System.out.print("~)");
         System.out.println();
      }
      //Exhaust tip
      for (int line=1; line<=2; line++) {
         for (int space=1; space<=line+18; space++) {
            System.out.print(" ");
         }
         System.out.print("(");
         for (int curl=1; curl<=-2*line+4; curl++) {
            System.out.print("~"); 
         }
         System.out.print(")");
         System.out.println();
      }
   }      
}
