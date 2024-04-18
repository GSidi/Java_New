import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class GameOfPokeMain {

    public static void main(String[] args) {

        String playersName;
        String playersSurname;
        String playersNickname;
        double playersMoney = 0;
        String  totalPlayers;
        int totalPlayersForLoop = 0;
        ArrayList<ArrayList<String>> tableOfPlayers = new ArrayList<>() ;

        totalPlayers = JOptionPane.showInputDialog("Give total players for the poker game");

        try {
            totalPlayersForLoop = Integer.parseInt(totalPlayers);
        } catch (NumberFormatException e){
            System.out.printf("%s , meaning you inserted a string not a number",e.toString());
        }

        for (int i = 0; i< totalPlayersForLoop ; i++){
            playersName = JOptionPane.showInputDialog("Give players d name");
            playersSurname = JOptionPane.showInputDialog("Give players surname");
            playersNickname = JOptionPane.showInputDialog("Give players nickname");

            try{
                playersMoney = Double.parseDouble(JOptionPane.showInputDialog("Give players money"));
            }catch (NumberFormatException e){
                System.out.printf("%s , meaning something went wrong when assigning money",e.toString());
            }

            PlayerCreation newPlayer = new PlayerCreation(playersName,playersSurname,playersNickname,playersMoney);
            ArrayList<String> player = new ArrayList<>();
            
            player.add(newPlayer.getPlayerName());
            player.add(newPlayer.getPlayerSurname());
            player.add(newPlayer.getPlayerNickname());

            try {
                player.add(String.valueOf(newPlayer.getPlayersMoney()));
            }catch (NumberFormatException e){
                System.out.printf("%s , meaning something went wrong when turning money to string",e.toString());
            }
            tableOfPlayers.add(player);
        }


        for (ArrayList<String> eachPlayer : tableOfPlayers){
                System.out.printf("Player: %s%n", eachPlayer.toString());
        }

    }
}
