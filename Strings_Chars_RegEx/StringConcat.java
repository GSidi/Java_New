public class StringConcat {

    public static void main(String[] args) {

        String s1 = "Happy";
        String s2 = "Birthday";
        System.out.printf("s1 = %s%ns2 = %s%n%n", s1, s2); //--> output -> s1 = Happy s2 = Birthday
        System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));//--> output Result of s1.concat(s2) = Happy Birthday
        System.out.printf("s1 after concatenation = %s%n", s1);//--> s1 after concatenation =  Happy

    }
}
