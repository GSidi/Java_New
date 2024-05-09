public class IntegerSet {

    private static boolean[] testSet = new boolean[100];
    private String forToString = "";
    public IntegerSet(){
        for (int i = 0; i < testSet.length; i++)
            testSet[i] = false;
    }

    public static boolean[] union(boolean[] firstArray , boolean[] secondArray){

        try{
            for (int i = 0 ; i < firstArray.length ; i++){
                if( (firstArray[i] == true) || (secondArray[i] == true)){
                    testSet[i] = true;
                }else{
                    testSet[i] = false;
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("%n first and second array must be of equal size: %s%n", e.getMessage());
        }

        return testSet;
    }

    public static boolean[] intersection(boolean[] firstArray , boolean[] secondArray){

        try{
            for (int i = 0 ; i < firstArray.length ; i++){
                if( (firstArray[i] == true) && (secondArray[i] == true)){
                    testSet[i] = true;
                }else{
                    testSet[i] = false;
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("%n first and second array must be of equal size: %s%n", e.getMessage());
        }

        return testSet;
    }

    public static void insertElement(int newElement){
        try{
            testSet[newElement] = true;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("%n element out of bounds: %s%n", e.getMessage());
        }
    }

    public static void removeElement(int newElement){
        try{
            testSet[newElement] = false;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("%n element out of bounds: %s%n", e.getMessage());
        }
    }

    @Override
    public String toString() {

        for (int i = 0 ; i < testSet.length ; i ++){
            if (testSet[i] == true){
                forToString = forToString+"--"+Integer.toString(i);
            }
        }
        return forToString;
    }
}
