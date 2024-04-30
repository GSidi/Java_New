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
        int deckLength = 52;
        ArrayList<String> pokerGameDeck = new ArrayList<>();
        ArrayList<String> shuffledDeck = new ArrayList<>();

        //Table creation : meaning the total players
        totalPlayers = JOptionPane.showInputDialog("Give total players for the poker game");

        try {
            totalPlayersForLoop = Integer.parseInt(totalPlayers);
        } catch (NumberFormatException e){
            System.out.printf("%s , meaning you inserted a string not a number",e.toString());
        }

        //Player creation
        for (int i = 0; i< totalPlayersForLoop ; i++){
            playersName = JOptionPane.showInputDialog("Give players name");
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
        //we get the total suits and number for the creation of the deck
        SuitsAndNumbers suitsAndNumbersObject = new SuitsAndNumbers(deckLength);

        //initialization of the deck for the game
        DeckOfCards pokerGameDeckObject = new DeckOfCards(suitsAndNumbersObject.getNumbersArray(), suitsAndNumbersObject.getSuitsArray());
        pokerGameDeck = pokerGameDeckObject.deckCreation(suitsAndNumbersObject.getNumbersArray(), suitsAndNumbersObject.getSuitsArray());
        //Creation a shuffled deck
        DeckFunctionalities deckFunctions = new DeckFunctionalities("shuffle", pokerGameDeck);
        shuffledDeck = deckFunctions.shuffleDeck("shuffle", pokerGameDeck);
//        System.out.println(shuffledDeck);
//        System.out.println(shuffledDeck.size());

    }
}
