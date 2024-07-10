public class Tiger  extends Animal{

    private boolean hasStripes;
    public Tiger(int legs, double speed ,String type, boolean hasStripes){
        super(legs, speed, type);
        this.hasStripes = hasStripes;
    }

    public boolean isHasStripes() {
        return hasStripes;
    }

    public void setHasStripes(boolean hasStripes) {
        this.hasStripes = hasStripes;
    }

    @Override
    public double move() {
        return (super.getLegs() * super.getSpeed())*2;
    }

    @Override
    public String sound() {
        return "TIGER ROAR";
    }

    @Override
    public String eat() {
        return "Anything that makes it a carnivore + Humans";
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %b%n%s : %.2f%n%s : %s%n%s : %s%n",
                super.toString(),
                "Animal has fur",isHasStripes(),
                "Tigers movement", move(),
                "Tigers sound",sound(),
                "Tigers eat",eat());
    }
}
