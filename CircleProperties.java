
//Calculate the area and circumference of a circle for a given radius using Math.PI

import java.util.Scanner;

public class CircleProperties {
//    Alternate method to find properties of circle using toString method
    float radii;

    public double getCircum(){
        return (2*Math.PI*radii);
    }
    public double getArea(){
        return Math.PI*Math.pow( radii , 2);
    }

    public CircleProperties(float radii) {
        this.radii = radii;
    }

    @Override
    public String toString() {
        return "Circle Properties{ Area of Circle: "+ getArea()+"," +
                " circumfrance of circle is : " + getCircum() + " }";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float radii = input.nextFloat();

        CircleProperties circle = new CircleProperties(radii);
        System.out.println(circle);

//      ***  Another method to find circle props  ***


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the radius of circle: ");
//        float radii = input.nextFloat();
//
//        double area =  Math.PI*Math.pow(radii , 2);
//
//        double circumfrance = 2* Math.PI * radii;
//
//        System.out.printf("Area of circle is : %.2f %n", area);
//        System.out.printf("Circumfrance of circle is : %.2f ", circumfrance);


    }

}
