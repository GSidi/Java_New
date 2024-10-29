public class StringValueOf {

    public static void main(String[] args) {

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean boolValue = true;
        int intValue = 1;
        long longValue = 10000000L;
        float floatValue = 10.01f;
        double doubleValue = 10.01;

        System.out.printf("char array = %s%n",String.valueOf(charArray));
        System.out.printf("int value = %s%n",String.valueOf(intValue));
        System.out.printf("long value = %s%n",String.valueOf(longValue));
        System.out.printf("float value = %s%n",String.valueOf(floatValue));
        System.out.printf("double value = %s%n",String.valueOf(doubleValue));
        System.out.printf("bool value = %s%n",String.valueOf(boolValue));
    }
}
