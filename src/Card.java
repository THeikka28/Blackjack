import javax.management.ValueExp;

public class Card {
    public String Suit;
    public int Value;
    public String Name;
    public Card(String pSuit, int pValue, String pName)
    {
        Name = pName;
        Suit = pSuit;
        Value = pValue;
    }
}
