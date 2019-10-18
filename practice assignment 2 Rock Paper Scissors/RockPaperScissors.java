import java.util.Scanner;

public class RockPaperScissors{

    static int wins = 0;
    static int losses = 0;
    static int ties = 0;
    static int Pchoice = 0;
    static int Cchoice = 0;
    static boolean again = true;
    static String a;

    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("Good Luck, Human...");

        while(again == true){

            System.out.println("");
            System.out.print("What do you throw?  [1] Rock, [2] Paper, [3] Scissors?");
            Pchoice = sc.nextInt();

            if(Pchoice == 1){
                System.out.println("");
                System.out.print("You threw rock!");
            }else if(Pchoice == 2){
                System.out.println("");
                System.out.print("You threw paper!");
            }else{
                System.out.println("");
                System.out.print("You threw scissors!");
            }

            randomCchoice();

            result();

            System.out.println("Again? (y/n)");
            a = sc.next();
            if(a.equals("y")){
                again = true;
            }else{
                again = false; 
            }
        }
        System.out.println("");
        System.out.println("Good Game!  Thanks for playing.");
        System.out.println("********************************************");
        System.out.println("wins: "+wins);
        System.out.println("losses: "+losses);
        System.out.println("ties: "+ties);
        System.out.println("");
    }

    public static void randomCchoice(){

        Cchoice = (int)(Math.random()*3) + 1;

        if(Cchoice == 1){
            System.out.println("");
            System.out.print("I threw rock!");
            System.out.println("");
        }else if(Cchoice == 2){
            System.out.println("");
            System.out.print("I threw paper!");
            System.out.println("");
        }else{
            System.out.println("");
            System.out.print("I threw scissors!");
            System.out.println("");
        }
    }

    public static void result(){
        if(Cchoice == Pchoice){
            System.out.println("A draw ... pretty good, human!  I demand a rematch ...");
            System.out.println("");
            ties++;
        }else if(Pchoice == 1 && Cchoice == 2){
            System.out.println("I win!  You are not a challenge for me ...");
            System.out.println("");
            losses++;
        }else if(Pchoice == 1 && Cchoice == 3){
            System.out.println("Whaaa?? ... You beat me?  RAGE!");
            System.out.println("");
            wins++;
        }else if(Pchoice == 2 && Cchoice == 1){
            System.out.println("Whaaa?? ... You beat me?  RAGE!");
            System.out.println("");
            wins++;
        }else if(Pchoice == 2 && Cchoice == 3){
            System.out.println("I win!  You are not a challenge for me ...");
            System.out.println("");
            losses++;
        }else if(Pchoice == 3 && Cchoice == 1){
            System.out.println("I win!  You are not a challenge for me ...");
            System.out.println("");
            losses++;   
        }else if(Pchoice == 3 && Cchoice == 2){
            System.out.println("Whaaa?? ... You beat me?  RAGE!");
            System.out.println("");
            wins++; 
        }
    }

}