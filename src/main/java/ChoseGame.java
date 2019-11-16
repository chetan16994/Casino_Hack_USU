public class ChoseGame {

    private final String game;
    private int[] numbers = new int[5];
    int bet_amount;

    ChoseGame(String game)
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
    ChoseGame(String game, int[] numbers){

        this.game = game;
        this.numbers=numbers;

        //call game c
    }
}
