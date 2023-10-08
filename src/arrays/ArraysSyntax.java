package arrays;

import java.util.Arrays;

public class ArraysSyntax {



    public void myArrayMethod() {
        int[] myArray=new int[5];
myArray[0]=11;
myArray[1]=2;
myArray[3]=67;
myArray[2]=59;
myArray[4]=70;

int [] array2={1,20,0,5,0,8,0,40,280,89};

Loops loops= new Loops();


//!PRINT THE NORMAL ARRAY
loops.PrintElements(myArray);



//! REMOVE ODD ELEMENTS
        System.out.println("REMOVE ODD ELEMENTS\n");
        RemoveEvenIntegers removeEvenIntegers=new RemoveEvenIntegers();
int[]oddElements= removeEvenIntegers.removeEven(myArray);
loops.PrintElements(oddElements);

//!REVERSE AN ARRAY
        System.out.println("!REVERSE AN ARRAY\n");

      ReverseAnArray reverseAnArray= new ReverseAnArray();
      int start=0;
      int end= myArray.length-1;

      int[] reversedArray=reverseAnArray.reverseArray(myArray,start,end);
      loops.PrintElements(reversedArray);

// FIND THE MINIMUM VALUE OF AN ARRAY
        System.out.println("FIND THE MINIMU VALUE IN AN ARRAY'\n");

       CheckMinimumValueInArray checkMinimumValueInArray=new CheckMinimumValueInArray();

       int minimuValue=checkMinimumValueInArray.findMinimumVal(myArray);
       System.out.println("the minimum value is :"+minimuValue);

       CheckSecondMAxValue checkSecondMAxValue= new CheckSecondMAxValue();



//        ! THE SECOND LARGEST ELEMNT OF THE ARRAY
        System.out.println(" THE SECOND LARGEST ELEMNT OF THE ARRAY\n");
       int secondMax=checkSecondMAxValue.secondMax(myArray) ;
       System.out.println("second max value is :"+secondMax);
//       !  PLACE THE ZEROS AT THE END OF THE ARRAY

        System.out.println("!  PLACE THE ZEROS AT THE END OF THE ARRAY\n");
PlacingZerosAtTheEndOfArray placingZerosAtTheEndOfArray=new PlacingZerosAtTheEndOfArray();

        int[] zerosAtEnd=placingZerosAtTheEndOfArray.placeZerosAtEnd(array2);

        loops.PrintElements(zerosAtEnd);



//        RESIZING THE ARRAY
     ResizingArrays resizingArrays=new ResizingArrays();

        int[] resizedArray= resizingArrays.resizeArray(myArray,20);

        loops.PrintElements(resizedArray);


        //    !  FIND MISSING NUMBERS

        int [] array3= {2,4,1,8,6,3,7};

        FindingMisingNumber findingMisingNumber= new FindingMisingNumber();
        int missing= findingMisingNumber.findMissing(array3);

        System.out.println("the missing number is:"+missing);





        System.out.println("PALINDROME CHECKERS \n");

        Paliddrome paliddrome= new Paliddrome();

        boolean isAPalindrome=paliddrome.isAPalindrome("mama");
      if(isAPalindrome){
          System.out.println("the word is a palindrome");
      } else {
          System.out.println("the word is not a palindrome");
      }






    }






    public static void main(String[] args) {


        ArraysSyntax myarray1=new ArraysSyntax();

        myarray1.myArrayMethod();


         

    }
}
