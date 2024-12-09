package Day_2.Factorial;

public class Factorial {
    public static  void main(String[] args){
        int n = 5;
        Long result = factorial(n);
        System.out.println(result);
    }
    private static  Long factorial(int n){
        long fact = 1;

        int i = 1;
        while(i <= n){
            fact *= i;
            i++;
        }
        return fact;
    }
}
