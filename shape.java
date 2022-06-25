
public class shape{
    private double area;

    public void SetArea(double a){
        area=a;
    }
    protected double getArea(){
        return area;
    }
}

class circle extends shape{

    private double radius;

    public void SetRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
}
