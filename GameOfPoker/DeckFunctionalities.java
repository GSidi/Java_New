import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class DeckFunctionalities {

    private String deckRequest ;
    private ArrayList<String> shuffledDeck =new ArrayList<String>();
    private ArrayList<String> deckOfCards =new ArrayList<String>();
    public DeckFunctionalities(String deckRequest, ArrayList<String> deckOfCards){
        this.deckOfCards = deckOfCards;
        if (deckRequest.equals("deal")){
            this.deckRequest = "deal";
        }else if (deckRequest.equals("shuffle")){
            this.deckRequest = "shuffle";
        }
    }

    public String getDeckRequest() {
        return deckRequest;
    }

    public void setDeckRequest(String deckRequest) {
        this.deckRequest = deckRequest;
    }

    public ArrayList<String> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(ArrayList<String> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public ArrayList<String> shuffleDeck (ArrayList<String> deckOfCards , String command){

        if (command.equals("shuffle")){
           Collections.shuffle(deckOfCards);
           for (String card : deckOfCards){
               shuffledDeck.add(card);
           }
        }else{
            System.out.println("Error in shuffle deck, check your params");
        }
        return shuffledDeck;
    }

    public ArrayList<ArrayList<String>> dealHand(int numberOfPlayers , ArrayList<String> deckOfCards) {

        ArrayList<String> deckAfterDealing = new ArrayList<>();
        ArrayList<ArrayList<String>> playerHands = new ArrayList<ArrayList<String>>();
        int tempPosition ;

        Random rand = new Random();

        for(int i = 0; i < numberOfPlayers ; i++){
            ArrayList<String> hand = new ArrayList<String>();
            for (int j =0 ;  j < 5 ; j++){
                tempPosition = rand.nextInt(deckOfCards.size());
                hand.add(j,deckOfCards.get(tempPosition));
                deckOfCards.remove(tempPosition);
            }
            playerHands.add(hand);
        }

        deckAfterDealing = deckOfCards;
        this.setDeckOfCards(deckAfterDealing);

        return playerHands;
    }
}
