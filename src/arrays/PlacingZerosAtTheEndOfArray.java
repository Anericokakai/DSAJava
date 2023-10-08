package arrays;

public class PlacingZerosAtTheEndOfArray {
    public  int [] placeZerosAtEnd(int[] arr){
        int n=arr.length;
        int j=0;
        for (int i=0;i<n ; i++) {
            if (arr[i] != 0 && arr[j] == 0) {

//                !perfom a wsap if the i element is mot zero and j eleemnt is zero
                int temp=arr[i];

                arr[i]=arr[j];
                arr[j]=temp;
            }

//            ! if the value t j index is not 0 we move the j index so that we van swap
            if(arr[j]!=0){
                j++;
            }
        }

        return arr;
    }

}
