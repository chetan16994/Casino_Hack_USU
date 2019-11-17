import java.util.ArrayList;

public class Result {

    private String resultA;
    private String resultB;
    private String resultC;
    ArrayList<String> results_for_gameA = new ArrayList<>();
    ArrayList<String> results_for_gameB = new ArrayList<>();
    ArrayList<String> results_for_gameC = new ArrayList<>();

//    public Result(String resultA) {
//        this.resultA = resultA;
//    }

    public void Initializer_(){
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");

        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");
        results_for_gameA.add("win");
        results_for_gameA.add("loss");
        results_for_gameA.add("loss");

        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("win");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("loss");

        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("win");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("win");
        results_for_gameB.add("loss");
        results_for_gameB.add("loss");


//        results_for_gameC.add("win");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("win");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("win");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("win");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("loss");
//
//        results_for_gameC.add("win");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("win");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("win");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("win");
//        results_for_gameC.add("loss");
//        results_for_gameC.add("loss");
//
    }
    
    public void storeResultA(String resultA){
        this.resultA=resultA;
        results_for_gameA.add(resultA);
    }

    public void storeResultB(String resultB){
        this.resultB=resultB;
        results_for_gameB.add(resultB);
    }

//    public void storeResultC(String resultC){
//        this.resultC=resultC;
//        results_for_gameA.add(resultC);
//    }


    public ArrayList<String> getLast10ResultA(){
        ArrayList<String> Last10ResultA=new ArrayList<>();
        for (int i=results_for_gameA.size()-1;i>results_for_gameA.size()-11; i--) {
            Last10ResultA.add(results_for_gameA.get(i));
           // System.out.println(results_for_gameA.get(i));
        }
        return Last10ResultA;
    }

    public ArrayList<String> getLast10ResultB(){
        ArrayList<String> Last10ResultB=new ArrayList<>();
        for (int i=results_for_gameB.size()-1;i>results_for_gameB.size()-11; i--) {
            Last10ResultB.add(results_for_gameB.get(i));
           // System.out.println(results_for_gameB.get(i));
        }
        return Last10ResultB;
    }

    public ArrayList<String> getLastResultC(){
        ArrayList<String> Last10ResultC=new ArrayList<>();
        for (int i=results_for_gameC.size()-1;i>results_for_gameA.size()-11; i--) {
            Last10ResultC.add(results_for_gameC.get(i));
            System.out.println(results_for_gameC.get(i));
        }
        return Last10ResultC;
    }

}