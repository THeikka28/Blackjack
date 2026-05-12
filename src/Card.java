import javax.management.ValueExp;

public class Card {
    public String Suit;
    public int Value;
    public String Name;
    public Card(String pSuit, int pValue,  int pName)
    {
        //Name = pName;
        if(pName == 0)
        {
            Name = "Ace";
            Value = 11;
        }
        if(pName == 10)
        {
            Name = "Jack";
            Value = 10;
        }
        if(pName == 11)
        {
            Name = "Queen";
            Value = 10;

        }
        if(pName == 12)
        {
            Name = "King";
            Value = 10;

        }

        if(pName >0&& pName <10)
        { int num = pName+1;
            Name = ""+num;
        Value = num;}



        Suit = pSuit;
    }
    public void Printinfo()
    {
        System.out.println("The name of the card is the " + Name + " of "  + Suit + ". It has a value of " + Value + ".");

    }
}
