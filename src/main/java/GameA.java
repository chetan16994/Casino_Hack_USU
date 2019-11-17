import java.util.ArrayList;
import java.util.Scanner;

public class GameA implements Casino{

    ArrayList<String> last10ResultA;
    int bet_amount;
    String next_result;

    @Override
    public int placeBet() {
      PlaceBet pb=new PlaceBet();
      bet_amount=pb.placeBet();
       return bet_amount;
    }

    @Override
    public void roll() {
        Result rs=new Result();
        rs.Initializer_();
        last10ResultA = rs.getLast10ResultA();
        CalculateProb cp=new CalculateProb();
        next_result= cp.nextResult(last10ResultA);
        System.out.println("result is "+next_result);
        displayResult();
    }

    @Override
    public void result() {

        //Result rs.displayResult();
    }

    public void displayResult()
    {
        if (next_result.equals("win"))
        System.out.println("user won "+bet_amount);
        else
            System.out.println("user lost "+bet_amount);
    }
}
