public class SuitsAndNumbers {

    int cardGameName;
    String[] numbersArray = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suitsArray = {"Clubs","Spades","Hearts","Diamonds"};

    public SuitsAndNumbers(int cardGameDeckLength){
        this.cardGameName = cardGameDeckLength;
        if (this.cardGameName != 52){
            System.out.printf("You have to set a new numberArray for your game since we provide 52 cards by default.%nFeel free to change the suits array also.%n");
        }
    }

    public String[] getNumbersArray() {
        return numbersArray;
    }

    public void setNumbersArray(String[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    public String[] getSuitsArray() {
        return suitsArray;
    }

    public void setSuitsArray(String[] suitsArray) {
        this.suitsArray = suitsArray;
    }
}
