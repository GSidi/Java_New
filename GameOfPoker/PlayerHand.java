import java.util.ArrayList;
import java.util.regex.*;
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

        flushCheck = this.flushColour(playersHand);

        return  null;
    }

    private String flushColour(ArrayList<String> playersHand){

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

}
