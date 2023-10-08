package arrays;

public class ResizingArrays {

    public  int [] resizeArray(int[] array,int newCapacity){

        int [] newArray= new int [newCapacity];
        int n=array.length;
        for(int i=0;i<n;i++){
            newArray[i]=array[i];
        }

//        make the old array point to the new array
        return  newArray;

    }

}
