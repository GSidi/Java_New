import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {

        String x = "10 of Spades";

        int y = 0;

        String cut = x.substring(0,2);
        System.out.printf("cut string : %s%n",cut);
//        Pattern testPattern = Pattern.compile()
        y = Integer.parseInt(cut);

        System.out.printf("y : %d", y);
    }
}
