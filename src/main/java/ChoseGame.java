public class ChoseGame {

    private final String game;
    private int[] numbers = new int[5];

    ChoseGame(String game)
    {
        this.game=game;

        if (game.equals("a")||game.equals("A")){
            // call Game A
        }
        if (game.equals("b")||game.equals("B")){
            //call game b
        }

    }
    ChoseGame(String game, int[] numbers){

        this.game = game;
        this.numbers=numbers;

        //call game c
    }
}
