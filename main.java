import java.util.ArrayList;
import java.util.Scanner;

/**
 * this will run the actual game of texas holdem poker, due to the complexity of coding the game the flop, turn and river will all be dealt at once and theres only one round of betting
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you to play a round of poker?(yes or no) ");
        String ans = input.next();
        double p1Pot = 200;
        double p2Pot = 200;
        int pot = 0;

        if(ans.equals("yes")){

            //creates deck
            ArrayList<Card> Deck = new ArrayList<Card>(); 
            Card.addCardsToDeck(Deck);
            //creates an array for the community cards
            ArrayList<Card> table = new ArrayList<Card>(); 
            //creates an array for each players hand
            ArrayList<Card> player1Hand = new ArrayList<Card>(); 
            ArrayList<Card> player2Hand = new ArrayList<Card>(); 
            //creates an array for the burn cards
            ArrayList<Card> burn = new ArrayList<Card>(); 

            Card.shuffle(Deck);
            //deals the players hands
            Card R4D = new Card(Card.Suit.DIAMONDS, "RED", 4, Card.Rank.NUMBER);
            Card R3H = new Card(Card.Suit.HEARTS, "RED", 3, Card.Rank.NUMBER);
            Card BAS = new Card(Card.Suit.SPADES, "BLACK", 14, Card.Rank.ACE);
            Card R3D = new Card(Card.Suit.DIAMONDS, "RED", 3, Card.Rank.NUMBER);

            burn.add(Deck.get(0));
            player1Hand.add(Deck.get(1));
            player2Hand.add(Deck.get(2));
            player1Hand.add(Deck.get(3));
            player2Hand.add(Deck.get(4));


            //deals the community cards
            for(int i=5; i<13; i++){
                if(i == 5 || i == 9 || i ==11){
                    burn.add(Deck.get(i));
                }else{
                    table.add(Deck.get(i));
                }
            }

            //ArrayList<Card> table = new ArrayList<Card>();
            //Card.addCardsToDeck(table);        
            //Card B10C = new Card(Card.Suit.CLUBS, "BLACK", 10, Card.Rank.NUMBER);
            //table.add(B10C);        
            //Card BKC = new Card(Card.Suit.HEARTS, "RED", 4, Card.Rank.NUMBER);
            //table.add(BKC);        
            //Card BKS = new Card(Card.Suit.SPADES, "BLACK", 13, Card.Rank.KING);
            //table.add(BKS);       
            //Card B4S = new Card(Card.Suit.SPADES, "BLACK", 4, Card.Rank.NUMBER);
            //table.add(B4S);
            //Card B8C = new Card(Card.Suit.CLUBS, "BLACK", 8, Card.Rank.NUMBER);
            //table.add(B8C);

            // ArrayList<Card> player1Hand = new ArrayList<Card>();
            // Card.addCardsToDeck(player1Hand);
            //Card B5C = new Card(Card.Suit.CLUBS, "BLACK", 5, Card.Rank.NUMBER);
            // player1Hand.add(B5C);
            //Card B2C = new Card(Card.Suit.CLUBS, "BLACK", 2, Card.Rank.NUMBER);
            // player1Hand.add(B2C);

            // ArrayList<Card> player2Hand = new ArrayList<Card>();
            // Card.addCardsToDeck(player2Hand);
            //Card R6D = new Card(Card.Suit.DIAMONDS, "RED", 6, Card.Rank.NUMBER);
            // player2Hand.add(R6D);
            //Card B5S = new Card(Card.Suit.SPADES, "BLACK", 5, Card.Rank.NUMBER);
            // player2Hand.add(B5S);

            System.out.println("You have $" + p1Pot);
            for(int i=0; i<table.size(); i++){
                if(i == 0){
                    System.out.println("On the table there is a \nA " + Card.getInfo(table.get(i)));
                }else {
                    System.out.println("A " + Card.getInfo(table.get(i)));
                }
            }

            System.out.println(Card.tellHand(player1Hand));

            //System.out.println("-2-" + Card.tellHand(player2Hand));

            System.out.println("Would you to bet or fold? ");
            String p1move = input.next();
            int p1Bet = 0;
            double totalPot = 0;
            if(p1move.equals("bet")){
                double p2Bet = player2.p2Play(table, player2Hand, p2Pot);
                p2Pot = p2Pot-p2Bet;
                System.out.println("Player 2 bet: " + p2Bet + " dollars");
                

                
                System.out.println("how much would you like to bet ");
                p1Bet = input.nextInt();
                p1Pot = p1Pot - p1Bet;
                totalPot = p2Bet + p1Bet;
                
                int p1Tester = 10;
                if(hands.royalFlushTest(table, player1Hand)){
                    p1Tester = 1;
                }else if(hands.straightFlushTest(table, player1Hand)){
                    p1Tester = 2;
                }else if(hands.fourOfAKindTest(table, player1Hand)){
                    p1Tester = 3;
                }else if(hands.fullHouseTest(table, player1Hand)){
                    p1Tester = 4;
                }else if(hands.flushTest(table, player1Hand)){
                    p1Tester = 5;
                }else if(hands.straightTest(table,player1Hand)){
                    p1Tester = 6;
                }else if(hands.threeOfAKindTest(table, player1Hand)){
                    p1Tester = 7;
                }else if(hands.twoPairTest(table, player1Hand)){
                    p1Tester = 8;
                }else if(hands.pairTest(table, player1Hand)){
                    p1Tester = 9;
                }else {

                }

                int p2Tester = 10;
                if(hands.royalFlushTest(table, player1Hand)){
                    p2Tester = 1;
                }else if(hands.straightFlushTest(table, player1Hand)){
                    p2Tester = 2;
                }else if(hands.fourOfAKindTest(table, player1Hand)){
                    p2Tester = 3;
                }else if(hands.fullHouseTest(table, player1Hand)){
                    p2Tester = 4;
                }else if(hands.flushTest(table, player1Hand)){
                    p2Tester = 5;
                }else if(hands.straightTest(table,player1Hand)){
                    p2Tester = 6;
                }else if(hands.threeOfAKindTest(table, player1Hand)){
                    p2Tester = 7;
                }else if(hands.twoPairTest(table, player1Hand)){
                    p2Tester = 8;
                }else if(hands.pairTest(table, player1Hand)){
                    p2Tester = 9;
                }else {

                }

                //finds the highest card in the each players hand
                ArrayList<Card> highCards = new ArrayList<Card>();
                for(int i=0; i<player1Hand.size(); i++){
                    if(player1Hand.get(0).getNum()>player1Hand.get(1).getNum()){
                        highCards.add(player1Hand.get(0));
                        break;
                    }else{
                        highCards.add(player1Hand.get(1));
                        break;
                    }
                }
                for(int i=0; i<player2Hand.size(); i++){
                    if(player1Hand.get(0).getNum()>player1Hand.get(1).getNum()){
                        highCards.add(player2Hand.get(0));
                        break;
                    }else{
                        highCards.add(player2Hand.get(1));
                        break;
                    }
                }
                //if(p1tester

                if(p1Tester < p2Tester){
                    p1Pot = p1Pot + totalPot;
                    System.out.println("You won! You now have: " + p1Pot + " dollars!");
                }else if(p2Tester < p1Tester){
                    p2Pot = p2Pot + totalPot;
                    System.out.println("You Lost! player 2 now has: " + p2Pot + " dollars!");
                }else {
                    if(highCards.get(0).getNum()>highCards.get(1).getNum()){
                        p1Pot = p1Pot + totalPot;
                        System.out.println("You won! You now have: " + p1Pot + " dollars!");
                    }else{
                        p2Pot = p2Pot + totalPot;
                        System.out.println("You Lost! player 2 now has: " + p2Pot + " dollars!");
                    
                        
                    }
                }
            }else{
                p2Pot = p2Pot + totalPot;
                System.out.println("You Lost! player 2 now has: " + p2Pot + " dollars!");
            }

        }else if(ans.equals("no")){
            System.out.println("Your loss");
        }
        /*
        ArrayList<Card> Deck = new ArrayList<Card>(); 
        Card.addCardsToDeck(Deck);
        Card.shuffle(Deck);

        for(int i=0; i <Deck.size(); i++){
        Card.getInfo(Deck.get(i));   
        }
         */

    }

}

