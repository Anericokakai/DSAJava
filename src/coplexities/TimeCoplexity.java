package coplexities;

public class TimeCoplexity {

    public static void main(String[] args) {

         double currentTime= System.currentTimeMillis();

         System.out.println(sumOfNumbers(99999));
         System.out.println("time taken:"+(System.currentTimeMillis()-currentTime));

         print(3);

    }

//    !using maths
    public  static  int sumOfNumbers(int number){
        return number *(number+1)/2;
    }
//    ! using a for loop

    public  static  int sumOfNumbersUsingLoop(int number){
        var sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        return sum;
    }


    public static  void  print(int n){
        for (int i= 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println("i="+i+", j="+j);
            }
            System.out.println("End of inner loop");

        }
        System.out.println("end of outer loop");
    }

}
