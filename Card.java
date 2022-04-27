import java.util.ArrayList;
import java.util.*;

/**
 * This class defines a card object.
 *
 * @author Dr. Zeitz
 * @version CPSC 220
 */
public class Card
{
    public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }
    public enum Rank { JACK, QUEEN, KING, ACE, NUMBER }

    // instance variables
    private Suit suit;
    private int number;
    private String color;
    private Rank rank;

    /**
     * Constructor for cards
     */
    public Card(Suit s, String c, int n, Rank r)
    {
        this.suit = s;
        this.color = c;
        this.number = n;
        this.rank = r;
    }

    public Suit getSuit()
    {
        return this.suit;
    }

    public int getNum()
    {
        return this.number;
    }

    public String getColor()
    {
        return this.color;
    }

    public Rank getRank()
    {
        return this.rank;
    }

    public static void shuffle(ArrayList<Card> list)
    {
        Collections.shuffle(list);
    }

    public static String getInfo(Card c)
    {
        String rank = "";
        if(c.getNum() >= 11){
            rank = c.getRank()+ " ";
        }else{
            rank = c.getNum()+ " ";
        }
        return (c.getColor() + " " + rank + "of " +c.getSuit());
    }

    public static String tellHand(ArrayList<Card> list)
    {
        String rank1 = "";
        String rank2 = "";
        for(int i=0; i<2; i++){
            if(i == 0){
                if(list.get(i).getNum() >= 11){
                    rank1 = list.get(i).getRank()+ " ";
                }else{
                    rank1 = list.get(i).getNum()+ " ";
                }
            }else{
                if(list.get(i).getNum() >= 11){
                    rank2 = list.get(i).getRank()+ " ";
                }else{
                    rank2 = list.get(i).getNum()+ " ";
                }
            }
        }

        return ("You have a " + list.get(0).getColor() + " " + rank1 + "of " + list.get(0).getSuit()+ " and a "  + list.get(1).getColor() + " " + rank2 + "of " + list.get(1).getSuit());
    }

    public static void addCardsToDeck(ArrayList<Card> list)
    {
        //creating clubs cards to put in a deck
        for(int n=2; n<11; n++){
            Card numCard = new Card(Suit.CLUBS, "BLACK", n, Rank.NUMBER);
            list.add(numCard);
        }
        Card BCJ = new Card(Suit.CLUBS, "BLACK", 11, Card.Rank.JACK);
        list.add(BCJ);
        Card BCQ = new Card(Suit.CLUBS, "BLACK",12, Card.Rank.QUEEN);
        list.add(BCQ);
        Card BCK = new Card(Suit.CLUBS, "BLACK",13, Card.Rank.KING);
        list.add(BCK);
        Card BCA = new Card(Suit.CLUBS, "BLACK",14 , Card.Rank.ACE);
        list.add(BCA);
        //creating diamond cards to put in a deck
        for(int n=2; n<11; n++){
            Card numCard = new Card(Suit.DIAMONDS, "RED", n, Rank.NUMBER);
            list.add(numCard);
        }
        Card RDJ = new Card(Suit.DIAMONDS, "RED", 11, Card.Rank.JACK);
        list.add(RDJ);
        Card RDQ = new Card(Suit.DIAMONDS, "RED", 12, Card.Rank.QUEEN);
        list.add(RDQ);
        Card RDK = new Card(Suit.DIAMONDS, "RED", 13, Card.Rank.KING);
        list.add(RDK);
        Card RDA = new Card(Suit.DIAMONDS, "RED", 14, Card.Rank.ACE);
        list.add(RDA);
        //creating hearts cards for the deck

        for(int n=2; n<11; n++){
            Card numCard = new Card(Suit.HEARTS, "RED", n, Rank.NUMBER);
            list.add(numCard);
        }
        Card RHJ = new Card(Suit.HEARTS, "RED", 11, Card.Rank.JACK);
        list.add(RHJ);
        Card RHQ = new Card(Suit.HEARTS, "RED", 12, Card.Rank.QUEEN);
        list.add(RHQ);
        Card RHK = new Card(Suit.HEARTS, "RED", 13, Card.Rank.KING);
        list.add(RHK);
        Card RHA = new Card(Suit.HEARTS, "RED", 14, Card.Rank.ACE);
        list.add(RHA);
        //creating spade cards for the deck
        for(int n=2; n<11; n++){
            Card numCard = new Card(Suit.SPADES, "BLACK", n, Rank.NUMBER);
            list.add(numCard);
        }
        Card BSJ = new Card(Suit.SPADES, "BLACK", 11, Card.Rank.JACK);
        list.add(BSJ);
        Card BSQ = new Card(Suit.SPADES, "BLACK", 12, Card.Rank.QUEEN);
        list.add(BSQ);
        Card BSK = new Card(Suit.SPADES, "BLACK", 13, Card.Rank.KING);
        list.add(BSK);
        Card BSA = new Card(Suit.SPADES, "BLACK", 14, Card.Rank.ACE);
        list.add(BSA);

    }
}
