package Arrays;

public class SortedArray {
    public static void main(String[] args){
        int arr[]={10,20,380,40,50};

        boolean a=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                a=true;
            }else{
                a=false;
                break;
            }
        }
System.out.println(a);
    }
}
