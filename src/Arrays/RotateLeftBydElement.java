package Arrays;
//   input:- 1,2,3,4,5
 //   d=2;
///  output:- 3,4,5,1,2
///
public class RotateLeftBydElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int d =2;
        int n =arr.length;
        rotateLeftBydElement(arr,d,n);
        rotateLeftBydElementBetter(arr,d,n);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void rotateLeftBydElementBetter(int[] arr, int d, int n) {

    }

    private static void rotateLeftBydElement(int[] arr, int d, int n) {
         for(int i=0;i<d;i++)
         {
             leftArrayByOnePosition(arr, n);

         }
    }

    private static void leftArrayByOnePosition(int[] arr, int n) {
        int temp =arr[0];
        for (int i = 1; i <n; i++) {
            arr[i-1] =arr[i];
        }
        arr[n-1] =temp;
    }
}
