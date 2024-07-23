public class Lion extends Animal{

    private boolean hasFur;
    public Lion(int legs, double speed ,String type, boolean hasFur){
        super(legs, speed, type);
        this.hasFur = hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    @Override
    public double move() {
        return super.getLegs() * super.getSpeed();
    }

    @Override
    public String sound() {
        return "LION ROAR";
    }

    @Override
    public String eat() {
        return "Anything that makes it a carnivore";
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %b%n%s : %.2f%n%s : %s%n%s : %s%n",
                super.toString(),
                "Animal has fur",isHasFur(),
                "Lions movement", move(),
                "Lions sound",sound(),
                "Lions eat",eat());
    }
}
