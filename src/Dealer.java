public class Dealer {
    public int Cardtotal;
    public boolean isOver15;
    public Card[] hand;
    public Dealer()
    {
        Cardtotal = 0;
        isOver15 = false;
        hand = new Card[2];
    }
    public void hit(){}
    public void stay(){}
    public void Calculatetotal()
    {
        Cardtotal = 0;
        for(int s = 0; s< hand.length; s++)
        {
            Cardtotal = Cardtotal + hand[s].Value;
        }
    }
    public void printinfo()
    {
        System.out.println("Im the dealer. My name is Johnny Long Bottoms.");
        for(int s = 0; s< hand.length; s++)
        {
            hand[s].Printinfo();
        }

    }
}
