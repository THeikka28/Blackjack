public class Basic_Game_app {
public Card[] deck;
public Player me;
public Dealer john;

    static void main() {
        Basic_Game_app game = new Basic_Game_app();
    }
    public Basic_Game_app()
    {
        deck = new Card[52];
        for(int x = 0; x< deck.length; x++)
        {
            deck[x] = new Card();
        }
    }
    public void Round()
    {

    }
    public void Shuffle()
    {

    }
    public void Compare()
    {

    }
}
