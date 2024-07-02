public class PieceEmployee extends BasicEmployee{


    private double salaryPerPiece;
    private int pieces;

    public PieceEmployee(String firstName, String surname, String email, String socialSecurityNumber, double baseSalary,
                          double salaryPerPiece , int pieces){

        super(firstName, surname, email, socialSecurityNumber, baseSalary);

        if (salaryPerPiece == 0.0)
            throw new IllegalArgumentException("Salary per piece can not be 0.0");

        if (pieces == 0)
            throw new IllegalArgumentException("Hours worked can not be 0");

        this.salaryPerPiece = salaryPerPiece;
        this.pieces = pieces;

    }

    public double getSalaryPerPiece() {
        return salaryPerPiece;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public void setSalaryPerPiece(double salaryPerPiece) {
        this.salaryPerPiece = salaryPerPiece;
    }

    public double earnings(){
        return getSalaryPerPiece() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %.2f",
                super.toString(),
                "Earnings of Hourly Employee", earnings());
    }
}
