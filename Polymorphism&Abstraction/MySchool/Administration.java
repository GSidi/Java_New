public class Administration extends Person {

    private String adminUsername;
    private String adminPassword;
    public Administration(String firstname, String surname, int age, String adminUsername, String adminPassword){
        super(firstname, surname, age);

        try{
            this.adminUsername = adminUsername;
        }catch (IllegalArgumentException e){
            System.out.printf("adminUsername needs to be a string :%s",e);
        }

        try{
            this.adminPassword = adminPassword;
        }catch (IllegalArgumentException e){
            System.out.printf("adminPassword needs to be a string :%s",e);
        }

    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    @Override
    public String toString() {
        return String.format("%s%n-Admin Info:%n--Admin Username:%s%n--Admin Password:%s%n",
                super.toString(),getAdminUsername(),getAdminPassword());
    }
}
