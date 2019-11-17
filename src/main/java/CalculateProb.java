import java.util.ArrayList;
import java.util.Iterator;

public class CalculateProb {

    int win_count=0;
    int loss_count=0;
    String next_result;

    //private final ArrayList<String> results;

//    public  CalculateProb(ArrayList<String> results){
//        this.results=results;
//    }

    public String nextResult(ArrayList<String> results){
        Iterator iter = results.iterator();
        while (iter.hasNext()) {

            if (iter.next().equals("win")){
                win_count++;
            }

            if (iter.next().equals("loss")){
                loss_count++;
            }
            //System.out.println(iter.next());
        }

        if (win_count<44)
        {
               next_result="loss";
        }
        else
        {
            next_result="win";
        }

        return next_result;
    }

    public void next_result(ArrayList<String> last10ResultA) {
    }
}
