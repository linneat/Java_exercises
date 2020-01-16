public class Exercise2120
{
  public static String[] deckCombined(String[] suit, String[] rank){
    String[] deck = new String[suit.length * rank.length];
    
    for (int i = 0; i < suit.length; i++)
    {
      for (int j = 0; j < rank.length; j++)
      {
        deck[rank.length * i + j] = rank[j] + " of " + suit[i];
      }
    }
    return deck;
  }

  public static void deckShuffle(String[] cardDeck){
    int numberOfCards = cardDeck.length;
    
    for (int i = 0; i < numberOfCards; i++)
    {
      int r = i + (int)(Math.random() * (numberOfCards - i));
      String t = cardDeck[i];
      cardDeck[i] = cardDeck[r];
      cardDeck[r] = t;
    }
  }

  public static String[][] deckOfFiveCards(String[] cardShuffle, int n){
   String[][] hands = new String[n][5];

    for(int i= 0; i< n; i++)
    {
      String card1 = cardShuffle[(i * 5) + 0];
      String card2 = cardShuffle[(i * 5) + 1]; 
      String card3 = cardShuffle[(i * 5) + 2];
      String card4 = cardShuffle[(i * 5) + 3];
      String card5 = cardShuffle[(i * 5) + 4];
      String[] arrayOfFiveCards = {card1, card2, card3, card4, card5};
      hands[i] = arrayOfFiveCards;
    }
    return hands;
  }

  public static void main(String[] args)
  {
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    int n = 3;
    //calling method for making the deck:
    String[] cardDeck = deckCombined(suit, rank);
    //calling method to shuffle the deck:
    deckShuffle(cardDeck);
    String[] cardShuffle = cardDeck;
 
    //calling method for taking five cards from the deck of n hands
    String[][] fiveCardsPrHand = deckOfFiveCards(cardShuffle, n);
    System.out.println(java.util.Arrays.deepToString(fiveCardsPrHand));


  }
}