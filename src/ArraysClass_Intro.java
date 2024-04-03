import java.util.Arrays;
public class ArraysClass_Intro {
    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray:");

        for (double value: doubleArray){
            System.out.printf("%.1f",value);
        }

        int[] filledIntArray = new int[7];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray: ");

        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int[] copyOfFirstArray = new int[firstArray.length];
        System.arraycopy(firstArray, 0, copyOfFirstArray, 0, firstArray.length);
        displayArray(firstArray, "firstArray: ");
        displayArray(copyOfFirstArray, "copyOfFirstArray: ");

        boolean b = Arrays.equals(firstArray, copyOfFirstArray);
        System.out.printf("%n%nfirstArray %s copyOfFirstArray%n", (b ? "==" : "!="));

        b = Arrays.equals(firstArray, copyOfFirstArray);
        System.out.printf("%n%nfirstArray %s copyOfFirstArray%n", (b ? "==" : "!="));

        int location = Arrays.binarySearch(firstArray, 5);

        if (location >= 0){
            System.out.printf("Found 5 at element %d in firstArray%n", location);
        }else{
            System.out.println("5 not in array firstArray");
        }

        location = Arrays.binarySearch(firstArray, 5879);
        if (location >= 0){
            System.out.printf("Found 5879 at element %d in firstArray%n", location);
        }else{
            System.out.println("5879 not in array firstArray");
        }




    }

    public static void displayArray(int[] array, String description){
        System.out.printf("%n%s", description);

        for(int value : array){
            System.out.printf("%d", value);
        }
    }
}
