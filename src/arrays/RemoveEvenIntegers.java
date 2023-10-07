package arrays;

public class RemoveEvenIntegers {

    public int[] removeEven(int[] arr){

       int n=arr.length;
       int newArraySize=0;
       for(int i=0;i<n;i++){
           if(arr[i]%2!=0){
               newArraySize++;

           }
       }

//       !initialise the new array
        int[] resultArray=new int[newArraySize];
       int index=0;
        for (int j : arr) {
            if (j % 2 != 0) {
                resultArray[index] = j;
                index++;
            }
        }


        return  resultArray;
    }
}
