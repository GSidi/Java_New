public class FacebookUsersIncrease {
    int increasePercentage;
    int currentUsers;
    int increasedUsers;

    public FacebookUsersIncrease(int increasePercentage, int currentUsers){
        this.increasePercentage = increasePercentage;
        this.currentUsers = currentUsers;
    }

    public void setIncreasePercentage(int increasePercentage) {
        this.increasePercentage = increasePercentage;
    }

    public int getIncreasePercentage() {
        return increasePercentage;
    }

    public void setCurrentUsers(int currentUsers) {
        this.currentUsers = currentUsers;
    }

    public int getCurrentUsers() {
        return currentUsers;
    }

    public int calculateRiseOfUsers(int increasePercentage, int currentUsers){
        increasedUsers = currentUsers + (currentUsers * increasePercentage/100);
        return increasedUsers;
    }

}
