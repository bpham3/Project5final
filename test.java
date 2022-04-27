import java.util.ArrayList;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String[] args)
    {
        ArrayList<Card> LIST = new ArrayList<Card>();
        Card.addCardsToDeck(LIST);        
        Card B4S = new Card(Card.Suit.SPADES, "BLACK", 4, Card.Rank.NUMBER);
        LIST.add(B4S);        
        Card R4H = new Card(Card.Suit.HEARTS, "RED", 4, Card.Rank.NUMBER);
        LIST.add(R4H);        
        Card B6C = new Card(Card.Suit.CLUBS, "BLACK", 6, Card.Rank.NUMBER);
        LIST.add(B6C);       
        Card RKH = new Card(Card.Suit.HEARTS, "RED", 14, Card.Rank.KING);
        LIST.add(RKH);
        Card B3S = new Card(Card.Suit.SPADES, "BLACK", 3, Card.Rank.NUMBER);
        LIST.add(B3S);
        
        ArrayList<Card> LIST1 = new ArrayList<Card>();
        Card.addCardsToDeck(LIST);
        Card B5C = new Card(Card.Suit.CLUBS, "BLACK", 5, Card.Rank.NUMBER);
        LIST1.add(B5C);
        Card B2C = new Card(Card.Suit.CLUBS, "BLACK", 2, Card.Rank.NUMBER);
        LIST1.add(B2C);
        
        ArrayList<Card> LIST2 = new ArrayList<Card>();
        Card.addCardsToDeck(LIST2);
        Card R6D = new Card(Card.Suit.DIAMONDS, "RED", 6, Card.Rank.NUMBER);
        LIST.add(R6D);
        Card B5S = new Card(Card.Suit.SPADES, "BLACK", 5, Card.Rank.NUMBER);
        LIST.add(B5S);
        
        player2.p2Play(LIST, LIST2, 0);
        
    }
}
