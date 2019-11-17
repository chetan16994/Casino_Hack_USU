import java.util.Scanner;

public class PlaceBet {


    int bet_amount;
    public int placeBet()
    {
        System.out.println("enter bet amount");
        Scanner sc=new Scanner(System.in);
        bet_amount = sc.nextInt();
        return bet_amount;
    }
}
