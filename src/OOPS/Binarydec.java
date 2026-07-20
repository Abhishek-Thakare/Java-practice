//Q. binary to decimal conversion

abstract class Decimal{
    abstract void convert(int n);
}
public class Binarydec extends Decimal {
    int bin[]=new int[100];
    int index=0;
    int r,i;

    @Override
    void convert (int n){
        while (n>0) {
            r=n%2;
            bin[index]=r;
            n=n/2;
            index++;
        }
        for(i=index-1;i>=0;i--){
            System.out.print(bin[i]);
        }
    }

public static void main(String[] args){
   Binarydec ob=new Binarydec();
   ob.convert(5);
}
}