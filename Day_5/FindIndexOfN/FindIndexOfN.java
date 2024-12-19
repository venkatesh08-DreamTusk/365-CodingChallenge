package Day_5.FindIndexOfN;

public class FindIndexOfN {

    public static  void main (String[] args){

        int n = 38;
        int[] arr = {20,8,-1,10,29,3,38};
        int result = findIndex(arr,n);
        System.out.println(result);
    }
    private static  int findIndex(int[] a, int n){
        for(int index = 0; index <= a.length-1; index++){
            if(a[index] == n){
                return index;
            }
        }
        return -1;
    }
}
