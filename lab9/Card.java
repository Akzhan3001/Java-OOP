public class Card {
    private int suit;
    private int rank;
    public Card(int suit, int rank){
        this.suit = suit;
        this.rank=rank;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String setSuit(int suit){
        String [] s = {"Diamonds","Clubs","Hearts","Spades"};
        return s[suit];
    }
    public String setRank(int rank){
        String[] r = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        return r[rank];
    }
    public boolean equals(Card c) {
        return this.suit == c.suit && this.rank == c.rank;
    }

    public String toString() {
        return setRank(rank) + " of " + setSuit(suit);
    }

    public int compareTo(Card obj){
        if(this.getSuit()>obj.getSuit()){
            return 1;
        }
        else if(this.getSuit()<obj.getSuit()){
            return -1;
        }
        else if(this.getSuit()==obj.getSuit() && this.getRank() < obj.getRank()){
            return -1;
        }
        else if(this.getSuit()==obj.getSuit() && this.getRank() > obj.getRank()){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        Card c1 = new Card(0, 1);
        Card c2 = new Card(0, 11);
        Card c3 = new Card(2, 11);
        if(c1.compareTo(c2) < 0 ){ System.out.println(c1 + " is smaller than " + c2); }
        if (c1.compareTo(c2) > 0){ System.out.println(c1 + " is larger than " + c2); }
        else{ System.out.println(c1 + " and " + c2 + " are equal"); }
        if(c3.compareTo(c2) < 0 ){ System.out.println(c3 + " is smaller than " + c2); }
        else if (c3.compareTo(c2) > 0){ System.out.println(c3 + " is larger than " + c2); }
        else{ System.out.println(c3 + " and " + c2 + " are equal");
        }
    }

    /*public static void main(String [] args){
        Card c1 = new Card(0,1);
        Card c2 = new Card(0,1);
        Card c3 = new Card(1, 1);
        Card c4 = new Card(1,2);

        System.out.println(c1);
        System.out.println(c2);
        if(c1.equals(c2)){
            System.out.println("They are equal!");
        }
        else{
            System.out.println("They are not equal!");
        }
        System.out.println();
        System.out.println(c1);
        System.out.println(c3);
        if(c1.equals(c3)){
            System.out.println("They are equal!");
        }
        else{
            System.out.println("They are not equal!");
        }
        System.out.println();
        System.out.println(c3);
        System.out.println(c4);
        if(c3.equals(c4)){
            System.out.println("They are equal!");
        }
        else{
            System.out.println("They are not equal!");
        }
        System.out.println();
    }*/
}

