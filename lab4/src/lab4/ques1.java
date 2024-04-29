package lab4;
import java.util.Scanner;


class Circle{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double getPerimeter(){
		return 2*Math.PI*radius;
		
	}
	double getArea() {
		return Math.PI*radius*radius;
	}
}
class Cylinder extends Circle{
	double height;
	Cylinder(double radius, double height){
		super(radius);
		this.height=height;
	}
	double getPerimeter() {
		return super.getPerimeter()*height;
	}
	double getArea() {
		return (2*Math.PI*radius*height)+(2*super.getArea());
	}
}
public class ques1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = scanner.nextDouble();
		System.out.println("Enter the height");
		double height = scanner.nextDouble();
		Circle circle = new Circle(radius);
		Cylinder cylinder = new Cylinder(radius,height);
		
		System.out.println("Circle Perimeter : "+ circle.getPerimeter());
		System.out.println("Circle Area : "+ circle.getArea());
		System.out.println("Cylinder Perimeter : "+ cylinder.getPerimeter());
		System.out.println("Cylinder Perimeter : "+ cylinder.getPerimeter());
		scanner.close();



	}
}






