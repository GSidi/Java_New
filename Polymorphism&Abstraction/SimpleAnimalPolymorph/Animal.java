public abstract class Animal{

    private int legs;
    private double speed;
    private String type;
    public Animal(int legs, double speed ,String type){

        this.legs = legs;
        this.speed = speed;
        this.type = type;

    }

    public double getSpeed() {
        return speed;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        return type;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s : %d%n%s : %.2f%n%s : %s",
                "Animal legs",getLegs(),
                "Animal speed",getSpeed(),
                "Animal type",getType());
    }

    public abstract double move();

    public abstract String sound();

    public abstract String eat();
}
