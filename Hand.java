//*******************************************************************
// This program aims to show cards in the hand of the user.
// Student Name: Akzhan ABYLKASSYM
// SID: 19201001
//*******************************************************************
public class Hand {
    private Card [] Card;

    public Hand(){
        this.Card = new Card[0];
    }

    public int getCardCount() {
        return this.Card.length;
    }

    public void addCard(Card hand){
        Card [] newHand = new Card[getCardCount()+1];
        for(int i=0;i<getCardCount();i++){
            newHand[i] = Card[i];
        }
        newHand[Card.length] = hand;
        Card = newHand;
    }

    public Card getCard(int count) {
        return Card[count];
    }

    public void removeCard(int num) {
        Card [] anotherArray = new Card[getCardCount() - 1];
        for(int i=0, k=0;i< getCardCount();i++) {
            if (i == num) {
               continue;
            }
            anotherArray[k++] = Card[i];
        }
        Card = anotherArray;
    }

    public void removeCard(Card c) {
        Card [] anotherArray = new Card[getCardCount() - 1];
        for (int i = 0, k = 0; i < getCardCount(); i++) {
           if (Card[i].equals(c)) {
                continue;
            }
            anotherArray[k++] = Card[i];
        }
        Card = anotherArray;
    }

   public String toString(){
       String str = "";
       int i=0;
       while(i<getCardCount()) {
           str = str + "[" + i + "] " + Card[i]+"\n";
           i++;
       }
       return str;
   }

   public static void main(String [] args){
        Hand myHand = new Hand();
        Card c1 = new Card(0, 1);
        Card c2 = new Card(1, 5);
        Card c3 = new Card(2, 11);
        Card c4 = new Card(3, 13);
        System.out.println("No. of Cards: " + myHand.getCardCount());
        System.out.println(myHand);
        myHand.addCard(c1);
        System.out.println("No. of Cards: " + myHand.getCardCount());
        System.out.println(myHand);
        myHand.addCard(c2);
        System.out.println("No. of Cards: " + myHand.getCardCount());
        System.out.println(myHand);
        myHand.addCard(c3);
        System.out.println("No. of Cards: " + myHand.getCardCount());
        System.out.println(myHand);
        myHand.addCard(c4);
        System.out.println("No. of Cards: " + myHand.getCardCount());
        System.out.println(myHand);
        System.out.println(myHand.getCard(2));
        System.out.println("No. of Cards: " + myHand.getCardCount());
        System.out.println(myHand); //remove cards
        myHand.removeCard(2);
        System.out.println("No. of Cards: " + myHand.getCardCount());
        System.out.println(myHand);
        myHand.removeCard(new Card(1, 5));
        System.out.println("No. of Cards: " + myHand.getCardCount());
        System.out.println(myHand);
   }
}
