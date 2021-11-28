import java.util.Scanner;
public class CardGuessingGame extends Deck{
    public static void main(String [] args) {
        boolean rightGuess = true;
        Scanner in = new Scanner(System.in);
        System.out.println("A new deck of 52 cards.");
        System.out.println("A deck is shuffled...");
        Deck d = new Deck();
        while (rightGuess || d.getCardCount() == 0) {
            d.shuffle();
            System.out.println("---------------------------------------");
            Card currentCard = dealCard();
            System.out.println("Current card: " + currentCard);
            System.out.println("Will be the next card be larger(L) or smaller(S)? ");
            String guess = in.next();
            Card newCard = dealCard();
            System.out.println("The next card is " + newCard);
            if (newCard.compareTo(currentCard) > 0) {
                System.out.println("The card is larger than the previous card. ");
                if (guess.toUpperCase().equals("L")) {
                    System.out.println("Your guess is correct. ");

                } else if (guess.toUpperCase().equals("S")) {
                    System.out.println("Your guess is incorrect. ");
                    System.out.println("Bye~ ");
                    rightGuess = false;
                } else {
                    System.out.println("Sorry. I didn't get your answer... ERROR404... TRY AGAIN...");
                    System.out.println("Bye~ ");
                    rightGuess = false;
                }
            } else if (newCard.compareTo(currentCard) < 0) {
                System.out.println("The card is smaller than the previous card. ");
                if (guess.toUpperCase().equals("L")) {
                    System.out.println("Your guess is incorrect. ");
                    System.out.println("Bye~ ");
                    rightGuess = false;
                } else if (guess.toUpperCase().equals("S")) {
                    System.out.println("Your guess is correct. ");

                } else {
                    System.out.println("Sorry. I didn't get your answer... ERROR404... TRY AGAIN...");
                    System.out.println("Bye~ ");
                    rightGuess = false;
                }
            }
        }
    }
}
