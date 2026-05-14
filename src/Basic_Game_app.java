public class Basic_Game_app {
public Card[] deck;
public Player me;
public Dealer john;

    static void main() {
        Basic_Game_app game = new Basic_Game_app();
    }
    public Basic_Game_app()
    {
        deck = new Card[53];
        for(int x = 0; x<13; x++)
        {
            deck[x] = new Card("Spades", x, x);
            deck[x].Printinfo();

        }
        System.out.println();

        for(int x = 13; x<26; x++)
        {
            deck[x] = new Card("Clubs", x-13, x-13);
            deck[x].Printinfo();

        }
        System.out.println();

        for(int x = 26; x<39; x++)
        {
            deck[x] = new Card("Hearts", x-26, x-26);
            deck[x].Printinfo();
        }
        System.out.println();

        for(int x = 39; x<53; x++)
        {
            deck[x] = new Card("Diamonds", x-39, x-39);
            deck[x].Printinfo();

        }
        System.out.println();

        deck[0].Printinfo();
        deck[13].Printinfo();
        deck[26].Printinfo();
        deck[39].Printinfo();

        Shuffle();
        deck[1].Printinfo();

    }
    public void Round()
    {

    }
    public void Shuffle()
    {
        for(int x = 0; x<deck.length;x++)
        {
            int randomIndex = (int) (Math.random()*52);
            Card helper = deck[randomIndex];
            deck[randomIndex]=deck[x];
            deck[x] = helper;
        }
    }
    public void Compare()
    {

    }
}
