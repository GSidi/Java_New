public class GradeBook {

    private String courseName;
    private int[][] grades;

    public  GradeBook(String courseName, int[][] grades){

        this.courseName = courseName;
        this.grades = grades;

    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }

    //does a bunch of things with data
//    public void processGrades(){
//        outputGrades();
//    }

    public int getMinimum(){
        //we assume that the first entry of the table is the lowest
        int lowGrade = grades[0][0];
        //first we iterate through the lines
        for (int[] studentGrades : grades){
            //then through the columns of the line
            for (int grade : studentGrades){
                if (grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }

        return lowGrade;
    }

    public int getMaximum(){
        //we assume that the first entry of the table is the highest
        int highGrade = grades[0][0];
        //first we iterate through the lines
        for (int[] studentGrades : grades){
            //then through the columns of the line
            for (int grade : studentGrades){
                if (grade > highGrade){
                    highGrade = grade;
                }
            }
        }

        return highGrade;
    }

    public double getAverage(int[] setOfGrades){

        int total = 0 ;

        for(int grade : setOfGrades){
            total +=grade;
        }

        return (double) total/setOfGrades.length;
    }

}
