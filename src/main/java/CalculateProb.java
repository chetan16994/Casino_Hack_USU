import java.util.ArrayList;
import java.util.Iterator;

public class CalculateProb {

    int win_count=0;
    int count=0;
    int loss_count=0;
    String next_result;

    public String nextResult(ArrayList<String> results){

        for (int i=0;i<results.size();i++){
            count++;
            //System.out.println(i+1 +"th  result is : "+ results.get(i));
            if (results.get(i).equals("win")){
                win_count++;
            }
            if (results.get(i).equals("loss")){
                loss_count++;
            }
            //System.out.println(iter.next());
        }
      //  System.out.println("count for b = "+count);
        //System.out.println("win count for b = "+win_count);
        //System.out.println("loss count for b = "+loss_count);

        if (win_count >=4)
        {
               next_result="loss";
        }
        else
        {
            next_result="win";
        }
        return next_result;
    }
}
