public class AnimalTest {

    public static void main(String[] args) {

        Lion testLion = new Lion(4,20.5, "Mammal", true);

        System.out.printf("%s", testLion.toString());

        Tiger testTiger = new Tiger(4, 25.2, "Mammal", true);

        System.out.printf("%s", testTiger.toString());

    }
}
