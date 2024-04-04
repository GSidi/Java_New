import java.util.ArrayList;
public class SuitsAndNumbers {

    int cardGameName;
    ArrayList<String> numbersArray = new ArrayList<String>();
    ArrayList<String> suitsArray = new ArrayList<String>();

    public SuitsAndNumbers(int cardGameDeckLength){
        this.cardGameName = cardGameDeckLength;
        numbersArray.add("A");
        numbersArray.add("K");
        numbersArray.add("Q");
        numbersArray.add("J");
        numbersArray.add("10");
        numbersArray.add("9");
        numbersArray.add("8");
        numbersArray.add("7");
        numbersArray.add("6");
        numbersArray.add("5");
        numbersArray.add("4");
        numbersArray.add("3");
        numbersArray.add("2");
        suitsArray.add("Clubs");
        suitsArray.add("Spades");
        suitsArray.add("Hearts");
        suitsArray.add("Diamonds");
        if (this.cardGameName != 52){
            System.out.printf("You have to set a new numberArray for your game since we provide 52 cards by defaultArrayList<String>.%nFeel free to change the suits array also.%n");
        }
    }

    public ArrayList<String> getNumbersArray() {
        return numbersArray;
    }

    public void setNumbersArray(ArrayList<String> numbersArray) {
        this.numbersArray = numbersArray;
    }

    public ArrayList<String> getSuitsArray() {
        return suitsArray;
    }

    public void setSuitsArray(ArrayList<String> suitsArray) {
        this.suitsArray = suitsArray;
    }
}
