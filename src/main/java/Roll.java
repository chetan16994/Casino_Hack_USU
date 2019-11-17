import java.util.ArrayList;

public class Roll {

    ArrayList<String> last10ResultA;
    String next_resultA;

    public void rollA(){

        Result rs=new Result();
        rs.Initializer_();
        last10ResultA = rs.getLast10ResultA();
        CalculateProb cp=new CalculateProb();
        next_resultA = cp.nextResult(last10ResultA);

    }



}
