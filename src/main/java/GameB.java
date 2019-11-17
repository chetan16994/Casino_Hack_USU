import java.util.ArrayList;
import java.util.Scanner;

public class GameB implements Casino{

    static int bet_amount;
    int input1;
    int input2;
    ArrayList<String> last10ResultA;
    String next_result;

    @Override
    public int placeBet() {
        PlaceBet pb=new PlaceBet();
        bet_amount = pb.placeBet();
        return bet_amount;
    }

    @Override
    public void roll() {

        Roll roll_const=new Roll("B");

//        input1 = (int) (Math.random() * (10)) + 1;
//        System.out.println("1st number is = " + input1);
//
//        Result rs = new Result();
//        rs.Initializer_();
//        last10ResultA = rs.getLast10ResultA();
//        CalculateProb cp = new CalculateProb();
//        next_result = cp.nextResult(last10ResultA);
//        rs.storeResultA(next_result);
//
//
//            if (next_result.equals("win")) {
//                input2=input1;
//            } else {
//                if (input1 == 10)
//                    input2 = (int) (Math.random() * (9)) + 1;
//                else {
//                    input2 = (int) (Math.random() * (10)) + 1;
//
//                    if (input1 == 1)
//                        input2 = input1 + 1;
//                }
//            }
//
//        System.out.println("second number is = "+input2);
//        displayResult();
    }


    @Override
    public void displayResult(String next_result) {
        this.next_result= next_result;
        if (next_result.equals("win"))
            System.out.println("user won "+bet_amount);
        else
            System.out.println("user lost "+bet_amount);

    }
}
