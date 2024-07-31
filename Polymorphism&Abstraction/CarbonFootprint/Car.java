public class Car implements  CarbonFootprint{

    private int numberOfWheels;
    private int numberOfDoors;
    private int abs_speed;

    public Car(int numberOfWheels, int numberOfDoors, int abs_speed){

        if (numberOfDoors!=4){
            throw new IllegalArgumentException("Number of wheels must be 4");
        }
        if (numberOfDoors<3){
            throw new IllegalArgumentException("Number of wheels must be 3 or more");
        }
        if (abs_speed==0){
            throw new IllegalArgumentException("Absolute speed can not be 0");
        }

        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.abs_speed = abs_speed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getAbs_speed() {
        return abs_speed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setAbs_speed(int abs_speed) {
        this.abs_speed = abs_speed;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return String.format("%s :%n%s : %d%n%s : %d%n%s : %d%n",
                "Car Info",
                "Number of wheels", getNumberOfWheels(),
                "Number of doors", getNumberOfDoors(),
                "Absolute speed", getAbs_speed());
    }

    @Override
    public double getCarbonFootprint() {
        return  getAbs_speed()/1.34;
    }
}
