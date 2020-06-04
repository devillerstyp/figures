public class Rectangle implements Shape  {
    // Attributs
    public double length;
    public double width;
    // Constructeur
    
public Rectangle (double length, double width)  {
    this.length = length;
    this.width = width;
} 
// Setter
public void setLength (double length)  {
    this.length = length;

}
public void setWidth (double width)  {
    this.width = width;

}
//getter
public double getLength ()  {
 return length;

}
public double getWidth ()  {
    return width;
   
   }
//methode 
public double area(){
    double area = width * length;
    return area;
}
public double perimeter(){
    double perimeter = (width + length)*2;
    return perimeter;
}

@Override
public void draw() {
    // TODO Auto-generated method stub

}
}

