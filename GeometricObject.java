import java.util.Date;
public class GeometricObject 
{
    protected String color;
    protected boolean filled;
    protected Date dateCreated;
    public GeometricObject()
    {
        this.dateCreated = new Date();
        this.color="white";
        this.filled=false;
    }

    public GeometricObject(String color, boolean filled)
    {
        this.dateCreated = new Date();
        this.color=color;
        this.filled=filled;
    }
    
    public String getColor() 
    {
        return this.color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public boolean isFilled() 
    {
        return this.filled;
    }

    public void setFilled(boolean filled) 
    {
        this.filled = filled;
    }

    public Date getDateCreated() 
    {
        return this.dateCreated;
    }

    public String toString()
    {
        String output = "created on "+ getDateCreated()+"\ncolor: white and filled: ";
        if(getColor()=="white" && isFilled()==true)
        {
            return (output+ "true");
        }
        else
        {
            return (output+ "false");
        }
    }
}



