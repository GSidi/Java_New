public class StringBufferTesting {

    public static void main(String[] args) {

        java.lang.StringBuffer buffer1 = new java.lang.StringBuffer();
        java.lang.StringBuffer buffer2 = new java.lang.StringBuffer(10);
        java.lang.StringBuffer buffer3 = new java.lang.StringBuffer("Hello");

        System.out.printf("buffer1 = \"%s\"%n", buffer1);
        System.out.printf("buffer2 = \"%s\"%n", buffer2);
        System.out.printf("buffer3 = \"%s\"%n", buffer3);

        java.lang.StringBuffer buffer4 = new java.lang.StringBuffer();

        buffer4.append("TestName");
        System.out.printf("buffer4 = %s%nlength = %d%ncapacity = %d%n%n", buffer4.toString(),
                buffer4.length(), buffer4.capacity());

        buffer4.ensureCapacity(75);
        buffer4.replace(0,8, "Test2");
        System.out.printf("New Capacity = %d%nBuffer = %s%n", buffer4.capacity(), buffer4.toString());
        buffer4.setLength(10);

        System.out.printf("New length = %d%nBuffer = %s%n", buffer4.length(), buffer4.toString());


    }
}
