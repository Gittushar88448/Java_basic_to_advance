public class Driver {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.fuel(5);

        myCar.start().drive();
        myCar.drive();
        System.out.println(myCar.getFuel());
    }

}
