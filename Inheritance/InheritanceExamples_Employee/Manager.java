public class Manager extends Employee{

    private double extraSalary;
    private String department;
    private String title;
    private String team;

    public Manager(String firstName, String surname, int age, String email, String countryOfOrigin, String livingLocation,double baseSalary,
                   double extraSalary, String department, String title, String team){
        super(firstName, surname, age, email, countryOfOrigin, livingLocation, baseSalary);

        if (department.isEmpty()){
            throw new IllegalArgumentException("Department is required");
        }
        if (title.isEmpty()){
            throw new IllegalArgumentException("Title is required");
        }
        if (team.isEmpty()){
            throw new IllegalArgumentException("Team is required");
        }
        if (extraSalary == 0){
            throw new IllegalArgumentException("Extra salary is required");
        }

        this.department = department;
        this.team = team;
        this.title = title;
        this.extraSalary = extraSalary;
    }

    public double getExtraSalary() {
        return extraSalary;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeam() {
        return team;
    }

    public String getTitle() {
        return title;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setExtraSalary(double extraSalary) {
        this.extraSalary = extraSalary;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double earnings(){
        double earningPerMonth;
        earningPerMonth = super.getBaseSalary() + getExtraSalary();
        return earningPerMonth;
    }

    @Override
    public String toString() {
        return String.format("%s%n-%s : %s%n-%s : %s%n-%s : %s%n-%s : %.2f",
                super.toString(),
                "Title", getTitle(),
                "Team", getTeam(),
                "Department Managed", getDepartment(),
                "Extra money for position as Manager", getExtraSalary());
    }
}
