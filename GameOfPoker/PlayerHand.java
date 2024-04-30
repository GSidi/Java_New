import java.util.ArrayList;
import java.util.regex.*;
import java.util.Collections;
public class PlayerHand {

    String playerName;
    ArrayList<String> dealtHand = new ArrayList<String>();
    public PlayerHand(String playerName, ArrayList<String> dealtHand){
        this.playerName = playerName;
        this.dealtHand = dealtHand;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<String> getDealtHand() {
        return dealtHand;
    }

    public void setDealtHand(ArrayList<String> dealtHand) {
        this.dealtHand = dealtHand;
    }

    public String handStrength (ArrayList<String> playersHand){
        String pairCheck;
        String threeOfaKindCheck;
        String straightCheck;
        String flushCheck;
        String fullHouseCheck;
        String fourOfaKingCheck;
        String straightFlushCheck;

        flushCheck = this.flushCheck(playersHand);
        straightCheck = this.straightCheck(playersHand);

        return String.format("%s%n%s%n", flushCheck, straightCheck);
    }

    private String flushCheck(ArrayList<String> playersHand){

        String flushCheck = "No Flush";
        int heartCount = 0;
        int diamondCount = 0;
        int spadeCount = 0;
        int clubCount = 0;
        String findCardColour = "";

        for (String card : playersHand){

            if (card.substring(4,5).equals(" ")){
                findCardColour = card.substring(5,card.length());
            }else{
                findCardColour = card.substring(6,card.length());
            }

            switch (findCardColour){
                case "Hearts":
                    heartCount++;
                    break;
                case "Diamonds":
                    diamondCount++;
                    break;
                case "Spades":
                    spadeCount++;
                    break;
                case "Clubs":
                    clubCount++;
                    break;
            }
        }

        if (heartCount == 5){
            flushCheck = "Hearts Flush";
        }else if (diamondCount == 5){
            flushCheck = "Diamonds Flush";
        }else if (spadeCount  == 5 ){
            flushCheck = "Spades Flush";
        }else if (clubCount == 5){
            flushCheck = "Clubs Flush";
        }

        return flushCheck;
    }

    private String straightCheck(ArrayList<String> playersHand){

        int straightCount = 0;
        String cardNumber;
        int cardValue = 0;
        String straightCheck = "No straight";
        ArrayList<Integer> cardValuesList = new ArrayList<Integer>();

        for (String card : playersHand){

          cardNumber = card.substring(0,2);
            if (cardNumber.substring(1,2).equals(" ")){
                cardNumber = cardNumber.substring(0,1);
            }
          switch (cardNumber){
              case "J":
                  cardValue = 11;
                  break;
              case "Q":
                  cardValue = 12;
                  break;
              case "K":
                  cardValue = 13;
                  break;
              case "A":
                      cardValue = 14;
                      break;
              default:
                      cardValue = Integer.parseInt(cardNumber.substring(0,1));
          }

            cardValuesList.add(cardValue);

        }

        cardValuesList.sort(Collections.reverseOrder());
        ArrayList<Integer> cardValuesListSorted = new ArrayList<>(cardValuesList);

        int benchmark = cardValuesListSorted.get(0);

        for(int i = 1; i<cardValuesListSorted.size(); i++){
            if ((benchmark - cardValuesListSorted.get(i)) == 1){
                benchmark = cardValuesListSorted.get(i);
                straightCount +=1 ;
            }
        }

        if (straightCount == 5){
            straightCheck = "You got a strait from :"+cardValuesListSorted.get(0)+"-"+cardValuesListSorted.get(cardValuesListSorted.size());
        }

        return straightCheck;
    }
}
