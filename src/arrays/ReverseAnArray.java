package arrays;

public class ReverseAnArray {

    public int[] reverseArray(int[] arrToReverse ,int start,int end){

        while(start<end){
            int temp=arrToReverse[start];
            arrToReverse[start]=arrToReverse[end];

            arrToReverse[end]=temp;
            start++;
            end--;
        }
        return  arrToReverse;

    }
}
