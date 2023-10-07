package arrays;

public class CheckMinimumValueInArray {

    public  int findMinimumVal(int [] arr){
        int minVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }

        return minVal;
    }
}
