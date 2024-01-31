package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Sim Yuan Hee Jan 31, 2024
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length - 1; i++) {
            Card card = new Card();
            card.setValue((int) (Math.random() * 12) + 1);
            card.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
            
            hand[i] = card;
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        Card lastcard = new Card();
        hand[6] = lastcard;
        hand[6].setValue(2);
        hand[6].setSuit("Spades");
 
        System.out.println("Please enter card value from 1 to 13. \n11 for jack, 12 for queen etc: ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println("Your guess for value is %s \n".formatted(value));
        
        System.out.println("Please enter suit value.\n1 for Hearts\n2 for Diamonds\n3 for Spades\n4 for Clubs: ");
        int suit = in.nextInt();
        System.out.println("Your guess for the suit is %s \n".formatted(Card.SUITS[suit]));
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
	// If the guess is successful, invoke the printInfo() method below.
	    
        for (int i = 0; i < hand.length; i++) 
        {
            int gottenValue = hand[i].getValue();
            if (gottenValue == value)
            {
                String gottenSuit = hand[i].getSuit();
                if(Card.SUITS[suit - 1].equals(gottenSuit))
                {
                   printInfo();
                   break; 
                }
            }
            else
            {
                System.out.println("No match for the %sth card".formatted(i + 1));
            }
        }    
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Sim Yuan Hee Jan 2024
     * “I’m done!” 
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sim (Actually Yuan Hee should be my first name, but my name order is different.). You can call me Nathan");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Improve my art and animation skills");
        System.out.println("-- Use my programming skill for the greater good");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Animation");
        System.out.println();
        
    
    }

}
