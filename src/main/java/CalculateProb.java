import java.util.ArrayList;
import java.util.Iterator;

public class CalculateProb {

    int win_count=0;
    int loss_count=0;
    String next_result;

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

        if (win_count<4)
        {
               next_result="win";
        }
        else
        {
            next_result="loss";
        }

        return next_result;
    }


}
