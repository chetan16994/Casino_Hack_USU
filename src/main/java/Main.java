import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter game ");
        System.out.println("A");
        System.out.println("B");
        //System.out.println("C");
        String game=sc.next();

        System.out.println("game chosen is "+game);

       if (game.equals("b")||game.equals("B") || game.equals("a")||game.equals("A")) {

            ChoseGame choseGame=new ChoseGame(game);
       }
       else
       {
           System.out.println("invaid input");
       }
    }
}
