import java.util.Date;

public class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;
    
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
}