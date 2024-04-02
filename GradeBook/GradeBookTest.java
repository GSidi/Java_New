public class GradeBookTest {

    public static void main(String[] args) {
        int[][] gradesArray = {{80,12,45}, {81,52,90}, {60,32,100}, {95,38,66}, {80,12,45},{80,12,45},{97,22,63},{90,40,65},{80,85,65}};

        GradeBook myGradeBook = new GradeBook("Test Course Name", gradesArray);
        System.out.printf("Welcome to grade book for%n%s%n%n",myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
