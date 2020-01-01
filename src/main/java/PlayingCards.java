public class PlayingCards {

    public static void main(String[] arg){

     //   cards();
    //    decks();;

    //}

    //public static void cards(){
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        int i = (int) (Math.random()*RANKS.length);
        int j = (int)(Math.random()*SUITS.length);

        System.out.println(RANKS[i]+ " of " +SUITS[j]);
    //}

    //public static void decks(){
    /*    String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

     */
        int n = RANKS.length*SUITS.length;
        String[] deck = new  String[n];
        for (i = 0;  i < RANKS.length; i++) {
            for (j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];

                //System.out.println(RANKS[i] + " of " + SUITS[j]);
                //System.out.println(deck[i]);
            }

            // Shuffle cards
            int nn = deck.length;
            for (i = 0; i < deck.length; i++) {
                int r = i + (int)(Math.random()*nn-1);
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }

            // Print Shuffle
            for(i = 0; i< n; i++)
            System.out.println(deck[i]);
        }
    }
}
