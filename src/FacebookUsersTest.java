import java.util.Scanner;
public class FacebookUsersTest {

    public static void main(String[] args) {
        int currentUsers;
        int increasePercent;
        int newUserCount;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Give current facebook users:");
        currentUsers =  input.nextInt();
        System.out.println("Give current facebook increase rate:");
        increasePercent =  input.nextInt();

        FacebookUsersIncrease facebookIncreaseObject =  new FacebookUsersIncrease(increasePercent, currentUsers);
        System.out.printf("-Current Users:%d%n-Increase Percent:%d%n",facebookIncreaseObject.getCurrentUsers(),facebookIncreaseObject.getIncreasePercentage());
        for (int i = 0; i < 100; i++) {
            newUserCount =facebookIncreaseObject.calculateRiseOfUsers(facebookIncreaseObject.getIncreasePercentage(), facebookIncreaseObject.getCurrentUsers());
            facebookIncreaseObject.setCurrentUsers(newUserCount);
            currentUsers = facebookIncreaseObject.getCurrentUsers();
            if (newUserCount > 2000 && newUserCount < 2100){
                System.out.printf("%nIn order to reach %d Users , %d Months were required.%n",newUserCount, count);
                System.out.printf("-Current Users:%d%n-Months Required:%d%n",newUserCount, count);
            }else if(newUserCount >= 4000){
                System.out.printf("%nIn order to reach %d Users , %d Months were required.%n",newUserCount, count);
                System.out.printf("-Current Users:%d%n-Months Required:%d%n",newUserCount, count);
                break;
            }
            count++;
        }

    }
}
