import java.util.Scanner;

import sun.tools.tree.FinallyStatement;
import java.lang.Object.wait;

public class FlipaCoin {
   public static void main(String[] args) {
       //define variables
       int tp = 1;
       double hp = .05;
       int td = 10;
       int hd = 5;
       int hn = 8;
       int tn = 15;
       int hq = 13;
       int tq = 25;
       int cfh = 3;
       double dc = 1.00;
       //print the title
       System.out.println("The Virtual Coin Flipper");
       //wait 1 second to execute the next command 
       synchronized (args){
       try {
           args.wait(1000);
       } 
       catch (InterruptedException e) {
           e.printStackTrace();
       }
       //pick which coin to use 
       System.out.println("What type of coin do you want to use? penny, dime, nickel or quarter");
       Scanner coins = new Scanner(System.in);
      String answer = coins.nextLine();
      //loop the next lines of code
       for (int i = 0; i < 5; i = i + 1) {
            int hot = (int) Math.round(Math.random() * (3 - 1) + 1);
            //If hot is 1 than print heads
           if (hot == 1) {
               System.out.println("heads");
           }
           //if certain input is given than give specified output
           if (answer.equals("penny") && hot == 1){
               System.out.println("You got "+hp+" cents");
           }
           if (answer.equals("dime") && hot == 1){
               System.out.println("You got "+hd+" cents");
           }
           if (answer.equals("nickel") && hot == 1){
               System.out.println("You got "+hn+" cents");
           }
           if (answer.equals("quarter") && hot == 1){
               System.out.println("you got "+hq+" cents" );
           }
           //If hot is 2 than print tails
           if (hot == 2) {
               System.out.println("tails");
           }
           //if certain input is given than give specified output
           if (answer.equals("penny") && hot == 2){
            System.out.println("You got "+tp+" cent");
           }
           if (answer.equals("dime") && hot == 2){
               System.out.println("You got "+td+" cents");
           }
           if (answer.equals("nickel") && hot == 2){
               System.out.println("you got "+tn+" cents");
           }
           if (answer.equals("quarter") && hot == 2){
               System.out.println("you got "+tq+" cents");
           }
           //condition for hot is 3
           if (hot == 3){
               System.out.println("Your coin has fallen off your hand");
               try{
                   args.wait(1000);
               }
               catch (InterruptedException t){
                   t.printStackTrace();
               }
               System.out.println("You lost "+cfh+" cents");
           }
           //wait one second to execute the next command 
           try {
               args.wait(1000);
           }
           catch (InterruptedException r){
               r.printStackTrace();
           }
           //ask if the user wants to flip again
           System.out.println("Would you like to flip again?");
            Scanner input = new Scanner(System.in);
            String yon = input.nextLine();
            //if the user inputs no than stop the loop
          if (yon.equals("no")){
              break;
         }
       }
       System.out.println("Would you like to play a bonus flip?");
        Scanner bonus = new Scanner(System.in);
         String dollar = bonus.nextLine();
         if (dollar.equals("yes")){
             System.out.println("This time you have a dollar coin and one flip only! Good Luck!");
             synchronized (args){
             try {
                 args.wait(1000);
             }
             catch (InterruptedException q){
                 q.printStackTrace();
             }
             System.out.println("You will now roll a dice, 1=lose 50 cents, 2=lose bonus 3=gain 1 dollar");
             try{
                 args.wait(1000);
             }
             catch (InterruptedException w){
                 w.printStackTrace();
             }
             int d = (int) Math.round(Math.random() * (3 - 1) + 1);
         if (d == 1){
            System.out.println("You lost 50 cents");
         }
         if (d == 2){
             System.out.println("you got a 2, better luck next time!");
             System.exit(1);
         }
         if (d == 3){
             System.out.println("You gained 1 dollar");
         }
              int e = (int) Math.round(Math.random() * (2 - 1) + 1);
         if (e ==1){
            System.out.println("You got heads");
            try {
                args.wait(1000);
            }
            catch (InterruptedException s) {
                s.printStackTrace();
            }
            System.out.println("You gained 50 cents");
           } 
         if (e == 2){
             System.out.println("You got tails");
             try {
                 args.wait(1000);
             }
             catch (InterruptedException f){
                 f.printStackTrace();
             }
             System.out.println("You gained 1 dollar");
          }
         }  
       } 
     }
   } 
}
