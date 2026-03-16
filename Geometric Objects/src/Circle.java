
public class Circle extends GeometricObject {
	private double radius;
	
	public Circle() {
		radius = 1;	
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;	
	}
	
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;	
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
}
