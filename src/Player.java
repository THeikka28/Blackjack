public class Player {
    public int Cardtotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] hand;
    public String name;
    public Player()
    {
    isBust = false;
    Cardtotal = 0;
    name = "Player";
    isHit = false;
    hand = new Card[2];
    }
    public void hit()
    {

    }
    public void stay()
    {

    }
    public void printinfo()
    {
        System.out.println("Name: " + name + ", Total: " + Cardtotal + ", isBust: " + isBust + ", isHit: " + isHit);
        for(int s = 0; s< hand.length; s++)
        {
            hand[s].Printinfo();
        }

    }
    public void Calculatetotal()
    {
        Cardtotal = 0;
        for(int s = 0; s< hand.length; s++)
        {
            Cardtotal = Cardtotal + hand[s].Value;
        }
    }
}
