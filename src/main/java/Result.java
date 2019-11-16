import java.util.ArrayList;

public class Result {

    public static void main(String[] args) {

        ArrayList<String> results_for_gameA = new ArrayList<>();

        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");

        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");


        ArrayList<String> results_for_gameB = new ArrayList<>();

        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("loss");

        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("loss");

        ArrayList<String> results_for_gameC = new ArrayList<>();

        results_for_gameC.add("win");
        results_for_gameC.add("loss");
        results_for_gameC.add("loss");
        results_for_gameC.add("win");
        results_for_gameC.add("loss");
        results_for_gameC.add("win");
        results_for_gameC.add("loss");
        results_for_gameC.add("win");
        results_for_gameC.add("loss");
        results_for_gameC.add("loss");

        results_for_gameC.add("win");
        results_for_gameC.add("loss");
        results_for_gameC.add("loss");
        results_for_gameC.add("win");
        results_for_gameC.add("loss");
        results_for_gameC.add("win");
        results_for_gameC.add("loss");
        results_for_gameC.add("win");
        results_for_gameC.add("loss");
        results_for_gameC.add("loss");

        System.out.println(results_for_gameA);
        System.out.println(results_for_gameB);
        System.out.println(results_for_gameC);

        for (int i=results_for_gameA.size()-1;i>results_for_gameA.size()-11; i--)
        System.out.println(results_for_gameA.get(i));
    }
}