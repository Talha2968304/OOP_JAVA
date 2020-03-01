package objectpasssingMethod;
public class ObjectPassingMethod {

    public static void main(String[] args) {
       Parameter b1 = new Parameter (10,20);
      Parameter  b2 = new Parameter (30,40);
    
       b1.display();
       b3.display();
       
       if(b1.isEqual(b2)){
           System.out.println("both b1 and b2 are same");
       }else{
           System.out.println("both b1 and b2 are not same");
       }
       
        if(Box.isTwoObjectsEqual(b1, b2)){
           System.out.println("both b1 and b2 are same");
       }else{
           System.out.println("both b1 and b2 are not same");
       }
    }
    
}