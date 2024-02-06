import java.util.Scanner;
public class DateDisplayTest {

    public static void main(String[] args) {

        DateDisplay dateObject = new DateDisplay(29,11,1997);
        Scanner input = new Scanner(System.in);

        System.out.printf("-Current Date:%d%n-Current Month:%d%n-Current Year:%d%n",dateObject.getDateDisplay(), dateObject.getMonthDisplay(), dateObject.getYearDisplay());

        System.out.println("Enter new date:");
        int newDate = input.nextInt();
        dateObject.setDateDisplay(newDate);

        System.out.println("Enter new date:");
        int newMonth = input.nextInt();
        dateObject.setMonthDisplay(newMonth);

        System.out.println("Enter new date:");
        int newYear = input.nextInt();
        dateObject.setYearDisplay(newYear);

        System.out.printf("-New Date:%d%n-New Month:%d%n-New Year:%d%n",dateObject.getDateDisplay(), dateObject.getMonthDisplay(), dateObject.getYearDisplay());
    }
}
