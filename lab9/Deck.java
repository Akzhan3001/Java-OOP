import java.util.Random;

public class Deck {
    private  static Card [] cards;
    public Deck(){
        this.cards = new Card[52];
        for(int i=0,k=0;i<4;i++){
            for(int j=0;j<13;j++){
                cards[k++] = new Card(i,j);
            }
        }
    }
    private void swapCard(int ind1, int ind2){
        Card saveVariable = cards[ind1];
        cards[ind1] = cards[ind2];
        cards[ind2] = saveVariable;
    }

    public void shuffle(){
        Random random = new Random(100);
        for(int i=0;i<cards.length;i++){
            swapCard(random.nextInt(cards.length), random.nextInt(cards.length));
        }
    }

    public static Card dealCard(){
        Card [] updatedDeck = new Card [cards.length-1];
        if(cards.length>0){
            for(int i =1; i< cards.length;i++){
                updatedDeck[i-1] = cards[i];
            }
            cards = updatedDeck;
            return cards[0];
        }
        return null;
    }

    public static int getCardCount(){
        return cards.length;
    }

    public String toString(){
        String str = "";
        int i=0;
        while(i<cards.length) {
            str = str + "[" + i + "] " + cards[i]+"\n";
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
        d.shuffle();
        System.out.print(d);
        System.out.println();
        System.out.println("After 2nd shuffle:");
        d.shuffle();
        System.out.print(d);
        System.out.println();
        System.out.println("Deal Card 1:");
        System.out.println(d.dealCard());
        System.out.println("No. of cards in deck: " + d.getCardCount());
        System.out.println("Deal Card 2:");
        System.out.println(d.dealCard());
        System.out.println("No. of cards in deck: " + d.getCardCount());
    }
}
