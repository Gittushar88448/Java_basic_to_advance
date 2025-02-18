
//Create an object with final fields and a constructor to initialize them.
public class CarFinal {

    final int noOfWheels;
    final  int fuelTank;
    final String modelName;

    public void show(){
        System.out.println(" Model is ready to test ");
    }

    public CarFinal(int noOfWheels, int fuelTank, String modelName) {
        this.noOfWheels = noOfWheels;
        this.fuelTank = fuelTank;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        CarFinal swift = new CarFinal(5,80,"A2024B7");
        swift.show();
    }

}
