import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class DeckV2 {
    private static List<Card> cards = new ArrayList<>();
    public DeckV2(){
        for(int i=0,k=0;i<4;i++){
            for(int j=0;j<13;j++){
                cards.set(k,new Card(i,j));
            }
        }
    }

    private void swapCard(int ind1, int ind2){
        Card saveVariable = cards.get(ind1);
        cards.set(ind1, cards.get(ind2));
        cards.set(ind2,saveVariable);
    }

    public void shuffle(){
        Random random = new Random(100);
        for(int i=0;i<cards.size();i++){
            swapCard(random.nextInt(cards.size()), random.nextInt(cards.size()));
        }
    }

    public static Card dealCard(){
        List<Card> updatedDeck = new ArrayList<>();
        if(cards.size()>0){
            for(int i =1; i< cards.size();i++){
                updatedDeck.set(i-1,cards.get(i));
            }
            cards = updatedDeck;
            return cards.get(0);
        }
        return null;
    }

    public static int getCardCount(){
        return cards.size();
    }

    public String toString(){
        String str = "";
        int i=0;
        while(i<cards.size()) {
            str = str + "[" + i + "] " + cards.get(i)+"\n";
            i++;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println("Unshuffled deck:");
        Deck d = new Deck();
        System.out.print(d);
        System.out.println();
        System.out.println("After 1st shuffle:");
        d.shuffle(); System.out.print(d);
        System.out.println();
        System.out.println("After 2nd shuffle:");
        d.shuffle(); System.out.print(d);
        System.out.println();
        System.out.println("Deal Card 1:");
        System.out.println(d.dealCard());
        System.out.println("No. of cards in deck: " + d.getCardCount());
        System.out.println("Deal Card 2:");
        System.out.println(d.dealCard());
        System.out.println("No. of cards in deck: " + d.getCardCount());
    }
}
