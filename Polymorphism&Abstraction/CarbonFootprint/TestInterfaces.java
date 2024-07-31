public class TestInterfaces {

    public static void main(String[] args) {

        Car carObj1 = new Car(4, 4,100);
        Bicycle bikeObj1 = new Bicycle(2, true);

        System.out.println("Car carbon footprint");
        System.out.println(carObj1.getCarbonFootprint());
        System.out.println("Bicycle carbon footprint");
        System.out.println(bikeObj1.getCarbonFootprint());
    }
}
