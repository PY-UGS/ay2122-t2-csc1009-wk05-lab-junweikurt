public class Circle extends Shape
{
    public Circle(double radius1, double radius2)
    {
        super(radius1,radius2);
    }
    public double area()
    {
        return (super.PI*super.dim1*super.dim2);
    }    
}