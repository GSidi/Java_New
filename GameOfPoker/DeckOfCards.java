import java.util.ArrayList;
public class DeckOfCards {

    //public static int Deck_Length = 52;
    ArrayList<String> numbersArray = new ArrayList<String>();
    ArrayList<String> suitsArray =new ArrayList<String>();
    ArrayList<String> newDeck = new ArrayList<String>();

    public DeckOfCards(ArrayList<String> numbersArray, ArrayList<String> suitsArray){
        this.numbersArray = numbersArray;
        this.suitsArray = suitsArray;
    }
    public ArrayList<String> getSuitsArray() {
        return suitsArray;
    }
    public void setSuitsArray(ArrayList<String> suitsArray) {
        this.suitsArray = suitsArray;
    }
    public ArrayList<String> getNumbersArray() {
        return numbersArray;
    }
    public void setNumbersArray(ArrayList<String> numbersArray) {
        this.numbersArray = numbersArray;
    }

    public ArrayList<String> deckCreation (ArrayList<String> numbersArray,ArrayList<String> suitsArray){

        for(String number : numbersArray){
            for (String suit : suitsArray){
                String cardCreation = number + " of " + suit;
                newDeck.add(cardCreation);
            }
        }
        return  newDeck;
    }

}
