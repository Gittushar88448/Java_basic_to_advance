public class Car {
    int noOfWheels;
    String color;
    int noOfSeats;
    float currentFuelInLitres;
    float maxSpeed;

    public Car start(){
        if(currentFuelInLitres == 0){
            System.out.println("car is not starting! , please add fuel");
        }
        else if (currentFuelInLitres < 5){
           System.out.println("Car is in reserve mode, please refuel.");
       }
        else {
            System.out.println("Car is Starting ");
        }
        return this;
    }
    public void drive(){
        if(currentFuelInLitres == 0){
            System.out.println("car is out of fuel , please refuel");
        } else if (currentFuelInLitres < 5) {
            System.out.println("Car is in reserve mode, please refuel.");
            currentFuelInLitres--;
        }
        else {
            System.out.println("Car is driving ");
            currentFuelInLitres--;
        }

    }

    public void fuel(float currentFuelInLitres){
        this.currentFuelInLitres += currentFuelInLitres;
        System.out.println("Car is refueled to "+ currentFuelInLitres + " litres");
    }

    public float getFuel(){
        return currentFuelInLitres;
    }
}
