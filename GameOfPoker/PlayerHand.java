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

        return  null;
    }

    private String flushCheck(ArrayList<String> playersHand){

        String flushCheck = "No Flush";
        Boolean matchFound = false;
        int heartCount = 0;
        int diamondCount = 0;
        int spadeCount = 0;
        int clubCount = 0;

        Pattern heartsPattern = Pattern.compile("Hearts");
        Pattern diamondsPattern = Pattern.compile("Diamonds");
        Pattern spadesPattern = Pattern.compile("Spades");
        Pattern clubsPattern = Pattern.compile("Clubs");

        for (String card : playersHand){
            Matcher heartsMatch = heartsPattern.matcher(card);
            matchFound = heartsMatch.find();
            if (matchFound = true){
                heartCount +=1;
            }
            Matcher diamondsMatch = diamondsPattern.matcher(card);
            matchFound = diamondsMatch.find();
            if (matchFound = true){
                diamondCount +=1;
            }
            Matcher spadesMatch = spadesPattern.matcher(card);
            matchFound = spadesMatch.find();
            if (matchFound = true){
                spadeCount +=1;
            }
            Matcher clubsMatch = clubsPattern.matcher(card);
            matchFound = clubsMatch.find();
            if (matchFound = true){
                clubCount +=1;
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

        int straghtCount = 0;
        String cardNumber;
        int cardValue;
        ArrayList<Integer> cardValuesList = new ArrayList<Integer>();

        for (String card : playersHand){

          cardNumber = card.substring(0,2);
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
                  cardValue = Integer.valueOf(cardNumber);
          }

            cardValuesList.add(cardValue);

        }

        cardValuesList.sort(Collections.reverseOrder());
        ArrayList<Integer> cardValuesListSorted = new ArrayList<>(cardValuesList);

        //int benchmark = Integer.parseInt(playersHand.get(0).substring(0,2));

        return null;
    }
}
