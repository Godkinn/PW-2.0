import java.util.Scanner;
import java.util.*;
import java.lang.Integer;

class main {
  //A variable I am going to use in both functions, so I have to declare it outside both
  static int PassLeft = 2;
  
  public static void main(String[] args) {
    //Variables I am going to use
    int Num = 0;
    int TriesLeft = 1;
    int UserPassInput;

    Scanner reader = new Scanner(System.in); //Allows user input

     //List that stores all passwords
     List<Integer> Pass = new ArrayList <Integer>();
     Pass.add(123);
     Pass.add(456);

     //List that stores all input passwords
     List<Integer>UserPass = new ArrayList <Integer>();

     //Asks for pass and checks if the passwords are the same
     while (PassLeft != 0) {

      System.out.println("\nFill in password: ");
      UserPass.add(reader.nextInt());

      if (Pass.get(Num).equals(UserPass.get(Num))) { //Checks if you filled in the right pass
        PassLeft = PassLeft - 1; //One step closer to authentication
        Num = Num + 1; //Next block
       }
      else {
        if ((Num == 0 || Num == 1) && TriesLeft == 1) { //Checks if you have the right to try again
          TriesLeft = 0; //Only one try-again
	  System.out.println("Triesleft = 0");
	  UserPass.remove(Num);
        }
        else {
          PassLeft = PassLeft + 1; //One step further away from authentication
	  UserPass.remove(Num);
	  double RandomInt1 = Math.round(Math.random()*10);
	  double RandomInt2 = Math.round(Math.random()*100);
	  double RandomInt3 = Math.round(Math.random()*1000);
	  double NewBlock = RandomInt1 + RandomInt2 + RandomInt3;
	  if ((NewBlock > 100) && NewBlock < 1000) {
	    Pass.add((int)NewBlock);
	  };
	  System.out.println("Pass = " + Pass);
        };
      };
    }; //while
  }; //function
}; //class
