public class Player {
    public int Cardtotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] hand;
    public String name;
    public Player()
    {
    isBust = false;
    name = "Player";
    isHit = true;
    hand = new Card[2];

    }
    public void hit()
    {

    }
    public void stay()
    {

    }
}
