package Arrays;

public class Largestelement {
    public static void main(String[] args) {
        //1.Find the largest element in an array.
        int a[] = {44, 55, 66, 99, 12};
        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
