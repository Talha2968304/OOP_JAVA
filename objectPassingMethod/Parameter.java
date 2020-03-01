package objectpassingMethod;
public class Parameter {
    int width;
    int height;
    Parameter(int w,int h)
    { width = w;
     height = h;
    }
    Parameter(Parameter b)
    {
        this.width = b.width;
        this.height = b.height;
    }
    static boolean isTwoObjectsEqual(Parameter b1,Parameter b2)
    {
        if(b1.width == b2.width && b1.height==b2.height)
            return true;
        else
            return false;
        
    }
    boolean isEqual(Parameter b)
    {
        if(this.width == b.width && this.height==b.height)
            return true;
        else
            return false;}
}