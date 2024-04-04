import java.util.ArrayList;

public class Test_Class {

    public static void main(String[] args) {

        ArrayList<String> numbersArray =new ArrayList<String>();
        ArrayList<String> suitsArray = new ArrayList<String>();
        ArrayList<String> newDeck = new ArrayList<String>();

        SuitsAndNumbers newSetofSuitsAndNumbers = new SuitsAndNumbers(51);

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

//        for (String card : newDeck)
//            System.out.printf("%s%n",card);

    }
}
