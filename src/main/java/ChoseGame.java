import java.util.ArrayList;

public class ChoseGame {

    private  String gameC;
    private String game;
    private int[] numbers = new int[5];
    int bet_amount;
    ArrayList<String> last10ResultA =new ArrayList<>();


    public ChoseGame(String gameC, int[] numbers){

        this.gameC = gameC;
        this.numbers=numbers;

        GameC gC=new GameC();
        bet_amount= gC.placeBet();
        System.out.println("Betting mount is "+bet_amount);


    }

   public ChoseGame(String game)
    {
        this.game=game;

        if (game.equals("a")||game.equals("A")){
            GameA gameA=new GameA();
           bet_amount= gameA.placeBet();
            System.out.println("Betting mount is "+bet_amount);

            gameA.roll();


        }
        if (game.equals("b")||game.equals("B")){
            GameB gameB=new GameB();
            bet_amount= gameB.placeBet();
            gameB.roll();
        }
    }
}
