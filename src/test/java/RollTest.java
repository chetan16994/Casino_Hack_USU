 import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RollTest {

    @Test
    public void rollA() {
        int input2;
        int input1 = (int) (Math.random() * (10)) + 1;
        int user_command = 1;

        Result rs = new Result();
        rs.Initializer_();
        ArrayList<String> last10ResultA = rs.getLast10ResultA();
        CalculateProb cp = new CalculateProb();
        String next_result = cp.nextResult(last10ResultA);


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


        GameA gA=new GameA();
        gA.displayResult(next_result);

    }

    @Test
    public void rollB() {

        int input1 = (int) (Math.random() * (10)) + 1;
        System.out.println("1st number is = " + input1);

        Result rs = new Result();
        rs.Initializer_();
        ArrayList<String> last10ResultB = rs.getLast10ResultB();
        CalculateProb cp = new CalculateProb();
        String next_result = cp.nextResult(last10ResultB);
//        System.out.println("result for b inside roll"+next_result);
        // rs.storeResultB(next_result);

        int input2;
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

        GameB gB=new GameB();
        gB.displayResult(next_result);

    }
}