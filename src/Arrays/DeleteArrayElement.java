package Arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int arr[] = {3,8,12,5,12,6};
        int deletedElement =12;
     //   int newSize = deleteArrayElement(arr, deletedElement);
      //  System.out.println(newSize);
         arr=deleteArrayElement1(arr, deletedElement);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }

    public static int [] deleteArrayElement1(int [] arr, int deletedElement){
         int n = arr.length;
         // create a new array of size = length-1
         int newArray[] =  new int[arr.length-2];
        for (int i = 0,k=0; i < arr.length; i++)
         {
             ///if element found
          if(arr[i]==deletedElement)
          {
              continue;
          }
          // copy the element in new Array
          newArray[k++] =arr[i];

          // if element not found the return old array
           if(i==n)
           {
               return arr;
           }
        }
        return newArray;
    }
///////////////////////////////////////////////////////////
    private static int deleteArrayElement(int[] arr, int elementToBeDeleted) {
             int n = arr.length;
             int i;
             for (i=0;i<n;i++)
             {
                 if(arr[i] == elementToBeDeleted)
                 {
                     break;
                 }
               //if we reach end Of Array And Array Don't Exist
                 if(i==n)
                 {
                   return n;
                 }
             }
        // copy all the remaining element after deletion
        for(int j=i;j<n-1;j++)
        {
            arr[j] =arr[j+1];
        }
        return n-1;
    }
}
