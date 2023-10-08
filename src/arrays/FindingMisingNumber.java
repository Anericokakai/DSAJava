package arrays;

public class FindingMisingNumber {

    public  int findMissing(int [] arr){
        int n=arr.length;
        int x=arr.length+1;
//        find the total of the elements n+1
        int total= x*(x+1)/2;
        for(int i:arr){
            total-=i;
        }
        return  total;



    }
}
