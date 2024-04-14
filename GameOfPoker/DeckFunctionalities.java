import java.util.ArrayList;
import java.util.Collections;

public class DeckFunctionalities {

    String deckRequest ;
    ArrayList<String> shuffledDeck =new ArrayList<String>();
    public DeckFunctionalities(String deckRequest){
        this.deckRequest = deckRequest;
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
}
