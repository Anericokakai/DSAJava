package arrays;

public class CheckSecondMAxValue {
    public int secondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int j:arr){

            if(j>max){
                secondMax=max;
                max=j;
            }else if(j>secondMax&&j!=max ){
                secondMax=j;

            }


        }
        return secondMax;
    }
}
