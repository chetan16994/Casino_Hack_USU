public class GameB implements Casino{

    int bet_amount;

    @Override
    public int placeBet() {
        PlaceBet pb=new PlaceBet();
        bet_amount = pb.placeBet();
        return bet_amount;
    }

    @Override
    public void roll() {

    }

    @Override
    public void result() {

    }
}
