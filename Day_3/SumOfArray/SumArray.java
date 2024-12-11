package Day_3.SumOfArray;

public class SumArray {
    public static  void main (String[] args){

        int[] a = {10,20,-30,40,-9,12};

        long result = sumOfArray(a);
        System.out.println(result);
    }

    private static  long sumOfArray (int[] a){
        long sum = 0;

        for(int i : a){
            sum += i;
        }
        return sum;
    }
}
