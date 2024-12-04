package Day_1.PrimeNumber;

public class PrimeNumber {
    public static  void main(String[] args){
        int num = 14;
        Boolean result = isPrime(num);

        if (result) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
    private static  Boolean isPrime(int number){
        int count = 0;

        for(int i = 1; i <= number ;i++){
            if(number%i == 0){
                count++;
            }
        }

        return count == 2;
    }
}
