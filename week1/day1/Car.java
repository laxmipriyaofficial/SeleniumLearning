package week1.day1;
//AccessModifier classKeyword ClassName
public class Car {
	
//AccessModifier returnType methodName()
public void applyGas() {
	System.out.println("Car is moving");
}
public void applyBrake() {
	System.out.println("Apply break");
}
	public static void main(String[] args) {
//ClassName objectReference Name = new Constructor();
	Car car1=new Car();
	car1.applyBrake();
	car1.applyGas();

	}

}
