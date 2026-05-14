import java.sql.SQLOutput;
import java.util.Scanner;

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
        Shuffle();
        me = new Player();
        john = new Dealer();
        // give the cards to the dealer/player
        me.hand[0] = deck[0];
        me.hand[1] = deck[1];
        john.hand[0] = deck[2];
        john.hand[1] = deck[3];
       // ask the user questions
        printDeck();
        me.Calculatetotal();
        john.Calculatetotal();
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.nextLine();
        me.name = name;
        me.printinfo();
        john.printinfo();



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
    public void printDeck()
    {
        for(int j=0; j< deck.length; j++)
        {
            deck[j].Printinfo();
        }
    }
}
