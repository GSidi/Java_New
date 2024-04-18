import java.util.ArrayList;
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
}
