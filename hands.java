import java.util.ArrayList;

/**
 * this class compares cards to determine best hands
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hands

{
    /**
     * method test for two pairs
     */
    public static boolean royalFlushTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        ArrayList<Card> index = new ArrayList<Card>();
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);
        
        
        for(int i=0; i<allCards.size(); i++){
            for(int n=i+1; n<allCards.size(); n++){
                if(allCards.get(n).getNum() == allCards.get(i).getNum()+1){
                    for(int j=n+1; j<allCards.size(); j++){
                        if(allCards.get(j).getNum() == allCards.get(n).getNum()+1){
                            for(int k=j+1; k<allCards.size(); k++){
                                if(allCards.get(k).getNum() == allCards.get(j).getNum()+1){
                                    for(int l=k+1; l<allCards.size(); l++){
                                        if(allCards.get(l).getNum() == allCards.get(k).getNum()+1){
                                            index.add(allCards.get(i));
                                            index.add(allCards.get(n));
                                            index.add(allCards.get(j));
                                            index.add(allCards.get(k));
                                            index.add(allCards.get(l));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }       
                }
            }
        }

        int count = 0;
        if(index.size() == 5){
            for(int i=0; i<index.size()-1; i++){
                if(index.get(i).getSuit() == index.get(i+1).getSuit()){
                    count = count+1;
                    
                }
            }
        }

        if(count == 5 && index.get(4).getRank() == Card.Rank.ACE){
            ans = true;
        }
        
        return ans;
    }

    /**
     * method test for two pairs
     */
    public static boolean straightFlushTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        
        ArrayList<Card> index = new ArrayList<Card>();
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);
        
        
        
        //checks if cards are the same suit
        for(int i=0; i<allCards.size(); i++){
            for(int n=i+1; n<allCards.size(); n++){
                if(allCards.get(n).getSuit() == allCards.get(i).getSuit()){
                    for(int j=n+1; j<allCards.size(); j++){
                        if(allCards.get(j).getSuit() == allCards.get(n).getSuit() && allCards.get(j).getSuit() == allCards.get(i).getSuit()){
                            for(int k=j+1; k<allCards.size(); k++){
                                if(allCards.get(k).getSuit() == allCards.get(j).getSuit() && allCards.get(k).getSuit()==allCards.get(n).getSuit() && allCards.get(k).getSuit()==  allCards.get(i).getSuit()){
                                    for(int l=k+1; l<allCards.size(); l++){
                                        if(allCards.get(l).getSuit() == allCards.get(k).getSuit() && allCards.get(l).getSuit()==allCards.get(j).getSuit()&& allCards.get(l).getSuit() == allCards.get(n).getSuit() && allCards.get(l).getSuit() == allCards.get(i).getSuit()){
                                            index.add(allCards.get(i));
                                            index.add(allCards.get(n));
                                            index.add(allCards.get(j));
                                            index.add(allCards.get(k));
                                            index.add(allCards.get(l));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }       
                }
            }
        }

        if(index.size() == 5 && ((index.get(1).getNum() == index.get(0).getNum()+1) && (index.get(2).getNum() == index.get(1).getNum()+1) && (index.get(3).getNum() == index.get(2).getNum()+1) && (index.get(4).getNum() == index.get(3).getNum()+1) && (index.get(5).getNum() == index.get(4).getNum()+1))){
            ans = true;
        }

        return ans;
    }

    /**
     * method test for four of a kind
     */
    public static boolean fourOfAKindTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);
        

        for(int i=0; i<allCards.size(); i++){
            int I = allCards.get(i).getNum();
            for(int n=i+1; n<allCards.size(); n++){
                int N = allCards.get(n).getNum();
                if(allCards.get(i).getNum() == allCards.get(n).getNum()){
                    for(int j=n+1; j<allCards.size(); j++){
                        int J = allCards.get(j).getNum();
                        if(allCards.get(n).getNum() == allCards.get(j).getNum() && allCards.get(j).getNum()==allCards.get(i).getNum()){
                            for(int k=j+1; k<allCards.size(); k++){
                                int K = allCards.get(k).getNum();
                                if(allCards.get(j).getNum() == allCards.get(k).getNum() && allCards.get(k).getNum() == allCards.get(n).getNum() && allCards.get(k).getNum() == allCards.get(i).getNum()){
                                    ans = true;
                                    break;
                                }
                            }
                        }
                    }
                }       
            }
        }

        return ans;
    }

    /**
     * method test for two pairs
     */
    public static boolean fullHouseTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        ArrayList<Card> index = new ArrayList<Card>();
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);

        for(int i=0; i<allCards.size(); i++){
            for(int n=i+1; n<allCards.size(); n++){
                if(allCards.get(i).getNum() == allCards.get(n).getNum()){
                    index.add(allCards.get(i));
                    index.add(allCards.get(n));
                    break;
                }
            }
        }

        for(int i=0; i<allCards.size(); i++){
            for(int n=i+1; n<allCards.size(); n++){
                if(allCards.get(i).getNum() == allCards.get(n).getNum()){
                    for(int j=n+1; n<hand.size(); j++){
                        if(allCards.get(i).getNum() == allCards.get(j).getNum() && allCards.get(j).getNum() == allCards.get(n).getNum()){
                            index.add(allCards.get(i));
                            index.add(allCards.get(n));
                            index.add(allCards.get(j));
                            break;
                        }
                    }
                }       
            }
        }

        if(index.size() == 5 && index.get(0) != index.get(2)){
            ans = true;
        }

        return ans;
    }

    /**
     * method test for two pairs
     */
    public static boolean flushTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);

        for(int i=0; i<allCards.size(); i++){
            for(int n=i+1; n<allCards.size(); n++){
                if(allCards.get(n).getSuit() == allCards.get(i).getSuit()){
                    for(int j=n+1; j<allCards.size(); j++){
                        if(allCards.get(j).getSuit() == allCards.get(n).getSuit()){
                            for(int k=j+1; k<allCards.size(); k++){
                                if(allCards.get(k).getSuit() == allCards.get(j).getSuit()){
                                    for(int l=k+1; l<allCards.size(); l++){
                                        if(allCards.get(l).getSuit() == allCards.get(k).getSuit()){
                                            ans = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }       
                }
            }
        }

        return ans;
    }

    /**
     * method test for a straight
     */
    public static boolean straightTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);

        for(int i=0; i<allCards.size()-4; i++){
            for(int n=i+1; n<allCards.size()-3; n++){
                if(allCards.get(n).getNum() == allCards.get(i).getNum()+1){
                    for(int j=n+1; j<allCards.size()-2; j++){
                        if(allCards.get(j).getNum() == allCards.get(n).getNum()+1){
                            for(int k=j+1; k<allCards.size()-1; k++){
                                if(allCards.get(k).getNum() == allCards.get(j).getNum()+1){
                                    for(int l=k+1; l<allCards.size(); l++){
                                        if(allCards.get(l).getNum() == allCards.get(k).getNum()+1){
                                            ans = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }       
                }
            }
        }

        return ans;
    }

    /**
     * method test for two pairs
     */
    public static boolean threeOfAKindTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);

        for(int i=0; i<allCards.size()-2; i++){
            for(int n=i+1; n<allCards.size()-1; n++){
                if(allCards.get(i).getNum() == allCards.get(n).getNum()){
                    for(int j=n+1; j<allCards.size(); j++){
                        if(allCards.get(i).getNum() == allCards.get(j).getNum()){
                            ans = true;
                            break;
                        }
                    }
                }       
            }
        }

        return ans;
    }

    /**
     * method test for pairs
     */
    public static boolean twoPairTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);
        int count = 0;
        int previousNum = 0;

        for(int w=0; w<2; w++){
            for(int i=0; i<allCards.size(); i++){
                for(int n=i+1; n<allCards.size(); n++){
                    if(allCards.get(i).getNum() == allCards.get(n).getNum() && previousNum == 0){
                        count = count + 1;
                        previousNum = allCards.get(i).getNum();
                    }else if(allCards.get(i).getNum() == allCards.get(n).getNum() && allCards.get(i).getNum() != previousNum){
                        count = count + 1;
                        break;
                    }
                }
            }
        }

        if(count == 2){
            ans = true;
        }

        return ans;
    }

    /**
     * method test for pairs
     */
    public static boolean pairTest(ArrayList<Card> table, ArrayList<Card> hand)
    {
        boolean ans = false;
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(table);
        allCards.addAll(hand);

        for(int i=0; i<allCards.size(); i++){
            for(int n=i+1; n<allCards.size(); n++){
                if(allCards.get(i).getNum() == allCards.get(n).getNum()){
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }

}

