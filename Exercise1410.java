public class Exercise1410
{
  public static void main(String[] args)
  {
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] deck = new String[suit.length * rank.length];
    int n = Integer.parseInt(args[0]);
    // Making the card deck
    for (int i = 0; i < suit.length; i++)
    {
      for (int j = 0; j < rank.length; j++)
      {
          deck[rank.length * i + j]= rank[j] + " of " + suit[i];
      }
    }

    // Shuffle the deck
    int numberOfCards = deck.length;
    for (int i = 0; i < numberOfCards; i++)
    {
      int r = i + (int)(Math.random()*(numberOfCards-i));
      String t = deck[i];
      deck[i] = deck[r];
      deck[r] = t;
    }

    // Taking five cards from the deck for n hands
    for(int i= 0; i< n; i++)
    {
      String card1 = deck[(i * 5) + 0];
      String card2 = deck[(i * 5) + 1]; 
      String card3 = deck[(i * 5) + 2];
      String card4 = deck[(i * 5) + 3];
      String card5 = deck[(i * 5) + 4];
      System.out.println("The 5 cards given are: " + card1 + ", " + card2 + ", " + card3 + ", " + card4 + ", " + card5);
    }
    
    // System.out.println(java.util.Arrays.toString(suit));
    // System.out.println(java.util.Arrays.toString(rank)); 
    // System.out.println(java.util.Arrays.toString(deck)); 
    

  }
}