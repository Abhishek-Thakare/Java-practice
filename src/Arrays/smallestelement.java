package Arrays;

public class smallestelement {
    public static void main(String[] args){
        int a[]={98,45,6,33,2};
        int smallest=a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]<smallest){
               smallest=a[i];
            }
        }
        System.out.println(smallest);
    }
}
