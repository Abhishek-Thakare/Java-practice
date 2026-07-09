package Arrays;

public class secondlargest {
    public static void main(String[] args){
        //Find the Second Largest Element in an Array
        int arr[]={55,66,77,88,100};
         int largest=arr[0];
         int secondlargest=arr[0];
         for(int i=1;i<arr.length;i++){
             if(arr[i]>largest){
                 secondlargest=largest;
                 largest=arr[i];
             }else if(arr[i]>secondlargest && arr[i] != largest){
                 secondlargest =arr[i];
             }
         }
System.out.println(secondlargest);


    }
}
