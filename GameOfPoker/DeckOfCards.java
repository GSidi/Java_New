public class DeckOfCards {

    public static int Deck_Length = 52;
    String[] numbersArray = new String[0];
    String[] suitsArray = new String[0];

    public DeckOfCards(String[] numbersArray, String[] suitsArray){
        this.numbersArray = numbersArray;
        this.suitsArray = suitsArray;
    }
    public String[] getSuitsArray() {
        return suitsArray;
    }
    public void setSuitsArray(String[] suitsArray) {
        this.suitsArray = suitsArray;
    }
    public String[] getNumbersArray() {
        return numbersArray;
    }
    public void setNumbersArray(String[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    
}
