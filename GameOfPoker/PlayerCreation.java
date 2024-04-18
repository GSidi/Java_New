public class PlayerCreation {

    String playerName;
    String playerSurname;
    String playerNickname;
    double playersMoney;
    public PlayerCreation(String playerName, String playerSurname, String playerNickname, double playersMoney){
        this.playerName = playerName;
        this.playerSurname = playerSurname;
        this.playerNickname = playerNickname;
        this.playersMoney = playersMoney;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

    public String getPlayerNickname() {
        return playerNickname;
    }

    public void setPlayerNickname(String playerNickname) {
        this.playerNickname = playerNickname;
    }

    public double getPlayersMoney() {
        return playersMoney;
    }

    public void setPlayersMoney(double playersMoney) {
        this.playersMoney = playersMoney;
    }
}
