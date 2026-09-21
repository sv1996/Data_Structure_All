package Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12, 0, 34, 0, 0};
        int n = arr.length;
        //  moveZeroesToEnd1(arr);
        //moveZeroesToEnd2(arr);
        //moveZeroesToEnd3(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void moveZeroesToEnd3(int[] arr)
    {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        int k = j;
        while (k < arr.length)
        {
            arr[k] = 0;
            k++;
        }
    }
    private static void moveZeroesToEnd2(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] ==0)
            {
                for (int j = i+1; j <arr.length; j++) {
                    if(arr[j] !=0)
                    {
                        swap(arr,i,j);
                    }
                }
            }
        }
    }


    private static void moveZeroesToEnd1(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, count);
                count++;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}




//        public static void swap(int arr[],int i,int j)
//        {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

//    private static void moveZeroesToEnd(int[] arr) {
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                swap(arr,i,count);
//                count++;
//            }
//        }
