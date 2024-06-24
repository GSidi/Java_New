public class IntegerSetTest {

    public static void main(String[] args) {

        IntegerSet newIntegerSetObject = new IntegerSet();

        boolean[] firstArray = {true , true , false , true , true};
        boolean[] secondArray = {true , false , false , true , false};

        newIntegerSetObject.union(firstArray , secondArray);

        System.out.printf("Result of union : %s%n",newIntegerSetObject.toString());

        newIntegerSetObject.intersection(firstArray , secondArray);

        System.out.printf("Result of intersection : %s%n",newIntegerSetObject.toString());

        newIntegerSetObject.insertElement(10);

        System.out.printf("Result of adding new element : %s%n",newIntegerSetObject.toString());

        newIntegerSetObject.removeElement(10);

        System.out.printf("Result of removing the new element : %s%n",newIntegerSetObject.toString());

    }

}
