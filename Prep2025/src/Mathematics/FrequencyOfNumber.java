package Mathematics;

public class FrequencyOfNumber {

    public static void main(String[] args) {

        int arr [] =  {1,2,3,4,1,2,1,5,6,7,8,1,2,3,4,5,1};
        int number = 1;
        int ans = checkNumberOfTimesAppear(arr, number);
    }

    private static int checkNumberOfTimesAppear(int[] arr, int number) {
        int count =0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==number)
            {
                count++;
            }
        }

        return count;
    }


}
