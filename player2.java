import java.util.ArrayList;

/**
 * Write a description of class player2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class player2
{
    
    public static double p2Play(ArrayList<Card> table, ArrayList<Card> hand, double pot){
        double ans = 0;
        
        if(hands.royalFlushTest(table, hand)){
            ans = pot * .20;
        }else if(hands.straightFlushTest(table, hand)){
            ans = pot * .15;
        }else if(hands.fourOfAKindTest(table, hand)){
            ans = pot * .13;
        }else if(hands.fullHouseTest(table, hand) || (hands.flushTest(table, hand) || hands.straightTest(table,hand))){
            ans = pot * .12;
        }else if(hands.threeOfAKindTest(table, hand)){
            ans = pot *.09;
        }else if(hands.twoPairTest(table, hand)){
            ans = pot * .07;
        }else if(hands.pairTest(table, hand)){
            ans = pot * .05;
        }else {
            ans = 2;
        }
        
        
        
        return ans;
    }
    
    
}
