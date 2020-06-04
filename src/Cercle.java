public class Cercle implements Shape {
    double radius;

    //setter 
    public Cercle ( double radius) {
        this.radius = radius;
    }

    //getter 
    public double getRadius() {
        return radius;
    }

    //methode 
    public double area() {
        double area = radius * radius * Math.PI;
        return area ;
    }

    public double perimeter() {
        
        return 2*radius*Math.PI;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub

    }
}