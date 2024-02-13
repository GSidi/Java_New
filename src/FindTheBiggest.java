public class FindTheBiggest {

    private int userChoice;
    private int result;

    public FindTheBiggest(int userChoice){
       this.userChoice = userChoice ;
    }
    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }
    public void checkBiggest(int numberToCheck){
        if (numberToCheck > this.userChoice)
            this.userChoice = numberToCheck;
    }

    public int biggestResult(int result){
        return result;
    }
}
