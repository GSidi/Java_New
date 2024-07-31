public class Bicycle implements CarbonFootprint {

    private int numberOfWheels;
    private boolean electricKit;

    public Bicycle(int numberOfWheels, boolean electricKit) {
        this.numberOfWheels = numberOfWheels;
        this.electricKit = electricKit;
    }

        public int getNumberOfWheels () {
            return numberOfWheels;
        }

        public void setNumberOfWheels ( int numberOfWheels){
            this.numberOfWheels = numberOfWheels;
        }

        public void setElectricKit ( boolean electricKit){
            this.electricKit = electricKit;
        }

        public boolean isElectricKit () {
            return electricKit;
        }

        @Override
        public double getCarbonFootprint () {
            if (isElectricKit()) {
                return 1.34;
            } else {
                return 0.0;
            }
        }
}
