import java.util.ArrayList;

public class Test_Class {

    public static void main(String[] args) {

        ArrayList<String> numbersArray =new ArrayList<String>();
        ArrayList<String> suitsArray = new ArrayList<String>();
        ArrayList<String> newDeck = new ArrayList<String>();
        ArrayList<String> shuffledDeck = new ArrayList<>();

        SuitsAndNumbers newSetofSuitsAndNumbers = new SuitsAndNumbers(52);

        numbersArray = newSetofSuitsAndNumbers.getNumbersArray();
        suitsArray = newSetofSuitsAndNumbers.getSuitsArray();

//        for (String number : numbersArray)
//            System.out.printf("%s,",number);
//
//        System.out.println();
//
//        for (String suit : suitsArray)
//            System.out.printf("%s,",suit);

        DeckOfCards testDeck = new DeckOfCards(numbersArray, suitsArray);

        newDeck = testDeck.deckCreation(numbersArray, suitsArray);

        for (String card : newDeck)
            System.out.printf("%s%n",card);

        System.out.printf("length of deck:%d%n",newDeck.size());

        DeckFunctionalities deckFunct = new DeckFunctionalities("shuffle");

         shuffledDeck = deckFunct.shuffleDeck(newDeck, "shuffle");

        for (String card : shuffledDeck)
            System.out.printf("%s%n",card);

        System.out.printf("length of deck:%d%n",shuffledDeck.size());
    }
}
