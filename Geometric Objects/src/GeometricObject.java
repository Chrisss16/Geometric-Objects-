import java.util.Date;

public abstract class GeometricObject {

    private String color;
    private boolean filled;
    public Date dateCreated;
    
    //CONSTRUCTORES 
    public GeometricObject() {
        dateCreated = new Date();
        color = "White";
        filled = false;
    }
    
    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }
    
    
    //GETTERS Y SETTERS

    public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//METODOS
    public abstract double getArea(); 
}