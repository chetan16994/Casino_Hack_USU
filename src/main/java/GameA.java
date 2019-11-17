import java.util.ArrayList;
import java.util.Scanner;

public class GameA implements Casino{

    ArrayList<String> last10ResultA;
    static int bet_amount;
    String next_result;
    int input2;
    int input1;

    @Override
    public int placeBet() {
      PlaceBet pb=new PlaceBet();
      bet_amount=pb.placeBet();
       return bet_amount;
    }

    @Override
    public void roll() {
        Roll roll_const=new Roll("A");
    }


    @Override
    public void displayResult(String next_result)
    {
        this.next_result= next_result;
        if (next_result.equals("win"))
        System.out.println("user won "+bet_amount);
        else
            System.out.println("user lost "+bet_amount);
    }
}
