package arrays;

import java.util.Arrays;

public class ArraysSyntax {

// loop function for the array
//    public void PrintElements(int[] arr){
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }


    public void myArrayMethod() {
        int[] myArray=new int[5];
myArray[0]=11;
myArray[1]=2;
myArray[3]=67;
myArray[2]=59;
myArray[4]=70;

Loops loops= new Loops();

//!PRINT THE NORMAL ARRAY
loops.PrintElements(myArray);



//! REMOVE ODD ELEMENTS
        System.out.println("REMOVE ODD ELEMENTS");
        RemoveEvenIntegers removeEvenIntegers=new RemoveEvenIntegers();
int[]oddElements= removeEvenIntegers.removeEven(myArray);
loops.PrintElements(oddElements);

//!REVERSE AN ARRAY
        System.out.println("!REVERSE AN ARRAY");

      ReverseAnArray reverseAnArray= new ReverseAnArray();
      int start=0;
      int end= myArray.length-1;

      int[] reversedArray=reverseAnArray.reverseArray(myArray,start,end);
      loops.PrintElements(reversedArray);

// FIND THE MINIMUM VALUE OF AN ARRAY
        System.out.println("FIND THE MINIMU VALUE IN AN ARRAY");

       CheckMinimumValueInArray checkMinimumValueInArray=new CheckMinimumValueInArray();

       int minimuValue=checkMinimumValueInArray.findMinimumVal(myArray);
       System.out.println("the minimum value is :"+minimuValue);

       CheckSecondMAxValue checkSecondMAxValue= new CheckSecondMAxValue();


       int secondMax=checkSecondMAxValue.secondMax(myArray) ;
       System.out.println("second max value is :"+secondMax);
    }

    public static void main(String[] args) {


        ArraysSyntax myarray1=new ArraysSyntax();

        myarray1.myArrayMethod();


         

    }
}
