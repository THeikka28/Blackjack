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
        for(int x = 0; x< deck.length/4; x++)
        {
            int value;
            if(x<10){
                value = x;
            } else if (x<13) {
                value = 10;
            }
            else
            {value = 11;}
            deck[x] = new Card("Clubs", value , "john");
        }
        for(int x = 14; x< (deck.length/4)+13; x++)
        {
            int value;
            if(x<23){
                value = x;
            } else if (x<26) {
                value = 10;
            }
            else
            {value = 11;}


            deck[x] = new Card("Spade", value, "john");
        }
        for(int x = 27; x< (deck.length/4)+26; x++)
        {
            int value;
            if(x<36){
                value = x;
            } else if (x<39) {
                value = 10;
            }
            else
            {value = 11;}
            deck[x] = new Card("Diamond", value, "john");
        }
        for(int x = 40; x< (deck.length/4)+39; x++)
        {
            int value;
            if(x<49){
                value = x;
            } else if (x<52) {
                value = 10;
            }
            else
            {value = 11;}
            deck[x] = new Card("Heart", value, "john");
        }
        int rand = (int)(Math.random()*52);
        System.out.println(deck[rand].Name);
        System.out.println(deck[rand].Value);
        System.out.println(deck[rand].Suit);
        System.out.println(rand);

        me = new Player();
        john = new Dealer();
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
