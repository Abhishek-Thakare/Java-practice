package OOPS.Inheritance;
class CalMean{
    double mean(double a,double b) {
        return (a + b) / 2;
    }
}
public class Mean extends CalMean {
    public static void main(String[] args){
        Mean ob= new Mean();
        System.out.println(ob.mean(8,5));
    }
}
