package  Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {5,6,7,8},{11,23,45,67}};
        int len = arr.length;
        for(int row=0;row<len;row++)
        {
            for(int col=0;col<arr[0].length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }



    }
}
