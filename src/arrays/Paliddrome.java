package arrays;

public class Paliddrome {

    public  boolean isAPalindrome(String word){
        char[] wordArray=word.toCharArray();
       int start=0;
       int end=wordArray.length-1;
       while (start<end){
           if(wordArray[start]!=wordArray[end]){
               return false;
           }
           end--;
           start++;
       }
       return  true;

    }
}
