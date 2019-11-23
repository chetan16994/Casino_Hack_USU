import java.util.ArrayList;
import java.util.Scanner;

public class Roll {

    int input1;
    int input2;
    String next_result;
    private  String game_name;
    ArrayList<String> last10ResultA;
    ArrayList<String> last10ResultB;

    public Roll(String game_name){
        this.game_name=game_name;

        if (game_name.equals("A")) {
            System.out.println("game B");
            rollA();
        }
        else if (game_name.equals("B")) {
            System.out.println("game B");
            rollB();
        }
        else
            System.out.println("invalid input");
    }

    public void rollA(){

        input1 = (int) (Math.random() * (10)) + 1;
        System.out.println("1st number is = " + input1);

        Scanner sc = new Scanner(System.in);
        System.out.println("type 1 for other roll");
        int user_command = sc.nextInt();

        Result rs = new Result();
        rs.Initializer_();
        last10ResultA = rs.getLast10ResultA();
        CalculateProb cp = new CalculateProb();
        next_result = cp.nextResult(last10ResultA);
       // rs.storeResultA(next_result);

        if (user_command == 1){
            if (next_result.equals("win")) {
                input2=input1;
            } else {
                if (input1 == 10)
                    input2 = (int) (Math.random() * (9)) + 1;
                else {
                    input2 = (int) (Math.random() * (10)) + 1;

                    if (input1 == 1)
                        input2 = input1 + 1;
                }
            }
        }
        else
            System.out.println("invalid user_command");

        System.out.println("second number is = "+input2);
        GameA gA=new GameA();
        gA.displayResult(next_result);
    }

    public void rollB(){

        input1 = (int) (Math.random() * (10)) + 1;
        System.out.println("1st number is = " + input1);

        Result rs = new Result();
        rs.Initializer_();
        last10ResultB = rs.getLast10ResultB();
        CalculateProb cp = new CalculateProb();
        next_result = cp.nextResult(last10ResultB);
//        System.out.println("result for b inside roll"+next_result);
       // rs.storeResultB(next_result);

        if (next_result.equals("win")) {
            input2=input1;
        } else {
            if (input1 == 10)
                input2 = (int) (Math.random() * (9)) + 1;
            else {
                input2 = (int) (Math.random() * (10)) + 1;

                if (input1 == 1)
                    input2 = input1 + 1;
            }
        }

        System.out.println("second number is = "+input2);
        GameB gB=new GameB();
        gB.displayResult(next_result);
    }
}
