public class Test_Class {

    public static void main(String[] args) {

        String[] numbersArray = new String[0];
        String[] suitsArray = new String[0];

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



    }
}
