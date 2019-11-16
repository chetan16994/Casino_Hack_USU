import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter game ");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        String game=sc.next();

        System.out.println("game chosen is "+game);

        if (game.equals("c")||game.equals("C")) {
            System.out.println("chose 5 numbers between 1 to 20");
            int numbers[] = new int[5];
            for (int i = 0; i < 5; i++) {
                numbers[i] = sc.nextInt();
            }
            System.out.println("number chosen are");
            for (int i=0;i<5;i++) {
                System.out.println(numbers[i]);
            }
            ChoseGame choseGame=new ChoseGame(game,numbers);
        }
    }
}
